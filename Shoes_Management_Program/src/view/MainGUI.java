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
 * MainGUI -> 메인화면
 * LoginGUI -> 로그인화면
 * ManagerGUI -> 관리자화면
 * ShoppingGUI -> 카테고리 선택 화면
 * KindGUI -> 카테고리 내부 신발 종류
 * SalesList -> 메인 2번 프레임
 * Search -> 메인 3번 프레임
 * M_Input -> 관리자 재고입력
 * M_Choice -> 수정 메뉴
 * M_Product -> 제품 수정
 * M_Modify -> 관리자 수정
 * M_SalesList -> 관리자 매출목록
 * M_InventoryList -> 관리자 재고목록
 */

/* 
 * 전체적인 코드 정리하기(자주 쓰는거 메소드로 만들어서 상속으로 이어받아서 사용할 수 있게) 
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
		setResizable(false);//최대화버튼 막기
		setLocationRelativeTo(null);//Frame 화면 가운데로, setSize보다 위에 있으면 적용되지 않음 
		Termination();//닫기 버튼 메소드
		setVisible(true);//프레임 활성화

		
		//관리자 로그인 메뉴바
		//메뉴바 단축키 지정은 스윙부터 가능함
		menuBar = new MenuBar();//MenuBar 생성
		setMenuBar(menuBar);
		
		managerMenu = new Menu("Manager");//Menu 생성
		menuBar.add(this.managerMenu);
		
		login = new MenuItem("Login");//Menu 안에 목록 생성
		managerMenu.add(login);
		
		//login 눌렀을 때 발생하는 이벤트
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);//메인화면 비활성화
				//new LoginGUI();//Login창 호출
				LoginGUI lg = new LoginGUI();
				lg.loginGUI();
			}
		});	
		
		setLayout(null);
		//Title 라벨
		lblTitle = new Label("Shoes Market");
		lblTitle.setFont(lblFont);
		add(lblTitle);
		lblTitle.setBounds(35, 50, 230, 100);
		lblTitle.setBackground(new Color(0, 0, 0));
		lblTitle.setForeground(new Color(255, 255, 255));
		
		
		
		//쇼핑 버튼
		shopBtn = new Button("Shopping");
		add(shopBtn);
		shopBtn.setBounds(65, 150, 170, 80);
		mainBtn(shopBtn);
		
		//shopBtn 이벤트 처리
		btnEvent(shopBtn);
		
		//구매목록 버튼
		salesListBtn = new Button("SalesList");
		add(salesListBtn);
		salesListBtn.setBounds(65, 260, 170, 80);
		mainBtn(salesListBtn);
		
		//salesListBtn 이벤트 처리
		btnEvent(salesListBtn);
		
		//Search 버튼
		searchBtn = new Button("Search");
		add(searchBtn);
		searchBtn.setBounds(65, 370, 170, 80);
		mainBtn(searchBtn);
		btnEvent(searchBtn);
	
	}//end mainGUI
	
	//버튼 이벤트 처리
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
	
	//버튼 구현
	public void mainBtn(Button b) {
		b.setFont(btnFont);
		b.setBackground(new Color(0, 0, 0));
		b.setForeground(new Color(255, 255, 255));
	}
	
	//이미지 불러오는 메소드
	@Override
	public void paint(Graphics g) {
		Toolkit mainTool = Toolkit.getDefaultToolkit();
		Image mainImg = mainTool.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\300_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
	//닫기 버튼 활성화 메소드
	public void Termination() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			};
		});
	}//end Termination
	
	//프레임 시작 부분
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
		//Title 라벨
		lblTitle = new Label("Manager Login", Label.CENTER);
		Font loginFont = new Font("SansSerif", Font.BOLD, 30);
		lblTitle.setFont(loginFont);
		lblTitle.setBackground(new Color(0, 0, 0));//라벨 배경색
		lblTitle.setForeground(new Color(255, 255, 255));//글자 색
		//ID 라벨
		lblID = new Label("ID");
		Font idPwFont = new Font("Serif", Font.PLAIN, 20);
		lblID.setFont(idPwFont);
		lblID.setBackground(new Color(0, 0, 0));//라벨 배경색
		lblID.setForeground(new Color(255, 255, 255));//글자 색
		//PW 라벨
		lblPW = new Label("PW");
		lblPW.setFont(idPwFont);
		lblPW.setBackground(new Color(0, 0, 0));//라벨 배경색
		lblPW.setForeground(new Color(255, 255, 255));//글자 색
		//ID, PW 텍스트필드
		tfID = new TextField("ManagerID");//TextField에 ManagerID라고 보임
		tfPW = new TextField("Password");//TextField에 Password라고 보임
		tfPW.setEchoChar('*');//입력한 문자 대신 *이 보임
		//Login 버튼
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
		
		//tfID 누르면 입력되있는 ID가 사라짐
		tfID.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfID.setText("");
			}
		});
							
		//tfPW 누르면 입력되있는 비밀번호가 사라짐
		tfPW.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfPW.setText("");
			}
		});
		
		//로그인 버튼 이벤트 처리
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
					loginDialog.setLayout(new FlowLayout());//FlowLayout : 화면의 크기를 조절하면 글씨들도 같이 움직임, 그림판의 텍스트창같이
					loginDialog.setSize(200, 120);
					loginDialog.setTitle("Login Failed");
					lblFailed = new Label("ID와 PW를 확인해주세요.["+loginCnt+"/3]");
					lblFailed.setForeground(new Color(255,0,0));
					loginDialog.add(lblFailed);
					Button btnOk = new Button("확 인");
					loginDialog.add(btnOk);
					
					//btnOK 누르면 Dialog 닫기
					btnOk.addActionListener(new ActionListener() {//btnOK 버튼 누르면 호출
						@Override
						public void actionPerformed(ActionEvent e) {
							loginDialog.dispose();//Dialog 닫기
						}
					});
					
					//Loginfailed Dialog 닫기 버튼 활성화
					loginDialog.addWindowListener(new WindowAdapter() {//닫기버튼 누르면 호출
						public void windowClosing(WindowEvent e) {
							loginDialog.dispose();//닫기
						};
					} );	
					
					loginDialog.setResizable(false);
					loginDialog.setLocation( ((loginDialog.getToolkit().getScreenSize()).width - loginDialog.getWidth()) / 2,
				            ((loginDialog.getToolkit().getScreenSize()).height - loginDialog.getHeight() ) / 2   );
					loginDialog.setVisible(true);
					if(loginCnt==3) {
						lblFailed.setText("ID와 PW가 틀렸습니다.["+loginCnt+"/3]");
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
			
		setTitle("로그인");
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

//관리자 메뉴
class ManagerGUI extends MainGUI{
	Button M_InputBtn, M_ModifyBtn, M_SalesListBtn,  M_InventoryListBtn, M_OutBtn, M_BackBtn;
	Label M_Title;
	Font btnFont = new Font("Serif", Font.HANGING_BASELINE, 20);//폰트 하나로 동일하는거 만들기
	Font listFont = new Font("Serif", Font.HANGING_BASELINE, 15);
	Font lblFont = new Font("Serif", Font.HANGING_BASELINE, 30);
	
	public void managerGUI() {
		setTitle("관리자 전용");
		setSize(300, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		
		//메인 라벨
		M_Title = new Label("Manager Space");
		add(M_Title);
		M_Title.setBounds(51, 30, 195, 50);
		M_Title.setFont(lblFont);
		M_Title.setBackground(new Color(0, 0, 0));
		M_Title.setForeground(new Color(255, 255, 255));
		
		//재고 입력 버튼
		M_InputBtn = new Button("Inventory Input");
		add(M_InputBtn);
		M_ButtonSt(M_InputBtn);
		M_InputBtn.setBounds(75, 85, 150, 50);
		M_ButtonEv(M_InputBtn);
		
		//수정 버튼
		M_ModifyBtn = new Button("Modify");
		add(M_ModifyBtn);
		M_ButtonSt(M_ModifyBtn);
		M_ModifyBtn.setBounds(75, 155, 150, 50);
		M_ButtonEv(M_ModifyBtn);
		
		//매출 목록 버튼
		M_SalesListBtn = new Button("Sales List");
		add(M_SalesListBtn);
		M_ButtonSt(M_SalesListBtn);
		M_SalesListBtn.setBounds(75, 225, 150, 50);
		M_ButtonEv(M_SalesListBtn);
		
		//재고 목록 버튼
		M_InventoryListBtn = new Button("Inventory List");
		add(M_InventoryListBtn);
		M_ButtonSt(M_InventoryListBtn);
		M_InventoryListBtn.setBounds(75, 295, 150, 50);
		M_ButtonEv(M_InventoryListBtn);
		
		//뒤로가기 버튼
		M_BackBtn = new Button("Back");
		add(M_BackBtn);
		M_ButtonSt(M_BackBtn);
		M_BackBtn.setBounds(75, 365, 150, 50);
		
		//뒤로가기 버튼 이벤트처리
		M_BackBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new MainGUI().mainGUI();
			}
		});
		
		//나가기 버튼
		M_OutBtn = new Button("Exit");
		add(M_OutBtn);
		M_ButtonSt(M_OutBtn);
		M_OutBtn.setBounds(75, 435, 150, 50);
		
		//나가기 버튼 이벤트 처리, 바로 종료(x버튼과 동일)
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
	
	//버튼 구현
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
	
	
	
	//ShoppingGUI 프레임 열기
	public void shoppingGUI() {
		setTitle("Shopping");
		setSize(300, 500);
		setLocationRelativeTo(null);
		setResizable(false);
		
		Termination();
		
		setVisible(true);
		
		setLayout(null);
		//Running Shoes 버튼
		rBtn = new Button("Running");
		add(rBtn);
		rBtn.setBounds(100, 100, 100, 100);
		shoppingBtn(rBtn);		
		btnEvent(rBtn);
		
		//Boots 버튼
		bBtn = new Button("Boots");
		add(bBtn);
		bBtn.setBounds(200, 200, 100, 100);
		shoppingBtn(bBtn);		
		btnEvent(bBtn);
		
		//Sneakers 버튼
		sBtn = new Button("Sneakers");
		add(sBtn);
		sBtn.setBounds(0, 200, 100, 100);
		shoppingBtn(sBtn);		
		btnEvent(sBtn);
		
		//Other Shoes 버튼
		oBtn = new Button("Other");
		add(oBtn);
		oBtn.setBounds(100, 300, 100, 100);
		shoppingBtn(oBtn);
		btnEvent(oBtn);
		
		//Back 버튼
		backBtn = new Button("Back");
		add(backBtn);
		backBtn.setBounds(100, 200, 100, 100);
		shoppingBtn(backBtn);
		btnEvent(backBtn);
	}
	
	//이동 버튼
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
	
	//버튼 구현
	public void shoppingBtn(Button b) {
		b.setFont(btnFont);
		b.setBackground(new Color(0, 0, 0));	
		b.setForeground(new Color(255, 255, 255));
	}
	
	//배경 구현
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
	 * 01/18 사용자 구매 버튼 구현하기
	 */
	
	//러닝화
	public void RunningGUI() {
		setTitle("Running");
		kindFrame();
		//리스트
		runList = new List(20);
		//매개값으로 (int, boolean)을 주면 다중선택이 가능
		//리스트가 2개 이상이라면 boolean을 true 단일이라면 false
		//runList.add()로 내용 추가
		add(runList);
		kindList(runList);
		kindDispaly("RUNNING", runList);
		
		//수량 입력 텍스트필드
		rQTf = new TextField("Quantity");
		add(rQTf);
		kindTf(rQTf);
		tfClear(rQTf);
		
		//sales 버튼		
		runBtn = new Button("Sales");
		add(runBtn);
		kindBtn(runBtn);
		
		//back 버튼
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
	
	//부츠
	public void bootsGUI() {
		setTitle("Boots");
		kindFrame();
		//리스트
		bootsList = new List(20);
		//매개값으로 (int, boolean)을 주면 다중선택이 가능
		//리스트가 2개 이상이라면 boolean을 true 단일이라면 false
		//runList.add()로 내용 추가
		add(bootsList);
		kindList(bootsList);
		kindDispaly("BOOTS", bootsList);
		
		//수량 입력 텍스트필드
		bQTf = new TextField("Quantity");
		add(bQTf);
		kindTf(bQTf);
		tfClear(bQTf);
		
		//sales 버튼		
		bootsBtn = new Button("Sales");
		add(bootsBtn);
		kindBtn(bootsBtn);
		
		//back 버튼
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

	//스니커즈
	public void sneakers() {
		setTitle("Sneakers");	
		kindFrame();

		//리스트
		sneakersList = new List(20);
		//매개값으로 (int, boolean)을 주면 다중선택이 가능
		//리스트가 2개 이상이라면 boolean을 true 단일이라면 false
		//runList.add()로 내용 추가
		add(sneakersList);
		kindList(sneakersList);
		kindDispaly("SNEAKERS", sneakersList);
		
		//수량 입력 텍스트필드
		sQTf = new TextField("Quantity");
		add(sQTf);
		kindTf(sQTf);
		tfClear(sQTf);
		
		//sales 버튼		
		sneakersBtn = new Button("Sales");
		add(sneakersBtn);
		kindBtn(sneakersBtn);
		
		//back 버튼
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
	
	//기타 신발
	public void other() {
		setTitle("Other");
		kindFrame();
		//리스트
		otherList = new List(20);
		//매개값으로 (int, boolean)을 주면 다중선택이 가능
		//리스트가 2개 이상이라면 boolean을 true 단일이라면 false
		//runList.add()로 내용 추가
		add(otherList);
		kindList(otherList);
		kindDispaly("OTHER", otherList);
		
		//수량 입력 텍스트필드
		oQTf = new TextField("Quantity");
		add(oQTf);
		kindTf(oQTf);
		tfClear(oQTf);
		
		//sales 버튼		
		otherBtn = new Button("Sales");
		add(otherBtn);
		kindBtn(otherBtn);
		
		//back 버튼
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
				//List에서 선택한 제품 코드 얻어오기
				String str = l.getSelectedItem();
				StringTokenizer st = new StringTokenizer(str,"≫");
				pCode = st.nextToken();
				String temp = st.nextToken();
				String name = st.nextToken();
				b.addActionListener(new ActionListener() {	
					@Override
					public void actionPerformed(ActionEvent e) {
						//텍스트필드에 입력한 수량 얻어오기
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
							//여기부터 안들어감
							while(io.hasNext()) {
								Output out = io.next();
								if(out.getP_code().equals(pCode)) {
									flag = true;
								}
							}
							if(flag) {
								dao.update(pCode, quantity);	
								if(inven==0) {
									resultlbl.setText("품절된 상품입니다.");
									resultlbl.setForeground(new Color(255, 0, 0));
									return;
								}
								if(quantity>inven) {
									resultlbl.setText("수량이 부족합니다.");
									resultlbl.setForeground(new Color(255, 0, 0));
									return;
								}
								resultlbl.setText("구매 성공! "+name);
							}
						} catch (ClassNotFoundException | SQLException e1) {
							e1.printStackTrace();
						}
						
					}
				});
				
			}
		});
	}
	
