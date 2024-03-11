package jogo;

import java.util.Random;

public class Pocao extends Item {

    Random r = new Random();
    protected final static double CURA = 0.25;
    protected boolean uso;
    protected boolean coletado;

    public Pocao(int id, String nome) {
        super(id, nome);
        this.uso = false;
        this.coletado = false;
    }

    @Override
    public void usar() {
        this.uso = true;
        System.out.println("Usando poção");
    }

    @Override
    public void armazenar() {
        this.coletado = true;
        System.out.println("Armazenando poção");
    }
}
