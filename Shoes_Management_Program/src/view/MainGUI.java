package view;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.StringTokenizer;


/*
 * MainGUI -> ����ȭ��
 * LoginGUI -> �α���ȭ��
 * ManagerGUI -> ������ȭ��
 * ShoppingGUI -> ī�װ� ���� ȭ��
 * KindGUI -> ī�װ� ���� �Ź� ����
 * SalesList -> ���� 2�� ������
 * Search -> ���� 3�� ������
 * M_Input -> ������ ����Է�
 * M_Choice -> ���� �޴�
 * M_Product -> ��ǰ ����
 * M_Modify -> ������ ����
 * M_SalesList -> ������ ������
 * M_InventoryList -> ������ �����
 */

/* 
 * ��ü���� �ڵ� �����ϱ�(���� ���°� �޼ҵ�� ���� ������� �̾�޾Ƽ� ����� �� �ְ�) 
 */

public class MainGUI extends Frame{
	private MenuBar menuBar;
	private Menu managerMenu;
	private MenuItem login;
	Panel[] panel;
	Label lblTitle;
	Button shopBtn, salesListBtn, searchBtn; 
	Font lblFont = new Font("Serif", Font.HANGING_BASELINE, 40);
	Font btnFont = new Font("Serif", Font.HANGING_BASELINE, 30);

	public void mainGUI() {
		
		setSize(300, 500);
		setTitle("Shoes_Sales_Program");
		setResizable(false);//�ִ�ȭ��ư ����
		setLocationRelativeTo(null);//Frame ȭ�� �����, setSize���� ���� ������ ������� ���� 
		Termination();//�ݱ� ��ư �޼ҵ�
		setVisible(true);//������ Ȱ��ȭ

		
		//������ �α��� �޴���
		//�޴��� ����Ű ������ �������� ������
		menuBar = new MenuBar();//MenuBar ����
		setMenuBar(menuBar);
		
		managerMenu = new Menu("Manager");//Menu ����
		menuBar.add(this.managerMenu);
		
		login = new MenuItem("Login");//Menu �ȿ� ��� ����
		managerMenu.add(login);
		
		//login ������ �� �߻��ϴ� �̺�Ʈ
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);//����ȭ�� ��Ȱ��ȭ
				//new LoginGUI();//Loginâ ȣ��
				LoginGUI lg = new LoginGUI();
				lg.loginGUI();
			}
		});	
		
		setLayout(null);
		//Title ��
		lblTitle = new Label("Shoes Market");
		lblTitle.setFont(lblFont);
		add(lblTitle);
		lblTitle.setBounds(35, 50, 230, 100);
		lblTitle.setBackground(new Color(0, 0, 0));
		lblTitle.setForeground(new Color(255, 255, 255));
		
		
		
		//���� ��ư
		shopBtn = new Button("Shopping");
		add(shopBtn);
		shopBtn.setBounds(65, 150, 170, 80);
		mainBtn(shopBtn);
		
		//shopBtn �̺�Ʈ ó��
		btnEvent(shopBtn);
		
		//���Ÿ�� ��ư
		salesListBtn = new Button("SalesList");
		add(salesListBtn);
		salesListBtn.setBounds(65, 260, 170, 80);
		mainBtn(salesListBtn);
		
		//salesListBtn �̺�Ʈ ó��
		btnEvent(salesListBtn);
		
		//Search ��ư
		searchBtn = new Button("Search");
		add(searchBtn);
		searchBtn.setBounds(65, 370, 170, 80);
		mainBtn(searchBtn);
		btnEvent(searchBtn);
	
	}//end mainGUI
	
	//��ư �̺�Ʈ ó��
	public void btnEvent(Button b) {
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(b.equals(shopBtn)) {
					ShoppingGUI sg = new ShoppingGUI();
					sg.shoppingGUI();	
				}
				if(b.equals(salesListBtn)) {
					SalesList sl = new SalesList();
					sl.salesListGUI();
				}
				if(b.equals(searchBtn)) {
					Search s = new Search();
					s.searchGUI();
				}
			}
		});
	}
	
	//��ư ����
	public void mainBtn(Button b) {
		b.setFont(btnFont);
		b.setBackground(new Color(0, 0, 0));
		b.setForeground(new Color(255, 255, 255));
	}
	
	//�̹��� �ҷ����� �޼ҵ�
	@Override
	public void paint(Graphics g) {
		Toolkit mainTool = Toolkit.getDefaultToolkit();
		Image mainImg = mainTool.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\300_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
	//�ݱ� ��ư Ȱ��ȭ �޼ҵ�
	public void Termination() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		});
	}//end Termination
	
	//������ ���� �κ�
	public static void main(String[] args) {
		MainGUI gui = new MainGUI();
		gui.mainGUI();
	}//end main
}//end Class


class LoginGUI extends MainGUI{
	private String ManagerID = "1";
	private String ManagerPW = "1";
	Panel[] panel;
	Label lblTitle, lblID, lblPW, lblFailed;
	TextField tfID, tfPW;
	Button btnLogin;
	int loginCnt = 0;
	LoginGUI lg = this;
		
	public void loginGUI() {

		Panel[] idpw = new Panel[3];
		for(int i = 0; i<idpw.length; i++) {
			idpw[i] = new Panel();
		}
		//Title ��
		lblTitle = new Label("Manager Login", Label.CENTER);
		Font loginFont = new Font("SansSerif", Font.BOLD, 30);
		lblTitle.setFont(loginFont);
		lblTitle.setBackground(new Color(0, 0, 0));//�� ����
		lblTitle.setForeground(new Color(255, 255, 255));//���� ��
		//ID ��
		lblID = new Label("ID");
		Font idPwFont = new Font("Serif", Font.PLAIN, 20);
		lblID.setFont(idPwFont);
		lblID.setBackground(new Color(0, 0, 0));//�� ����
		lblID.setForeground(new Color(255, 255, 255));//���� ��
		//PW ��
		lblPW = new Label("PW");
		lblPW.setFont(idPwFont);
		lblPW.setBackground(new Color(0, 0, 0));//�� ����
		lblPW.setForeground(new Color(255, 255, 255));//���� ��
		//ID, PW �ؽ�Ʈ�ʵ�
		tfID = new TextField("ManagerID");//TextField�� ManagerID��� ����
		tfPW = new TextField("Password");//TextField�� Password��� ����
		tfPW.setEchoChar('*');//�Է��� ���� ��� *�� ����
		//Login ��ư
		Font btnFont = new Font("Serif", Font.PLAIN, 15);
		btnLogin = new Button("Login");
		btnLogin.setFont(btnFont);
	
		
		
		setLayout(null);
		add(lblTitle);
		lblTitle.setBounds(20, 25, 250, 80);
		add(lblID);
		lblID.setBounds(50, 100, 30, 50);
		add(lblPW);
		lblPW.setBounds(50, 150, 30, 50);
		add(tfID);
		tfID.setBounds(90, 115, 140, 25);
		add(tfPW);
		tfPW.setBounds(90, 160, 140, 25);
		add(btnLogin);
		btnLogin.setBounds(130, 230, 40, 25);
		
		//tfID ������ �Էµ��ִ� ID�� �����
		tfID.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfID.setText("");
			}
		});
							
		//tfPW ������ �Էµ��ִ� ��й�ȣ�� �����
		tfPW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfPW.setText("");
			}
		});
		
		//�α��� ��ư �̺�Ʈ ó��
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tfID.getText().equals(ManagerID)&&tfPW.getText().equals(ManagerPW)){
					setVisible(false);
					ManagerGUI mg = new ManagerGUI();
					mg.managerGUI();
				}else {
					loginCnt++;
					Dialog loginDialog = new Dialog(lg, "Warning", true);
					loginDialog.setLayout(new FlowLayout());//FlowLayout : ȭ���� ũ�⸦ �����ϸ� �۾��鵵 ���� ������, �׸����� �ؽ�Ʈâ����
					loginDialog.setSize(200, 120);
					loginDialog.setTitle("Login Failed");
					lblFailed = new Label("ID�� PW�� Ȯ�����ּ���.["+loginCnt+"/3]");
					lblFailed.setForeground(new Color(255,0,0));
					loginDialog.add(lblFailed);
					Button btnOk = new Button("Ȯ ��");
					loginDialog.add(btnOk);
					
					//btnOK ������ Dialog �ݱ�
					btnOk.addActionListener(new ActionListener() {//btnOK ��ư ������ ȣ��
						@Override
						public void actionPerformed(ActionEvent e) {
							loginDialog.dispose();//Dialog �ݱ�
						}
					});
					
					//Loginfailed Dialog �ݱ� ��ư Ȱ��ȭ
					loginDialog.addWindowListener(new WindowAdapter() {//�ݱ��ư ������ ȣ��
						public void windowClosing(WindowEvent e) {
							loginDialog.dispose();//�ݱ�
						};
					} );	
					
					loginDialog.setResizable(false);
					loginDialog.setLocation( ((loginDialog.getToolkit().getScreenSize()).width - loginDialog.getWidth()) / 2,
				            ((loginDialog.getToolkit().getScreenSize()).height - loginDialog.getHeight() ) / 2   );
					loginDialog.setVisible(true);
					if(loginCnt==3) {
						lblFailed.setText("ID�� PW�� Ʋ�Ƚ��ϴ�.["+loginCnt+"/3]");
						try {
							Thread.sleep(500);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						System.exit(0);
					}
				
				}
			}
		});//end btnLogin
			
		setTitle("�α���");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		
		Termination();
		
		setVisible(true);
	
	}//end loginGUI
	
	
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\300_300.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}//end paint
	
}//end LoginGUI

