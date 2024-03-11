package jogo;

public abstract class Item implements Coletavel{
    
    protected int id;
    protected String nome;
    
    public Item(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void usar(){
        System.out.println("Item "+ this.getNome()  +" usado!");
    };

    @Override
    public void armazenar(){
        System.out.println("Item "+ this.getNome()  +" armazenado!");
    };
}
