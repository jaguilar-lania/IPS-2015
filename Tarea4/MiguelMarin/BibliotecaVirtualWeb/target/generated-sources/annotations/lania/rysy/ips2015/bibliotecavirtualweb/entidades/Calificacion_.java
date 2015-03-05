package lania.rysy.ips2015.bibliotecavirtualweb.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lania.rysy.ips2015.bibliotecavirtualweb.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-01T01:16:45")
@StaticMetamodel(Calificacion.class)
public class Calificacion_ { 

    public static volatile SingularAttribute<Calificacion, Double> calificacion;
    public static volatile SingularAttribute<Calificacion, Integer> idtesis;
    public static volatile SingularAttribute<Calificacion, Date> fechaReg;
    public static volatile SingularAttribute<Calificacion, Integer> idcalificacion;
    public static volatile SingularAttribute<Calificacion, Usuario> usuario;

}