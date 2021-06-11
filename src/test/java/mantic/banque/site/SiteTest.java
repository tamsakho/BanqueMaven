/**
 * 
 */
package mantic.banque.site;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;
import org.xml.sax.SAXException;

import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebResponse;

/**
 * @author Sakho
 *
 */
public class SiteTest {
	public static final String URL = "http://localhost:8080/MonSiteStatic/index.html";

	@Test
	public void testMenuPage() {
		try {
			WebConversation webConversation = new WebConversation();
			WebResponse menuResponse = webConversation.getResponse(URL);
			assertEquals("JTS Web Site", menuResponse.getTitle());
		} catch (SAXException e) {
			fail("SAXException: " + e.getMessage());
		} catch (IOException e) {
			fail("IOException: " + e.getMessage());
		}
	}
}
