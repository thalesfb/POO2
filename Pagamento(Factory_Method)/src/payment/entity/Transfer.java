package payment.entity;

public class Transfer implements Payment {

  protected String cpf_cnpj_origem;
  protected String cpf_cnpj_destino;
  protected String banco_origem;
  protected String banco_destino;
  protected String conta_origem;
  protected String conta_destino;
  protected String agencia_origem;
  protected String agencia_destino;
  protected String nome_origem;
  protected String nome_destino;

  public Transfer() {
    
  }

  public Transfer(String cpf_cnpj_origem, String cpf_cnpj_destino, String banco_origem, String banco_destino, String conta_origem, String conta_destino, String agencia_origem, String agencia_destino, String nome_origem, String nome_destino) {
    this.cpf_cnpj_origem = cpf_cnpj_origem;
    this.cpf_cnpj_destino = cpf_cnpj_destino;
    this.banco_origem = banco_origem;
    this.banco_destino = banco_destino;
    this.conta_origem = conta_origem;
    this.conta_destino = conta_destino;
    this.agencia_origem = agencia_origem;
    this.agencia_destino = agencia_destino;
    this.nome_origem = nome_origem;
    this.nome_destino = nome_destino;
  }

    @Override
    public boolean pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com sucesso via Transferência");
        return true;
    }
}