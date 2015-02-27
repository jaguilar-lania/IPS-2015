package rysi.articulos.articulosweb;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rysi.articulos.articulosweb.Cliente;
import rysi.articulos.articulosweb.DetalleCompra;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-26T14:29:34")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Date> fecha;
    public static volatile CollectionAttribute<Compra, DetalleCompra> detalleCompraCollection;
    public static volatile SingularAttribute<Compra, Cliente> idCliente;
    public static volatile SingularAttribute<Compra, BigDecimal> subtotal;
    public static volatile SingularAttribute<Compra, Integer> idCompra;

}