//	//sales 버튼 이벤트 처리
//	public void kindSales(Button b) {
//		b.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("호이");
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
	

	//라벨 구현
	public void kindlbl(Label l) {
		l.setBounds(0, 475, 500, 20);
		l.setBackground(new Color(0, 0, 0));
		l.setForeground(new Color(255, 255, 255));
		l.setFont(listFont);
		l.setAlignment(Label.CENTER);
	}
	
	//수량 텍스트필드 구현
	public void kindTf(TextField t) {
		t.setBounds(215, 370, 70, 27);
		t.setBackground(new Color(0, 0, 0));
		t.setForeground(new Color(255, 255, 255));
		t.setFont(listFont);
	}
	
	//텍스트필드 클릭하면 입력되있던 값이 사라짐		
	public void tfClear(TextField t) {
		//텍스트필드 클릭하면 입력되있던 값이 사라짐		
		t.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t.setText("");
			}
		});
	}

	
	//프레임 구현
	public void kindFrame() {
		setSize(500, 500);
		setLocationRelativeTo(null);
		setResizable(false);	
		setLayout(null);
	}
	
	//뒤로가기 버튼
	public void backButton() {
		backBtn.setFont(btnFont);
		backBtn.setBounds(265, 415, 60, 40);
		backBtn.setBackground(new Color(0, 0, 0));
		backBtn.setForeground(new Color(255, 255, 255));
		
		//back 버튼 이벤트 처리
		backBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ShoppingGUI().shoppingGUI();
			}
		});
	}
	
	//버튼 구현
	public void kindBtn(Button b) {
		b.setFont(btnFont);
		b.setBounds(175, 415, 60, 40);
		b.setBackground(new Color(0, 0, 0));
		b.setForeground(new Color(255, 255, 255));
	}
	
	//리스트 구현
	public void kindList(List l) {
		l.setFont(listFont);
		l.setBounds(50, 50, 400, 300);
		l.setBackground(new Color(0, 0, 0));
		l.setForeground(new Color(255, 255, 255));
	}
	
	//배경 구현
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\500_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
	//카테고리에 맞는 품목들을 List에 보여줌
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
			l.add(code + "≫" + kind + "≫" + name + "≫" + 
					price + "≫" + size);
		}
	}
}//end KindGUI


