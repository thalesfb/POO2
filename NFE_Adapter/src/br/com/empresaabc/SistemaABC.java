package br.com.empresaabc;

import interfaces.NotaFiscalXML;

public class SistemaABC implements NotaFiscalXML {
  @Override
  public void processarXML(String dados) {
    // Lógica para processar XML
    System.out.println("Processando XML em SistemaABC: \n" + dados);
  }
}
