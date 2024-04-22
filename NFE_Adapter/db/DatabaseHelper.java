import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DatabaseHelper {
  private Connection connect() {
    // Altere para a URL, usuário e senha do seu banco de dados
    String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
    String user = "usuario";
    String password = "senha";

    Connection conn = null;
    try {
      conn = DriverManager.getConnection(url, user, password);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return conn;
  }

  public void inserirNotaFiscal(String nome, String cnpj, String valorTotal) {
    String sql = "INSERT INTO notas_fiscais(nome, cnpj, valor_total) VALUES(?, ?, ?)";

    try (Connection conn = this.connect();
        PreparedStatement pstmt = conn.prepareStatement(sql)) {
      pstmt.setString(1, nome);
      pstmt.setString(2, cnpj);
      pstmt.setString(3, valorTotal);
      pstmt.executeUpdate();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
