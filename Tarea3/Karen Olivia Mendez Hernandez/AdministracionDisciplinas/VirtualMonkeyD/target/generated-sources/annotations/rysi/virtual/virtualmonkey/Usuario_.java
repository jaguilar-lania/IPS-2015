package rysi.virtual.virtualmonkey;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rysi.virtual.virtualmonkey.Registroestadisticas;
import rysi.virtual.virtualmonkey.Roles;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-28T02:12:00")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile CollectionAttribute<Usuario, Registroestadisticas> registroestadisticasCollection;
    public static volatile SingularAttribute<Usuario, String> genero;
    public static volatile SingularAttribute<Usuario, String> facebook;
    public static volatile SingularAttribute<Usuario, String> ocupacion;
    public static volatile SingularAttribute<Usuario, String> contrasena;
    public static volatile SingularAttribute<Usuario, String> correoelectronico;
    public static volatile CollectionAttribute<Usuario, Roles> rolesCollection;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, Integer> idusuario;
    public static volatile SingularAttribute<Usuario, String> gradoacademico;

}