//메인 2번 프레임
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
		
		//리스트
		add(sList);
		sList.setFont(listFont);
		sList.setBounds(50, 50, 400, 300);
		sList.setBackground(new Color(0, 0, 0));
		sList.setForeground(new Color(255, 255, 255));
		
		//검색 텍스트필드
		add(salesTf);
		salesTf.setBounds(150, 375, 150, 25);
		salesTf.setBackground(new Color(0, 0, 0));
		salesTf.setForeground(new Color(255, 255, 255));
		salesTf.setFont(btnFont);

		//텍스트필드 클릭하면 입력되있던 값이 사라짐		
		salesTf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				salesTf.setText("");
			}
		});
		
		//검색 버튼
		searchBtn = new Button("Search");
		add(searchBtn);
		searchBtn.setBounds(300, 375, 50, 25);
		salesBtn(searchBtn);
		
		//환불 버튼
		refundBtn = new Button("Refund");
		add(refundBtn);
		refundBtn.setBounds(180, 420, 50, 25);
		salesBtn(refundBtn);
		
		salesBackBtn = new Button("Back");
		add(salesBackBtn);
		salesBackBtn.setBounds(270, 420, 50, 25);
		salesBtn(salesBackBtn);
		//backBtn 이벤트처리
		salesBackBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new MainGUI().mainGUI();
			}
		});
		
		Termination();
		setLocationRelativeTo(null);//왜 정렬 안되는지?
		setVisible(true);
	}

	//버튼 구현
	public void salesBtn(Button b) {
		b.setFont(btnFont);
		b.setBackground(new Color(0, 0, 0));
		b.setForeground(new Color(255, 255, 255));
	}//end salesBtn
	
	//배경 구현
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\500_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
}//end SalesList

