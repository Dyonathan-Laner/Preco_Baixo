package OutrasClasses;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDao implements RepositoryUser {
    
    @Override
    public boolean delete(int id){
       Conexao conexao = new Conexao();
       try{
           PreparedStatement st = conexao.conectar().prepareStatement("DELETE FROM Usuario WHERE id = ?");
           st.setInt(1,id);
           st.executeUpdate();

           return true;
       }catch(Exception e){
           System.out.println("Erro ao deletar usuario");
           return false;
       }finally{conexao.desconectar();} 
    }
    
    @Override
    public List<Usuario> select(){
        Conexao conexao = new Conexao();
        try{    
        PreparedStatement st = conexao.conectar().prepareStatement("SELECT * FROM Usuario");
        ResultSet rs = st.executeQuery();
        
        return fromResultSet(rs);
        }
        catch(Exception e){
            System.out.println("Erro ao buscar Usuario");
        return new ArrayList<Usuario>();
        
        }finally{conexao.desconectar();}
    }
    
    @Override
    public boolean insert(Usuario user){
        Conexao conexao = new Conexao();
        try{
            PreparedStatement St = conexao.conectar().prepareStatement("insert into Usuario(Nome,CPF,Nascimento,E_mail,Funcao, Senha,Salario,H_trabalhadas)values(?,?,?,?,?,?,?,?)");
            St.setString(1,user.getNome());
            St.setString(2,user.getCPF());
            St.setString(3,user.getNascimento());
            St.setString(4,user.getE_mail());
            St.setString(5,user.getFuncao());
            St.setString(6,user.getSenha());
            St.setDouble(7,user.getSalario());
            St.setInt(8,user.getH_trabalhadas());
            
            St.executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println("Não foi possivel Adicionar o Usuario");
            return false;
        }finally{conexao.desconectar();}
    }
    
    @Override
    public boolean update(Usuario user){
        Conexao conexao = new Conexao();
        try{
            PreparedStatement St = conexao.conectar().prepareStatement("UPDATE Usuario SET Nome = ?, CPF = ?, Nascimento = ?, E_mail = ?, Funcao = ?, Senha = ?, Salario = ?, H_trabalhadas = ? where id = ?");
            St.setString(1, user.getNome());
            St.setString(2, user.getCPF());
            St.setString(3, user.getNascimento());
            St.setString(4, user.getE_mail());
            St.setString(5, user.getFuncao());
            St.setString(6, user.getSenha());
            St.setDouble(7, user.getSalario());
            St.setInt(8, user.getH_trabalhadas());
            St.setInt(9, user.getId());
            
            St.executeUpdate();
            
            return true;
        }catch(Exception e){
            System.out.println("Erro ao Atualizar o Usuario");
            return false;
        }finally{conexao.desconectar();}
        
        
    }
    
    @Override
    public Usuario select(String Nome, String Senha){
        Conexao conexao = new Conexao();
        try{PreparedStatement st = conexao.conectar().prepareStatement("SELECT * FROM Usuario WHERE Nome = ? AND Senha = ?");
            st.setString(1, Nome);
            st.setString(2, Senha);
            
            ResultSet rs = st.executeQuery();
            
            List<Usuario> lista = fromResultSet(rs);
            
            if(!lista.isEmpty()){
                return lista.get(0);
            }
            return new Usuario();
        }catch(Exception e){
            System.out.println("Erro ao buscar Usuario");
            return new Usuario();
        }finally{conexao.desconectar();}
    }
    
    @Override
    public Usuario select(int id){
        Conexao conexao = new Conexao();
        try{PreparedStatement st = conexao.conectar().prepareStatement("SELECT * FROM Usuario WHERE id = ? ");
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            
            List<Usuario> lista = fromResultSet(rs);
            
            if(!lista.isEmpty()){
                return lista.get(0);
            }
            return new Usuario();
        }catch(Exception e){
            System.out.println("Erro ao buscar Usuario");
            return new Usuario();
        }finally{conexao.desconectar();}
    }    
    
    @Override
    public List<Usuario> fromResultSet(ResultSet rs){
        try{
        List<Usuario> listaU = new ArrayList<Usuario>();
        
        while(rs.next()){
        Usuario User = new Usuario();
        User.setId(rs.getInt("id"));
        User.setNome(rs.getString("Nome"));
        User.setCPF(rs.getString("CPF"));
        User.setNascimento(rs.getString("Nascimento"));
        User.setE_mail(rs.getString("E_mail"));
        User.setFuncao(rs.getString("Funcao"));
        User.setSenha(rs.getString("Senha"));
        User.setSalario(rs.getDouble("Salario"));
        User.setH_trabalhadas(rs.getInt("H_trabalhadas"));
        
        listaU.add(User);
        }
        return listaU;
        }catch(Exception e){
            System.out.println("Erro ao transformar ResultSet em lista de Usuarios ");
            return new ArrayList<Usuario>();
        }
        
    }
    
}
