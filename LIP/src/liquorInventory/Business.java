package liquorInventory;
import java.text.DecimalFormat;
import java.util.*;
/*
 * ������ �� �����Ȳ ���α׷����� �ٲ㺸��
 * ������ ������ ����ް� ������ ����ϴ� ���α׷� ���ĺ���
 * ���ϸ� �κ��丮 �����ϰ� ������
 * (������ �׳� �� �ܼ�, ��Ʋ �Է��ϰ�)
 */

public class Business {
	Scanner sc = new Scanner(System.in);
	String[] branchName = {"û����","�ѳ���","������"};
	String[] text = {"Whisky","Vodka","Tequila","Gin","Brandy","Rum"};
	String msg = "1. Whisky\n2. Vodka\n3. Tequila\n4. Gin\n5. Brandy\n6. Rum\n7. Back\n���� >>> ";
	String listMsg = "1. Whisky\n2. Vodka\n3. Tequila\n4. Gin\n5. Brandy\n6. Rum\n7. All\n8. Back\n���� >>> ";
	Manager cManager = new Manager();
	Manager hManager = new Manager();
	Manager gManager = new Manager();
	Manager[] branchManager = {cManager, hManager, gManager};
	Map<String, Manager> managerMap = new HashMap<String, Manager>();
	List<String> list = new ArrayList<String>();
	Iterator iter;
	String name;
	int year;
	int price;
	int cnt;
	boolean flag = true;//�ԷµȰ� ������ true
		
	public void start() {
		System.out.println("�ַ� ��� ���� ���α׷��Դϴ�.");
		branchMenu();
	}//end start
	
	void branchMenu() {
		boolean branchFlag = true;
		//�ϼ��ϰ� û��,�ѳ�,������ �����
		managerMap.put("û��", new Manager("û��"));
		managerMap.put("�ѳ�", new Manager("�ѳ�"));
		managerMap.put("����", new Manager("����"));
		managerMap.get("û��").setId("bang");
		managerMap.get("û��").setPw("010");
		managerMap.get("�ѳ�").setId("jun");
		managerMap.get("�ѳ�").setPw("4642");
		managerMap.get("����").setId("ho");
		managerMap.get("����").setPw("0130");
		list.add("û��");
		list.add("�ѳ�");
		list.add("����");
		while(branchFlag) {
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.println("4. ����");
			switch(select()) {
				case 1:
					branchChoice();
					break;
				case 2:
					branchCreate();
					break;
				case 3:
					branchDelete();
					break;
				case 4:
					branchFlag = false;
					break;
				default:
					break;
			}
			
		}
	}//end branchMenu
	
	//����
	void branchCreate() {
		System.out.print("������ ������ �Է��ϼ��� : ");
		String name = sc.next();
		System.out.print("ID�� �Է��ϼ��� : ");
		String id = sc.next();
		System.out.print("PW�� �Է��ϼ��� : ");
		String pw = sc.next();
		managerMap.put(name, new Manager(name));
		list.add(name);
		managerMap.get(name).setId(id);
		managerMap.get(name).setPw(pw);
	}//end branchCreate
	
	//����
	void branchDelete() {
		System.out.print("������ ������ �Է��ϼ��� : ");
		String name = sc.next();
		managerMap.remove(name);
		list.remove(name);
	}//end branchDelete
	
	
	void branchChoice() {
		int choice=0;
		boolean testFlag = true;
		String result;
		while(testFlag) {
			System.out.println("������ �����ϼ���.");
			for(int i=0;i<list.size();i++) {
				System.out.println((i+1)+". "+list.get(i)+"��");
			}
			System.out.println("0. ����");
			System.out.print("���� >>> ");
			choice = select();
			if(choice==0) {
				testFlag=false;
				break;
			}else {
				identity(list.get(choice-1));
				break;
			}
		}
	}
	/*
	void branch() {
		int choice=0;
		while(!(0<choice&&choice<4)) {
			System.out.println("������ �����ϼ���.");
			System.out.println("1. û����");
			System.out.println("2. �ѳ���");
			System.out.println("3. ������");
			System.out.println("4. �ڷΰ���");
			System.out.print("���� >>> ");
			choice = select();
			if(choice==1)identity(choice);
			else if(choice==2)identity(choice);
			else if(choice==3)identity(choice);
			else if(choice==4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else {
				System.out.println("�ٽ� �õ����ּ���.");			
			}
		}
	}
	*/
	
