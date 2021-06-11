package mantic.banque.gestioncompte;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CompteImplTest {
	private Compte compte;
	
	@Before
	public void setUp() {
		compte= new CompteImpl();
	}

	@Test
	public void testCrediter() {
		compte.crediter(50);
		compte.crediter(60);
	    assertTrue(110.0 == compte.getSolde());
	}

	@Test(expected=IllegalArgumentException.class)
	public void testCrediterException() {
		compte.crediter(-50);
	}

	@Test
	public void testDebiter() {
		compte.crediter(200);
		compte.debiter(40);
		compte.debiter(20);
		assertThat(compte.getSolde()).isEqualTo(140);
	}
}
