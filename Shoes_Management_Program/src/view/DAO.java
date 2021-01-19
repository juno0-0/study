package view;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;




public class DAO {
   // 1. 오라클 데이터베이스 연동을 위한 4가지 정보를 문자열에 저장한다.
   // 객체화해서 변경할 시 한번에 쉽게 바꾸기 위해서
   String driver = "oracle.jdbc.driver.OracleDriver";
   String url = "jdbc:oracle:thin:@localhost:1521:xe";
   String userid = "system";
   String password = "1234";

   
   // 입력해서 담기는 값들을 담으려고
   ArrayList list = new ArrayList<Product>();
   
   public DAO() {}

   // 1.데이터 출력 (프로덕트 클래스(테이블))
   public List<Product> getListP(){
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "SELECT * FROM product";
      
      try {
         Class.forName(driver);
         // 아래 세개는 매번 실행할 때마다 따로 있어야된다.
         Connection con = DriverManager.getConnection(url, userid, password);
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(sql);
         // 저장된 자료를 가져오기 (출력하기)
         while (rs.next()) {
            Product p = new Product();
            p.setP_code(rs.getString("p_code"));
            p.setKind(rs.getString("kind"));
            p.setP_name(rs.getString("p_name"));
            p.setPrice(rs.getInt("price"));
            p.setP_size(rs.getInt("p_size"));
//          String p_code = rs.getString("p_code");
//          String kind = rs.getString("kind");
//          String p_name = rs.getString("p_name");
//          int price = rs.getInt("price");
//          int p_size = rs.getInt("p_size");

            list.add(p);
         }
      
//            //위에서 받은 값을 생성자를 통해 초기화해준다.getter로 초기화할 수있지만 이렇게 해보겟다
//            Product product = new Product(p_code, kind, p_name, price, p_size);
            
         if(rs!=null)rs.close();
         if(st!=null)st.close();
         if(con!=null)con.close();
         
      } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
      }
      return list;
   }// end1.데이터출력(프로덕트)

   public List<Product> getKind(String kind){//버튼 눌렀을 때 자동적으로 이 메소드에 매개변수를 주고 실행
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String sql = "SELECT * FROM product WHERE kind = ?";
         try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, userid, password);
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, kind);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
               Product p = new Product();
               p.setP_code(rs.getString("p_code"));
               p.setKind(rs.getString("kind"));
               p.setP_name(rs.getString("p_name"));
               p.setPrice(rs.getInt("price"));
               p.setP_size(rs.getInt("p_size"));
               list.add(p);
            }
            if(rs!=null)rs.close();
            if(pstmt!=null)pstmt.close();
            if(con!=null)con.close();
         } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
         }
         return list;
      }

   
   
   // 2.값을 삽입하기 위한(프로덕트)
   public int insert(Product product) throws SQLException, ClassNotFoundException {
      String p_code = product.getP_code(); // UI에서 사용자가 입력한 값이 여기로 전달될 것
      String kind = product.getKind();
      String p_name = product.getP_name();
      int price = product.getPrice();
      int p_size = product.getP_size();
      
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "INSERT INTO product(p_code, kind, p_name, price, p_size) " + "VALUES(?,?,?,?,?)"; //
      //sql2는 바로 insert테이블에 등록된 제품을 추가해주기 위해 (수량은 나중에 입력) 
      String sql2 = "INSERT INTO input(p_code,kind) VALUES(?,?)";    
      //마찬가지로 바로 output테이블에 등록된 제품을 추가해준다.  
      String sql3 = "INSERT INTO output(p_code,kind) VALUES(?,?)";
      
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      
      PreparedStatement st = con.prepareStatement(sql); // ??를 채우기 위해 입력하기에서
      st.setString(1, p_code); // PreparedStatement의 set의 인덱스는 0이 아닌 1부터시작한다.
      st.setString(2, kind);
      st.setString(3, p_name);
      st.setInt(4, price);
      st.setInt(5, p_size);
      
      int result = st.executeUpdate();// PreparedStatment을 사용할 때 쓰는 것을 골라라
      // 이메소드는 반환값 즉, 몇개의 row가 입력됬는지를 카운트 해준다. 1개가 입력되면 리턴 1을 해줌
      
      PreparedStatement st2 = con.prepareStatement(sql2);
         st2.setString(1, p_code);
         st2.setString(2, kind);
         
         st2.executeUpdate();
      
         PreparedStatement st3 = con.prepareStatement(sql3);
         st3.setString(1, p_code);
         st3.setString(2, kind);
         
         st3.executeUpdate();
      
      st.close();
      st2.close();
      st3.close();
      con.close();
      
      
      return result;

   }

   //3.값을 수정하기위해(프로덕트)
   public int update(Product product) throws SQLException, ClassNotFoundException {
      String p_code = product.getP_code();
      String kind = product.getKind();
      String p_name = product.getP_name();
      int price = product.getPrice();
      int p_size = product.getP_size();
      
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "UPDATE product " + "SET p_code=?,kind=?,p_name=?,price=?,p_size=? " + "WHERE p_code=?"; // preparedstatement쓸때는
                                                                                    // ' '가
                                                                                    // 자동으로
                                                                                    // 붙음 그냥
                                                                                    // ?써
      
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      
      PreparedStatement st = con.prepareStatement(sql); // ??를 채우기 위해 입력하기에서
      // PreparedStatement의 set의 인덱스는 0이 아닌 1부터시작한다.
      st.setString(1, p_code);
      st.setString(2, kind);
      st.setString(3, p_name);
      st.setInt(4, price);
      st.setInt(5, p_size);
      st.setString(6, p_code);

      
      int result = st.executeUpdate(); // PreparedStatment을 사용할 때 쓰는 것을 골라라
      // 이메소드는 반환값 즉, 몇개의 row가 입력됬는지를 카운트 해준다. 1개가 입력되면 리턴 1을 해줌
      
      st.close();
      con.close();
      
      return result;
   }// end 3.값 수정 (프로덕트)

   // 4.값을 삭제하기 위해(프로덕트)
   public int delete(String p_code) throws ClassNotFoundException, SQLException {

      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "DELETE product WHERE p_code=?";
      // 지금 product테이블의 기본 키를 가지고 있는 자식테이블이 있어서 삭제가 안됨
      
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      PreparedStatement st = con.prepareStatement(sql);
      
      st.setString(1, p_code);
      
      int result = st.executeUpdate(); // PreparedStatment을 사용할 때 쓰는 것을 골라라
      
     
      
      st.close();
      con.close();
      return 0;
   }//product end
   
   public ArrayList<Product> mainSearch(String name, int price, int size) {
	   int n = 0;
	   ArrayList<Product> aList = new ArrayList<>();
	   Product p = null;
	   String url = "jdbc:oracle:thin:@localhost:1521:xe";
	   String sql = "";
	   if(!name.isEmpty()) {
		   sql = "SELECT * FROM product WHERE p_name like ?";
		   //sql = "SELECT * FROM product WHERE p_name like"+"%"+"?"+"%";
		   n = 1;
	   }else if(price!=0||!(String.valueOf(price).equals(""))) {
		   sql = "SELECT * FROM product WHERE price <= ?";
		   n = 2;
	   }else if(size!=0||!(String.valueOf(size).equals(""))) {
		   sql = "SELECT * FROM product WHERE p_size = ?";
		   n = 3;
	   }
	   try {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, userid, password);
		PreparedStatement pstmt = con.prepareStatement(sql);
		if(n==1) pstmt.setString(1, "%"+name+"%");
		else if(n==2) pstmt.setInt(1, price);
		else if(n==3) pstmt.setInt(1, size);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			//여기서 new를 안해주면 하나의 p에 값들이 중복되서 계속 들어가는 것
			p = new Product();
			p.setP_code(rs.getString("p_code"));
			p.setKind(rs.getString("kind"));
			p.setP_name(rs.getString("p_name"));
			p.setPrice(rs.getInt("price"));
			p.setP_size(rs.getInt("p_size"));
			aList.add(p);
		}
		if(rs!=null)rs.close();
		if(pstmt!=null)pstmt.close();
		if(con!=null)con.close();
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	   return aList;
   }
   
   // 1.데이터 출력 (인풋 클래스(테이블))
   public List<Input> getListI() throws ClassNotFoundException, SQLException {

      String url = "jdbc:oracle:thin:@localhost:1521:xe";
//      String sql = "SELECT p_code, kind ,to_char(i_date,'HH24:MI:SS'),quantity FROM input";
//      String sql = "SELECT p_code, kind ,to_char(i_date," + "'"+"YYYY/MM/DD/HH24:MI:SS"+"'"+"), quantity  FROM input WHERE quantity !=0";
//      String sql = "SELECT i.p_code, i.kind ,to_char(i_date,YYYY/MM/DD/HH24:MI:SS), quantity ,price  FROM input i , product p WHERE quantity !=0 and i.p_code=p.p_code"; 
//      String sql = "SELECT p_code, kind ,i_date ,quantity FROM input";

      String sql = "SELECT i.p_code, i.kind ,i_date, i.quantity ,price a_unit_price  FROM input i , product p WHERE i.p_code=p.p_code";
  

      //조건을 걸어서 quantity가 null이면 출력 안되게할것
      Class.forName(driver);
      
      Connection con = DriverManager.getConnection(url, userid, password);
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(sql);
      
      List<Input> list = new ArrayList<Input>();
      // 저장된 자료를 가져오기 (출력하기)
      while (rs.next()) {
         String p_code = rs.getString("p_code");
         String kind = rs.getString("kind");
         Date i_date = rs.getDate("i_date");
         int quantity = rs.getInt("quantity");
      
         // 위에서 받은 값을 생성자를 통해 초기화해준다.getter로 초기화할 수있지만 이렇게 해보겟다.
         Input input = new Input(p_code, kind, i_date, quantity);  
      
         list.add(input);
      
      }
      rs.close();
      st.close();
      con.close();
      return list;

   }// end1.데이터출력(인풋)
  
   // 2.값을 삽입하기 위한(인풋) -기존의 제품정보는 프로덕트 테이블에 추가할때 틀은 추가되니 수량만 추가하면됨
   // 2.값을 삽입하기 위한(인풋) +날짜입력추가한거 
   public int update(Input input) throws SQLException, ClassNotFoundException {

      String p_code = input.getP_code();
      String kind = input.getKind();
      Date i_date = input.getI_date();
      int quantity = input.getQuantity();
      
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      //날짜도 입력을 해야하는데...
      String sql = "UPDATE input " + "SET i_date = ?, quantity = ?"+" WHERE p_code =? "; 
                                                                                 
      
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      
      PreparedStatement st = con.prepareStatement(sql); 
      st.setDate(1, (java.sql.Date) i_date);
      st.setInt(2, quantity);
      st.setString(3, p_code);
      
      
      int result = st.executeUpdate(); // PreparedStatment을 사용할 때 쓰는 것을 골라라
      
      
      st.close();
      con.close();
      
      return result;
   }// end 2.값 삽입(인풋)

   // 2.값을 삽입하기 위한(인풋) -날짜입력 없는 -기존의 제품정보는 프로덕트 테이블에 추가할때 틀은 추가되니 수량만 추가하면됨
   public int q_Update(Input input) throws SQLException, ClassNotFoundException {

      String p_code = input.getP_code();
      String kind = input.getKind();
      Date i_date = input.getI_date();
      int quantity = input.getQuantity();
      
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "UPDATE input " + "SET quantity = quantity + ?"+" WHERE p_code =? "; 
                                                                                 
      
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      
      PreparedStatement st = con.prepareStatement(sql); 
      
      st.setInt(1, quantity);
      st.setString(2, p_code);
      
      
      int result = st.executeUpdate(); // PreparedStatment을 사용할 때 쓰는 것을 골라라
      
      
      st.close();
      con.close();
      
      return result;
   }// end 2.값 삽입(인풋)


   //임시메소드 준호님 ver
   public int idelete(String p_code) throws ClassNotFoundException, SQLException {
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "DELETE input WHERE p_code=?";
      // 지금 product테이블의 기본 키를 가지고 있는 자식테이블이 있어서 삭제가 안됨
      
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      PreparedStatement st = con.prepareStatement(sql);
      
      st.setString(1, p_code);
      
      int result = st.executeUpdate(); // PreparedStatment을 사용할 때 쓰는 것을 골라라
      
      st.close();
      con.close();
      return 0;
   }//product end

   //데이터 검색(input)
   //code 검색시 해당 코드의 재고 정보가 나옴(1개)
   //kind 검색시 해당 kind의 재고 정보들이 나옴(여러개)
   //date 검색시 date 날짜에 들어온 재고 정보들이 나옴(여러개)
   //quantity 0 검색시 재고가 없는 제품들의 정보들이 나옴(여러개)   
   public Input iSearch(String code) {
      Input i = new Input();
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "SELECT * FROM input WHERE p_code = ?";
      try {
         Class.forName(driver);
         Connection con = DriverManager.getConnection(url, userid, password);
         PreparedStatement pstmt = con.prepareStatement(sql);
         pstmt.setString(1, code);
         ResultSet rs = pstmt.executeQuery();
         while(rs.next()) {
            i.setP_code(rs.getString("p_code"));
            i.setKind(rs.getString("kind"));
            i.setI_date(rs.getDate("i_date"));
            i.setQuantity(rs.getInt("quantity"));
         }
      
         if(rs!=null)rs.close();
         if(pstmt!=null)pstmt.close();
         if(con!=null)con.close();
      } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
      }
      return i;
   }
   