	//ID, PW
	void identity(String branch) {	
		for(int i=0;i<3;i++) {
			System.out.println("ID�� PW�� �Է����ּ���.");
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String pw = sc.next();
			if(!(managerMap.get(branch).getId().equals(id)&&managerMap.get(branch).getPw().equals(pw))) {
				if(i==2) {
					System.out.println("���α׷��� ����˴ϴ�.");
					break;
				}
				System.out.println("ID�� PW�� �ٽ� Ȯ�����ּ���.");
				continue;
			}else {
				i=0;
				//mainMenu(branch);
				break;
			}
		}
	}//end check
		
	/*
	 * 12/16 ������� ����
	 */
	
	
	//���θ޴�
	void mainMenu(int branch) {
		boolean mainFlag = true;
		while(mainFlag) {
			System.out.println(branchName[branch-1]+" ���θ޴� �Դϴ�.");
			System.out.println("==============");
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1. �ַ� ���");
			System.out.println("2. �ַ� �˻�");
			System.out.println("3. �ַ� ����");
			System.out.println("4. �ַ� ����");
			System.out.println("5. ��� ���� �ַ�");
			System.out.println("6. ��� ��Ȳ");
			System.out.println("7. ���� ����");
			System.out.println("8. ����");
			System.out.print("���� >>> ");
			switch(select()) {
				case 1:
					input(branch);
					break;
				case 2:
					search(branch);
					break;
				case 3:
					update(branch);
					break;
				case 4:
					delete(branch);
					break;
				case 5:
					zeroCnt(branch);
					break;
				case 6:
					list(branch);
					break;
				case 7:
					mainFlag = false;
					//branch();
				case 8:
					System.out.println("���α׷��� ����˴ϴ�.");
					mainFlag = false;
					break;
				default:
					break;
			}
		}
	}//end mainMenu
	
	//�ַ� ���
	void input(int branch) {
		boolean inputFlag = true;
		while(inputFlag) {
			System.out.println(branchName[branch-1]+" �ַ� ���");
			System.out.println("=================");
			System.out.println("����� ���� �����ϼ���.");
			System.out.println("=================");
			System.out.print(msg);
			kindInput(branch, select());
			System.out.print("����� �����Ͻðڽ��ϱ�?(Y/N) : ");
			String yn = sc.next();
			if(yn.toLowerCase().equals("y")||!(yn.toLowerCase().equals("n"))) {
				System.out.println("�ַ� ����� �����մϴ�.");
				inputFlag = false;
				flag = false;//��ϵ� �ַ��� 1���� �ִ°�
				return;
			}
		}	
	}//end input
	
	//�ַ��� ���
	void kindInput(int branch, int i) {
		if(i<1 || i>6)return;
		sc.nextLine();
		
		System.out.println("=====================");
		System.out.println("����Ͻ� ������ �Է����ּ���.");
		System.out.println("=====================");
		System.out.print("�� �̸� : ");
		name = sc.nextLine();
		System.out.print("�������� : ");
		year = sc.nextInt();
		System.out.print("���� : ");
		price = sc.nextInt();
		System.out.print("���� : ");
		cnt = sc.nextInt();
		System.out.println("=====================");
		if(!(price<0||cnt<0)) {
			if(i==1) branchManager[branch-1].getWhisky().add(new Whisky(name, year, price, cnt));
			else if(i==2) branchManager[branch-1].getVodka().add(new Vodka(name, year, price, cnt));
			else if(i==3) branchManager[branch-1].getTequila().add(new Tequila(name, year, price, cnt));
			else if(i==4) branchManager[branch-1].getGin().add(new Gin(name, year, price, cnt));
			else if(i==5) branchManager[branch-1].getBrandy().add(new Brandy(name, year, price, cnt));
			else if(i==6) branchManager[branch-1].getRum().add(new Rum(name, year, price, cnt));
			System.out.println(name+" "+year+"��   "+price+"��   "+cnt+"��");			
			System.out.println("=====================");
		}else System.out.println("�Էµ��� ���� ������ �ֽ��ϴ�.");		
	}//end kindInput
	
