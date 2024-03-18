import java.time.LocalDate;

public class Pessoa implements Comparable<Pessoa> {
  private String nome;
  private String sobrenome;
  private LocalDate dataNascimento;
  private String telefone;

  public Pessoa(String nome, String sobrenome, LocalDate dataNascimento, String telefone) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.dataNascimento = dataNascimento;
    this.telefone = telefone;
  }

  public String getNome() {
    return nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public String getTelefone() {
    return telefone;
  }

  public String setNome(String nome) {
    this.nome = nome;
  }

  public String setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public LocalDate setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String setTelefone(String telefone) {
    this.telefone = telefone;
  }

  @Override
  public int compareTo(Pessoa pessoa) {
    int comparaNome = this.nome.compareTo(pessoa.getNome());
    if (comparaNome != 0)
      return comparaNome;

    int comparaSobrenome = this.sobrenome.compareTo(pessoa.getSobrenome());
    if (comparaSobrenome != 0)
      return comparaSobrenome;

    return this.dataNascimento.compareTo(pessoa.getDataNascimento());
  }

  @Override
  public String toString() {
    return "Pessoa{" +
        "nome='" + nome + '\'' +
        ", sobrenome='" + sobrenome + '\'' +
        ", dataNascimento=" + dataNascimento +
        ", telefone='" + telefone + '\'' +
        '}';
  }
}