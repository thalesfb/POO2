package br.com.empresaabc;

public class NotaFiscal {
  
  private String cnpj;
  private String nome;
  private double valorTotal;

  public NotaFiscal(String cnpj, String nome, double valorTotal) {
    this.cnpj = cnpj;
    this.nome = nome;
    this.valorTotal = valorTotal;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(double valorTotal) {
    this.valorTotal = valorTotal;
  }

  public void emitirNotaFiscal() {
    System.out.println("Emitindo nota fiscal...");
  }

  public void enviarNotaFiscal() {
    System.out.println("Enviando nota fiscal...");
  }

  public void imprimirNotaFiscal() {
    System.out.println("Imprimindo nota fiscal...");
  }

  public void salvarNotaFiscal() {
    System.out.println("Salvando nota fiscal...");
  }

  public void enviarEmailNotaFiscal() {
    System.out.println("Enviando nota fiscal por e-mail...");
  }

  public void enviarWhatsappNotaFiscal() {
    System.out.println("Enviando nota fiscal por WhatsApp...");
  }

}