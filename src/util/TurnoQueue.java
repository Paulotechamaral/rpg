package util;

import model.Personagem;
import java.util.LinkedList;
import java.util.Queue;

public class TurnoQueue {

    private Queue<Personagem> filaTurnos = new LinkedList<>();

    //Adiciona personagem a fila

    public void adicionarPersonagem(Personagem personagem){
        filaTurnos.add(personagem);
    }

    //Retorna o proximo a agir
    public Personagem proximoTurno(){
        return filaTurnos.poll();
    }

    //Coloca o personagem no fim da fila
    public void retornarAoFinal(Personagem personagem){
        if(personagem.estaVivo()){
            filaTurnos.add(personagem);
        }
    }

    //verifica se a fila esta vazia
    public boolean estaVazia(){
        return filaTurnos.isEmpty();
    }

    //Exibe estado da fila
    public void mostrarFila(){
        System.out.println("Fila de Turnos: ");
        for (Personagem p : filaTurnos){
            System.out.println(p.getNome());
        }
    }
}
