package folhapagamento;

public class ComissionadoEfetivo extends Comissionado{
    private double salario;
    
    public ComissionadoEfetivo(String nome, String cpf, double valorTotalVendas,
            double percentualComissao, double salario){
        super(nome, cpf, valorTotalVendas, percentualComissao);
        this.salario = salario;
    }
    
    @Override
    public double calcularSalario(){
        return super.calcularSalario()+ this.salario;
    }
}
