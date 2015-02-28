package rysi.articulos.articulosweb;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rysi.articulos.articulosweb.Compra;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-26T14:29:34")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile CollectionAttribute<Cliente, Compra> compraCollection;
    public static volatile SingularAttribute<Cliente, Date> fechaRegistro;
    public static volatile SingularAttribute<Cliente, String> login;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> email;

}