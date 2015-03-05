package lania.rysy.ips2015.bibliotecavirtualweb.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Bitacora;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Calificacion;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Comentario;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Pais;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Rol;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-01T01:16:45")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile ListAttribute<Usuario, Bitacora> bitacoraList;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile SingularAttribute<Usuario, Date> fechaReg;
    public static volatile SingularAttribute<Usuario, Integer> estatus;
    public static volatile ListAttribute<Usuario, Comentario> comentarioList;
    public static volatile SingularAttribute<Usuario, String> correo;
    public static volatile SingularAttribute<Usuario, String> usuario;
    public static volatile ListAttribute<Usuario, Calificacion> calificacionList;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, Rol> rol;
    public static volatile SingularAttribute<Usuario, Integer> idusuario;
    public static volatile SingularAttribute<Usuario, Pais> pais;

}