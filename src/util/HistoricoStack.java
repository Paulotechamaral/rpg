package util;

import model.Acao;

import java.util.Stack;

public class HistoricoStack {

    private Stack<Acao> historico = new Stack<>();

    //Registra nova ação
    public void registrar(Acao acao){
        historico.push(acao);
    }

    //Mostra a ultima ação feita
    public Acao ultimaAcao(){
        if (historico.isEmpty()){
            return null;
        }
        return historico.peek();
    }
    //Remove a ultima ação
    public Acao desfazerUltima(){
        if (historico.isEmpty()){
            return null;
        }
        return historico.pop();
    }

    //Mostra historico completo
    public void mostarHistorico(){
        System.out.println("Historico de ações");
        for (int i = historico.size() - 1; i >= 0; i--){
            System.out.println(historico.get(i));
        }
    }
}
