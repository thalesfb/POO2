package jogo;

public class Heroi extends Personagem {
    protected Coletavel coletavel;

    public Heroi(int id, String nome) {
        super(id, nome);
        this.coletavel = null;
        System.out.println("Herói criado");
    }

    public void coletar(Coletavel c) {
        this.coletavel = c;
        this.coletavel.usar();
        System.out.println("Coletável coletado");
    }

    public void habilidadeEspecial() {
        System.out.println("Habilidade Especial ativada");
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
