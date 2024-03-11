package jogo;

public class Jogo {

    public static void main(String[] args) {

        Heroi h = new Heroi(1, "Super");
        Monstro m = new Monstro(2, "Monstro");

        Arma a1 = new Arma(1, "faca");
        Arma a2 = new Arma(2, "espada");
        
        h.coletar(a1);
        h.coletar(a2);

        h.atacar(m);
    }
}
