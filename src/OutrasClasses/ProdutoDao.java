package OutrasClasses;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao implements RepositoryProduct {

    @Override
    public boolean delete(int id) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement st = conexao.conectar().prepareStatement("DELETE FROM Produto WHERE id = ?");
            st.setInt(1, id);
            st.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Não foi posivel exclui o Produto");
            return false;
        } finally {
            conexao.desconectar();
        }
    }
    
    @Override
    public List<Produto> select(String Nome) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement st = conexao.conectar().prepareStatement("SELECT * FROM Produto where Nome LIKE ?");
            st.setString(1, "%" + Nome + "%");
            ResultSet rs = st.executeQuery();

            return fromResultSet(rs);
        } catch (Exception e) {
            System.out.println("Erro ao buscar produto");
            return new ArrayList<Produto>();

        } finally {
            conexao.desconectar();
        }
    }
    
    @Override
    public boolean insert(Produto produto) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement St = conexao.conectar().prepareStatement("insert into Produto(Nome,Validade,Preco,Quantidade)values(?,?,?,?)");
            St.setString(1, produto.getNome());
            St.setString(2, produto.getValidade());
            St.setDouble(3, produto.getPreco());
            St.setInt(4, produto.getQuantidade());
            St.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Não foi possivel salvar o Produto");
            return false;
        } finally {
            conexao.desconectar();
        }
    }
    
    @Override
    public boolean update(Produto produto) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement St = conexao.conectar().prepareStatement("UPDATE Produto SET Nome = ?, Validade = ?, Preco = ?, Quantidade = ? where id = ?");
            St.setString(1, produto.getNome());
            St.setString(2, produto.getValidade());
            St.setDouble(3, produto.getPreco());
            St.setInt(4, produto.getQuantidade());
            St.setInt(5, produto.getId());

            St.executeUpdate();

            return true;
        } catch (Exception e) {
            System.out.println("Erro ao Atualizar o produto");
            return false;
        } finally {
            conexao.desconectar();
        }
    }
    
    @Override
    public Produto select(int id) {
        Conexao conexao = new Conexao();
        try {
            PreparedStatement st = conexao.conectar().prepareStatement("SELECT * FROM Produto where id = ?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();

            List<Produto> lista = fromResultSet(rs);

            if (!lista.isEmpty()) {
                return lista.get(0);
            }
            return new Produto();
        } catch (Exception e) {
            System.out.println("Erro ao buscar produto");
            return new Produto();

        } finally {
            conexao.desconectar();
        }
    }
    
    @Override
    public List<Produto> fromResultSet(ResultSet rs) {
        try {
            List<Produto> lista = new ArrayList<Produto>();

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setId(rs.getInt("id"));
                produto.setNome(rs.getString("Nome"));
                produto.setValidade(rs.getString("Validade"));
                produto.setPreco(rs.getDouble("Preco"));
                produto.setQuantidade(rs.getInt("Quantidade"));
                lista.add(produto);
            }
            return lista;
        } catch (Exception e) {
            System.out.println("Erro ao transformar ResultSet em lista de Produtos");
            return new ArrayList<Produto>();
        }
    }
     
}