//������ �޴�
class ManagerGUI extends MainGUI{
	Button M_InputBtn, M_ModifyBtn, M_SalesListBtn,  M_InventoryListBtn, M_OutBtn, M_BackBtn;
	Label M_Title;
	Font btnFont = new Font("Serif", Font.HANGING_BASELINE, 20);//��Ʈ �ϳ��� �����ϴ°� �����
	Font listFont = new Font("Serif", Font.HANGING_BASELINE, 15);
	Font lblFont = new Font("Serif", Font.HANGING_BASELINE, 30);
	
	public void managerGUI() {
		setTitle("������ ����");
		setSize(300, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		
		//���� ��
		M_Title = new Label("Manager Space");
		add(M_Title);
		M_Title.setBounds(51, 30, 195, 50);
		M_Title.setFont(lblFont);
		M_Title.setBackground(new Color(0, 0, 0));
		M_Title.setForeground(new Color(255, 255, 255));
		
		//��� �Է� ��ư
		M_InputBtn = new Button("Inventory Input");
		add(M_InputBtn);
		M_ButtonSt(M_InputBtn);
		M_InputBtn.setBounds(75, 85, 150, 50);
		M_ButtonEv(M_InputBtn);
		
		//���� ��ư
		M_ModifyBtn = new Button("Modify");
		add(M_ModifyBtn);
		M_ButtonSt(M_ModifyBtn);
		M_ModifyBtn.setBounds(75, 155, 150, 50);
		M_ButtonEv(M_ModifyBtn);
		
		//���� ��� ��ư
		M_SalesListBtn = new Button("Sales List");
		add(M_SalesListBtn);
		M_ButtonSt(M_SalesListBtn);
		M_SalesListBtn.setBounds(75, 225, 150, 50);
		M_ButtonEv(M_SalesListBtn);
		
		//��� ��� ��ư
		M_InventoryListBtn = new Button("Inventory List");
		add(M_InventoryListBtn);
		M_ButtonSt(M_InventoryListBtn);
		M_InventoryListBtn.setBounds(75, 295, 150, 50);
		M_ButtonEv(M_InventoryListBtn);
		
		//�ڷΰ��� ��ư
		M_BackBtn = new Button("Back");
		add(M_BackBtn);
		M_ButtonSt(M_BackBtn);
		M_BackBtn.setBounds(75, 365, 150, 50);
		
		//�ڷΰ��� ��ư �̺�Ʈó��
		M_BackBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new MainGUI().mainGUI();
			}
		});
		
		//������ ��ư
		M_OutBtn = new Button("Exit");
		add(M_OutBtn);
		M_ButtonSt(M_OutBtn);
		M_OutBtn.setBounds(75, 435, 150, 50);
		
		//������ ��ư �̺�Ʈ ó��, �ٷ� ����(x��ư�� ����)
		M_OutBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		Termination();
		setVisible(true);
	}//managetGUI
	
	
	public void M_ButtonEv(Button b) {
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(b.equals(M_InputBtn)) new M_Input().M_InputGUI();
				else if(b.equals(M_ModifyBtn)) new M_Choice().M_ChoiceGUI();
				else if(b.equals(M_SalesListBtn)) new M_SalesList().M_SalesListGUI();
				else new M_InventoryList().M_InventoryListGUI();
				
			}
		});
	}
	
	//��ư ����
	public void M_ButtonSt(Button b) {
		b.setFont(btnFont);
		b.setBackground(new Color(0, 0, 0));
		b.setForeground(new Color(255, 255, 255));
	}
	
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\300_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
}//end ManagetGUI


class ShoppingGUI extends MainGUI{
	Button rBtn, bBtn, sBtn, oBtn, backBtn; 
	Font btnFont = new Font("Serif", Font.HANGING_BASELINE, 25);
	
	
	
	//ShoppingGUI ������ ����
	public void shoppingGUI() {
		setTitle("Shopping");
		setSize(300, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		
		Termination();
		
		setVisible(true);
		
		setLayout(null);
		//Running Shoes ��ư
		rBtn = new Button("Running");
		add(rBtn);
		rBtn.setBounds(100, 100, 100, 100);
		shoppingBtn(rBtn);		
		btnEvent(rBtn);
		
		//Boots ��ư
		bBtn = new Button("Boots");
		add(bBtn);
		bBtn.setBounds(200, 200, 100, 100);
		shoppingBtn(bBtn);		
		btnEvent(bBtn);
		
		//Sneakers ��ư
		sBtn = new Button("Sneakers");
		add(sBtn);
		sBtn.setBounds(0, 200, 100, 100);
		shoppingBtn(sBtn);		
		btnEvent(sBtn);
		
		//Other Shoes ��ư
		oBtn = new Button("Other");
		add(oBtn);
		oBtn.setBounds(100, 300, 100, 100);
		shoppingBtn(oBtn);
		btnEvent(oBtn);
		
		//Back ��ư
		backBtn = new Button("Back");
		add(backBtn);
		backBtn.setBounds(100, 200, 100, 100);
		shoppingBtn(backBtn);
		btnEvent(backBtn);
	}
	
	//�̵� ��ư
	public void btnEvent(Button b) {
		b.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(b.equals(backBtn)) new MainGUI().mainGUI();
				else if(b.equals(rBtn)) new KindGUI().RunningGUI();
				else if(b.equals(bBtn)) new KindGUI().bootsGUI();
				else if(b.equals(sBtn)) new KindGUI().sneakers();
				else new KindGUI().other();		
			}
		});
	}
	
	//��ư ����
	public void shoppingBtn(Button b) {
		b.setFont(btnFont);
		b.setBackground(new Color(0, 0, 0));	
		b.setForeground(new Color(255, 255, 255));
	}
	
	//��� ����
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\300_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
}//end ShoppingGUI


class KindGUI extends ShoppingGUI{
	List runList, bootsList, sneakersList, otherList;
	Button runBtn, bootsBtn, sneakersBtn, otherBtn, backBtn;
	Font listFont = new Font("Serif", Font.HANGING_BASELINE, 15);
	Font btnFont = new Font("Serif", Font.HANGING_BASELINE, 20);
	TextField rQTf, bQTf, sQTf, oQTf;
	Label rlbl, blbl, slbl, olbl, resultlbl;
	

	/*
	 * 01/18 ����� ���� ��ư �����ϱ�
	 */
	
	//����ȭ
	public void RunningGUI() {
		setTitle("Running");
		kindFrame();
		//����Ʈ
		runList = new List(20);
		//�Ű������� (int, boolean)�� �ָ� ���߼����� ����
		//����Ʈ�� 2�� �̻��̶�� boolean�� true �����̶�� false
		//runList.add()�� ���� �߰�
		add(runList);
		kindList(runList);
		kindDispaly("RUNNING", runList);
		
		//���� �Է� �ؽ�Ʈ�ʵ�
		rQTf = new TextField("Quantity");
		add(rQTf);
		kindTf(rQTf);
		tfClear(rQTf);
		
		//sales ��ư		
		runBtn = new Button("Sales");
		add(runBtn);
		kindBtn(runBtn);
		
		//back ��ư
		backBtn = new Button("Back");
		add(backBtn);
		backButton();
		
		kindSales(runList, runBtn, rQTf);
		
		resultlbl = new Label();
		add(resultlbl);
		kindlbl(resultlbl);
		
		Termination();
		setVisible(true);
	}
	
	//����
	public void bootsGUI() {
		setTitle("Boots");
		kindFrame();
		//����Ʈ
		bootsList = new List(20);
		//�Ű������� (int, boolean)�� �ָ� ���߼����� ����
		//����Ʈ�� 2�� �̻��̶�� boolean�� true �����̶�� false
		//runList.add()�� ���� �߰�
		add(bootsList);
		kindList(bootsList);
		kindDispaly("BOOTS", bootsList);
		
		//���� �Է� �ؽ�Ʈ�ʵ�
		bQTf = new TextField("Quantity");
		add(bQTf);
		kindTf(bQTf);
		tfClear(bQTf);
		
		//sales ��ư		
		bootsBtn = new Button("Sales");
		add(bootsBtn);
		kindBtn(bootsBtn);
		
		//back ��ư
		backBtn = new Button("Back");
		add(backBtn);
		backButton();
		
		kindSales(bootsList, bootsBtn, bQTf);
		
		resultlbl = new Label();
		add(resultlbl);
		kindlbl(resultlbl);
		
		Termination();
		setVisible(true);
	
	}

