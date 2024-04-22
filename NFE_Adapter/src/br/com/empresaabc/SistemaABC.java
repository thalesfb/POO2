package br.com.empresaabc;

import interfaces.NotaFiscalXML;

public class SistemaABC{

  private String cnpj;
  private String nome;
  private double valorTotal;
  
  public void processarXML(NotaFiscalXML dados) {
    // Lógica para processar XML
    System.out.println("Processando XML e cadastrando no banco em SistemaABC: \n");
  }

  public void inserirBanco(){
    // Lógica para inserir no banco
    System.out.println("Inserindo no banco em SistemaABC: \n");
  }
}