package jogo;

public class Monstro extends Personagem {
    public Monstro(int id, String nome) {
        super(id, nome);
        System.out.println("Monstro criado");
    }

    public void calcularDano(Personagem personagem) {
        personagem.atacar(personagem);
        System.out.println("Personagem " + personagem.getNome() + " atacado");
    }

    @Override
    public void atacar(Personagem personagem) {
        if (personagem.vida >= this.dano) {
            personagem.vida = personagem.vida - this.dano;
        } else {
            personagem.setVida(0);
        }
        System.out.println("Ataque realizado, vida em: " + personagem.vida + " pontos.");
    }

    @Override
    public void defender(Personagem personagem) {
        if (this.vida >= personagem.dano) {
            this.vida = this.vida - personagem.dano;
        } else {
            personagem.setVida(0);
        }
        System.out.println("Defesa realizada, vida em: " + this.vida + " pontos.");
    }
}
