package folhapagamento;

public class Horista extends MensalFixo{
    
    private double quantidadeHorasTrabalhadas;
    private double valorHora;
    
    public Horista(String nome, String cpf, double salario, double qtdHoras, double valorHora){
        super(nome, cpf, salario);
        this.quantidadeHorasTrabalhadas = qtdHoras;
        this.valorHora = valorHora;
    }
    
    @Override
    public double calcularSalario(){
        if (this.quantidadeHorasTrabalhadas > 40){
            return super.calcularSalario() + (this.quantidadeHorasTrabalhadas - 40) * this.valorHora;
        }
        return calcularSalario();
    }
}
