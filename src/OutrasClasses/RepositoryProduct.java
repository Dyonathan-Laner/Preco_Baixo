package OutrasClasses;

import java.sql.ResultSet;
import java.util.List;

public interface RepositoryProduct {

    boolean delete(int id);
    List<Produto> select(String Nome);
    boolean insert(Produto produto);
    boolean update(Produto produto);
    Produto select(int id);
    List<Produto> fromResultSet(ResultSet rs);
    

}
