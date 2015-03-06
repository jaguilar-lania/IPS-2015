package lania.rysy.ips2015.bibliotecavirtualweb.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Permiso;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-05T18:35:38")
@StaticMetamodel(Rol.class)
public class Rol_ { 

    public static volatile SingularAttribute<Rol, Integer> idrol;
    public static volatile ListAttribute<Rol, Usuario> usuarioList;
    public static volatile SingularAttribute<Rol, String> rol;
    public static volatile ListAttribute<Rol, Permiso> permisoList;

}