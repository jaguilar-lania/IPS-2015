package lania.rysy.ips2015.bibliotecavirtualweb.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Pais;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-05T18:35:38")
@StaticMetamodel(Bitacora.class)
public class Bitacora_ { 

    public static volatile SingularAttribute<Bitacora, Date> fechaReg;
    public static volatile SingularAttribute<Bitacora, Integer> idtesis;
    public static volatile SingularAttribute<Bitacora, String> ip;
    public static volatile SingularAttribute<Bitacora, Integer> idbitacora;
    public static volatile SingularAttribute<Bitacora, Usuario> usuario;
    public static volatile SingularAttribute<Bitacora, Pais> pais;

}