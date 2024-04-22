package ch.com.xingling;

import interfaces.NotaFiscalXML;
import java.io.File;

public class FornecedorX implements NotaFiscalXML {
  
  private File xml;

  public FornecedorX(String xml) {
    this.xml = new File(xml);
  }

  @Override
  public String lerXML() {
    // Simular envio de dados XML
    return "Enviando conteúdo do XML do FornecedorX: \n";
  }
}