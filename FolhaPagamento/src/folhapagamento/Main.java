package folhapagamento;

import java.util.ArrayList;
import java.util.List;
public class Main {
    
    public static void main(String[] args) {
        List<Funcionario> funcs = new ArrayList<>();
        
        funcs.add(new MensalFixo("José", "11111111111", 2000)); //2000
        funcs.add(new Horista("Maria", "22222222222", 2000, 50, 100)); //3000
        funcs.add(new Comissionado("Ana", "33333333333", 50000, 0.1)); //5000
        funcs.add(new ComissionadoEfetivo("Pedro", "4444444444", 40000, 0.1, 2000)); //6000
        funcs.add(new Gerente("Augusto", "6666666666", 50000)); //50000
        
        FolhaPagamento fp = new FolhaPagamento(funcs);
        
        System.out.println("Total da folha: " + fp.gerarFolha());
    }   
}