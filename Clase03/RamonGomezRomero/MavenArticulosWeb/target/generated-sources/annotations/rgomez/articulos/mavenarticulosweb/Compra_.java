package rgomez.articulos.mavenarticulosweb;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rgomez.articulos.mavenarticulosweb.Cliente;
import rgomez.articulos.mavenarticulosweb.ComprasDetalle;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-21T12:46:36")
@StaticMetamodel(Compra.class)
public class Compra_ { 

    public static volatile SingularAttribute<Compra, Date> fecha;
    public static volatile SingularAttribute<Compra, Cliente> cliente;
    public static volatile SingularAttribute<Compra, BigDecimal> subtotal;
    public static volatile ListAttribute<Compra, ComprasDetalle> comprasDetalleList;
    public static volatile SingularAttribute<Compra, Integer> idCompra;

}