	//����Ŀ��
	public void sneakers() {
		setTitle("Sneakers");	
		kindFrame();

		//����Ʈ
		sneakersList = new List(20);
		//�Ű������� (int, boolean)�� �ָ� ���߼����� ����
		//����Ʈ�� 2�� �̻��̶�� boolean�� true �����̶�� false
		//runList.add()�� ���� �߰�
		add(sneakersList);
		kindList(sneakersList);
		kindDispaly("SNEAKERS", sneakersList);
		
		//���� �Է� �ؽ�Ʈ�ʵ�
		sQTf = new TextField("Quantity");
		add(sQTf);
		kindTf(sQTf);
		tfClear(sQTf);
		
		//sales ��ư		
		sneakersBtn = new Button("Sales");
		add(sneakersBtn);
		kindBtn(sneakersBtn);
		
		//back ��ư
		backBtn = new Button("Back");
		add(backBtn);
		backButton();
		
		kindSales(sneakersList, sneakersBtn, sQTf);
		
		resultlbl = new Label();
		add(resultlbl);
		kindlbl(resultlbl);
		
		Termination();
		setVisible(true);
	
	}
	
	//��Ÿ �Ź�
	public void other() {
		setTitle("Other");
		kindFrame();
		//����Ʈ
		otherList = new List(20);
		//�Ű������� (int, boolean)�� �ָ� ���߼����� ����
		//����Ʈ�� 2�� �̻��̶�� boolean�� true �����̶�� false
		//runList.add()�� ���� �߰�
		add(otherList);
		kindList(otherList);
		kindDispaly("OTHER", otherList);
		
		//���� �Է� �ؽ�Ʈ�ʵ�
		oQTf = new TextField("Quantity");
		add(oQTf);
		kindTf(oQTf);
		tfClear(oQTf);
		
		//sales ��ư		
		otherBtn = new Button("Sales");
		add(otherBtn);
		kindBtn(otherBtn);
		
		//back ��ư
		backBtn = new Button("Back");
		add(backBtn);
		backButton();
		
		kindSales(otherList, otherBtn, oQTf);
		
		resultlbl = new Label();
		add(resultlbl);
		kindlbl(resultlbl);
		
		Termination();
		setVisible(true);
	}
	
	public void kindSales(List l, Button b, TextField t) {
		l.addItemListener(new ItemListener() {
			String pCode = "";
			boolean flag = false;
			@Override
			public void itemStateChanged(ItemEvent e) {
				Product p = new Product();
				Output o = new Output();
				Input i = new Input();
				DAO dao = new DAO();
				//List���� ������ ��ǰ �ڵ� ������
				String str = l.getSelectedItem();
				StringTokenizer st = new StringTokenizer(str,"��");
				pCode = st.nextToken();
				String temp = st.nextToken();
				String name = st.nextToken();
				b.addActionListener(new ActionListener() {	
					@Override
					public void actionPerformed(ActionEvent e) {
						//�ؽ�Ʈ�ʵ忡 �Է��� ���� ������
						int quantity = Integer.parseInt(t.getText());
						int inven = 0;
						try {
							Iterator<Input> ii = dao.getListI().iterator();
							while(ii.hasNext()) {
								Input i = ii.next();
								if(i.getP_code().equals(pCode)) {
									inven = i.getQuantity();
								}
							}
							Iterator<Output> io = dao.getListO().iterator();
							//������� �ȵ�
							while(io.hasNext()) {
								Output out = io.next();
								if(out.getP_code().equals(pCode)) {
									flag = true;
								}
							}
							if(flag) {
								dao.update(pCode, quantity);	
								if(inven==0) {
									resultlbl.setText("ǰ���� ��ǰ�Դϴ�.");
									resultlbl.setForeground(new Color(255, 0, 0));
									return;
								}
								if(quantity>inven) {
									resultlbl.setText("������ �����մϴ�.");
									resultlbl.setForeground(new Color(255, 0, 0));
									return;
								}
								resultlbl.setText("���� ����! "+name);
							}
						} catch (ClassNotFoundException | SQLException e1) {
							e1.printStackTrace();
						}
						
					}
				});
				
			}
		});
	}
	
//	//sales ��ư �̺�Ʈ ó��
//	public void kindSales(Button b) {
//		b.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("ȣ��");
//				runList.addItemListener(new ItemListener() {
//					@Override
//					public void itemStateChanged(ItemEvent e) {
//						String str = runList.getSelectedItem();
//						System.out.println(str);
//					}
//				});
//				DAO dao = new DAO();
////				Output temp = new Output(p_code, kind, o_date, quantity);
//			}
//		});
//	}
	

	//�� ����
	public void kindlbl(Label l) {
		l.setBounds(0, 475, 500, 20);
		l.setBackground(new Color(0, 0, 0));
		l.setForeground(new Color(255, 255, 255));
		l.setFont(listFont);
		l.setAlignment(Label.CENTER);
	}
	
	//���� �ؽ�Ʈ�ʵ� ����
	public void kindTf(TextField t) {
		t.setBounds(215, 370, 70, 27);
		t.setBackground(new Color(0, 0, 0));
		t.setForeground(new Color(255, 255, 255));
		t.setFont(listFont);
	}
	
	//�ؽ�Ʈ�ʵ� Ŭ���ϸ� �Էµ��ִ� ���� �����		
	public void tfClear(TextField t) {
		//�ؽ�Ʈ�ʵ� Ŭ���ϸ� �Էµ��ִ� ���� �����		
		t.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t.setText("");
			}
		});
	}

	
	//������ ����
	public void kindFrame() {
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);	
		setLayout(null);
	}
	
	//�ڷΰ��� ��ư
	public void backButton() {
		backBtn.setFont(btnFont);
		backBtn.setBounds(265, 415, 60, 40);
		backBtn.setBackground(new Color(0, 0, 0));
		backBtn.setForeground(new Color(255, 255, 255));
		
		//back ��ư �̺�Ʈ ó��
		backBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ShoppingGUI().shoppingGUI();
			}
		});
	}
	
	//��ư ����
	public void kindBtn(Button b) {
		b.setFont(btnFont);
		b.setBounds(175, 415, 60, 40);
		b.setBackground(new Color(0, 0, 0));
		b.setForeground(new Color(255, 255, 255));
	}
	
	//����Ʈ ����
	public void kindList(List l) {
		l.setFont(listFont);
		l.setBounds(50, 50, 400, 300);
		l.setBackground(new Color(0, 0, 0));
		l.setForeground(new Color(255, 255, 255));
	}
	
	//��� ����
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\500_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
	//ī�װ��� �´� ǰ����� List�� ������
	public void kindDispaly(String k, List l) {
		DAO dao = new DAO();
		l.removeAll();
		java.util.List<Product> allData = dao.getKind(k);
		for(Product p : allData) {
			String code = p.getP_code();
			String kind = p.getKind();
			String name = p.getP_name();
			int price = p.getPrice();
			int size = p.getP_size();
			l.add(code + "��" + kind + "��" + name + "��" + 
					price + "��" + size);
		}
	}
}//end KindGUI


//���� 2�� ������
class SalesList extends MainGUI{
	Button searchBtn, refundBtn, salesBackBtn;
	TextField salesTf = new TextField("Search");
	List sList = new List(20);
	Font listFont = new Font("Serif", Font.HANGING_BASELINE, 15);
	Font btnFont = new Font("Serif", Font.HANGING_BASELINE, 13);
	
	public void salesListGUI() {		
		setTitle("SalesList");
		setResizable(false);
		setSize(500, 500);
		setLayout(null);
		
		//����Ʈ
		add(sList);
		sList.setFont(listFont);
		sList.setBounds(50, 50, 400, 300);
		sList.setBackground(new Color(0, 0, 0));
		sList.setForeground(new Color(255, 255, 255));
		
		//�˻� �ؽ�Ʈ�ʵ�
		add(salesTf);
		salesTf.setBounds(150, 375, 150, 25);
		salesTf.setBackground(new Color(0, 0, 0));
		salesTf.setForeground(new Color(255, 255, 255));
		salesTf.setFont(btnFont);

		//�ؽ�Ʈ�ʵ� Ŭ���ϸ� �Էµ��ִ� ���� �����		
		salesTf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				salesTf.setText("");
			}
		});
		
		//�˻� ��ư
		searchBtn = new Button("Search");
		add(searchBtn);
		searchBtn.setBounds(300, 375, 50, 25);
		salesBtn(searchBtn);
		
		//ȯ�� ��ư
		refundBtn = new Button("Refund");
		add(refundBtn);
		refundBtn.setBounds(180, 420, 50, 25);
		salesBtn(refundBtn);
		
		salesBackBtn = new Button("Back");
		add(salesBackBtn);
		salesBackBtn.setBounds(270, 420, 50, 25);
		salesBtn(salesBackBtn);
		//backBtn �̺�Ʈó��
		salesBackBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new MainGUI().mainGUI();
			}
		});
		
		Termination();
		setLocationRelativeTo(null);//�� ���� �ȵǴ���?
		setVisible(true);
	}

	//��ư ����
	public void salesBtn(Button b) {
		b.setFont(btnFont);
		b.setBackground(new Color(0, 0, 0));
		b.setForeground(new Color(255, 255, 255));
	}//end salesBtn
	
	//��� ����
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\500_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
}//end SalesList

