

/**
 * @author REBECA
 * @version 1.0
 * @created 14-feb.-2015 01:40:21 a. m.
 */
public class MaterialExt {

	public static VARCHAR Id_mat;
	public VARCHAR Id_Tesis;
	public VARCHAR Nombre;
	public Tesis PK_Tesis;

	public MaterialExt(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param Id_Tesis
	 */
	public FK_MaterialExt_Tesis(VARCHAR Id_Tesis){

	}

	/**
	 * 
	 * @param Id_mat
	 */
	public PK_MaterialExt(VARCHAR Id_mat){

	}

	/**
	 * 
	 * @param Id_mat
	 */
	public UQ_MaterialExt_Id_mat(VARCHAR Id_mat){

	}

}