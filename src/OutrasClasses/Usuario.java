package OutrasClasses;

public class Usuario {
    private int id, H_trabalhadas;
    private String Nome, CPF, Nascimento, E_mail, Senha; 
    private Double Salario;
    private String Funcao;

    public Usuario(int id, int H_trabalhadas, String Nome, String CPF, String Nascimento, String E_mail, String Senha, Double Salario, String Funcao) {
        this.id = id;
        this.H_trabalhadas = H_trabalhadas;
        this.Nome = Nome;
        this.CPF = CPF;
        this.Nascimento = Nascimento;
        this.E_mail = E_mail;
        this.Senha = Senha;
        this.Salario = Salario;
        this.Funcao = Funcao;
    }

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getH_trabalhadas() {
        return H_trabalhadas;
    }

    public void setH_trabalhadas(int H_trabalhadas) {
        this.H_trabalhadas = H_trabalhadas;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    
    
}
