package rysi.virtual.virtualmonkey;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rysi.virtual.virtualmonkey.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-02-28T02:12:00")
@StaticMetamodel(Registroestadisticas.class)
public class Registroestadisticas_ { 

    public static volatile SingularAttribute<Registroestadisticas, Integer> idtesis;
    public static volatile SingularAttribute<Registroestadisticas, Integer> idmaterialextra;
    public static volatile SingularAttribute<Registroestadisticas, Integer> ip;
    public static volatile SingularAttribute<Registroestadisticas, Integer> idregistro;
    public static volatile SingularAttribute<Registroestadisticas, Date> fechavisita;
    public static volatile SingularAttribute<Registroestadisticas, Usuario> idusuario;

}