package jp.com.tanaka;

import interfaces.NotaFiscalJSON;
import java.io.File;

public class FornecedorJapa implements NotaFiscalJSON {

  private File json;

  public FornecedorJapa(String json) {
    this.json = new File(json);
  }

  @Override
  public String lerJSON() {
    // Simular envio de dados JSON
    return "Enviando dados JSON de FornecedorJapa: \n";
  }
}