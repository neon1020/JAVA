import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import sql.SqlMapClient;

public class CustomerDAO {
	
	private SqlSessionFactory sqlSessionFactory = SqlMapClient.getSqlSessionFactory();
	
	// select()
	public void select() {
		SqlSession session = sqlSessionFactory.openSession();
		List<Map<String, String>> data = session.selectList("Customer.select"); // namespace.id
		System.out.println(data);
	}
	
	// insert()
	
	// update()
	
	// delete()
	
}