//���� 3�� ������
class Search extends KindGUI{
	Button searchBtn, searchBackBtn;
	TextField nSTf, pSTf, sSTf;
	List searchlist = new List(20);
	List resultlist = new List(20);
	Font listFont = new Font("Serif", Font.HANGING_BASELINE, 15);
	Font btnFont = new Font("Serif", Font.HANGING_BASELINE, 13);
	Label nlbl, plbl, slbl;
	
	public void searchGUI() {
		displayAll();
		setTitle("Search");
		setResizable(false);
		setSize(500, 500);
		setLayout(null);
		Termination();
		setLocationRelativeTo(null);
		setVisible(true);
		
		//����Ʈ ����
		add(searchlist);
		searchlist.setFont(listFont);
		searchlist.setBounds(50, 50, 400, 300);
		searchlist.setBackground(new Color(0, 0, 0));
		searchlist.setForeground(new Color(255, 255, 255));
		
		//�̸� �ؽ�Ʈ �ʵ� ����
		nSTf = new TextField();
		add(nSTf);
		nSTf.setBounds(200, 360, 130, 25);
		S_Tf(nSTf);
		
		//�̸� �� ����
		nlbl = new Label("Name");
		add(nlbl);
		nlbl.setBounds(152, 362, 50, 20);
		S_Lbl(nlbl);
		
		//���� �ؽ�Ʈ �ʵ� ����
		pSTf = new TextField("0");
		add(pSTf);
		pSTf.setBounds(200, 390, 130, 25);
		S_Tf(pSTf);
		
		//���� �� ����
		plbl = new Label("Price");
		add(plbl);
		plbl.setBounds(152, 392, 50, 20);
		S_Lbl(plbl);
		
		//������ �ؽ�Ʈ �ʵ� ����
		sSTf = new TextField("0");
		add(sSTf);
		sSTf.setBounds(200, 420, 130, 25);
		S_Tf(sSTf);
		
		//������ �� ����
		slbl = new Label("Size");
		add(slbl);
		slbl.setBounds(152, 422, 50, 20);
		S_Lbl(slbl);
		
		//�˻� ��ư ����
		searchBtn = new Button("Search");
		add(searchBtn);
		searchBtn.setBounds(190, 455, 50, 25);
		searchBtn.setBackground(new Color(0, 0, 0));
		searchBtn.setForeground(new Color(255, 255, 255));
		searchBtn.setFont(btnFont);
		
		searchBtn.addActionListener(new ActionListener() {
			ArrayList<Product> a = null;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				remove(searchlist);
				resultlist.removeAll();
				String name = nSTf.getText().toUpperCase();
				int price = 0;
				int size = 0;
				try {
					//name�� �Է��ϰ� price, size �� �� �Է¾��ϴ°� ��������
					//name�� price Ȥ�� name�� size�� ������ ���¿���
					//price�� size�� �Է��ϸ� NumberFormatException �߻�
					price = Integer.parseInt(pSTf.getText());
					size = Integer.parseInt(sSTf.getText());
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				}finally {
					Product p = new Product();
					
					DAO dao = new DAO();
					a = dao.mainSearch(name, price, size);
					add(resultlist);
					resultlist.setFont(listFont);
					resultlist.setBounds(50, 50, 400, 300);
					resultlist.setBackground(new Color(0, 0, 0));
					resultlist.setForeground(new Color(255, 255, 255));
					for(int i = 0; i<a.size();i++) {
						resultlist.add(a.get(i).getKind()+"��"+a.get(i).getP_name()+"��"+a.get(i).getPrice()+"��"+a.get(i).getP_size());					
					}			
				}
		
			}
		});
		
				
		//�ڷΰ����ư
		searchBackBtn = new Button("Back");
		add(searchBackBtn);
		searchBackBtn.setBounds(260, 455, 50, 25);
		searchBackBtn.setFont(btnFont);
		searchBackBtn.setBackground(new Color(0, 0, 0));
		searchBackBtn.setForeground(new Color(255, 255, 255));
		
		
		//�ڷΰ����ư �̺�Ʈó��
		searchBackBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new MainGUI().mainGUI();
			}
		});
	}//end searchGUI
	
	//��� ����
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\500_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
	//�ؽ�Ʈ�ʵ� ����
	public void S_Tf(TextField t) {
		t.setFont(listFont);
		t.setBackground(new Color(0, 0, 0));
		t.setForeground(new Color(255, 255, 255));
		tfClear(t);
	}
	
	//�� ����
	public void S_Lbl(Label l) {
		l.setFont(listFont);
		l.setBackground(new Color(0, 0, 0));
		l.setForeground(new Color(255, 255, 255));
	}
	
	//ȭ�� ��� (���� �����غ���)
	public void displayAll() {
		DAO dao = new DAO();
		searchlist.removeAll();
		java.util.List<Product> allData = dao.getListP();
		
		for(Product p : allData) {
			String kind = p.getKind();
			String name = p.getP_name();
			int price = p.getPrice();
			int size = p.getP_size();
			searchlist.add(kind + "��" + name + "��" + 
					price + "��" + size);
		}
	}
	

	
}//end Search



class M_Input extends ManagerGUI{
	List inputList = new List(20);
	Label codelbl, kindlbl, namelbl, pricelbl, sizelbl, resultlbl;
	TextField codeTf, kindTf, nameTf, priceTf, sizeTf;
	Button inputBtn, backBtn;
	Font font15 = new Font("Serif", Font.HANGING_BASELINE, 15);
	Choice kindCi, sizeCi;
	
