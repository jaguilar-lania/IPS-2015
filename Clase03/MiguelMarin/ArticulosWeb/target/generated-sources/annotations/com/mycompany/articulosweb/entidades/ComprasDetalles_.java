package com.mycompany.articulosweb.entidades;

import com.mycompany.articulosweb.entidades.Articulo;
import com.mycompany.articulosweb.entidades.Compra;
import com.mycompany.articulosweb.entidades.ComprasDetallesPK;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-21T14:21:08")
@StaticMetamodel(ComprasDetalles.class)
public class ComprasDetalles_ { 

    public static volatile SingularAttribute<ComprasDetalles, ComprasDetallesPK> comprasDetallesPK;
    public static volatile SingularAttribute<ComprasDetalles, Compra> compra;
    public static volatile SingularAttribute<ComprasDetalles, BigDecimal> precio;
    public static volatile SingularAttribute<ComprasDetalles, BigDecimal> precioUnitario;
    public static volatile SingularAttribute<ComprasDetalles, Integer> cantidad;
    public static volatile SingularAttribute<ComprasDetalles, Articulo> articulo;

}