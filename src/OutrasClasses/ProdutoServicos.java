package OutrasClasses;

import java.util.ArrayList;
import java.util.List;


public class ProdutoServicos {
    
    private final RepositoryProduct repository;
    
    public ProdutoServicos(RepositoryProduct repository){
        this.repository = repository;
    }
    public static String validarProduto(Produto produto) {
        if (produto.getNome() == null || produto.getNome().isEmpty()) {
            return "Preencha o nome";
        }
        if (!produto.getValidade().matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}")) {
            return "insira uma validade valida ex: dd/mm/aaaa";
        }
        if (!produto.getPreco().toString().matches("[0.00-9.99]+") || produto.getPreco() <= 0) {
            return "Preço inválido";
        }
        if (!String.valueOf(produto.getQuantidade()).matches("[0-9]+") || produto.getQuantidade() <= 0) {
            return "Quantidade inválida!";
        }
        return null;
    }
    public boolean salvarProduto(Produto produto) {
        try{
        repository.insert(produto);
        return true;
        }catch(Exception ex){
        return false;
        
        }
    }
    public boolean atualizarProduto(Produto produto) {
        try{
        repository.update(produto);
        return true;
        }catch(Exception ex){
        return false;
        
        }
    }
    public boolean controlePratico(int idProduto, int quantidade){
        try{
        Produto product = repository.select(idProduto);    
        product.setQuantidade(product.getQuantidade()+ quantidade);
        repository.update(product);
        return true;
        }catch(Exception ex){
            return false;
        }      
    }
    public List<Produto> getProdutosNome(String nome){
        try{
            return repository.select(nome);
        }catch(Exception ex){
            System.out.println("Erro ao selecionar Produtos");
            return new ArrayList<Produto>();
        }
    }
    public boolean deleteProduto(int id){
        try{
            repository.delete(id);
            return true;
        }catch(Exception ex){
            System.out.println("Erro ao deletar Produto");
            return false;
        }
    }
    public Produto getProdutoId(int id){
        try {
            return repository.select(id);
        } catch (Exception ex) {
            System.out.println("Erro ao buscar Produto pelo ID");
            return new Produto();
        }
    }
    
}
