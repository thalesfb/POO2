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
    FornecedorX fornecedorX = new FornecedorX("../data/nf.xml"); // só envia XML
    FornecedorJapa fornecedorJapa = new FornecedorJapa("../data/nf.json"); // só envia JSON
    SistemaABC sistemaABC = new SistemaABC(); // só recebe XML

    // obter dados de um arquivo XML do fonrecedor X e enviar para o sistema ABC
    sistemaABC.processarXML(fornecedorX);

    // obter dados de um arquivo JSON do fornecedor Japa e enviar para o sistema ABC
    sistemaABC.processarXML(new JSONToXMLAdapter(fornecedorJapa));
  }
}