//메인 3번 프레임
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
		
		//리스트 구현
		add(searchlist);
		searchlist.setFont(listFont);
		searchlist.setBounds(50, 50, 400, 300);
		searchlist.setBackground(new Color(0, 0, 0));
		searchlist.setForeground(new Color(255, 255, 255));
		
		//이름 텍스트 필드 구현
		nSTf = new TextField();
		add(nSTf);
		nSTf.setBounds(200, 360, 130, 25);
		S_Tf(nSTf);
		
		//이름 라벨 구현
		nlbl = new Label("Name");
		add(nlbl);
		nlbl.setBounds(152, 362, 50, 20);
		S_Lbl(nlbl);
		
		//가격 텍스트 필드 구현
		pSTf = new TextField("0");
		add(pSTf);
		pSTf.setBounds(200, 390, 130, 25);
		S_Tf(pSTf);
		
		//가격 라벨 구현
		plbl = new Label("Price");
		add(plbl);
		plbl.setBounds(152, 392, 50, 20);
		S_Lbl(plbl);
		
		//사이즈 텍스트 필드 구현
		sSTf = new TextField("0");
		add(sSTf);
		sSTf.setBounds(200, 420, 130, 25);
		S_Tf(sSTf);
		
		//사이즈 라벨 구현
		slbl = new Label("Size");
		add(slbl);
		slbl.setBounds(152, 422, 50, 20);
		S_Lbl(slbl);
		
		//검색 버튼 구현
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
					//name을 입력하고 price, size 둘 다 입력안하는건 괜찮지만
					//name과 price 혹은 name과 size가 공백인 상태에서
					//price나 size를 입력하면 NumberFormatException 발생
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
						resultlist.add(a.get(i).getKind()+"≫"+a.get(i).getP_name()+"≫"+a.get(i).getPrice()+"≫"+a.get(i).getP_size());					
					}			
				}
		
			}
		});
		
				
		//뒤로가기버튼
		searchBackBtn = new Button("Back");
		add(searchBackBtn);
		searchBackBtn.setBounds(260, 455, 50, 25);
		searchBackBtn.setFont(btnFont);
		searchBackBtn.setBackground(new Color(0, 0, 0));
		searchBackBtn.setForeground(new Color(255, 255, 255));
		
		
		//뒤로가기버튼 이벤트처리
		searchBackBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new MainGUI().mainGUI();
			}
		});
	}//end searchGUI
	
	//배경 구현
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\500_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
	//텍스트필드 구현
	public void S_Tf(TextField t) {
		t.setFont(listFont);
		t.setBackground(new Color(0, 0, 0));
		t.setForeground(new Color(255, 255, 255));
		tfClear(t);
	}
	
	//라벨 구현
	public void S_Lbl(Label l) {
		l.setFont(listFont);
		l.setBackground(new Color(0, 0, 0));
		l.setForeground(new Color(255, 255, 255));
	}
	
	//화면 출력 (정렬 생각해보기)
	public void displayAll() {
		DAO dao = new DAO();
		searchlist.removeAll();
		java.util.List<Product> allData = dao.getListP();
		
		for(Product p : allData) {
			String kind = p.getKind();
			String name = p.getP_name();
			int price = p.getPrice();
			int size = p.getP_size();
			searchlist.add(kind + "≫" + name + "≫" + 
					price + "≫" + size);
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
		
		//코드 라벨
		codelbl = new Label("Code");
		add(codelbl);
		codelbl.setBounds(50, 360, 45, 30);
		M_Label(codelbl);
		
		//코드 텍스트필드
		codeTf = new TextField("Code Number");
		add(codeTf);
		codeTf.setBounds(95, 363, 150, 25);
		M_TextField(codeTf);
		M_TextClear(codeTf);
		
		//카테고리 라벨
		kindlbl = new Label("Kind");
		add(kindlbl);
		kindlbl.setBounds(270, 360, 45, 30);
		M_Label(kindlbl);
		
		//카테고리 초이스
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
//		//kindCi.getSelectedItem() : 카테고리 선택하고 입력을 눌렀을 때 이 메소드를 호출하면 카테고리의 문자가 리턴
//		//kindCi.getSelectedIndex() : 카테고리 선택하고 입력을 눌렀을 때 이 메소드를 호출하면 인덱스 번호가 리턴
		
		//카테고리 텍스트필드
		kindTf = new TextField("Kind");
		add(kindTf);
		kindTf.setBounds(315, 363, 100, 25);
		M_TextField(kindTf);
		M_TextClear(kindTf);
		
		//이름 라벨
		namelbl = new Label("Name");
		add(namelbl);
		namelbl.setBounds(50, 400, 45, 30);
		M_Label(namelbl);
		
		//이름 텍스트필드
		nameTf = new TextField("Name");
		add(nameTf);
		nameTf.setBounds(95, 403, 150, 25);
		M_TextField(nameTf);
		M_TextClear(nameTf);
		
		//사이즈 라벨
		sizelbl = new Label("Size");
		add(sizelbl);
		sizelbl.setBounds(270, 400, 45, 30);
		M_Label(sizelbl);
		
		//사이즈 초이스
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
		//kindCi.getSelectedItem() : 카테고리 선택하고 입력을 눌렀을 때 이 메소드를 호출하면 카테고리의 문자가 리턴
		//kindCi.getSelectedIndex() : 카테고리 선택하고 입력을 눌렀을 때 이 메소드를 호출하면 인덱스 번호가 리턴
		
		//사이즈 텍스트필드
		sizeTf = new TextField("Size");
		add(sizeTf);
		sizeTf.setBounds(315, 403, 80, 25);
		M_TextField(sizeTf);
		M_TextClear(sizeTf);
		
		//가격 라벨
		pricelbl = new Label("Price");
		add(pricelbl);
		pricelbl.setBounds(50, 440, 45, 25);
		M_Label(pricelbl);
		
		//가격 텍스트필드 
		priceTf = new TextField("Price");
		add(priceTf);
		priceTf.setBounds(95, 443, 80, 25);
		M_TextField(priceTf);
		M_TextClear(priceTf);

		//성공/실패 라벨 만들기?
		//값이 하나라도 없으면 다시 입력하도록? 아니면 다시 창이 실행되도록?
		resultlbl = new Label();
		add(resultlbl);
		resultlbl.setBounds(0, 470, 500, 32);
		resultlbl.setBackground(new Color(0, 0, 0));
		resultlbl.setFont(font15);
		//라벨 가운데정렬
		resultlbl.setAlignment(Label.CENTER);
		
		//입력 버튼
		inputBtn = new Button("Input");
		add(inputBtn);
		inputBtn.setBounds(210, 440, 60, 30);
		M_Button(inputBtn);
		
		//입력버튼 이벤트 처리
		inputBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String code = codeTf.getText().toUpperCase();
				String kind = kindTf.getText().toUpperCase();
				String name = nameTf.getText().toUpperCase();
				int price = 0;
				int size = 0;
				try {
					//price나 size에 값이 입력되지 않거나 문자가 입력되면
					//NumberFormatException 발생
					price = Integer.parseInt(priceTf.getText());
					size = Integer.parseInt(sizeTf.getText());
				} catch (NumberFormatException e2) {
					e2.printStackTrace();
					resultlbl.setText("등록 실패 : 누락된 정보가 있습니다.");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				
				//name에 값이 입력되지 않는 경우
				if(name.isEmpty()) {
					resultlbl.setText("등록 실패 : 누락된 정보가 있습니다.");
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
					//code, kind가 중복인 상품 입력시 예외 발생
					resultlbl.setText("등록 실패 : Code와 Kind를 다시 확인해주세요.");
					resultlbl.setForeground(new Color(255, 0, 0));
					e1.printStackTrace();
					return;
				}
				resultlbl.setText("등록 성공! "+code+"/"+kind+"/"+name+"/"+price+"/"+size);
				resultlbl.setForeground(new Color(255, 255, 255));
				displayAll();
			}
		});
		
		backBtn = new Button("Back");
		add(backBtn);
		backBtn.setBounds(290, 440, 60, 30);
		M_Button(backBtn);
		M_BackBtn(backBtn);
		
		
		
		//아이템을 클릭했을 때 아이템의 정보가 텍스트필드에 들어가는 이벤트 처리
		inputList.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = inputList.getSelectedItem();
				StringTokenizer st = new StringTokenizer(str,"≫");
				//구분자에 띄어쓰기가 들어가면 띄어쓰기로 인식해버림
			
				codeTf.setText(st.nextToken());
				kindTf.setText(st.nextToken());
				//kindCi.getSelectedIndex();//초이스에 들어있는 값의 인덱스를 리턴
				nameTf.setText(st.nextToken());
				priceTf.setText(st.nextToken());
				sizeTf.setText(st.nextToken());
				//sizeCi.getSelectedItem();//초이스에 들어있는 값을 리턴

			}
		});
	}
	
	//뒤로가기 버튼
	public void M_BackBtn(Button b) {
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ManagerGUI().managerGUI();
			}
		});
	}
	
	//버튼 구현
	public void M_Button(Button b) {
		b.setFont(font15);
		b.setBackground(new Color(0, 0, 0));
		b.setForeground(new Color(255, 255, 255));
	}
	
	//텍스트필드 클릭하면 기존 값 사라짐
	public void M_TextClear(TextField t) {
		t.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				t.setText("");
			}
		});
	}
	
	
	//텍스트필드 구현
	public void M_TextField(TextField t) {
		t.setFont(font15);
		t.setBackground(new Color(0, 0, 0));
		t.setForeground(new Color(255, 255, 255));
	}
	
	//라벨 구현
	public void M_Label(Label l) {
		l.setFont(font15);
		l.setBackground(new Color(0, 0, 0));
		l.setForeground(new Color(255, 255, 255));
	}
	
	//프레임 구현
	public void M_Frame() {
		setLayout(null);
		setResizable(false);
		setSize(500, 500);
		setLayout(null);
		Termination();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	//리스트 구현
	public void M_List(List l) {
		l.setFont(font15);
		l.setBackground(new Color(0, 0, 0));
		l.setForeground(new Color(255, 255, 255));
		l.setBounds(50, 50, 400, 300);
	}
	
	//배경 구현
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\500_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
	//List에 product 테이블 내용 출력
	public void displayAll() {
		inputList.removeAll();//이 리스트로부터 모든 항목 삭제
		DAO dao = new DAO();
		java.util.List<Product> allData = dao.getListP();
		for(Product p : allData) {
			String code = p.getP_code();
			String kind = p.getKind();
			String name = p.getP_name();
			int price = p.getPrice();
			int size = p.getP_size();
			inputList.add(code + "≫" + kind + "≫" + name + "≫" + 
			price + "≫" + size);
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
		//제품 수정
		pBtn = new Button("Product Modify");
		add(pBtn);
		pBtn.setBounds(75, 50, 150, 100);
		Font font20 = new Font("Serif", Font.HANGING_BASELINE, 20);
		pBtn.setFont(font20);
		pBtn.setBackground(new Color(0, 0, 0));
		pBtn.setForeground(new Color(255, 255, 255));
		
		//제품 수정 버튼 이벤트처리
		pBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new M_Product().M_ProductGUI();
			}
		});
		
		//재고 등록
		oBtn = new Button("Quantity Modify");
		add(oBtn);
		oBtn.setBounds(75, 170, 150, 100);
		oBtn.setFont(font20);
		oBtn.setBackground(new Color(0, 0, 0));
		oBtn.setForeground(new Color(255, 255, 255));
		
		//재고 등록 버튼 이벤트처리
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
	
	//배경 구현
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\300_300.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
}

