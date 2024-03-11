package folhapagamento;

public class Gerente extends Funcionario{
    
    private double salario;
    public Gerente(String nome, String cpf, double salario){
        super(nome, cpf);
        this.salario = salario;
    }
    
    @Override
    public double calcularSalario(){
        return this.salario;
    }
}
