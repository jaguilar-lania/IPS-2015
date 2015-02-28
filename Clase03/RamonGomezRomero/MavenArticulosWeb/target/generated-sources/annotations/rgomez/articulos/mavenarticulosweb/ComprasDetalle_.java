package rgomez.articulos.mavenarticulosweb;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rgomez.articulos.mavenarticulosweb.Articulo;
import rgomez.articulos.mavenarticulosweb.Compra;
import rgomez.articulos.mavenarticulosweb.ComprasDetallePK;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-21T12:46:36")
@StaticMetamodel(ComprasDetalle.class)
public class ComprasDetalle_ { 

    public static volatile SingularAttribute<ComprasDetalle, Compra> compra;
    public static volatile SingularAttribute<ComprasDetalle, BigDecimal> precioUnitario;
    public static volatile SingularAttribute<ComprasDetalle, BigDecimal> precio;
    public static volatile SingularAttribute<ComprasDetalle, Articulo> articulo;
    public static volatile SingularAttribute<ComprasDetalle, ComprasDetallePK> comprasDetallePK;
    public static volatile SingularAttribute<ComprasDetalle, Integer> cantidad;

}