//   kind만 입력되었을 경우
//   public Input kSearch(String kind) {
//      Input i = new Input();
//      String url = "jdbc:oracle:thin:@localhost:1521:xe";
//      String sql = "SELECT * FROM input WHERE kind = ?";
//      try {
//         Class.forName(driver);
//         Connection con = DriverManager.getConnection(url, userid, password);
//         PreparedStatement pstmt = con.prepareStatement(sql);
//         pstmt.setString(1, kind);
//         ResultSet rs = pstmt.executeQuery();
//         while(rs.next()) {
//            i.setP_code(rs.getString("p_code"));
//            i.setKind(rs.getString("kind"));
//            i.setI_date(rs.getDate("i_date"));
//            i.setQuantity(rs.getInt("quantity"));
//         }
//      
//         if(rs!=null)rs.close();
//         if(pstmt!=null)pstmt.close();
//         if(con!=null)con.close();
//      } catch (ClassNotFoundException | SQLException e) {
//         e.printStackTrace();
//      }
//      return i;
//   }
//   date만 입력되었을 경우
//   public Input dSearch(Date date) {
//      Input i = new Input();
//      String url = "jdbc:oracle:thin:@localhost:1521:xe";
//      String sql = "SELECT * FROM input WHERE i_date = to_char(?, 'yyyy-MI-dd')";
//      try {
//         Class.forName(driver);
//         Connection con = DriverManager.getConnection(url, userid, password);
//         PreparedStatement pstmt = con.prepareStatement(sql);
//         pstmt.setDate(1, java.sql.Date.valueOf(date+""));
//         ResultSet rs = pstmt.executeQuery();
//         while(rs.next()) {
//            i.setP_code(rs.getString("p_code"));
//            i.setKind(rs.getString("kind"));
//            i.setI_date(rs.getDate("i_date"));
//            i.setQuantity(rs.getInt("quantity"));
//         }
//      
//         if(rs!=null)rs.close();
//         if(pstmt!=null)pstmt.close();
//         if(con!=null)con.close();
//      } catch (ClassNotFoundException | SQLException e) {
//         e.printStackTrace();
//      }
//      return i;
//   }

   
   //1.데이터 출력 (아웃풋 클래스(테이블))
   public List<Output> getListO() throws ClassNotFoundException, SQLException {

      String url = "jdbc:oracle:thin:@localhost:1521:xe";
//      String sql = "SELECT p_code, kind ,to_char(o_date,'HH24:MI:SS'),quantity FROM output";
//      String sql = "SELECT o.p_code, o.kind ,to_char(o_date," + "'"+"YYYY/MM/DD/HH24:MI:SS"+"'"+"), quantity,price  FROM output o , product p WHERE quantity !=0 and o.p_code=p.p_code"";
//      String sql = "SELECT o.p_code, o.kind ,to_char(o_date,YYYY/MM/DD/HH24:MI:SS), quantity ,price  FROM output o , product p WHERE quantity !=0 and o.p_code=p.p_code"; 
               //--> ' '뺏음 
      String sql ="SELECT o.p_code, o.kind, o_date, quantity, price FROM output o, product p WHERE o.p_code = p.p_code";
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(sql);
      
      List<Output> list = new ArrayList<Output>();
      
      while (rs.next()) {
          String p_code = rs.getString("p_code");
          String kind = rs.getString("kind");
          Date o_date = rs.getDate("o_date");
          int quantity = rs.getInt("quantity");
          int totalPrice = rs.getInt("price");
                    
          Output output = new Output(p_code, kind, o_date, quantity, totalPrice);
       
          list.add(output);
       
       }

      rs.close();
      st.close();
      con.close();
      return list;

   }// end1.데이터출력(아웃풋)
   
   // oSearch 준호님 ver 
   public Output oSearch(String code) {
         Output o = new Output();
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         String sql = "SELECT o.p_code, o.kind, o_date, quantity, price FROM output o, product p WHERE quantity != 0 AND o.p_code = ? AND o.p_code = p.p_code";
         try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, userid, password);
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, code);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()) {
               o.setP_code(rs.getString("p_code"));
               o.setKind(rs.getString("kind"));
               o.setO_date(rs.getDate("o_date"));
               o.setQuantity(rs.getInt("quantity"));
               o.setTotalPrice(rs.getInt("price"));
            }
         
            if(rs!=null)rs.close();
            if(pstmt!=null)pstmt.close();
            if(con!=null)con.close();
         } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
         }
         return o;
      }

   // 2.값을 삽입(아웃풋) 소비자가 물건을 사면 아웃풋의 수량이 증가하고 인풋의 수량이 감소 미완성 
   public int update(String code, int quantity) throws SQLException, ClassNotFoundException {

//      String p_code = output.getP_code();
//      String kind = output.getKind();
//      Date o_date = output.getO_date();
//      int quantity = output.getQuantity();

      
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "UPDATE output  SET quantity = quantity+? WHERE p_code= ? AND ? <=(SELECT I.quantity FROM input I WHERE p_code=?) "; 
      String sql2 ="UPDATE input SET quantity =  quantity -? WHERE p_code = ? AND ? <= quantity";                                                    
      
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      PreparedStatement st = con.prepareStatement(sql); 
      
      st.setInt(1, quantity);
      st.setString(2, code);
      st.setInt(3, quantity);
      st.setString(4, code);
      int result = st.executeUpdate(); // PreparedStatment을 사용할 때 쓰는 것을 골라라
      
      
      PreparedStatement st2= con.prepareStatement(sql2); 
      st2.setInt(1, quantity);
      st2.setString(2, code);
      st2.setInt(3, quantity);
      
      st2.executeUpdate();
      
      st2.close();
      st.close();
      con.close();
      
      return result;
   }// end 2.값 삽입(아웃풋)미완성
  
   
   
   
}
