package tesis.monky.entidades;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tesis.monky.entidades.Disciplina;
import tesis.monky.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-07T01:42:42")
@StaticMetamodel(Tesis.class)
public class Tesis_ { 

    public static volatile SingularAttribute<Tesis, Integer> idTesis;
    public static volatile SingularAttribute<Tesis, Serializable> archivo;
    public static volatile SingularAttribute<Tesis, Disciplina> idDisciplina;
    public static volatile SingularAttribute<Tesis, Usuario> idUsuario;
    public static volatile SingularAttribute<Tesis, String> titulo;

}