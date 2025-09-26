package OutrasClasses;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsuarioServicos {
    
    private final RepositoryUser repository;
    
    public UsuarioServicos(RepositoryUser repository){
        this.repository = repository;
    }

    public static String validarUsuario(Usuario user) {

        if (!user.getNascimento().matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}")) {
            return "Data De Nascimento Inválida";
        }
        if (!user.getCPF().matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}")) {
            return "CPF inválido";
        }
        if (!user.getSalario().toString().matches("[0.00-9.99]+") || user.getSalario() <= 0) {
            return "Salario Inválido";
        }

        return null;
    }

    public static boolean validarPermissao(Usuario user, String senhainf) {
        if (user.getSenha().equals(senhainf) && user.getFuncao().equals("Gerente")) {
            return true;
        }
        return false;
    }

    public boolean adicionarUsuario(Usuario user) {
        try {
            repository.insert(user);
            return true;
        } catch (Exception ex) {
            return false;
        }

    }

    public boolean atualizarUsuario(Usuario user) {
        try {
            repository.update(user);
            return true;
        } catch (Exception ex) {
            return false;
        }

    }

    public Usuario getUsuarioId(int id) {
        try {
            return repository.select(id);
        } catch (Exception ex) {
            System.out.println("Erro ao buscar usuário pelo ID");
            return new Usuario();
        }
    }

    public static Double salarioCalculado(Usuario user) {
        Double salario = user.getSalario() * user.getH_trabalhadas();
        Date dataAtual = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String dataatual = formatador.format(dataAtual);
        String[] nas = user.getNascimento().split("/");
        String[] data = dataatual.split("/");
        int da = Integer.parseInt(data[2]);
        int dn = Integer.parseInt(nas[2]);
        int idade = da - dn;

        if (idade > 40) {
            salario = salario + 300;
        }
        return salario;
    }
    
    public boolean deletarUsuario(int id){
        try{
            repository.select(id);
            return true;
        }catch(Exception ex){
            System.out.println("Erro ao deletar Usuário");
            return false;
        }
    }

    public Usuario getUsuarioNomeSenha(String nome, String senha){
        try{
            return repository.select(nome, senha);
        }catch(Exception ex){
            return new Usuario();
        }
        
        
    }

    public List<Usuario> getListUsuario(){
        try{
            return repository.select();
        }catch(Exception ex){
            System.out.println("Erro ao buscar Usuários");
            return new ArrayList<Usuario>();
        }
    }
}