//제품 정보 수정
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
		
		//코드 라벨
		codelbl = new Label("Code");
		add(codelbl);
		codelbl.setBounds(50, 360, 45, 30);
		M_Label(codelbl);
		
		//코드 텍스트필드
		codeTf = new TextField("Code Number");
		add(codeTf);
		codeTf.setBounds(95, 363, 150, 25);
		M_TextField(codeTf);
		M_TextClear(codeTf);
		
		//카테고리 라벨
		kindlbl = new Label("Kind");
		add(kindlbl);
		kindlbl.setBounds(270, 360, 45, 30);
		M_Label(kindlbl);
		
		//카테고리 텍스트필드
		kindTf = new TextField("Kind");
		add(kindTf);
		kindTf.setBounds(315, 363, 100, 25);
		M_TextField(kindTf);
		M_TextClear(kindTf);
		
		//이름 라벨
		namelbl = new Label("Name");
		add(namelbl);
		namelbl.setBounds(50, 400, 45, 30);
		M_Label(namelbl);
		
		//이름 텍스트필드
		nameTf = new TextField("Name");
		add(nameTf);
		nameTf.setBounds(95, 403, 150, 25);
		M_TextField(nameTf);
		M_TextClear(nameTf);
		
		//사이즈 라벨
		sizelbl = new Label("Size");
		add(sizelbl);
		sizelbl.setBounds(270, 400, 45, 30);
		M_Label(sizelbl);
		
		//사이즈 텍스트필드
		sizeTf = new TextField("Size");
		add(sizeTf);
		sizeTf.setBounds(315, 403, 80, 25);
		M_TextField(sizeTf);
		M_TextClear(sizeTf);
		
		//가격 라벨
		pricelbl = new Label("Price");
		add(pricelbl);
		pricelbl.setBounds(50, 440, 45, 25);
		M_Label(pricelbl);
		
		//가격 텍스트필드 
		priceTf = new TextField("Price");
		add(priceTf);
		priceTf.setBounds(95, 443, 80, 25);
		M_TextField(priceTf);
		M_TextClear(priceTf);

		//성공/실패 라벨 만들기?
		//값이 하나라도 없으면 다시 입력하도록? 아니면 다시 창이 실행되도록?
		resultlbl = new Label();
		add(resultlbl);
		resultlbl.setBounds(0, 470, 500, 32);
		resultlbl.setBackground(new Color(0, 0, 0));
		resultlbl.setFont(font15);
		//라벨 가운데정렬
		resultlbl.setAlignment(Label.CENTER);
		
		//제품 수정 버튼
		p_modifyBtn = new Button("Modify");
		add(p_modifyBtn);
		p_modifyBtn.setBounds(210, 440, 60, 30);
		M_Button(p_modifyBtn);
		
		//제품 수정 버튼 이벤트 처리 부분
		p_modifyBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String code = codeTf.getText().toUpperCase();
				String kind = kindTf.getText().toUpperCase();
				String name = nameTf.getText().toUpperCase();
				int price = 0;
				int size = 0;
				try {
					//price나 size에 값이 입력되지 않거나 문자가 입력되면
					//NumberFormatException 발생
					price = Integer.parseInt(priceTf.getText());
					size = Integer.parseInt(sizeTf.getText());
				} catch (NumberFormatException e2) {
					e2.printStackTrace();
					resultlbl.setText("수정 실패 : 누락된 정보가 있습니다.");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				
				//name에 값이 입력되지 않는 경우
				if(name.isEmpty()) {
					resultlbl.setText("수정 실패 : 누락된 정보가 있습니다.");
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
					//code, kind가 중복인 상품 입력시 예외 발생
					resultlbl.setText("수정 실패 : Code와 Kind를 다시 확인해주세요.");
					resultlbl.setForeground(new Color(255, 0, 0));
					e1.printStackTrace();
					return;
				}
				int check = 0;//같은 코드 값이 있는지 확인
				Iterator<Product> it = dao.getListP().iterator();
				while(it.hasNext()) {
					Product p = it.next();
					if(p.getP_code().equals(code)&&p.getKind().equals(kind)) {
						check = 1;
					}
				}
				if(check==1) {
					resultlbl.setText("수정 성공! "+code+"/"+kind+"/"+name+"/"+price+"/"+size);
					resultlbl.setForeground(new Color(255, 255, 255));					
				}else {
					resultlbl.setText("수정 실패 : Code와 Kind를 다시 확인해주세요.");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				
				displayAll();
			}
		});
		
		//삭제 버튼
		p_deleteBtn = new Button("Delete");
		add(p_deleteBtn);
		p_deleteBtn.setBounds(290, 440, 60, 30);
		M_Button(p_deleteBtn);
	
		//삭제 버튼 이벤트처리
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
						check = 1;//code와 같은 값이 이미 있으면 check = 1;
					}
				}
				if(check==1) {
					resultlbl.setText("삭제 성공! "+code);
					resultlbl.setForeground(new Color(255, 255, 255));
				}else {
					resultlbl.setText("삭제 실패 : Code와 Kind를 다시 확인해주세요.");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				try {
					dao.delete(code);
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
				resultlbl.setText("삭제 성공! "+codeTf.getText());
				resultlbl.setForeground(new Color(255, 255, 255));
				displayAll();
			}
		});
		
		//뒤로가기 버튼
		backBtn = new Button("Back");
		add(backBtn);
		backBtn.setBounds(370, 440, 60, 30);
		M_Button(backBtn);
		M_BackBtn(backBtn);

		//아이템을 클릭했을 때 아이템의 정보가 텍스트필드에 들어가는 이벤트 처리
		productList.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = productList.getSelectedItem();
				StringTokenizer st = new StringTokenizer(str,"≫");
				//구분자에 띄어쓰기가 들어가면 띄어쓰기로 인식해버림
				codeTf.setText(st.nextToken());
				kindTf.setText(st.nextToken());
				//kindCi.getSelectedIndex();//초이스에 들어있는 값의 인덱스를 리턴
				nameTf.setText(st.nextToken());
				priceTf.setText(st.nextToken());
				sizeTf.setText(st.nextToken());
				//sizeCi.getSelectedItem();//초이스에 들어있는 값을 리턴

			}
		});
	}

	//배경 구현
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\500_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
	//List에 product table 출력
	public void displayAll() {
		productList.removeAll();//이 리스트로부터 모든 항목 삭제
		DAO dao = new DAO();
		java.util.List<Product> allData = dao.getListP();
		for(Product p : allData) {
			String code = p.getP_code();
			String kind = p.getKind();
			String name = p.getP_name();
			int price = p.getPrice();
			int size = p.getP_size();
			productList.add(code + "≫" + kind + "≫" + name + "≫" + 
			price + "≫" + size);
		}	
	}
}

