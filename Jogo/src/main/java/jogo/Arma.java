package jogo;

import java.util.Random;

public class Arma extends Item{

    Random r = new Random();
    protected int dano;
    protected boolean uso;

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public boolean isUso() {
        return uso;
    }

    public void setUso(boolean uso) {
        this.uso = uso;
    }
    
    public Arma(int id, String nome){
        super(id, nome);
        this.dano = r.nextInt(5, 30);
        this.uso = false;
    }
    


    public void usar(){
        this.setUso(true);
    }
}
