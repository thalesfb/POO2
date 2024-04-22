package payment.entity;

public class Card implements Payment {

  protected String nome_titular;
  protected String numero_cartao;
  protected String data_validade;
  protected String cvv;
  protected String banco;

  public Card() {
    
  }

  public Card(String nome_titular, String numero_cartao, String data_validade, String cvv, String banco) {
    this.nome_titular = nome_titular;
    this.numero_cartao = numero_cartao;
    this.data_validade = data_validade;
    this.cvv = cvv;
    this.banco = banco;
  }

    @Override
    public boolean pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com sucesso via Cartão");
        return true;
    }
}