//input 테이블 사용
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
		
		//코드 라벨
		codelbl = new Label("Code");
		add(codelbl);
		codelbl.setBounds(50, 360, 45, 30);
		M_Label(codelbl);
		
		//코드 텍스트필드
		codeTf = new TextField("Code Number");
		add(codeTf);
		codeTf.setBounds(95, 363, 150, 25);
		M_TextField(codeTf);
		M_TextClear(codeTf);
		
		//카테고리 라벨
		kindlbl = new Label("Kind");
		add(kindlbl);
		kindlbl.setBounds(270, 360, 45, 30);
		M_Label(kindlbl);
		
		//카테고리 텍스트필드
		kindTf = new TextField("Kind");
		add(kindTf);
		kindTf.setBounds(315, 363, 100, 25);
		M_TextField(kindTf);
		M_TextClear(kindTf);
		
		//날짜 라벨
		datelbl = new Label("Date");
		add(datelbl);
		datelbl.setBounds(50, 400, 45, 30);
		M_Label(datelbl);
		
		//날짜 텍스트필드
		dateTf= new TextField("Date");
		add(dateTf);
		dateTf.setBounds(95, 403, 150, 25);
		M_TextField(dateTf);
		M_TextClear(dateTf);
		
		//수량 라벨
		quantitylbl = new Label("Quantity");
		add(quantitylbl);
		quantitylbl.setBounds(270, 400, 65, 30);
		M_Label(quantitylbl);
		
		//수량 텍스트필드
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
		//라벨 가운데정렬
		resultlbl.setAlignment(Label.CENTER);
		
		//수량 추가 버튼
		addBtn = new Button("Add");
		add(addBtn);
		addBtn.setBounds(60, 440, 60, 30);
		M_Button(addBtn);
		
		//수량  추가 이벤트 처리
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
					resultlbl.setText("추가 성공! "+code+"/"+quantity+"ea");
					resultlbl.setForeground(new Color(255, 255, 255));
				} catch (ClassNotFoundException | SQLException e1) {
					resultlbl.setText("추가 실패 : 다시 시도해주세요.");
					resultlbl.setForeground(new Color(255, 0, 0));
					e1.printStackTrace();
				}
			}
		});
		
		//수정 버튼
		mBtn = new Button("Modify");
		add(mBtn);
		mBtn.setBounds(140, 440, 60, 30);
		M_Button(mBtn);
		
		//수정 버튼 이벤트 처리
		//날짜 형식이 yyyyMMdd가 아니면 오류 발생
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
					if(kind.isEmpty()) {//kind를 입력해도 되고 안해도 되고
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
					resultlbl.setText("수정 성공! "+code+"/"+kind+"/"+date+"/"+quantity+"ea");
					resultlbl.setForeground(new Color(255, 255, 255));
				} catch (Exception e2) {
					resultlbl.setText("수정 실패 : yyyyDDmm 형식으로 입력해주세요.");
					resultlbl.setForeground(new Color(255, 0, 0));
					e2.printStackTrace();
				}
			}
		});
		
		//삭제 버튼
		dBtn = new Button("Delete");
		add(dBtn);
		dBtn.setBounds(220, 440, 60, 30);
		M_Button(dBtn);
		
		//삭제 버튼 이벤트 처리
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
						resultlbl.setText("삭제 성공! "+code);
						resultlbl.setForeground(new Color(255, 255, 255));		
					}else {
						resultlbl.setText("삭제 실패 : Code와 Kind를 다시 확인해주세요.");
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
		
		//지우기 버튼
		clearBtn = new Button("Clear");
		add(clearBtn);
		clearBtn.setBounds(300, 440, 60, 30);
		M_Button(clearBtn);
		
		//지우기 버튼 이벤트 처리
		//텍스트필드의 값들을 비워준다.
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
		
		//뒤로가기 버튼
		backBtn = new Button("Back");
		add(backBtn);
		backBtn.setBounds(380, 440, 60, 30);
		M_Button(backBtn);
		M_BackBtn(backBtn);	
		
		displayAll(modifyList);
	}//M_ModifyGUI
	
	//배경 구현
	@Override
	public void paint(Graphics g) {
		Toolkit mainToll = Toolkit.getDefaultToolkit();
		Image mainImg = mainToll.getImage("C:\\bjh\\workspace\\Shoes_Management_Program\\src\\view\\img\\500_500.jpg");
		g.drawImage(mainImg, 0, 0, this);
	}
	
	//List에 input table 출력
	public void displayAll(List l) {
		l.removeAll();//이 리스트로부터 모든 항목 삭제
		DAO dao = new DAO();
		try {
			java.util.List<Input> allData = dao.getListI();
			for(Input i : allData) {
				String code = i.getP_code();
				String kind = i.getKind();
				Date date = i.getI_date(); 
				int quantity = i.getQuantity();
				//date에 null이 있는 경우 NullPointException 발생
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
				l.add(code + "≫" + kind + "≫" + date + "≫" + 
						quantity);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		//List 데이터 클릭시 텍스트필드에 해당 값들이 들어감
		l.addItemListener(new ItemListener() {		
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = l.getSelectedItem();
				StringTokenizer st = new StringTokenizer(str,"≫");
				codeTf.setText(st.nextToken());
				kindTf.setText(st.nextToken());
				dateTf.setText(st.nextToken());
				quantityTf.setText(st.nextToken());
			}
		});
	}//end displayAll
	
	//yyyymmdd 형식으로 입력되게 만드는 메소드
	//다른 형식으로 입력하면 또 에러남
//	public java.sql.Date transDate(String date) {
//		SimpleDateFormat beforeFormat = new SimpleDateFormat("yyyymmdd");
//		SimpleDateFormat afterFormat = new SimpleDateFormat("yyyy-mm-dd");
//		java.util.Date tempDate = null;
//		try {
//			//yyyymmdd로 된 날짜 형식으로 java.util.Date객체 만들기
//			tempDate = beforeFormat.parse(date);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
//		//java.util.Date를 yyyy-mm-dd형식으로 변경하여 STring으로 반환.
//		String transDate = afterFormat.format(tempDate);
//		//반환된 String 값을 Date로 변경
//		return java.sql.Date.valueOf(transDate);
//		
//	}
	
}//end M_Modify

