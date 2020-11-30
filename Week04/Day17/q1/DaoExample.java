package q1;

public class DaoExample{
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		DaoExample d = new DaoExample();
		d.dbWork(new OracleDao());
		d.dbWork(new MySqlDao());
	}
}
