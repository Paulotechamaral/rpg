package model;

public class Personagem {

    private String nome;
    private int hp;
    private int velocidade;

    //construtor
    public Personagem(String nome, int hp, int velocidade){
        this.nome = nome;
        this.hp = hp;
        this.velocidade = velocidade;
    }

    //Getters
    public String getNome(){
        return nome;
    }

    public int getHp(){
        return hp;
    }

    public int getVelocidade(){
        return velocidade;
    }

    //setter( apenas para o hp)
    public void setHp(int hp){
        this.hp = hp;
    }

    public boolean estaVivo(){
        return hp > 0;
    }

    //representação textual
    @Override
    public String toString(){
        return "Personagem{"+ "nome= " + nome + "/" + ", hp= " + hp + ",velocidade= " + velocidade + "}";
    }
}
