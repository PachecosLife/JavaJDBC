package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDao;
import model.Telefone;
import model.userposjava;

public class TesteBancoJdbc {
	
		@Test
		public void initBanco(){
			
			UserPosDao userPosDao = new UserPosDao();
			userposjava userposjava = new userposjava();
			
			userposjava.setNome("Willian");
			userposjava.setEmail("will.brazil@gmail.com");
			
			userPosDao.salvar(userposjava);
			
		}
	
		@Test
		public void initBuscar () {
			UserPosDao dao = new UserPosDao ();
			
			try {
				userposjava userposjava = dao.buscar(5L);
				
				System.out.println(userposjava);
					System.out.println("----------------");
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
		@Test
		public void initAtualizar () {
			try {
				
			UserPosDao dao = new UserPosDao ();
			userposjava objetoBanco = dao.buscar(5L);
			objetoBanco.setNome("Willian");
			dao.atualizar(objetoBanco);
			
		}catch (Exception e){
			e.printStackTrace();
		}
			
		}
		
		@Test
		public void initDeletar () {
			try {
				UserPosDao dao = new UserPosDao ();
				dao.delete(5L);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		@Test
		public void testeInsertTelefone() {
			Telefone telefone = new Telefone();
			telefone.setNumero("61 9999-9999");
			telefone.setTipo("fixo");
			telefone.setUsuario(9L);
			
			UserPosDao dao = new UserPosDao();
			dao.salvarTelefone(telefone);			
			
		}
		
}
 