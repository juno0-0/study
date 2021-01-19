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
   // 1. ����Ŭ �����ͺ��̽� ������ ���� 4���� ������ ���ڿ��� �����Ѵ�.
   // ��üȭ�ؼ� ������ �� �ѹ��� ���� �ٲٱ� ���ؼ�
   String driver = "oracle.jdbc.driver.OracleDriver";
   String url = "jdbc:oracle:thin:@localhost:1521:xe";
   String userid = "system";
   String password = "1234";

   
   // �Է��ؼ� ���� ������ ��������
   ArrayList list = new ArrayList<Product>();
   
   public DAO() {}

   // 1.������ ��� (���δ�Ʈ Ŭ����(���̺�))
   public List<Product> getListP(){
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "SELECT * FROM product";
      
      try {
         Class.forName(driver);
         // �Ʒ� ������ �Ź� ������ ������ ���� �־�ߵȴ�.
         Connection con = DriverManager.getConnection(url, userid, password);
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery(sql);
         // ����� �ڷḦ �������� (����ϱ�)
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
      
//            //������ ���� ���� �����ڸ� ���� �ʱ�ȭ���ش�.getter�� �ʱ�ȭ�� �������� �̷��� �غ��ٴ�
//            Product product = new Product(p_code, kind, p_name, price, p_size);
            
         if(rs!=null)rs.close();
         if(st!=null)st.close();
         if(con!=null)con.close();
         
      } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
      }
      return list;
   }// end1.���������(���δ�Ʈ)

   public List<Product> getKind(String kind){//��ư ������ �� �ڵ������� �� �޼ҵ忡 �Ű������� �ְ� ����
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

   
   
   // 2.���� �����ϱ� ����(���δ�Ʈ)
   public int insert(Product product) throws SQLException, ClassNotFoundException {
      String p_code = product.getP_code(); // UI���� ����ڰ� �Է��� ���� ����� ���޵� ��
      String kind = product.getKind();
      String p_name = product.getP_name();
      int price = product.getPrice();
      int p_size = product.getP_size();
      
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "INSERT INTO product(p_code, kind, p_name, price, p_size) " + "VALUES(?,?,?,?,?)"; //
      //sql2�� �ٷ� insert���̺� ��ϵ� ��ǰ�� �߰����ֱ� ���� (������ ���߿� �Է�) 
      String sql2 = "INSERT INTO input(p_code,kind) VALUES(?,?)";    
      //���������� �ٷ� output���̺� ��ϵ� ��ǰ�� �߰����ش�.  
      String sql3 = "INSERT INTO output(p_code,kind) VALUES(?,?)";
      
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      
      PreparedStatement st = con.prepareStatement(sql); // ??�� ä��� ���� �Է��ϱ⿡��
      st.setString(1, p_code); // PreparedStatement�� set�� �ε����� 0�� �ƴ� 1���ͽ����Ѵ�.
      st.setString(2, kind);
      st.setString(3, p_name);
      st.setInt(4, price);
      st.setInt(5, p_size);
      
      int result = st.executeUpdate();// PreparedStatment�� ����� �� ���� ���� ����
      // �̸޼ҵ�� ��ȯ�� ��, ��� row�� �Է������ ī��Ʈ ���ش�. 1���� �ԷµǸ� ���� 1�� ����
      
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

   //3.���� �����ϱ�����(���δ�Ʈ)
   public int update(Product product) throws SQLException, ClassNotFoundException {
      String p_code = product.getP_code();
      String kind = product.getKind();
      String p_name = product.getP_name();
      int price = product.getPrice();
      int p_size = product.getP_size();
      
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "UPDATE product " + "SET p_code=?,kind=?,p_name=?,price=?,p_size=? " + "WHERE p_code=?"; // preparedstatement������
                                                                                    // ' '��
                                                                                    // �ڵ�����
                                                                                    // ���� �׳�
                                                                                    // ?��
      
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      
      PreparedStatement st = con.prepareStatement(sql); // ??�� ä��� ���� �Է��ϱ⿡��
      // PreparedStatement�� set�� �ε����� 0�� �ƴ� 1���ͽ����Ѵ�.
      st.setString(1, p_code);
      st.setString(2, kind);
      st.setString(3, p_name);
      st.setInt(4, price);
      st.setInt(5, p_size);
      st.setString(6, p_code);

      
      int result = st.executeUpdate(); // PreparedStatment�� ����� �� ���� ���� ����
      // �̸޼ҵ�� ��ȯ�� ��, ��� row�� �Է������ ī��Ʈ ���ش�. 1���� �ԷµǸ� ���� 1�� ����
      
      st.close();
      con.close();
      
      return result;
   }// end 3.�� ���� (���δ�Ʈ)

   // 4.���� �����ϱ� ����(���δ�Ʈ)
   public int delete(String p_code) throws ClassNotFoundException, SQLException {

      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "DELETE product WHERE p_code=?";
      // ���� product���̺��� �⺻ Ű�� ������ �ִ� �ڽ����̺��� �־ ������ �ȵ�
      
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      PreparedStatement st = con.prepareStatement(sql);
      
      st.setString(1, p_code);
      
      int result = st.executeUpdate(); // PreparedStatment�� ����� �� ���� ���� ����
      
     
      
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
			//���⼭ new�� �����ָ� �ϳ��� p�� ������ �ߺ��Ǽ� ��� ���� ��
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
   
   // 1.������ ��� (��ǲ Ŭ����(���̺�))
   public List<Input> getListI() throws ClassNotFoundException, SQLException {

      String url = "jdbc:oracle:thin:@localhost:1521:xe";
//      String sql = "SELECT p_code, kind ,to_char(i_date,'HH24:MI:SS'),quantity FROM input";
//      String sql = "SELECT p_code, kind ,to_char(i_date," + "'"+"YYYY/MM/DD/HH24:MI:SS"+"'"+"), quantity  FROM input WHERE quantity !=0";
//      String sql = "SELECT i.p_code, i.kind ,to_char(i_date,YYYY/MM/DD/HH24:MI:SS), quantity ,price  FROM input i , product p WHERE quantity !=0 and i.p_code=p.p_code"; 
//      String sql = "SELECT p_code, kind ,i_date ,quantity FROM input";

      String sql = "SELECT i.p_code, i.kind ,i_date, i.quantity ,price a_unit_price  FROM input i , product p WHERE i.p_code=p.p_code";
  

      //������ �ɾ quantity�� null�̸� ��� �ȵǰ��Ұ�
      Class.forName(driver);
      
      Connection con = DriverManager.getConnection(url, userid, password);
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(sql);
      
      List<Input> list = new ArrayList<Input>();
      // ����� �ڷḦ �������� (����ϱ�)
      while (rs.next()) {
         String p_code = rs.getString("p_code");
         String kind = rs.getString("kind");
         Date i_date = rs.getDate("i_date");
         int quantity = rs.getInt("quantity");
      
         // ������ ���� ���� �����ڸ� ���� �ʱ�ȭ���ش�.getter�� �ʱ�ȭ�� �������� �̷��� �غ��ٴ�.
         Input input = new Input(p_code, kind, i_date, quantity);  
      
         list.add(input);
      
      }
      rs.close();
      st.close();
      con.close();
      return list;

   }// end1.���������(��ǲ)
  
   // 2.���� �����ϱ� ����(��ǲ) -������ ��ǰ������ ���δ�Ʈ ���̺� �߰��Ҷ� Ʋ�� �߰��Ǵ� ������ �߰��ϸ��
   // 2.���� �����ϱ� ����(��ǲ) +��¥�Է��߰��Ѱ� 
   public int update(Input input) throws SQLException, ClassNotFoundException {

      String p_code = input.getP_code();
      String kind = input.getKind();
      Date i_date = input.getI_date();
      int quantity = input.getQuantity();
      
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      //��¥�� �Է��� �ؾ��ϴµ�...
      String sql = "UPDATE input " + "SET i_date = ?, quantity = ?"+" WHERE p_code =? "; 
                                                                                 
      
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      
      PreparedStatement st = con.prepareStatement(sql); 
      st.setDate(1, (java.sql.Date) i_date);
      st.setInt(2, quantity);
      st.setString(3, p_code);
      
      
      int result = st.executeUpdate(); // PreparedStatment�� ����� �� ���� ���� ����
      
      
      st.close();
      con.close();
      
      return result;
   }// end 2.�� ����(��ǲ)

   // 2.���� �����ϱ� ����(��ǲ) -��¥�Է� ���� -������ ��ǰ������ ���δ�Ʈ ���̺� �߰��Ҷ� Ʋ�� �߰��Ǵ� ������ �߰��ϸ��
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
      
      
      int result = st.executeUpdate(); // PreparedStatment�� ����� �� ���� ���� ����
      
      
      st.close();
      con.close();
      
      return result;
   }// end 2.�� ����(��ǲ)


   //�ӽø޼ҵ� ��ȣ�� ver
   public int idelete(String p_code) throws ClassNotFoundException, SQLException {
      String url = "jdbc:oracle:thin:@localhost:1521:xe";
      String sql = "DELETE input WHERE p_code=?";
      // ���� product���̺��� �⺻ Ű�� ������ �ִ� �ڽ����̺��� �־ ������ �ȵ�
      
      Class.forName(driver);
      Connection con = DriverManager.getConnection(url, userid, password);
      PreparedStatement st = con.prepareStatement(sql);
      
      st.setString(1, p_code);
      
      int result = st.executeUpdate(); // PreparedStatment�� ����� �� ���� ���� ����
      
      st.close();
      con.close();
      return 0;
   }//product end

   //������ �˻�(input)
   //code �˻��� �ش� �ڵ��� ��� ������ ����(1��)
   //kind �˻��� �ش� kind�� ��� �������� ����(������)
   //date �˻��� date ��¥�� ���� ��� �������� ����(������)
   //quantity 0 �˻��� ��� ���� ��ǰ���� �������� ����(������)   
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
   
//   kind�� �ԷµǾ��� ���
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
//   date�� �ԷµǾ��� ���
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

   
   //1.������ ��� (�ƿ�ǲ Ŭ����(���̺�))
   public List<Output> getListO() throws ClassNotFoundException, SQLException {

      String url = "jdbc:oracle:thin:@localhost:1521:xe";
//      String sql = "SELECT p_code, kind ,to_char(o_date,'HH24:MI:SS'),quantity FROM output";
//      String sql = "SELECT o.p_code, o.kind ,to_char(o_date," + "'"+"YYYY/MM/DD/HH24:MI:SS"+"'"+"), quantity,price  FROM output o , product p WHERE quantity !=0 and o.p_code=p.p_code"";
//      String sql = "SELECT o.p_code, o.kind ,to_char(o_date,YYYY/MM/DD/HH24:MI:SS), quantity ,price  FROM output o , product p WHERE quantity !=0 and o.p_code=p.p_code"; 
               //--> ' '���� 
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

   }// end1.���������(�ƿ�ǲ)
   
   // oSearch ��ȣ�� ver 
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

   // 2.���� ����(�ƿ�ǲ) �Һ��ڰ� ������ ��� �ƿ�ǲ�� ������ �����ϰ� ��ǲ�� ������ ���� �̿ϼ� 
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
      int result = st.executeUpdate(); // PreparedStatment�� ����� �� ���� ���� ����
      
      
      PreparedStatement st2= con.prepareStatement(sql2); 
      st2.setInt(1, quantity);
      st2.setString(2, code);
      st2.setInt(3, quantity);
      
      st2.executeUpdate();
      
      st2.close();
      st.close();
      con.close();
      
      return result;
   }// end 2.�� ����(�ƿ�ǲ)�̿ϼ�
  
   
   
   
}
