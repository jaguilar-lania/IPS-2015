package rysi.articulos.articulosweb;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rysi.articulos.articulosweb.Articulo;
import rysi.articulos.articulosweb.Compra;
import rysi.articulos.articulosweb.DetalleCompraPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-26T14:29:34")
@StaticMetamodel(DetalleCompra.class)
public class DetalleCompra_ { 

    public static volatile SingularAttribute<DetalleCompra, Compra> compra;
    public static volatile SingularAttribute<DetalleCompra, BigDecimal> precio;
    public static volatile SingularAttribute<DetalleCompra, BigDecimal> precioUnitario;
    public static volatile SingularAttribute<DetalleCompra, Integer> cantidad;
    public static volatile SingularAttribute<DetalleCompra, Articulo> articulo;
    public static volatile SingularAttribute<DetalleCompra, DetalleCompraPK> detalleCompraPK;

}