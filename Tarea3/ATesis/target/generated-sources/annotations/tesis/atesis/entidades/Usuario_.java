package tesis.atesis.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tesis.atesis.entidades.Pais;
import tesis.atesis.entidades.Tesis;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-27T20:29:02")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellidos;
    public static volatile SingularAttribute<Usuario, Date> fechaNac;
    public static volatile ListAttribute<Usuario, Tesis> tesisList;
    public static volatile SingularAttribute<Usuario, Pais> idPais;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, String> facebook;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, String> contraseña;

}