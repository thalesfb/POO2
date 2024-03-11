package folhapagamento;

public class MensalFixo extends Funcionario{
    
    private double salario;
    public MensalFixo(String nome, String cpf, double salario){
        super(nome, cpf);
        this.salario = salario;
    }
    
    @Override
    public double calcularSalario(){
        return this.salario;
    }
}
