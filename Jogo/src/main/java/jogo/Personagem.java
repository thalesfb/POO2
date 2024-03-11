package jogo;

import java.util.Random;

public abstract class Personagem {

    protected int id;
    protected int dano;
    protected String nome;
    protected int vida;
    protected int nivel;
    protected static int MAX_VIDA = 100;

    public Personagem(int id, String nome) {

        Random r = new Random();
        this.id = id;
        this.dano = r.nextInt(5, 30);
        this.nome = nome;
        this.vida = r.nextInt(50, 500);
        this.nivel = r.nextInt(1, 10);
        System.out.println("Personagem: " + nome + " criado com vida: " + vida + " e dano: " + dano + " e nível: "
                + nivel + " e id: " + id + ".");
    }

    public int getId() {
        return id;
    }

    public int getDano() {
        return dano;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getNivel() {
        return nivel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setNivel(int nível) {
        this.nivel = nível;
    }

    public abstract void atacar(Personagem personagem);

    public abstract void defender(Personagem personagem);

    /*
     * public void atacar(Personagem personagem){
     * if (personagem.vida >= this.dano) {
     * personagem.vida = personagem.vida - this.dano;
     * }
     * else
     * {
     * personagem.setVida(0);
     * }
     * }
     * public void defender(Personagem personagem){
     * if (this.vida >= personagem.dano) {
     * this.vida = this.vida - personagem.dano;
     * }
     * else
     * {
     * personagem.setVida(0);
     * }
     * }
     */

}
