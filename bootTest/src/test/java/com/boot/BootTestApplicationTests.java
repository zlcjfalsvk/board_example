package com.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.boot.domain.BoardVO;
import com.boot.mapper.BoardMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BootTestApplication.class)
@WebAppConfiguration
public class BootTestApplicationTests {

	// @Autowired
	// private DataSource ds;

	// @Autowired
	// private SqlSessionFactory sqlSession;

	@Autowired
	private BoardMapper mapper;

	@Test
	public void contextLoads() {
	}

	// @Test
	// public void testConnection() throws Exception{
	// System.out.println("ds : "+ds);
	//
	// Connection con = ds.getConnection();
	//
	// System.out.println("con : "+con);
	//
	// con.close();
	// }

	// @Test
	// public void testSqlSession() throws Exception{
	// System.out.println("sqlSession :"+sqlSession);
	//
	// }
	
	@Test 
	public void testMapper() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setSubject("TITLE");
		vo.setContent("CONTENT");
		vo.setWriter("WRITER");
		
		mapper.boardinsert(vo);
	}

}
