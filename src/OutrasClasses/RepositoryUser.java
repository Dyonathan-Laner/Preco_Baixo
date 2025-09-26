package OutrasClasses;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Dyonathan
 */
public interface RepositoryUser {
    
    boolean delete(int id);
    boolean insert(Usuario user);
    boolean update(Usuario user);
    Usuario select(int id);
    List<Usuario> fromResultSet(ResultSet rs);
    List<Usuario> select();
    Usuario select(String nome, String senha);
}
