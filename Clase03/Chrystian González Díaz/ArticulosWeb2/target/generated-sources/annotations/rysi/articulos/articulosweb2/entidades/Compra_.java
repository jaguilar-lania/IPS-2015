package rysi.articulos.articulosweb2.entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rysi.articulos.articulosweb2.entidades.Cliente;
import rysi.articulos.articulosweb2.entidades.DetalleCompra;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-25T16:36:13")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Date> fecha;
    public static volatile ListAttribute<Compra, DetalleCompra> detalleCompraList;
    public static volatile SingularAttribute<Compra, Cliente> idCliente;
    public static volatile SingularAttribute<Compra, BigDecimal> subtotal;
    public static volatile SingularAttribute<Compra, Integer> idCompra;

}