import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista_telefonica {
  public static void main(String[] args) {
    List<Pessoa> agenda = new ArrayList<>();
    //Joao, Silva, 1990-01-01
    //2 Ana, Paula, 1989-01-01
    //3 Joao, Santos, 1991-01-01
    //4 Joao, Silva, 1980-01-01]
    agenda.add(new Pessoa("Joao", "Silva", LocalDate.of(1990, 1, 1), "1234-5678"));
    agenda.add(new Pessoa("Ana", "Paula", LocalDate.of(1989, 1, 1), "1234-5678"));
    agenda.add(new Pessoa("Joao", "Santos", LocalDate.of(1991, 1, 1), "1234-5678"));
    agenda.add(new Pessoa("Joao", "Silva", LocalDate.of(1980, 1, 1), "1234-5678"));

    System.out.println("Agenda desordenada: ");
    for (Pessoa pessoa : agenda) {
      System.out.println(pessoa);
    }

    Collections.sort(agenda);

    System.out.println("\nAgenda ordenada: ");
    for (Pessoa pessoa : agenda) {
      System.out.println(pessoa);
    }
  }
}
