package liquorInventory;
import java.text.DecimalFormat;
import java.util.*;
/*
 * 지점별 총 재고현황 프로그램으로 바꿔보기
 * 지점별 월매출 보고받고 순이익 계산하는 프로그램 합쳐보기
 * 데일리 인벤토리 가능하게 만들어보기
 * (마감시 그날 판 잔술, 보틀 입력하게)
 */

public class Business {
	Scanner sc = new Scanner(System.in);
	String[] branchName = {"청담점","한남점","강남점"};
	String[] text = {"Whisky","Vodka","Tequila","Gin","Brandy","Rum"};
	String msg = "1. Whisky\n2. Vodka\n3. Tequila\n4. Gin\n5. Brandy\n6. Rum\n7. Back\n선택 >>> ";
	String listMsg = "1. Whisky\n2. Vodka\n3. Tequila\n4. Gin\n5. Brandy\n6. Rum\n7. All\n8. Back\n선택 >>> ";
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
	boolean flag = true;//입력된게 없으면 true
		
	public void start() {
		System.out.println("주류 재고 관리 프로그램입니다.");
		branchMenu();
	}//end start
	
	void branchMenu() {
		boolean branchFlag = true;
		//완성하고 청담,한남,강남점 지우기
		managerMap.put("청담", new Manager("청담"));
		managerMap.put("한남", new Manager("한남"));
		managerMap.put("강남", new Manager("강남"));
		managerMap.get("청담").setId("bang");
		managerMap.get("청담").setPw("010");
		managerMap.get("한남").setId("jun");
		managerMap.get("한남").setPw("4642");
		managerMap.get("강남").setId("ho");
		managerMap.get("강남").setPw("0130");
		list.add("청담");
		list.add("한남");
		list.add("강남");
		while(branchFlag) {
			System.out.println("1. 지점 선택");
			System.out.println("2. 지점 생성");
			System.out.println("3. 지점 삭제");
			System.out.println("4. 종료");
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
	
	//오픈
	void branchCreate() {
		System.out.print("오픈한 매장을 입력하세요 : ");
		String name = sc.next();
		System.out.print("ID를 입력하세요 : ");
		String id = sc.next();
		System.out.print("PW를 입력하세요 : ");
		String pw = sc.next();
		managerMap.put(name, new Manager(name));
		list.add(name);
		managerMap.get(name).setId(id);
		managerMap.get(name).setPw(pw);
	}//end branchCreate
	
	//폐점
	void branchDelete() {
		System.out.print("폐점할 매장을 입력하세요 : ");
		String name = sc.next();
		managerMap.remove(name);
		list.remove(name);
	}//end branchDelete
	
	
	void branchChoice() {
		int choice=0;
		boolean testFlag = true;
		String result;
		while(testFlag) {
			System.out.println("지점을 선택하세요.");
			for(int i=0;i<list.size();i++) {
				System.out.println((i+1)+". "+list.get(i)+"점");
			}
			System.out.println("0. 종료");
			System.out.print("선택 >>> ");
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
			System.out.println("지점을 선택하세요.");
			System.out.println("1. 청담점");
			System.out.println("2. 한남점");
			System.out.println("3. 강남점");
			System.out.println("4. 뒤로가기");
			System.out.print("선택 >>> ");
			choice = select();
			if(choice==1)identity(choice);
			else if(choice==2)identity(choice);
			else if(choice==3)identity(choice);
			else if(choice==4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("다시 시도해주세요.");			
			}
		}
	}
	*/
	
	//ID, PW
	void identity(String branch) {	
		for(int i=0;i<3;i++) {
			System.out.println("ID와 PW를 입력해주세요.");
			System.out.print("ID : ");
			String id = sc.next();
			System.out.print("PW : ");
			String pw = sc.next();
			if(!(managerMap.get(branch).getId().equals(id)&&managerMap.get(branch).getPw().equals(pw))) {
				if(i==2) {
					System.out.println("프로그램이 종료됩니다.");
					break;
				}
				System.out.println("ID와 PW를 다시 확인해주세요.");
				continue;
			}else {
				i=0;
				//mainMenu(branch);
				break;
			}
		}
	}//end check
		
	/*
	 * 12/16 여기까지 만듬
	 */
	
	
	//메인메뉴
	void mainMenu(int branch) {
		boolean mainFlag = true;
		while(mainFlag) {
			System.out.println(branchName[branch-1]+" 메인메뉴 입니다.");
			System.out.println("==============");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 주류 등록");
			System.out.println("2. 주류 검색");
			System.out.println("3. 주류 수정");
			System.out.println("4. 주류 삭제");
			System.out.println("5. 재고가 없는 주류");
			System.out.println("6. 재고 현황");
			System.out.println("7. 지점 선택");
			System.out.println("8. 종료");
			System.out.print("선택 >>> ");
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
					System.out.println("프로그램이 종료됩니다.");
					mainFlag = false;
					break;
				default:
					break;
			}
		}
	}//end mainMenu
	
	//주류 등록
	void input(int branch) {
		boolean inputFlag = true;
		while(inputFlag) {
			System.out.println(branchName[branch-1]+" 주류 등록");
			System.out.println("=================");
			System.out.println("등록할 술을 선택하세요.");
			System.out.println("=================");
			System.out.print(msg);
			kindInput(branch, select());
			System.out.print("등록을 종료하시겠습니까?(Y/N) : ");
			String yn = sc.next();
			if(yn.toLowerCase().equals("y")||!(yn.toLowerCase().equals("n"))) {
				System.out.println("주류 등록을 종료합니다.");
				inputFlag = false;
				flag = false;//등록된 주류가 1개라도 있는거
				return;
			}
		}	
	}//end input
	
	//주류별 등록
	void kindInput(int branch, int i) {
		if(i<1 || i>6)return;
		sc.nextLine();
		
		System.out.println("=====================");
		System.out.println("등록하실 정보를 입력해주세요.");
		System.out.println("=====================");
		System.out.print("술 이름 : ");
		name = sc.nextLine();
		System.out.print("숙성연도 : ");
		year = sc.nextInt();
		System.out.print("가격 : ");
		price = sc.nextInt();
		System.out.print("수량 : ");
		cnt = sc.nextInt();
		System.out.println("=====================");
		if(!(price<0||cnt<0)) {
			if(i==1) branchManager[branch-1].getWhisky().add(new Whisky(name, year, price, cnt));
			else if(i==2) branchManager[branch-1].getVodka().add(new Vodka(name, year, price, cnt));
			else if(i==3) branchManager[branch-1].getTequila().add(new Tequila(name, year, price, cnt));
			else if(i==4) branchManager[branch-1].getGin().add(new Gin(name, year, price, cnt));
			else if(i==5) branchManager[branch-1].getBrandy().add(new Brandy(name, year, price, cnt));
			else if(i==6) branchManager[branch-1].getRum().add(new Rum(name, year, price, cnt));
			System.out.println(name+" "+year+"년   "+price+"원   "+cnt+"병");			
			System.out.println("=====================");
		}else System.out.println("입력되지 않은 정보가 있습니다.");		
	}//end kindInput
	
	//주류 검색
	void search(int branch) {
		System.out.println(branchName[branch-1]+" 주류 검색");
		System.out.println("=================");
		System.out.println("검색할 술을 선택하세요.");
		System.out.println("=================");
		System.out.print(msg);
		kindSearch(branch, select());
	}//end search
	
	//주류별 검색
	void kindSearch(int branch, int i) {
		DecimalFormat df = new DecimalFormat();
		df=new DecimalFormat("#,###");
		if(!(i<1 || i>6)) {
			iter = branchManager[branch-1].getLiquor(i).iterator();			
		}else {
			return;
		}
		boolean flag = true;//true가 유지되면 검색한 값이 없는 것
		if(check(branch,i)==false) return;
		System.out.print("이름을 입력해주세요 : ");
		name = sc.next();
		System.out.print("숙성연도를 입력해주세요 : ");
		year = sc.nextInt();
		while(iter.hasNext()) {
			Liquor l = (Liquor) iter.next();
			if(l.name.equals(name)&&l.ripeYear==year) {
				System.out.println("==================================");
				System.out.println(l.name+" "+l.ripeYear+"년   "+df.format(l.price)+"원   "+l.bottleCnt+"병");
				System.out.println("==================================");
				flag = false;//검색한 값이 있으면 false
				break;
			}
		}
		if(flag==true) System.out.println("등록되지 않은 술 입니다.");
	}//end kindSearch
	
	//주류 수정
	//마감 시 인벤토리 가능하도록
	void update(int branch) {
		System.out.println(branchName[branch-1]+" 주류 수정");
		System.out.println("=================");
		System.out.println("수정하실 술을 선택하세요.");
		System.out.println("=================");
		System.out.print(msg);
		kindUpdate(branch, select());
	}//end update
	
	//주류별 수정
	void kindUpdate(int branch, int i) {
		DecimalFormat df = new DecimalFormat();
		df=new DecimalFormat("#,###");
		if(!(i<1 || i>6)) {//선택시 번호에 맞는 술의 객체가 iter에 들어감
			iter = branchManager[branch-1].getLiquor(i).iterator();			
		}else {
			return;
		}
		int choice;
		boolean modifyCheck = true;//false가 되면 수정완료
		if(check(branch,i)==false) return;
		System.out.println("1.이름\n2.숙성연도\n3.가격\n4.수량");
		System.out.print("선택 >>> ");
		try {
			choice = sc.nextInt();
			if(!(0<choice&&choice<5))return;
			System.out.print("수정하실 술의 이름을 입력하세요 : ");
			name = sc.next();
			System.out.print("수정하실 술의 숙성연도를 입력하세요 : ");
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
						System.out.print("새로운 이름을 입력하세요 : ");
						name = sc.next();
						l.name = name;
						modifyCheck = false;
						System.out.println("==================================");
						System.out.println(l.name+" "+l.ripeYear+"년   "+df.format(l.price)+"원   "+l.bottleCnt+"병");
						System.out.println("==================================");
						break;
					case 2:
						System.out.print("새로운 숙성연도를 입력하세요 : ");
						year = sc.nextInt();
						l.ripeYear = year;
						modifyCheck = false;
						System.out.println("==================================");
						System.out.println(l.name+" "+l.ripeYear+"년   "+df.format(l.price)+"원   "+l.bottleCnt+"병");
						System.out.println("==================================");
						break;
					case 3:
						System.out.print("새로운 가격을 입력하세요 : ");
						price = sc.nextInt();
						l.price = price;
						modifyCheck = false;
						System.out.println("==================================");
						System.out.println(l.name+" "+l.ripeYear+"년   "+df.format(l.price)+"원   "+l.bottleCnt+"병");
						System.out.println("==================================");
						break;
					case 4:
						System.out.print("새로운 수량을 입력하세요 : ");
						cnt = sc.nextInt();
						l.bottleCnt = cnt;
						modifyCheck = false;
						System.out.println("==================================");
						System.out.println(l.name+" "+l.ripeYear+"년   "+df.format(l.price)+"원   "+l.bottleCnt+"병");
						System.out.println("==================================");
						break;
					default:
						break;
				}
			}
		}
		if(modifyCheck==true) {
			System.out.println("등록되지 않은 술 입니다.");
		}else {
			System.out.println("수정 완료!");	
		}
	}//end kindUpdate
	
	//주류 삭제
	void delete(int branch) {
		System.out.println(branchName[branch-1]+" 주류 삭제");
		System.out.println("=================");
		System.out.println("삭제할 술을 선택하세요.");
		System.out.println("=================");
		System.out.print(msg);
		kindDelete(branch, select());	
	}//end delete
	
	//주류별 삭제
	void kindDelete(int branch, int i) {
		DecimalFormat df = new DecimalFormat();
		df=new DecimalFormat("#,###");
		if(!(i<1 || i>6)) {//메뉴에 없는 정수 들어오면 메인메뉴로 감
			iter = branchManager[branch-1].getLiquor(i).iterator();			
		}else {
			return;
		}
		if(check(branch,i)==false) return;
		System.out.print("삭제하실 술의 이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("삭제하실 술의 숙성연도를 입력하세요 : ");
		year = sc.nextInt();
		while(iter.hasNext()) {
			Liquor l = (Liquor)iter.next();
			if(l.name.equals(name)&&l.ripeYear==year) {
				System.out.print("정말로 삭제하시겠습니까?(Y/N)");
				String yn = sc.next();
				if(yn.toLowerCase().equals("y")) {
					iter.remove();
					System.out.println("해당 주류를 삭제하였습니다.");
					System.out.println("==================================");
					System.out.println(l.name+" "+l.ripeYear+"y "+df.format(l.price)+"원 "+l.bottleCnt+"병");
					System.out.println("==================================");					
					break;
				}
			}else {
				continue;
			}
			
		}
	}//end kindDelete
	
	//재고가 없는 주류
	void zeroCnt(int branch) {
		DecimalFormat df = new DecimalFormat();
		df=new DecimalFormat("#,###");
		boolean test = true;//true면 재고가 0인 제품이 없음
		System.out.println(branchName[branch-1]+" 재고 없는 주류 목록");
		System.out.println("==================================");
		for (int i = 1; i < 7; i++) {
			iter = branchManager[branch-1].getLiquor(i).iterator();			
			while(iter.hasNext()) {
				Liquor l = (Liquor) iter.next();
				if(l.bottleCnt==0) {
					System.out.println(l.name+" "+l.ripeYear+"년   "+df.format(l.price)+"원   "+l.bottleCnt+"병");
					test = false;//false면 재고가 0인 제품이 있음
				}
			}
		}
		if(test == true) {
			System.out.println("등록된 주류가 없습니다.");
			return;
		}
		System.out.println("==================================");
		System.out.print("재고를 추가하시겠습니까?(Y/N) : ");
		String yn = sc.next();
		if(yn.toLowerCase().equals("y")) {
			System.out.print(msg);
			int i = select();
			iter = branchManager[branch-1].getLiquor(i).iterator();
			System.out.print("수정하실 술의 이름을 입력하세요 : ");
			name = sc.next();
			System.out.print("수정하실 술의 숙성연도를 입력하세요 : ");
			year = sc.nextInt();
			while(iter.hasNext()) {
				Liquor l = (Liquor)iter.next();
				if(l.name.equals(name)&&l.ripeYear==year) {
					System.out.print("새로운 수량을 입력하세요 : ");
					cnt = sc.nextInt();
					if(cnt==0)return;
					l.bottleCnt = cnt;
					System.out.println("수정 완료!");
					System.out.println("==================================");
					System.out.println(l.name+" "+l.ripeYear+"년   "+df.format(l.price)+"원   "+l.bottleCnt+"병");
					System.out.println("==================================");
					return;
				}
			}
		}else {			
			return;
		}
	}//end zeroCnt
	
	//재고 현황
	//모든술 재고 만들기
	void list(int branch) {
		System.out.println(branchName[branch-1]+" 재고 현황");
		System.out.println("=================");
		System.out.println("술을 선택하세요.");
		System.out.println("=================");
		System.out.print(listMsg);
		kindList(branch, select());
	}//end list
	
	//주류별 재고
	//이름 오름차순
	void kindList(int branch, int i) {
		if(!(i<1 || i>6)) {//메뉴에 없는 정수 들어오면 메인메뉴로 감
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
		System.out.println(branchName[branch-1]+" 재고 목록");
		System.out.println("======================================");
		List<Liquor> list = new ArrayList<Liquor>(branchManager[branch-1].getLiquor(i));
		Collections.sort(list);
		for(Liquor temp : list) {
			System.out.println(temp);
		}
		System.out.println("======================================");
	}//end kindList
	
	//모든 주류 목록
	void allList(int branch) {
		String[] kind = {"Whisky","Vodka","Tequila","Gin","Brandy","Rum"};
		System.out.println("======================================");
		System.out.println(branchName[branch-1]+" 총 재고 목록");
		System.out.println("======================================");
		for(int i=1;i<7;i++) {
			if(branchManager[branch-1].getLiquor(i).isEmpty())continue;//술이 없는 목록은 넘어감
			System.out.println(kind[i-1]+" 목록");
			List<Liquor> list = new ArrayList<Liquor>(branchManager[branch-1].getLiquor(i));
			Collections.sort(list);
			for(Liquor temp : list) {
				System.out.println(temp);
			}
		}
		System.out.println("======================================");
	}//end allList
	
	
	//재고 유무 확인
	boolean check(int branch, int i) {
		if(i==7) {
			return false;//재고가 없으면 false
		}else{
			if(branchManager[branch-1].getLiquor(i).isEmpty()) {
				System.out.println("등록된 주류가 없습니다.");
				return false;
			}else {
				return true;//있으면 iter에 manager를 넣고 true
			}
		}
	}//end check
	
	//choice
	//choice에 문자열이 들어오는걸 막아준다.
	int select(){
		int choice;
		try {
			choice = sc.nextInt();
		} catch (Exception e) {
			System.out.println("숫자만 입력해주세요...");
			sc = new Scanner(System.in);
			choice = 0;
		}
		return choice;
		
		/*
		 * while(!sc.hasNextInt()){
		 * 		sc.next();//입력받았던 값을 날려버림
		 * 		System.out.println("Error");
		 * }
		 * int i = sc.nextInt();
		 * hasNextInt()가 true가 아니라는건 int가 입력되지 않았다는 뜻
		 * 		 
		 */
	}//end choice
	
}//end Class
