package folhapagamento;

public class Comissionado extends Funcionario{
    private double valorTotalVendas;
    private double percentualComissao;
    
    public Comissionado(String nome, String cpf, double valorTotalVendas, double percentualComissao){
        super(nome, cpf);
        this.percentualComissao = percentualComissao;
        this.valorTotalVendas = valorTotalVendas;
    }
    
    @Override
    public double calcularSalario(){
        return this.percentualComissao * valorTotalVendas;
    }
}
