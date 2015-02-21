package com.mycompany.articulosweb.entidades;

import com.mycompany.articulosweb.entidades.ComprasDetalles;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-21T14:21:08")
@StaticMetamodel(Articulo.class)
public class Articulo_ { 

    public static volatile SingularAttribute<Articulo, Integer> idArticulo;
    public static volatile SingularAttribute<Articulo, String> descripcion;
    public static volatile SingularAttribute<Articulo, BigDecimal> precio;
    public static volatile ListAttribute<Articulo, ComprasDetalles> comprasDetallesList;
    public static volatile SingularAttribute<Articulo, String> nombre;

}