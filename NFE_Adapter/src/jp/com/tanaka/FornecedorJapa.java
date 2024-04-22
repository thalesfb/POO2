package jp.com.tanaka;

import interfaces.NotaFiscalJSON;

public class FornecedorJapa implements NotaFiscalJSON {
  @Override
  public void processarJSON(String dados) {
    // Simular envio de dados JSON
    System.out.println("Enviando dados JSON de FornecedorJapa: \n" + dados);
  }
}