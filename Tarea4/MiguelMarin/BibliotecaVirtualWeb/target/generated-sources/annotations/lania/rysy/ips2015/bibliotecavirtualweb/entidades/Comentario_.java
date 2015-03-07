package lania.rysy.ips2015.bibliotecavirtualweb.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-06T17:29:05")
@StaticMetamodel(Comentario.class)
public class Comentario_ { 

    public static volatile SingularAttribute<Comentario, Integer> idtesis;
    public static volatile SingularAttribute<Comentario, Date> fechaReg;
    public static volatile SingularAttribute<Comentario, Integer> estatus;
    public static volatile SingularAttribute<Comentario, Usuario> usuario;
    public static volatile SingularAttribute<Comentario, Integer> tipoComentario;
    public static volatile SingularAttribute<Comentario, Integer> idcomentario;
    public static volatile SingularAttribute<Comentario, String> comentario;

}