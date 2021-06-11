package mantic.banque.gestioncompte;

import java.sql.ResultSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class BanqueTest {
	@Mock
	private Requete requete;
	
	@Mock
	private ResultSet resultSet;
	
	@Test
	public void testGetSolde(){
		Banque banque = new Banque();
		banque.setRequete(requete);
		Mockito.when(requete.executer(any())).thenReturn(resultSet);
		assertNotNull(banque.getPersonnesFromDB());
	}

}
