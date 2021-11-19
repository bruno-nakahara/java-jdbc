package pos_java_jdbc.pos_java_jdbc;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.BeanUserFone;
import model.Telefone;
import model.Userposjava;

import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

public class TesteBancoJdbc {

	@Test
	public void initBanco() {
		UserPosDAO userPosDAO = new UserPosDAO();
		Userposjava userposjava = new Userposjava();
		
		userposjava.setNome("Alex JDEV");
		userposjava.setEmail("java@jdev.com");
		
		userPosDAO.salvar(userposjava);
	}
	
	@Test
	public void initListar() {
		UserPosDAO dao = new UserPosDAO();

		try {
			List<Userposjava> list = dao.listar();
			
			for (Userposjava userposjava : list) {
				System.out.println(userposjava);
				System.out.println("----------------------------------------------");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void initBuscar() throws SQLException {
		UserPosDAO dao = new UserPosDAO();

		Userposjava userposjava = dao.buscar(4L);
		
		System.out.println(userposjava);
		
	}
	
	@Test
	public void initAtualizar() throws SQLException {
		UserPosDAO dao = new UserPosDAO();

		Userposjava userposjava = dao.buscar(4L);
		userposjava.setNome("Bruno Hideki Silva Nakahara");
		
		dao.atualizar(userposjava);
		
	}
	
	@Test
	public void initDeletar() {
		try {
			UserPosDAO dao = new UserPosDAO();
			dao.deletar(5L);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void initInsertTelefone() {
		try {
			Telefone telefone = new Telefone();
			telefone.setNumero("(11) 2222-2222");
			telefone.setTipo("casa");
			telefone.setUsuario(7L);
			
			UserPosDAO dao = new UserPosDAO();
			dao.salvarTelefone(telefone);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void testeCarregaFoneUser() {
		try {
			UserPosDAO dao = new UserPosDAO();

			List<BeanUserFone> beanUserFones = dao.listaUserFone(7L);
			
			for (BeanUserFone beanUserFone : beanUserFones) {
				System.out.println(beanUserFone);
				System.out.println("----------------------------------------------");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void testeDeleteUserFone() {
		try {
			UserPosDAO dao = new UserPosDAO();
			dao.deleteFonePorUser(7L);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
