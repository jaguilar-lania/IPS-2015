package rysi.articulos.articulosweb2.entidades;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rysi.articulos.articulosweb2.entidades.Articulo;
import rysi.articulos.articulosweb2.entidades.Compra;
import rysi.articulos.articulosweb2.entidades.ComprasDetallePK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-27T19:31:37")
@StaticMetamodel(ComprasDetalle.class)
public class ComprasDetalle_ { 

    public static volatile SingularAttribute<ComprasDetalle, Compra> compra;
    public static volatile SingularAttribute<ComprasDetalle, BigDecimal> precio;
    public static volatile SingularAttribute<ComprasDetalle, BigDecimal> precioUnitario;
    public static volatile SingularAttribute<ComprasDetalle, Integer> cantidad;
    public static volatile SingularAttribute<ComprasDetalle, Articulo> articulo;
    public static volatile SingularAttribute<ComprasDetalle, ComprasDetallePK> comprasDetallePK;

}