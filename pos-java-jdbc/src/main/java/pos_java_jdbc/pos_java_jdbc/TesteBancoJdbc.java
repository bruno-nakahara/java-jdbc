package pos_java_jdbc.pos_java_jdbc;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.Userposjava;

import org.junit.Test;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setId(5L);
		userposjava.setNome("Diego Costa");
		userposjava.setEmail("rock@jdc.com");
		
		userPosDAO.salvar(userposjava);
	}
}
