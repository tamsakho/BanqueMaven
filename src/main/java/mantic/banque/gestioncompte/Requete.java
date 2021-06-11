/**
 * 
 */
package mantic.banque.gestioncompte;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 * @author Sakho
 *
 */
public class Requete {
	
	private static final String URL_DS = "java:/comp/env/jdbc/biblioDS";
	Context ctx = null;
	DataSource ds=null;
	Connection cnn = null;
	
	
	public Requete() {
		try{
		ctx = new InitialContext();
		ds=(DataSource)ctx.lookup(URL_DS);
		 cnn = ds.getConnection();
		}catch(Exception e){
			e.printStackTrace();
		}
	}


	public ResultSet executer(String req){
		ResultSet rs= null;
			try {
				Statement stt = cnn.createStatement();
				rs= stt.executeQuery(req);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return rs;

	}
	public List executerList(String req, int colonne){
		List l= new LinkedList();
		ResultSet rs= null;
			try {
				Statement stt = cnn.createStatement();
				rs= stt.executeQuery(req);
				while(rs.next())
					l.add(rs.getString(colonne));
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			return l;

	}


	/**
	 * 
	 */
	public void fermerConnexion() {
		try {
			cnn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
