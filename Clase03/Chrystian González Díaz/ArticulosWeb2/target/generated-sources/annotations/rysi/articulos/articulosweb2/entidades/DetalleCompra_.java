package rysi.articulos.articulosweb2.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rysi.articulos.articulosweb2.entidades.Articulo;
import rysi.articulos.articulosweb2.entidades.Compra;
import rysi.articulos.articulosweb2.entidades.DetalleCompraPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-25T16:36:13")
@StaticMetamodel(DetalleCompra.class)
public class DetalleCompra_ { 

    public static volatile SingularAttribute<DetalleCompra, Compra> compra;
    public static volatile SingularAttribute<DetalleCompra, BigDecimal> precio;
    public static volatile SingularAttribute<DetalleCompra, BigDecimal> precioUnitario;
    public static volatile SingularAttribute<DetalleCompra, Integer> cantidad;
    public static volatile SingularAttribute<DetalleCompra, Articulo> articulo;
    public static volatile SingularAttribute<DetalleCompra, DetalleCompraPK> detalleCompraPK;

}