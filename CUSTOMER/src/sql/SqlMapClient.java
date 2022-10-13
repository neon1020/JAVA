package sql;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapClient {
	private static SqlSessionFactory sqlSessionFactory;
	
	// 클래스 로딩 시 자동으로 실행되는 static 블럭
	static {
		try {
			String resource = "mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			
			if(sqlSessionFactory == null) {
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Getter 메소드
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
