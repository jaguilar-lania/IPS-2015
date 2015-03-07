package tesis.monky.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import tesis.monky.entidades.Estado;
import tesis.monky.entidades.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-03-07T01:42:42")
@StaticMetamodel(Pais.class)
public class Pais_ { 

    public static volatile ListAttribute<Pais, Usuario> usuarioList;
    public static volatile SingularAttribute<Pais, Integer> idPais;
    public static volatile ListAttribute<Pais, Estado> estadoList;
    public static volatile SingularAttribute<Pais, String> nomPais;

}