	public void M_InputGUI() {
		displayAll();
		setTitle("Inventory Input");
		M_Frame();
		add(inputList);
		M_List(inputList);
		
		//�ڵ� ��
		codelbl = new Label("Code");
		add(codelbl);
		codelbl.setBounds(50, 360, 45, 30);
		M_Label(codelbl);
		
		//�ڵ� �ؽ�Ʈ�ʵ�
		codeTf = new TextField("Code Number");
		add(codeTf);
		codeTf.setBounds(95, 363, 150, 25);
		M_TextField(codeTf);
		M_TextClear(codeTf);
		
		//ī�װ� ��
		kindlbl = new Label("Kind");
		add(kindlbl);
		kindlbl.setBounds(270, 360, 45, 30);
		M_Label(kindlbl);
		
		//ī�װ� ���̽�
//		kindCi = new Choice();
//		add(kindCi);
//		kindCi.setBounds(315, 363, 100, 25);
//		kindCi.setFont(font15);
//		kindCi.setBackground(new Color(0, 0, 0));
//		kindCi.setForeground(new Color(255, 255, 255));
//		kindCi.add("Running");
//		kindCi.add("Boots");
//		kindCi.add("Sneakers");
//		kindCi.add("Other");
//		//kindCi.getSelectedItem() : ī�װ� �����ϰ� �Է��� ������ �� �� �޼ҵ带 ȣ���ϸ� ī�װ��� ���ڰ� ����
//		//kindCi.getSelectedIndex() : ī�װ� �����ϰ� �Է��� ������ �� �� �޼ҵ带 ȣ���ϸ� �ε��� ��ȣ�� ����
		
		//ī�װ� �ؽ�Ʈ�ʵ�
		kindTf = new TextField("Kind");
		add(kindTf);
		kindTf.setBounds(315, 363, 100, 25);
		M_TextField(kindTf);
		M_TextClear(kindTf);
		
		//�̸� ��
		namelbl = new Label("Name");
		add(namelbl);
		namelbl.setBounds(50, 400, 45, 30);
		M_Label(namelbl);
		
		//�̸� �ؽ�Ʈ�ʵ�
		nameTf = new TextField("Name");
		add(nameTf);
		nameTf.setBounds(95, 403, 150, 25);
		M_TextField(nameTf);
		M_TextClear(nameTf);
		
		//������ ��
		sizelbl = new Label("Size");
		add(sizelbl);
		sizelbl.setBounds(270, 400, 45, 30);
		M_Label(sizelbl);
		
		//������ ���̽�
//		sizeCi = new Choice();
//		add(sizeCi);
//		sizeCi.setBounds(315, 403, 80, 25);
//		sizeCi.setFont(font15);
//		sizeCi.setBackground(new Color(0, 0, 0));
//		sizeCi.setForeground(new Color(255, 255, 255));
//		sizeCi.add("230");
//		sizeCi.add("235");
//		sizeCi.add("240");
//		sizeCi.add("245");
//		sizeCi.add("250");
//		sizeCi.add("255");
//		sizeCi.add("260");
//		sizeCi.add("265");
//		sizeCi.add("270");
//		sizeCi.add("275");
//		sizeCi.add("280");
		//kindCi.getSelectedItem() : ī�װ� �����ϰ� �Է��� ������ �� �� �޼ҵ带 ȣ���ϸ� ī�װ��� ���ڰ� ����
		//kindCi.getSelectedIndex() : ī�װ� �����ϰ� �Է��� ������ �� �� �޼ҵ带 ȣ���ϸ� �ε��� ��ȣ�� ����
		
		//������ �ؽ�Ʈ�ʵ�
		sizeTf = new TextField("Size");
		add(sizeTf);
		sizeTf.setBounds(315, 403, 80, 25);
		M_TextField(sizeTf);
		M_TextClear(sizeTf);
		
		//���� ��
		pricelbl = new Label("Price");
		add(pricelbl);
		pricelbl.setBounds(50, 440, 45, 25);
		M_Label(pricelbl);
		
		//���� �ؽ�Ʈ�ʵ� 
		priceTf = new TextField("Price");
		add(priceTf);
		priceTf.setBounds(95, 443, 80, 25);
		M_TextField(priceTf);
		M_TextClear(priceTf);

		//����/���� �� �����?
		//���� �ϳ��� ������ �ٽ� �Է��ϵ���? �ƴϸ� �ٽ� â�� ����ǵ���?
		resultlbl = new Label();
		add(resultlbl);
		resultlbl.setBounds(0, 470, 500, 32);
		resultlbl.setBackground(new Color(0, 0, 0));
		resultlbl.setFont(font15);
		//�� �������
		resultlbl.setAlignment(Label.CENTER);
		
		//�Է� ��ư
		inputBtn = new Button("Input");
		add(inputBtn);
		inputBtn.setBounds(210, 440, 60, 30);
		M_Button(inputBtn);
		
		//�Է¹�ư �̺�Ʈ ó��
		inputBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String code = codeTf.getText().toUpperCase();
				String kind = kindTf.getText().toUpperCase();
				String name = nameTf.getText().toUpperCase();
				int price = 0;
				int size = 0;
				try {
					//price�� size�� ���� �Էµ��� �ʰų� ���ڰ� �ԷµǸ�
					//NumberFormatException �߻�
					price = Integer.parseInt(priceTf.getText());
					size = Integer.parseInt(sizeTf.getText());
				} catch (NumberFormatException e2) {
					e2.printStackTrace();
					resultlbl.setText("��� ���� : ������ ������ �ֽ��ϴ�.");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				
				//name�� ���� �Էµ��� �ʴ� ���
				if(name.isEmpty()) {
					resultlbl.setText("��� ���� : ������ ������ �ֽ��ϴ�.");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				
				DAO dao = new DAO();
				Product temp = new Product(code, kind, name, price, size);
				try {
					dao.insert(temp);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					//code, kind�� �ߺ��� ��ǰ �Է½� ���� �߻�
					resultlbl.setText("��� ���� : Code�� Kind�� �ٽ� Ȯ�����ּ���.");
					resultlbl.setForeground(new Color(255, 0, 0));
					e1.printStackTrace();
					return;
				}
				resultlbl.setText("��� ����! "+code+"/"+kind+"/"+name+"/"+price+"/"+size);
				resultlbl.setForeground(new Color(255, 255, 255));
				displayAll();
			}
		});
		
		backBtn = new Button("Back");
		add(backBtn);
		backBtn.setBounds(290, 440, 60, 30);
		M_Button(backBtn);
		M_BackBtn(backBtn);
		
		
		
		//�������� Ŭ������ �� �������� ������ �ؽ�Ʈ�ʵ忡 ���� �̺�Ʈ ó��
		inputList.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = inputList.getSelectedItem();
				StringTokenizer st = new StringTokenizer(str,"��");
				//�����ڿ� ���Ⱑ ���� ����� �ν��ع���
			
				codeTf.setText(st.nextToken());
				kindTf.setText(st.nextToken());
				//kindCi.getSelectedIndex();//���̽��� ����ִ� ���� �ε����� ����
				nameTf.setText(st.nextToken());
				priceTf.setText(st.nextToken());
				sizeTf.setText(st.nextToken());
				//sizeCi.getSelectedItem();//���̽��� ����ִ� ���� ����

			}
		});
	}
	
	//�ڷΰ��� ��ư
	public void M_BackBtn(Button b) {
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ManagerGUI().managerGUI();
			}
		});
	}
	
	//��ư ����
	public void M_Button(Button b) {
		b.setFont(font15);
		b.setBackground(new Color(0, 0, 0));
		b.setForeground(new Color(255, 255, 255));
	}
	
	//�ؽ�Ʈ�ʵ� Ŭ���ϸ� ���� �� �����
	public void M_TextClear(TextField t) {
		t.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t.setText("");
			}
		});
	}
	
	
	//�ؽ�Ʈ�ʵ� ����
	public void M_TextField(TextField t) {
		t.setFont(font15);
		t.setBackground(new Color(0, 0, 0));
		t.setForeground(new Color(255, 255, 255));
	}
	
	//�� ����
	public void M_Label(Label l) {
		l.setFont(font15);
		l.setBackground(new Color(0, 0, 0));
		l.setForeground(new Color(255, 255, 255));
	}
	
	//������ ����
	public void M_Frame() {
		setLayout(null);
		setResizable(false);
		setSize(500, 500);
		setLayout(null);
		Termination();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	//����Ʈ ����
	public void M_List(List l) {
		l.setFont(font15);
		l.setBackground(new Color(0, 0, 0));
		l.setForeground(new Color(255, 255, 255));
		l.setBounds(50, 50, 400, 300);
	}
	
	//��� ����
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\500_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
	//List�� product ���̺� ���� ���
	public void displayAll() {
		inputList.removeAll();//�� ����Ʈ�κ��� ��� �׸� ����
		DAO dao = new DAO();
		java.util.List<Product> allData = dao.getListP();
		for(Product p : allData) {
			String code = p.getP_code();
			String kind = p.getKind();
			String name = p.getP_name();
			int price = p.getPrice();
			int size = p.getP_size();
			inputList.add(code + "��" + kind + "��" + name + "��" + 
			price + "��" + size);
		}	
	}
	
}//end M_Input

class M_Choice extends M_Input{
	Button pBtn, oBtn;
	public void M_ChoiceGUI() {
		setTitle("Modify Choice");
		setLayout(null);
		setResizable(false);
		setSize(300, 300);
		setLayout(null);
		//��ǰ ����
		pBtn = new Button("Product Modify");
		add(pBtn);
		pBtn.setBounds(75, 50, 150, 100);
		Font font20 = new Font("Serif", Font.HANGING_BASELINE, 20);
		pBtn.setFont(font20);
		pBtn.setBackground(new Color(0, 0, 0));
		pBtn.setForeground(new Color(255, 255, 255));
		
		//��ǰ ���� ��ư �̺�Ʈó��
		pBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new M_Product().M_ProductGUI();
			}
		});
		
		//��� ���
		oBtn = new Button("Quantity Modify");
		add(oBtn);
		oBtn.setBounds(75, 170, 150, 100);
		oBtn.setFont(font20);
		oBtn.setBackground(new Color(0, 0, 0));
		oBtn.setForeground(new Color(255, 255, 255));
		
		//��� ��� ��ư �̺�Ʈó��
		oBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new M_Modify().M_ModifyGUI();
			}
		});
		
		Termination();
		setLocationRelativeTo(null);
		setVisible(true);
		
		
	}
	
	//��� ����
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\300_300.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
}

//��ǰ ���� ����
class M_Product extends M_Choice{
	List productList = new List(20);
	Label codelbl, kindlbl, namelbl, pricelbl, sizelbl, resultlbl;
	TextField codeTf, kindTf, nameTf, priceTf, sizeTf;
	Button p_modifyBtn, p_deleteBtn, backBtn;

