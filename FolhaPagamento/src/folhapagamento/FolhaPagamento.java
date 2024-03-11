package folhapagamento;

import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {
    
    private List<Funcionario> funcionarios;
    
    public FolhaPagamento(){
        this.funcionarios = new ArrayList<>();
    }
    
    public FolhaPagamento(List<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }
    
    public void contratar(Funcionario func){
        this.funcionarios.add(func);
    }
    
    public double gerarFolha(){
        
        double totalFolha = 0;
        
        for (Funcionario funcionario : funcionarios){
            totalFolha += funcionario.calcularSalario();
        }
    return totalFolha;
    }
}