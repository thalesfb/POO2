package ch.com.xingling;

import interfaces.NotaFiscalXML;

public class FornecedorX implements NotaFiscalXML {
  @Override
  public void processarXML(String dados) {
    // Simular envio de dados XML
    System.out.println("Enviando dados XML do FornecedorX: \n" + dados);
  }
}