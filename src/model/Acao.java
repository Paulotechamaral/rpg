package model;


import java.time.LocalDateTime;

public class Acao {

    private String ator;
    private String descricao;
    private LocalDateTime momento;

    public Acao(String ator, String descricao){
        this.ator = ator;
        this.descricao = descricao;
        this.momento = LocalDateTime.now();
    }

    public String getAtor() {
        return ator;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    @Override
    public String toString(){
        return "[" + momento + "]" + ator + "->" + descricao;
    }
}
