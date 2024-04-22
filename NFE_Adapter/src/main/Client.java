package main;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import ch.com.xingling.FornecedorX;
import jp.com.tanaka.FornecedorJapa;
import br.com.empresaabc.SistemaABC;
import adapters.JSONToXMLAdapter;

public class Client {
  public static void main(String[] args) {
    FornecedorX fornecedorX = new FornecedorX(); // só envia XML
    FornecedorJapa fornecedorJapa = new FornecedorJapa(); // só envia JSON
    SistemaABC sistemaABC = new SistemaABC(); // só recebe XML

    // obter dados de um arquivo XML do fonrecedor X e enviar para o sistema ABC
    try {
      String dadosXml = new String(Files.readAllBytes(Paths.get("../data/nf.xml")), StandardCharsets.UTF_8);
      sistemaABC.processarXML(dadosXml);
    } catch (IOException e) {
      e.printStackTrace();
    }
    // obter dados de um arquivo JSON do fornecedor Japa e enviar para o sistema ABC
    try {
      String dadosJson = new String(Files.readAllBytes(Paths.get("../data/nf.json")), StandardCharsets.UTF_8);
      JSONToXMLAdapter adapter = new JSONToXMLAdapter(fornecedorJapa);
      adapter.processarXML(dadosJson);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