	public void M_ProductGUI() {
		displayAll();
		setTitle("Product Modify");
		M_Frame();
		add(productList);
		M_List(productList);
		
		//�ڵ� ��
		codelbl = new Label("Code");
		add(codelbl);
		codelbl.setBounds(50, 360, 45, 30);
		M_Label(codelbl);
		
		//�ڵ� �ؽ�Ʈ�ʵ�
		codeTf = new TextField("Code Number");
		add(codeTf);
		codeTf.setBounds(95, 363, 150, 25);
		M_TextField(codeTf);
		M_TextClear(codeTf);
		
		//ī�װ� ��
		kindlbl = new Label("Kind");
		add(kindlbl);
		kindlbl.setBounds(270, 360, 45, 30);
		M_Label(kindlbl);
		
		//ī�װ� �ؽ�Ʈ�ʵ�
		kindTf = new TextField("Kind");
		add(kindTf);
		kindTf.setBounds(315, 363, 100, 25);
		M_TextField(kindTf);
		M_TextClear(kindTf);
		
		//�̸� ��
		namelbl = new Label("Name");
		add(namelbl);
		namelbl.setBounds(50, 400, 45, 30);
		M_Label(namelbl);
		
		//�̸� �ؽ�Ʈ�ʵ�
		nameTf = new TextField("Name");
		add(nameTf);
		nameTf.setBounds(95, 403, 150, 25);
		M_TextField(nameTf);
		M_TextClear(nameTf);
		
		//������ ��
		sizelbl = new Label("Size");
		add(sizelbl);
		sizelbl.setBounds(270, 400, 45, 30);
		M_Label(sizelbl);
		
		//������ �ؽ�Ʈ�ʵ�
		sizeTf = new TextField("Size");
		add(sizeTf);
		sizeTf.setBounds(315, 403, 80, 25);
		M_TextField(sizeTf);
		M_TextClear(sizeTf);
		
		//���� ��
		pricelbl = new Label("Price");
		add(pricelbl);
		pricelbl.setBounds(50, 440, 45, 25);
		M_Label(pricelbl);
		
		//���� �ؽ�Ʈ�ʵ� 
		priceTf = new TextField("Price");
		add(priceTf);
		priceTf.setBounds(95, 443, 80, 25);
		M_TextField(priceTf);
		M_TextClear(priceTf);

		//����/���� �� �����?
		//���� �ϳ��� ������ �ٽ� �Է��ϵ���? �ƴϸ� �ٽ� â�� ����ǵ���?
		resultlbl = new Label();
		add(resultlbl);
		resultlbl.setBounds(0, 470, 500, 32);
		resultlbl.setBackground(new Color(0, 0, 0));
		resultlbl.setFont(font15);
		//�� �������
		resultlbl.setAlignment(Label.CENTER);
		
		//��ǰ ���� ��ư
		p_modifyBtn = new Button("Modify");
		add(p_modifyBtn);
		p_modifyBtn.setBounds(210, 440, 60, 30);
		M_Button(p_modifyBtn);
		
		//��ǰ ���� ��ư �̺�Ʈ ó�� �κ�
		p_modifyBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String code = codeTf.getText().toUpperCase();
				String kind = kindTf.getText().toUpperCase();
				String name = nameTf.getText().toUpperCase();
				int price = 0;
				int size = 0;
				try {
					//price�� size�� ���� �Էµ��� �ʰų� ���ڰ� �ԷµǸ�
					//NumberFormatException �߻�
					price = Integer.parseInt(priceTf.getText());
					size = Integer.parseInt(sizeTf.getText());
				} catch (NumberFormatException e2) {
					e2.printStackTrace();
					resultlbl.setText("���� ���� : ������ ������ �ֽ��ϴ�.");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				
				//name�� ���� �Էµ��� �ʴ� ���
				if(name.isEmpty()) {
					resultlbl.setText("���� ���� : ������ ������ �ֽ��ϴ�.");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				
				DAO dao = new DAO();
				Product temp = new Product(code, kind, name, price, size);
				try {
					dao.update(temp);
				} catch (ClassNotFoundException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					//code, kind�� �ߺ��� ��ǰ �Է½� ���� �߻�
					resultlbl.setText("���� ���� : Code�� Kind�� �ٽ� Ȯ�����ּ���.");
					resultlbl.setForeground(new Color(255, 0, 0));
					e1.printStackTrace();
					return;
				}
				int check = 0;//���� �ڵ� ���� �ִ��� Ȯ��
				Iterator<Product> it = dao.getListP().iterator();
				while(it.hasNext()) {
					Product p = it.next();
					if(p.getP_code().equals(code)&&p.getKind().equals(kind)) {
						check = 1;
					}
				}
				if(check==1) {
					resultlbl.setText("���� ����! "+code+"/"+kind+"/"+name+"/"+price+"/"+size);
					resultlbl.setForeground(new Color(255, 255, 255));					
				}else {
					resultlbl.setText("���� ���� : Code�� Kind�� �ٽ� Ȯ�����ּ���.");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				
				displayAll();
			}
		});
		
		//���� ��ư
		p_deleteBtn = new Button("Delete");
		add(p_deleteBtn);
		p_deleteBtn.setBounds(290, 440, 60, 30);
		M_Button(p_deleteBtn);
	
		//���� ��ư �̺�Ʈó��
		p_deleteBtn.addActionListener(new ActionListener() {
			int check = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				String code = codeTf.getText().toUpperCase();
				DAO dao = new DAO();
				Iterator<Product> pi = dao.getListP().iterator();
				while(pi.hasNext()) {
					Product p = pi.next();
					if(p.getP_code().equals(code)) {
						check = 1;//code�� ���� ���� �̹� ������ check = 1;
					}
				}
				if(check==1) {
					resultlbl.setText("���� ����! "+code);
					resultlbl.setForeground(new Color(255, 255, 255));
				}else {
					resultlbl.setText("���� ���� : Code�� Kind�� �ٽ� Ȯ�����ּ���.");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				try {
					dao.delete(code);
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				resultlbl.setText("���� ����! "+codeTf.getText());
				resultlbl.setForeground(new Color(255, 255, 255));
				displayAll();
			}
		});
		
		//�ڷΰ��� ��ư
		backBtn = new Button("Back");
		add(backBtn);
		backBtn.setBounds(370, 440, 60, 30);
		M_Button(backBtn);
		M_BackBtn(backBtn);

		//�������� Ŭ������ �� �������� ������ �ؽ�Ʈ�ʵ忡 ���� �̺�Ʈ ó��
		productList.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = productList.getSelectedItem();
				StringTokenizer st = new StringTokenizer(str,"��");
				//�����ڿ� ���Ⱑ ���� ����� �ν��ع���
				codeTf.setText(st.nextToken());
				kindTf.setText(st.nextToken());
				//kindCi.getSelectedIndex();//���̽��� ����ִ� ���� �ε����� ����
				nameTf.setText(st.nextToken());
				priceTf.setText(st.nextToken());
				sizeTf.setText(st.nextToken());
				//sizeCi.getSelectedItem();//���̽��� ����ִ� ���� ����

			}
		});
	}

	//��� ����
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\500_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
	//List�� product table ���
	public void displayAll() {
		productList.removeAll();//�� ����Ʈ�κ��� ��� �׸� ����
		DAO dao = new DAO();
		java.util.List<Product> allData = dao.getListP();
		for(Product p : allData) {
			String code = p.getP_code();
			String kind = p.getKind();
			String name = p.getP_name();
			int price = p.getPrice();
			int size = p.getP_size();
			productList.add(code + "��" + kind + "��" + name + "��" + 
			price + "��" + size);
		}	
	}
}

