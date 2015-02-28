package rysi.articulos.articulosweb.entidades;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rysi.articulos.articulosweb.entidades.Cliente;
import rysi.articulos.articulosweb.entidades.DetalleCompra;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-27T11:55:48")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Date> fecha;
    public static volatile ListAttribute<Compra, DetalleCompra> detalleCompraList;
    public static volatile SingularAttribute<Compra, Cliente> cliente;
    public static volatile SingularAttribute<Compra, BigDecimal> subtotal;
    public static volatile SingularAttribute<Compra, Integer> idCompra;

}