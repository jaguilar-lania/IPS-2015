package rysi.articulos.articulosweb.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rysi.articulos.articulosweb.entidades.Articulo;
import rysi.articulos.articulosweb.entidades.Compra;
import rysi.articulos.articulosweb.entidades.DetalleCompraPK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-27T11:55:48")
@StaticMetamodel(DetalleCompra.class)
public class DetalleCompra_ { 

    public static volatile SingularAttribute<DetalleCompra, Compra> compra;
    public static volatile SingularAttribute<DetalleCompra, BigDecimal> precio;
    public static volatile SingularAttribute<DetalleCompra, BigDecimal> precioUnitario;
    public static volatile SingularAttribute<DetalleCompra, Integer> cantidad;
    public static volatile SingularAttribute<DetalleCompra, Articulo> articulo;
    public static volatile SingularAttribute<DetalleCompra, DetalleCompraPK> detalleCompraPK;

}