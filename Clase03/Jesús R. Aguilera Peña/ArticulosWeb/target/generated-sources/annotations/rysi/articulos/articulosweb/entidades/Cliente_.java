package rysi.articulos.articulosweb.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rysi.articulos.articulosweb.entidades.Compra;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-27T11:55:48")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, Date> fechaRegistro;
    public static volatile SingularAttribute<Cliente, String> login;
    public static volatile ListAttribute<Cliente, Compra> compraList;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> email;

}