//input ���̺� ���
class M_Modify extends M_Choice{
	List modifyList = new List(20);
	Label datelbl, quantitylbl;
	TextField dateTf, quantityTf;
	Button mBtn, dBtn, uBtn, sBtn, addBtn, clearBtn;
	public void M_ModifyGUI() {
		displayAll(modifyList);
		setTitle("Modify");
		M_Frame();
		add(modifyList);
		M_List(modifyList);
		
		//�ڵ� ��
		codelbl = new Label("Code");
		add(codelbl);
		codelbl.setBounds(50, 360, 45, 30);
		M_Label(codelbl);
		
		//�ڵ� �ؽ�Ʈ�ʵ�
		codeTf = new TextField("Code Number");
		add(codeTf);
		codeTf.setBounds(95, 363, 150, 25);
		M_TextField(codeTf);
		M_TextClear(codeTf);
		
		//ī�װ� ��
		kindlbl = new Label("Kind");
		add(kindlbl);
		kindlbl.setBounds(270, 360, 45, 30);
		M_Label(kindlbl);
		
		//ī�װ� �ؽ�Ʈ�ʵ�
		kindTf = new TextField("Kind");
		add(kindTf);
		kindTf.setBounds(315, 363, 100, 25);
		M_TextField(kindTf);
		M_TextClear(kindTf);
		
		//��¥ ��
		datelbl = new Label("Date");
		add(datelbl);
		datelbl.setBounds(50, 400, 45, 30);
		M_Label(datelbl);
		
		//��¥ �ؽ�Ʈ�ʵ�
		dateTf= new TextField("Date");
		add(dateTf);
		dateTf.setBounds(95, 403, 150, 25);
		M_TextField(dateTf);
		M_TextClear(dateTf);
		
		//���� ��
		quantitylbl = new Label("Quantity");
		add(quantitylbl);
		quantitylbl.setBounds(270, 400, 65, 30);
		M_Label(quantitylbl);
		
		//���� �ؽ�Ʈ�ʵ�
		quantityTf = new TextField("Quantity");
		add(quantityTf);
		quantityTf.setBounds(335, 403, 80, 25);
		M_TextField(quantityTf);
		M_TextClear(quantityTf);
		
		resultlbl = new Label();
		add(resultlbl);
		resultlbl.setBounds(0, 470, 500, 32);
		resultlbl.setBackground(new Color(0, 0, 0));
		resultlbl.setFont(font15);
		//�� �������
		resultlbl.setAlignment(Label.CENTER);
		
		//���� �߰� ��ư
		addBtn = new Button("Add");
		add(addBtn);
		addBtn.setBounds(60, 440, 60, 30);
		M_Button(addBtn);
		
		//����  �߰� �̺�Ʈ ó��
		addBtn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				String code = codeTf.getText().toUpperCase();
				String kind = kindTf.getText().toUpperCase();
				String date = dateTf.getText().toUpperCase();
				java.sql.Date sdate = java.sql.Date.valueOf(date);
				int quantity = Integer.parseInt(quantityTf.getText());				
				DAO dao = new DAO();
				Input temp = new Input(code, kind, sdate, quantity);
				try {
					dao.q_Update(temp);
					displayAll(modifyList);
					resultlbl.setText("�߰� ����! "+code+"/"+quantity+"ea");
					resultlbl.setForeground(new Color(255, 255, 255));
				} catch (ClassNotFoundException | SQLException e1) {
					resultlbl.setText("�߰� ���� : �ٽ� �õ����ּ���.");
					resultlbl.setForeground(new Color(255, 0, 0));
					e1.printStackTrace();
				}
			}
		});
		
		//���� ��ư
		mBtn = new Button("Modify");
		add(mBtn);
		mBtn.setBounds(140, 440, 60, 30);
		M_Button(mBtn);
		
		//���� ��ư �̺�Ʈ ó��
		//��¥ ������ yyyyMMdd�� �ƴϸ� ���� �߻�
		mBtn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String code = codeTf.getText().toUpperCase();
				String kind = kindTf.getText().toUpperCase();
				String date = dateTf.getText().toUpperCase();
				java.sql.Date sdate;
				try {
					sdate = java.sql.Date.valueOf(date);
					int quantity = Integer.parseInt(quantityTf.getText());
					DAO dao = new DAO();
					Input temp;
					if(kind.isEmpty()) {//kind�� �Է��ص� �ǰ� ���ص� �ǰ�
						temp = new Input(code, sdate, quantity);
					}else {
						temp = new Input(code, kind, sdate, quantity);
						
					}
					try {
						dao.update(temp);
					} catch (ClassNotFoundException | SQLException e1) {
						e1.printStackTrace();
					}			
					displayAll(modifyList);
					resultlbl.setText("���� ����! "+code+"/"+kind+"/"+date+"/"+quantity+"ea");
					resultlbl.setForeground(new Color(255, 255, 255));
				} catch (Exception e2) {
					resultlbl.setText("���� ���� : yyyyDDmm �������� �Է����ּ���.");
					resultlbl.setForeground(new Color(255, 0, 0));
					e2.printStackTrace();
				}
			}
		});
		
		//���� ��ư
		dBtn = new Button("Delete");
		add(dBtn);
		dBtn.setBounds(220, 440, 60, 30);
		M_Button(dBtn);
		
		//���� ��ư �̺�Ʈ ó��
		dBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int check = 0;
					String code = codeTf.getText().toUpperCase();
					DAO dao = new DAO();
					Iterator<Input> it = dao.getListI().iterator();
					while(it.hasNext()) {
						Input i = it.next();
						if(i.getP_code().equals(code)) {
							check = 1;
						}
					}
					if(check ==1) {
						resultlbl.setText("���� ����! "+code);
						resultlbl.setForeground(new Color(255, 255, 255));		
					}else {
						resultlbl.setText("���� ���� : Code�� Kind�� �ٽ� Ȯ�����ּ���.");
						resultlbl.setForeground(new Color(255, 0, 0));
						return;
					}
					dao.idelete(code);
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				displayAll(modifyList);
			}
		});
		
		//����� ��ư
		clearBtn = new Button("Clear");
		add(clearBtn);
		clearBtn.setBounds(300, 440, 60, 30);
		M_Button(clearBtn);
		
		//����� ��ư �̺�Ʈ ó��
		//�ؽ�Ʈ�ʵ��� ������ ����ش�.
		clearBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				codeTf.setText("");
				kindTf.setText("");
				dateTf.setText("");
				quantityTf.setText("");
				resultlbl.setText("Clear!");
				resultlbl.setForeground(new Color(255, 255, 255));
			}
		});
		
		//�ڷΰ��� ��ư
		backBtn = new Button("Back");
		add(backBtn);
		backBtn.setBounds(380, 440, 60, 30);
		M_Button(backBtn);
		M_BackBtn(backBtn);	
		
		displayAll(modifyList);
	}//M_ModifyGUI
	
	//��� ����
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\500_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
	//List�� input table ���
	public void displayAll(List l) {
		l.removeAll();//�� ����Ʈ�κ��� ��� �׸� ����
		DAO dao = new DAO();
		try {
			java.util.List<Input> allData = dao.getListI();
			for(Input i : allData) {
				String code = i.getP_code();
				String kind = i.getKind();
				Date date = i.getI_date(); 
				int quantity = i.getQuantity();
				//date�� null�� �ִ� ��� NullPointException �߻�
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				l.add(code + "��" + kind + "��" + date + "��" + 
						quantity);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		//List ������ Ŭ���� �ؽ�Ʈ�ʵ忡 �ش� ������ ��
		l.addItemListener(new ItemListener() {		
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = l.getSelectedItem();
				StringTokenizer st = new StringTokenizer(str,"��");
				codeTf.setText(st.nextToken());
				kindTf.setText(st.nextToken());
				dateTf.setText(st.nextToken());
				quantityTf.setText(st.nextToken());
			}
		});
	}//end displayAll
	
	//yyyymmdd �������� �Էµǰ� ����� �޼ҵ�
	//�ٸ� �������� �Է��ϸ� �� ������
//	public java.sql.Date transDate(String date) {
//		SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyymmdd");
//		SimpleDateFormat afterFormat = new SimpleDateFormat("yyyy-mm-dd");
//		java.util.Date tempDate = null;
//		try {
//			//yyyymmdd�� �� ��¥ �������� java.util.Date��ü �����
//			tempDate = beforeFormat.parse(date);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		//java.util.Date�� yyyy-mm-dd�������� �����Ͽ� STring���� ��ȯ.
//		String transDate = afterFormat.format(tempDate);
//		//��ȯ�� String ���� Date�� ����
//		return java.sql.Date.valueOf(transDate);
//		
//	}
	
}//end M_Modify

//������
class M_SalesList extends M_Modify{
	List salesList = new List(20);
	List searchResultList = new List(20);
	
