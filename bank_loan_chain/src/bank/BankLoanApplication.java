package bank;

import interfaces.Handler;
import request.Request;

public class BankLoanApplication {
    public static void main(String[] args) {
        Handler handler = BuildChainBank.buildChain();

        Request request = new Request(5000, 50000, true, true);
        // Configurar o objeto Request com os detalhes necessários

        if (handler.handle(request)) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo negado!");
        }
    }
}