//매출목록
class M_SalesList extends M_Modify{
	List salesList = new List(20);
	List searchResultList = new List(20);
	
	public void M_SalesListGUI() {
		displayAll();
		setTitle("List of Sales");
		M_Frame();
		add(salesList);
		M_List(salesList);
		
		//코드 라벨
		codelbl = new Label("Code");
		add(codelbl);
		codelbl.setBounds(50, 360, 45, 30);
		M_Label(codelbl);
		
		//코드 텍스트필드
		codeTf = new TextField("Code Number");
		add(codeTf);
		codeTf.setBounds(95, 363, 150, 25);
		M_TextField(codeTf);
		M_TextClear(codeTf);
		
		//카테고리 라벨
		kindlbl = new Label("Kind");
		add(kindlbl);
		kindlbl.setBounds(270, 360, 45, 30);
		M_Label(kindlbl);
		
		//카테고리 텍스트필드
		kindTf = new TextField("Kind");
		add(kindTf);
		kindTf.setBounds(315, 363, 100, 25);
		M_TextField(kindTf);
		M_TextClear(kindTf);
		
		//날짜 라벨
		datelbl = new Label("Date");
		add(datelbl);
		datelbl.setBounds(50, 400, 45, 30);
		M_Label(datelbl);
		
		//날짜 텍스트필드
		dateTf= new TextField("Date");
		add(dateTf);
		dateTf.setBounds(95, 403, 150, 25);
		M_TextField(dateTf);
		M_TextClear(dateTf);
		
		//수량 라벨
		quantitylbl = new Label("Quantity");
		add(quantitylbl);
		quantitylbl.setBounds(270, 400, 65, 30);
		M_Label(quantitylbl);
		
		//수량 텍스트필드
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
		//라벨 가운데정렬
		resultlbl.setAlignment(Label.CENTER);
		
		//검색 버튼
		sBtn = new Button("Search");
		add(sBtn);
		sBtn.setBounds(100, 440, 60, 30);
		M_Button(sBtn);
		
		//검색 버튼 이벤트 처리
		//코드 입력하고 버튼 누르면 자료가 텍스트필드에 나옴
		sBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				remove(salesList);
				searchResultList.removeAll();
				String code = codeTf.getText().toUpperCase();
				//code를 입력 안하고 버튼 눌렀을 시
				if(code.isEmpty()) {
					resultlbl.setText("검색 실패 : Code를 입력하세요");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				Output output = new Output();
				DAO dao = new DAO();
				output = dao.oSearch(code);
				add(searchResultList);
				M_List(searchResultList);
				searchResultList.add(output.getP_code()+"≫"+output.getKind()+"≫"+output.getO_date()+
						"≫"+output.getQuantity()+"≫"+output.getTotalPrice()+"≫"+(output.getQuantity()*output.getTotalPrice()));
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
		
		//뒤로가기 버튼
		backBtn = new Button("Back");
		add(backBtn);
		backBtn.setBounds(350, 440, 60, 30);
		M_Button(backBtn);
		M_BackBtn(backBtn);	
		
		
			
	}//end M_SalesListGUI
	
	//List에 output table 출력
	public void displayAll() {
		salesList.removeAll();//이 리스트로부터 모든 항목 삭제
		DAO dao = new DAO();
		try {
			java.util.List<Output> allData = dao.getListO();
			for(Output o : allData) {
				String code = o.getP_code();
				String kind = o.getKind();
				Date date = o.getO_date();
				int quantity = o.getQuantity();
				int price = o.getTotalPrice();
				salesList.add(code + "≫" + kind + "≫" + date + "≫" + 
			quantity + "≫" + price+ "≫" + (quantity*price));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}//end displayAll();
}//end M_SalesList

//재고목록
//input 테이블 데이터를 List로 출력
class M_InventoryList extends M_Modify{
	List inputSearchList = new List(20);
	List searchResultList = new List(20);
	public void M_InventoryListGUI() {
		displayAll(inputSearchList);
		setTitle("Inventory List");
		M_Frame();
		add(inputSearchList);
		M_List(inputSearchList);
		
		//코드 라벨
		codelbl = new Label("Code");
		add(codelbl);
		codelbl.setBounds(50, 360, 45, 30);
		M_Label(codelbl);
		
		//코드 텍스트필드
		codeTf = new TextField("Code Number");
		add(codeTf);
		codeTf.setBounds(95, 363, 150, 25);
		M_TextField(codeTf);
		M_TextClear(codeTf);
		
		//카테고리 라벨
		kindlbl = new Label("Kind");
		add(kindlbl);
		kindlbl.setBounds(270, 360, 45, 30);
		M_Label(kindlbl);
		
		//카테고리 텍스트필드
		kindTf = new TextField("Kind");
		add(kindTf);
		kindTf.setBounds(315, 363, 100, 25);
		M_TextField(kindTf);
		M_TextClear(kindTf);
		
		//날짜 라벨
		datelbl = new Label("Date");
		add(datelbl);
		datelbl.setBounds(50, 400, 45, 30);
		M_Label(datelbl);
		
		//날짜 텍스트필드
		dateTf= new TextField("Date");
		add(dateTf);
		dateTf.setBounds(95, 403, 150, 25);
		M_TextField(dateTf);
		M_TextClear(dateTf);
		
		//수량 라벨
		quantitylbl = new Label("Quantity");
		add(quantitylbl);
		quantitylbl.setBounds(270, 400, 65, 30);
		M_Label(quantitylbl);
		
		//수량 텍스트필드
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
		//라벨 가운데정렬
		resultlbl.setAlignment(Label.CENTER);
		
		//검색 버튼
		sBtn = new Button("Search");
		add(sBtn);
		sBtn.setBounds(100, 440, 60, 30);
		M_Button(sBtn);
		
		//검색 버튼 이벤트 처리
		//코드 입력하고 버튼 누르면 자료가 텍스트필드에 나옴
		sBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				remove(inputSearchList);
				String code = codeTf.getText().toUpperCase();
				//code를 입력 안하고 버튼 눌렀을 시
				if(code.isEmpty()) {
					resultlbl.setText("검색 실패 : Code를 입력하세요");
					resultlbl.setForeground(new Color(255, 0, 0));
					return;
				}
				Input input = new Input();
				DAO dao = new DAO();
				input = dao.iSearch(code);
				add(searchResultList);
				M_List(searchResultList);
				searchResultList.add(input.getP_code()+"≫"+input.getKind()+"≫"+input.getI_date()+"≫"+input.getQuantity());
				codeTf.setText(input.getP_code());
				kindTf.setText(input.getKind());
				dateTf.setText(String.valueOf(input.getI_date()));
				quantityTf.setText(String.valueOf(input.getQuantity()));
			}
		});
		
		/*
		 * //검색 버튼 이벤트 처리
		 * code만 입력했을 경우 결과 출력(o)
		 * kind만 입력했을 경우 결과 출력(o)
		 * date만 입력했을 경우 결과 출력(x)
      //코드 입력하고 버튼 누르면 자료가 텍스트필드에 나옴
      sBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            remove(inputSearchList);
            String code = codeTf.getText().toUpperCase();
            String kind = kindTf.getText().toUpperCase();
            Date date = java.sql.Date.valueOf(dateTf.getText());
            String quantity = quantityTf.getText();
            if(!code.isEmpty()) {
               //code를 입력 안하고 버튼 눌렀을 시
               if(code.isEmpty()) {
                  resultlbl.setText("검색 실패 : Code를 입력하세요");
                  resultlbl.setForeground(new Color(255, 0, 0));
                  return;
               }
               Input input = new Input();
               DAO dao = new DAO();
               input = dao.iSearch(code);
               add(searchResultList);
               M_List(searchResultList);
               searchResultList.add(input.getP_code()+"≫"+input.getKind()+"≫"+input.getI_date()+"≫"+input.getQuantity());
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
               searchResultList.add(input.getP_code()+"≫"+input.getKind()+"≫"+input.getI_date()+"≫"+input.getQuantity());
               codeTf.setText(input.getP_code());
               kindTf.setText(input.getKind());
               dateTf.setText(String.valueOf(input.getI_date()));
               quantityTf.setText(String.valueOf(input.getQuantity()));
            }else if(!date.equals(null)) {// 오류 발생
               Input input = new Input();
               DAO dao = new DAO();
               input = dao.dSearch(date);
               add(searchResultList);
               M_List(searchResultList);
               searchResultList.add(input.getP_code()+"≫"+input.getKind()+"≫"+input.getI_date()+"≫"+input.getQuantity());
               codeTf.setText(input.getP_code());
               kindTf.setText(input.getKind());
               dateTf.setText(String.valueOf(input.getI_date()));
               quantityTf.setText(String.valueOf(input.getQuantity()));      
            }
         }
      });
		 */
		//Clear 버튼 추가
		clearBtn = new Button("Clear");
		add(clearBtn);
		clearBtn.setBounds(220, 440, 60, 30);
		M_Button(clearBtn);
		
		//Clear 버튼 이벤트 처리
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
		
		//뒤로가기 버튼
		backBtn = new Button("Back");
		add(backBtn);
		backBtn.setBounds(350, 440, 60, 30);
		M_Button(backBtn);
		M_BackBtn(backBtn);	
		
		displayAll(inputSearchList);
			
	}//end M_InventoryListGUI
}//end M_InventoryList