	public void M_SalesListGUI() {
		displayAll();
		setTitle("List of Sales");
		M_Frame();
		add(salesList);
		M_List(salesList);
		
		//�ڵ� ��
		codelbl = new Label("Code");
		add(codelbl);
		codelbl.setBounds(50, 360, 45, 30);
		M_Label(codelbl);
		
		//�ڵ� �ؽ�Ʈ�ʵ�
		codeTf = new TextField("Code Number");
		add(codeTf);
		codeTf.setBounds(95, 363, 150, 25);
		M_TextField(codeTf);
		M_TextClear(codeTf);
		
		//ī�װ� ��
		kindlbl = new Label("Kind");
		add(kindlbl);
		kindlbl.setBounds(270, 360, 45, 30);
		M_Label(kindlbl);
		
		//ī�װ� �ؽ�Ʈ�ʵ�
		kindTf = new TextField("Kind");
		add(kindTf);
		kindTf.setBounds(315, 363, 100, 25);
		M_TextField(kindTf);
		M_TextClear(kindTf);
		
		//��¥ ��
		datelbl = new Label("Date");
		add(datelbl);
		datelbl.setBounds(50, 400, 45, 30);
		M_Label(datelbl);
		
		//��¥ �ؽ�Ʈ�ʵ�
		dateTf= new TextField("Date");
		add(dateTf);
		dateTf.setBounds(95, 403, 150, 25);
		M_TextField(dateTf);
		M_TextClear(dateTf);
		
		//���� ��
		quantitylbl = new Label("Quantity");
		add(quantitylbl);
		quantitylbl.setBounds(270, 400, 65, 30);
		M_Label(quantitylbl);
		
		//���� �ؽ�Ʈ�ʵ�
		quantityTf = new TextField("Quantity");
		add(quantityTf);
		quantityTf.setBounds(335, 403, 80, 25);
		M_TextField(quantityTf);
		M_TextClear(quantityTf);
		
		resultlbl = new Label();
		add(resultlbl);
		resultlbl.setBounds(0, 470, 500, 32);
		resultlbl.setBackground(new Color(0, 0, 0));
		resultlbl.setFont(font15);
		//�� �������
		resultlbl.setAlignment(Label.CENTER);
		
		//�˻� ��ư
		sBtn = new Button("Search");
		add(sBtn);
		sBtn.setBounds(100, 440, 60, 30);
		M_Button(sBtn);
		
		//�˻� ��ư �̺�Ʈ ó��
		//�ڵ� �Է��ϰ� ��ư ������ �ڷᰡ �ؽ�Ʈ�ʵ忡 ����
		sBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				remove(salesList);
				searchResultList.removeAll();
				String code = codeTf.getText().toUpperCase();
				//code�� �Է� ���ϰ� ��ư ������ ��
				if(code.isEmpty()) {
					resultlbl.setText("�˻� ���� : Code�� �Է��ϼ���");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				Output output = new Output();
				DAO dao = new DAO();
				output = dao.oSearch(code);
				add(searchResultList);
				M_List(searchResultList);
				searchResultList.add(output.getP_code()+"��"+output.getKind()+"��"+output.getO_date()+
						"��"+output.getQuantity()+"��"+output.getTotalPrice()+"��"+(output.getQuantity()*output.getTotalPrice()));
				codeTf.setText(output.getP_code());
				kindTf.setText(output.getKind());
				dateTf.setText(String.valueOf(output.getO_date()));
				quantityTf.setText(String.valueOf(output.getQuantity()));

				
			}
		});
		
		
		clearBtn = new Button("Clear");
		add(clearBtn);
		clearBtn.setBounds(220, 440, 60, 30);
		M_Button(clearBtn);
		
		clearBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				codeTf.setText("");
				kindTf.setText("");
				dateTf.setText("");
				quantityTf.setText("");
				resultlbl.setText("Clear!");
				resultlbl.setForeground(new Color(255, 255, 255));		
			}
		});
		
		//�ڷΰ��� ��ư
		backBtn = new Button("Back");
		add(backBtn);
		backBtn.setBounds(350, 440, 60, 30);
		M_Button(backBtn);
		M_BackBtn(backBtn);	
		
		
			
	}//end M_SalesListGUI
	
	//List�� output table ���
	public void displayAll() {
		salesList.removeAll();//�� ����Ʈ�κ��� ��� �׸� ����
		DAO dao = new DAO();
		try {
			java.util.List<Output> allData = dao.getListO();
			for(Output o : allData) {
				String code = o.getP_code();
				String kind = o.getKind();
				Date date = o.getO_date();
				int quantity = o.getQuantity();
				int price = o.getTotalPrice();
				salesList.add(code + "��" + kind + "��" + date + "��" + 
			quantity + "��" + price+ "��" + (quantity*price));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}//end displayAll();
}//end M_SalesList

//�����
//input ���̺� �����͸� List�� ���
class M_InventoryList extends M_Modify{
	List inputSearchList = new List(20);
	List searchResultList = new List(20);
	public void M_InventoryListGUI() {
		displayAll(inputSearchList);
		setTitle("Inventory List");
		M_Frame();
		add(inputSearchList);
		M_List(inputSearchList);
		
		//�ڵ� ��
		codelbl = new Label("Code");
		add(codelbl);
		codelbl.setBounds(50, 360, 45, 30);
		M_Label(codelbl);
		
		//�ڵ� �ؽ�Ʈ�ʵ�
		codeTf = new TextField("Code Number");
		add(codeTf);
		codeTf.setBounds(95, 363, 150, 25);
		M_TextField(codeTf);
		M_TextClear(codeTf);
		
		//ī�װ� ��
		kindlbl = new Label("Kind");
		add(kindlbl);
		kindlbl.setBounds(270, 360, 45, 30);
		M_Label(kindlbl);
		
		//ī�װ� �ؽ�Ʈ�ʵ�
		kindTf = new TextField("Kind");
		add(kindTf);
		kindTf.setBounds(315, 363, 100, 25);
		M_TextField(kindTf);
		M_TextClear(kindTf);
		
		//��¥ ��
		datelbl = new Label("Date");
		add(datelbl);
		datelbl.setBounds(50, 400, 45, 30);
		M_Label(datelbl);
		
		//��¥ �ؽ�Ʈ�ʵ�
		dateTf= new TextField("Date");
		add(dateTf);
		dateTf.setBounds(95, 403, 150, 25);
		M_TextField(dateTf);
		M_TextClear(dateTf);
		
		//���� ��
		quantitylbl = new Label("Quantity");
		add(quantitylbl);
		quantitylbl.setBounds(270, 400, 65, 30);
		M_Label(quantitylbl);
		
		//���� �ؽ�Ʈ�ʵ�
		quantityTf = new TextField("Quantity");
		add(quantityTf);
		quantityTf.setBounds(335, 403, 80, 25);
		M_TextField(quantityTf);
		M_TextClear(quantityTf);
		
		resultlbl = new Label();
		add(resultlbl);
		resultlbl.setBounds(0, 470, 500, 32);
		resultlbl.setBackground(new Color(0, 0, 0));
		resultlbl.setFont(font15);
		//�� �������
		resultlbl.setAlignment(Label.CENTER);
		
		//�˻� ��ư
		sBtn = new Button("Search");
		add(sBtn);
		sBtn.setBounds(100, 440, 60, 30);
		M_Button(sBtn);
		
		//�˻� ��ư �̺�Ʈ ó��
		//�ڵ� �Է��ϰ� ��ư ������ �ڷᰡ �ؽ�Ʈ�ʵ忡 ����
		sBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				remove(inputSearchList);
				String code = codeTf.getText().toUpperCase();
				//code�� �Է� ���ϰ� ��ư ������ ��
				if(code.isEmpty()) {
					resultlbl.setText("�˻� ���� : Code�� �Է��ϼ���");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				Input input = new Input();
				DAO dao = new DAO();
				input = dao.iSearch(code);
				add(searchResultList);
				M_List(searchResultList);
				searchResultList.add(input.getP_code()+"��"+input.getKind()+"��"+input.getI_date()+"��"+input.getQuantity());
				codeTf.setText(input.getP_code());
				kindTf.setText(input.getKind());
				dateTf.setText(String.valueOf(input.getI_date()));
				quantityTf.setText(String.valueOf(input.getQuantity()));
			}
		});
		
		/*
		 * //�˻� ��ư �̺�Ʈ ó��
		 * code�� �Է����� ��� ��� ���(o)
		 * kind�� �Է����� ��� ��� ���(o)
		 * date�� �Է����� ��� ��� ���(x)
      //�ڵ� �Է��ϰ� ��ư ������ �ڷᰡ �ؽ�Ʈ�ʵ忡 ����
      sBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            remove(inputSearchList);
            String code = codeTf.getText().toUpperCase();
            String kind = kindTf.getText().toUpperCase();
            Date date = java.sql.Date.valueOf(dateTf.getText());
            String quantity = quantityTf.getText();
            if(!code.isEmpty()) {
               //code�� �Է� ���ϰ� ��ư ������ ��
               if(code.isEmpty()) {
                  resultlbl.setText("�˻� ���� : Code�� �Է��ϼ���");
                  resultlbl.setForeground(new Color(255, 0, 0));
                  return;
               }
               Input input = new Input();
               DAO dao = new DAO();
               input = dao.iSearch(code);
               add(searchResultList);
               M_List(searchResultList);
               searchResultList.add(input.getP_code()+"��"+input.getKind()+"��"+input.getI_date()+"��"+input.getQuantity());
               codeTf.setText(input.getP_code());
               kindTf.setText(input.getKind());
               dateTf.setText(String.valueOf(input.getI_date()));
               quantityTf.setText(String.valueOf(input.getQuantity()));
            }else if(!kind.isEmpty()) {
               Input input = new Input();
               DAO dao = new DAO();
               input = dao.kSearch(kind);
               add(searchResultList);
               M_List(searchResultList);
               searchResultList.add(input.getP_code()+"��"+input.getKind()+"��"+input.getI_date()+"��"+input.getQuantity());
               codeTf.setText(input.getP_code());
               kindTf.setText(input.getKind());
               dateTf.setText(String.valueOf(input.getI_date()));
               quantityTf.setText(String.valueOf(input.getQuantity()));
            }else if(!date.equals(null)) {// ���� �߻�
               Input input = new Input();
               DAO dao = new DAO();
               input = dao.dSearch(date);
               add(searchResultList);
               M_List(searchResultList);
               searchResultList.add(input.getP_code()+"��"+input.getKind()+"��"+input.getI_date()+"��"+input.getQuantity());
               codeTf.setText(input.getP_code());
               kindTf.setText(input.getKind());
               dateTf.setText(String.valueOf(input.getI_date()));
               quantityTf.setText(String.valueOf(input.getQuantity()));      
            }
         }
      });
		 */
		//Clear ��ư �߰�
		clearBtn = new Button("Clear");
		add(clearBtn);
		clearBtn.setBounds(220, 440, 60, 30);
		M_Button(clearBtn);
		
		//Clear ��ư �̺�Ʈ ó��
		clearBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				codeTf.setText("");
				kindTf.setText("");
				dateTf.setText("");
				quantityTf.setText("");
				resultlbl.setText("Clear!");
				resultlbl.setForeground(new Color(255, 255, 255));		
			}
		});
		
		//�ڷΰ��� ��ư
		backBtn = new Button("Back");
		add(backBtn);
		backBtn.setBounds(350, 440, 60, 30);
		M_Button(backBtn);
		M_BackBtn(backBtn);	
		
		displayAll(inputSearchList);
			
	}//end M_InventoryListGUI
}//end M_InventoryList



