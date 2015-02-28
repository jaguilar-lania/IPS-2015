package tesis.atesis.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tesis.atesis.entidades.Disciplina;
import tesis.atesis.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-27T20:29:02")
@StaticMetamodel(Tesis.class)
public class Tesis_ { 

    public static volatile SingularAttribute<Tesis, Integer> idTesis;
    public static volatile SingularAttribute<Tesis, Disciplina> idDisciplina;
    public static volatile SingularAttribute<Tesis, Usuario> idUsuario;
    public static volatile SingularAttribute<Tesis, String> titulo;

}