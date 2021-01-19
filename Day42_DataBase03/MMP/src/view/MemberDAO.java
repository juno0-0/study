package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//Data Access Object
//DB �����ϴ� Ŭ����
public class MemberDAO {
	//1. ����Ŭ �����ͺ��̽� ������ ���� 4���� ������ ���ڿ��� ����
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String userid = "system";
	String passwd = "1234";
	
	public MemberDAO() {
		try {
			//2. ����̹� �ε� OracleDriver Ŭ������ �ڹٿ��� �̿��ϱ� ���ؼ� JVM�� �÷���
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}//end ������
	
	//ȸ�� ���� ����
	public ArrayList<MemberDTO> select(){
		ArrayList<MemberDTO> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		//PreparedStatement : ?�� ���߿� �Է��ϴ� ��
		ResultSet rs = null;
		try {
			//3. Connection �α�
			con = DriverManager.getConnection(url, userid, passwd);
			//4. SQL���� �ۼ�
			String query = "SELECT * FROM member";
			//5. PreparedStatement ����, ��û�� SQL���� �����ϰ� �����ϴ� Ŭ����
			pstmt = con.prepareStatement(query);
			//6. ������ �� DB���� SQL���� ����ǰ� ����� ��� �� ���� �ۼ�
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setHeight(rs.getInt("height"));
				dto.setWeight(rs.getInt("weight"));
				dto.setSex(rs.getString("sex").charAt(0));
				list.add(dto);//ArrayList�� �����ͺ��̽��� ���ڵ带 �����ͼ� ��� �־��ִ� ��
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//7. �ڿ� �ݳ�
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(con != null) con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		//�����ͺ��̽����� ������ ������ ����ִ� ArrayList�� ����
		return list;
		
	}//end select
}//end class
