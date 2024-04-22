package payment.entity;

public class BankSlip implements Payment {

  protected String nome_beneficiario;
  protected String cpf_cnpj_beneficiario;
  protected String data_vencimento;
  protected String codigo_barras;

  public BankSlip() {
    
  }
  
  public BankSlip(String nome_beneficiario, String cpf_cnpj_beneficiario, String data_vencimento, String codigo_barras) {
    this.nome_beneficiario = nome_beneficiario;
    this.cpf_cnpj_beneficiario = cpf_cnpj_beneficiario;
    this.data_vencimento = data_vencimento;
    this.codigo_barras = codigo_barras;
  }

  @Override
  public boolean pagar(double valor) {
    System.out.println("Pagamento de R$ " + valor + " realizado com sucesso via Boleto");
    return true;
  }
}