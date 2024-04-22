package payment.entity;

public class PIX implements Payment {

  protected String chave;
  protected String banco;
  protected String conta;
  protected String agencia;
  protected String nome;

  public PIX() {
    
  }

  public PIX(String chave, String banco, String conta, String agencia, String nome) {
    this.chave = chave;
    this.banco = banco;
    this.conta = conta;
    this.agencia = agencia;
    this.nome = nome;
  }

    @Override
    public boolean pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com sucesso via PIX");
        return true;
    }
}