	//�ַ� �˻�
	void search(int branch) {
		System.out.println(branchName[branch-1]+" �ַ� �˻�");
		System.out.println("=================");
		System.out.println("�˻��� ���� �����ϼ���.");
		System.out.println("=================");
		System.out.print(msg);
		kindSearch(branch, select());
	}//end search
	
	//�ַ��� �˻�
	void kindSearch(int branch, int i) {
		DecimalFormat df = new DecimalFormat();
		df=new DecimalFormat("#,###");
		if(!(i<1 || i>6)) {
			iter = branchManager[branch-1].getLiquor(i).iterator();			
		}else {
			return;
		}
		boolean flag = true;//true�� �����Ǹ� �˻��� ���� ���� ��
		if(check(branch,i)==false) return;
		System.out.print("�̸��� �Է����ּ��� : ");
		name = sc.next();
		System.out.print("���������� �Է����ּ��� : ");
		year = sc.nextInt();
		while(iter.hasNext()) {
			Liquor l = (Liquor) iter.next();
			if(l.name.equals(name)&&l.ripeYear==year) {
				System.out.println("==================================");
				System.out.println(l.name+" "+l.ripeYear+"��   "+df.format(l.price)+"��   "+l.bottleCnt+"��");
				System.out.println("==================================");
				flag = false;//�˻��� ���� ������ false
				break;
			}
		}
		if(flag==true) System.out.println("��ϵ��� ���� �� �Դϴ�.");
	}//end kindSearch
	
	//�ַ� ����
	//���� �� �κ��丮 �����ϵ���
	void update(int branch) {
		System.out.println(branchName[branch-1]+" �ַ� ����");
		System.out.println("=================");
		System.out.println("�����Ͻ� ���� �����ϼ���.");
		System.out.println("=================");
		System.out.print(msg);
		kindUpdate(branch, select());
	}//end update
	
	//�ַ��� ����
	void kindUpdate(int branch, int i) {
		DecimalFormat df = new DecimalFormat();
		df=new DecimalFormat("#,###");
		if(!(i<1 || i>6)) {//���ý� ��ȣ�� �´� ���� ��ü�� iter�� ��
			iter = branchManager[branch-1].getLiquor(i).iterator();			
		}else {
			return;
		}
		int choice;
		boolean modifyCheck = true;//false�� �Ǹ� �����Ϸ�
		if(check(branch,i)==false) return;
		System.out.println("1.�̸�\n2.��������\n3.����\n4.����");
		System.out.print("���� >>> ");
		try {
			choice = sc.nextInt();
			if(!(0<choice&&choice<5))return;
			System.out.print("�����Ͻ� ���� �̸��� �Է��ϼ��� : ");
			name = sc.next();
			System.out.print("�����Ͻ� ���� ���������� �Է��ϼ��� : ");
			year = sc.nextInt();
		} catch (Exception e) {
			sc = new Scanner(System.in);
			choice = 0;
		}
		while(iter.hasNext()) {
			Liquor l = (Liquor)iter.next();
			if(!(l.name.equals(name)&&l.ripeYear==year)) break;
			else {
				switch(choice) {
					case 1:
						System.out.print("���ο� �̸��� �Է��ϼ��� : ");
						name = sc.next();
						l.name = name;
						modifyCheck = false;
						System.out.println("==================================");
						System.out.println(l.name+" "+l.ripeYear+"��   "+df.format(l.price)+"��   "+l.bottleCnt+"��");
						System.out.println("==================================");
						break;
					case 2:
						System.out.print("���ο� ���������� �Է��ϼ��� : ");
						year = sc.nextInt();
						l.ripeYear = year;
						modifyCheck = false;
						System.out.println("==================================");
						System.out.println(l.name+" "+l.ripeYear+"��   "+df.format(l.price)+"��   "+l.bottleCnt+"��");
						System.out.println("==================================");
						break;
					case 3:
						System.out.print("���ο� ������ �Է��ϼ��� : ");
						price = sc.nextInt();
						l.price = price;
						modifyCheck = false;
						System.out.println("==================================");
						System.out.println(l.name+" "+l.ripeYear+"��   "+df.format(l.price)+"��   "+l.bottleCnt+"��");
						System.out.println("==================================");
						break;
					case 4:
						System.out.print("���ο� ������ �Է��ϼ��� : ");
						cnt = sc.nextInt();
						l.bottleCnt = cnt;
						modifyCheck = false;
						System.out.println("==================================");
						System.out.println(l.name+" "+l.ripeYear+"��   "+df.format(l.price)+"��   "+l.bottleCnt+"��");
						System.out.println("==================================");
						break;
					default:
						break;
				}
			}
		}
		if(modifyCheck==true) {
			System.out.println("��ϵ��� ���� �� �Դϴ�.");
		}else {
			System.out.println("���� �Ϸ�!");	
		}
	}//end kindUpdate
	
