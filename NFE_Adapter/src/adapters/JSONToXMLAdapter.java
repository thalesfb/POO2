package adapters;

// import org.json.JSONObject;
// import org.json.XML;
import interfaces.NotaFiscalJSON;
import interfaces.NotaFiscalXML;

public class JSONToXMLAdapter implements NotaFiscalXML {
  private NotaFiscalJSON json;

  public JSONToXMLAdapter(NotaFiscalJSON json) {
    System.out.println("Adaptando JSON para XML");
    this.json = json;
  }

  @Override
  public void processarXML(String dadosJson) {
    // Aqui ocorreria a conversão de JSON para XML
    // String dadosXml = converteJSONparaXML(dadosJson);
    // Agora processa como XML
    System.out.println("Processando JSON para XML");
    json.processarJSON(dadosJson);
  }

  // private String converteJSONparaXML(String dadosJson) {
  // Lógica para conversão de JSON para XML
  // System.out.println("Convertendo JSON para XML");
  // try {
  // JSONObject json = new JSONObject(jsonData);
  // return XML.toString(json);
  // } catch (Exception e) {
  // e.printStackTrace();
  // return null;
  // }
  // return dadosJson;
  // }
}
