package rgomez.articulos.mavenarticulosweb;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rgomez.articulos.mavenarticulosweb.Compra;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-21T12:46:36")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> email;
    public static volatile ListAttribute<Cliente, Compra> compraList;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, String> login;
    public static volatile SingularAttribute<Cliente, Date> fechaRegistro;

}