	//�ַ� ����
	void delete(int branch) {
		System.out.println(branchName[branch-1]+" �ַ� ����");
		System.out.println("=================");
		System.out.println("������ ���� �����ϼ���.");
		System.out.println("=================");
		System.out.print(msg);
		kindDelete(branch, select());	
	}//end delete
	
	//�ַ��� ����
	void kindDelete(int branch, int i) {
		DecimalFormat df = new DecimalFormat();
		df=new DecimalFormat("#,###");
		if(!(i<1 || i>6)) {//�޴��� ���� ���� ������ ���θ޴��� ��
			iter = branchManager[branch-1].getLiquor(i).iterator();			
		}else {
			return;
		}
		if(check(branch,i)==false) return;
		System.out.print("�����Ͻ� ���� �̸��� �Է��ϼ��� : ");
		name = sc.next();
		System.out.print("�����Ͻ� ���� ���������� �Է��ϼ��� : ");
		year = sc.nextInt();
		while(iter.hasNext()) {
			Liquor l = (Liquor)iter.next();
			if(l.name.equals(name)&&l.ripeYear==year) {
				System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N)");
				String yn = sc.next();
				if(yn.toLowerCase().equals("y")) {
					iter.remove();
					System.out.println("�ش� �ַ��� �����Ͽ����ϴ�.");
					System.out.println("==================================");
					System.out.println(l.name+" "+l.ripeYear+"y "+df.format(l.price)+"�� "+l.bottleCnt+"��");
					System.out.println("==================================");					
					break;
				}
			}else {
				continue;
			}
			
		}
	}//end kindDelete
	
	//��� ���� �ַ�
	void zeroCnt(int branch) {
		DecimalFormat df = new DecimalFormat();
		df=new DecimalFormat("#,###");
		boolean test = true;//true�� ��� 0�� ��ǰ�� ����
		System.out.println(branchName[branch-1]+" ��� ���� �ַ� ���");
		System.out.println("==================================");
		for (int i = 1; i < 7; i++) {
			iter = branchManager[branch-1].getLiquor(i).iterator();			
			while(iter.hasNext()) {
				Liquor l = (Liquor) iter.next();
				if(l.bottleCnt==0) {
					System.out.println(l.name+" "+l.ripeYear+"��   "+df.format(l.price)+"��   "+l.bottleCnt+"��");
					test = false;//false�� ��� 0�� ��ǰ�� ����
				}
			}
		}
		if(test == true) {
			System.out.println("��ϵ� �ַ��� �����ϴ�.");
			return;
		}
		System.out.println("==================================");
		System.out.print("��� �߰��Ͻðڽ��ϱ�?(Y/N) : ");
		String yn = sc.next();
		if(yn.toLowerCase().equals("y")) {
			System.out.print(msg);
			int i = select();
			iter = branchManager[branch-1].getLiquor(i).iterator();
			System.out.print("�����Ͻ� ���� �̸��� �Է��ϼ��� : ");
			name = sc.next();
			System.out.print("�����Ͻ� ���� ���������� �Է��ϼ��� : ");
			year = sc.nextInt();
			while(iter.hasNext()) {
				Liquor l = (Liquor)iter.next();
				if(l.name.equals(name)&&l.ripeYear==year) {
					System.out.print("���ο� ������ �Է��ϼ��� : ");
					cnt = sc.nextInt();
					if(cnt==0)return;
					l.bottleCnt = cnt;
					System.out.println("���� �Ϸ�!");
					System.out.println("==================================");
					System.out.println(l.name+" "+l.ripeYear+"��   "+df.format(l.price)+"��   "+l.bottleCnt+"��");
					System.out.println("==================================");
					return;
				}
			}
		}else {			
			return;
		}
	}//end zeroCnt
	
	//��� ��Ȳ
	//���� ��� �����
	void list(int branch) {
		System.out.println(branchName[branch-1]+" ��� ��Ȳ");
		System.out.println("=================");
		System.out.println("���� �����ϼ���.");
		System.out.println("=================");
		System.out.print(listMsg);
		kindList(branch, select());
	}//end list
	
	//�ַ��� ���
	//�̸� ��������
	void kindList(int branch, int i) {
		if(!(i<1 || i>6)) {//�޴��� ���� ���� ������ ���θ޴��� ��
			iter = branchManager[branch-1].getLiquor(i).iterator();			
		}else if(i==7){
			allList(branch);
			return;
		}else {
			return;
		}
		if(check(branch,i)==false) {
			return;
		}
		System.out.println("======================================");
		System.out.println(branchName[branch-1]+" ��� ���");
		System.out.println("======================================");
		List<Liquor> list = new ArrayList<Liquor>(branchManager[branch-1].getLiquor(i));
		Collections.sort(list);
		for(Liquor temp : list) {
			System.out.println(temp);
		}
		System.out.println("======================================");
	}//end kindList
	
	//��� �ַ� ���
	void allList(int branch) {
		String[] kind = {"Whisky","Vodka","Tequila","Gin","Brandy","Rum"};
		System.out.println("======================================");
		System.out.println(branchName[branch-1]+" �� ��� ���");
		System.out.println("======================================");
		for(int i=1;i<7;i++) {
			if(branchManager[branch-1].getLiquor(i).isEmpty())continue;//���� ���� ����� �Ѿ
			System.out.println(kind[i-1]+" ���");
			List<Liquor> list = new ArrayList<Liquor>(branchManager[branch-1].getLiquor(i));
			Collections.sort(list);
			for(Liquor temp : list) {
				System.out.println(temp);
			}
		}
		System.out.println("======================================");
	}//end allList
	
	
	//��� ���� Ȯ��
	boolean check(int branch, int i) {
		if(i==7) {
			return false;//��� ������ false
		}else{
			if(branchManager[branch-1].getLiquor(i).isEmpty()) {
				System.out.println("��ϵ� �ַ��� �����ϴ�.");
				return false;
			}else {
				return true;//������ iter�� manager�� �ְ� true
			}
		}
	}//end check
	
	//choice
	//choice�� ���ڿ��� �����°� �����ش�.
	int select(){
		int choice;
		try {
			choice = sc.nextInt();
		} catch (Exception e) {
			System.out.println("���ڸ� �Է����ּ���...");
			sc = new Scanner(System.in);
			choice = 0;
		}
		return choice;
		
		/*
		 * while(!sc.hasNextInt()){
		 * 		sc.next();//�Է¹޾Ҵ� ���� ��������
		 * 		System.out.println("Error");
		 * }
		 * int i = sc.nextInt();
		 * hasNextInt()�� true�� �ƴ϶�°� int�� �Էµ��� �ʾҴٴ� ��
		 * 		 
		 */
	}//end choice
	
}//end Class
