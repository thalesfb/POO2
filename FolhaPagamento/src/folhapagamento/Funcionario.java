package folhapagamento;

public abstract class Funcionario {
    
    private String nome;
    private String cpf;
    
    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    //metodo abstrato
    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
