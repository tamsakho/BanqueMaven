package mantic.banque.gestioncompte;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import mantic.banque.utils.BanqueUtils;

public class BanqueUtilsTest {

	@Test
	public void testCalculSomme() {
		List<Double> listeDouble = new ArrayList<Double>();
		listeDouble.add(150.0);
		listeDouble.add(500.0);
		assertEquals(650.0, BanqueUtils.calculSomme(listeDouble), 0);
	}

}
