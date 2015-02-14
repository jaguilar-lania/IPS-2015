

/**
 * @author REBECA
 * @version 1.0
 * @created 14-feb.-2015 01:40:47 a. m.
 */
public class Usuario {

	public static VARCHAR Id_Usuario;
	public VARCHAR Nombre;
	public VARCHAR Pais;
	public CHAR CorreoElec;
	public VARCHAR Facebook;
	public Admonistrador m_Admonistrador;
	public Tesis m_Tesis;

	public Usuario(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param Id_Usuario
	 */
	public PK_Usuario(VARCHAR Id_Usuario){

	}

	/**
	 * 
	 * @param Id_Usuario
	 */
	public UQ_Usuario_Id_Usuario(VARCHAR Id_Usuario){

	}

	public Colsultar(){

	}

	public Descargar(){

	}

}