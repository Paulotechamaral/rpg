import model.Acao;
import model.Personagem;
import util.HistoricoStack;
import util.TurnoQueue;

public class Main {

    static void main(String[] args) {

        //Criação de personagens
        Personagem guerreiro = new Personagem("Guerreiro", 100, 5);
        Personagem mago = new Personagem("Mago", 70, 9);
        Personagem ladino = new Personagem("Ladino", 80, 10);

        //Fila de turnos
        TurnoQueue fila= new TurnoQueue();

        fila.adicionarPersonagem(ladino);
        fila.adicionarPersonagem(mago);
        fila.adicionarPersonagem(guerreiro);

        //Pilha de Historico
        HistoricoStack historico = new HistoricoStack();

        System.out.println("Inicio de Combate");
        fila.mostrarFila();

        //Simula alguns turnos

        for (int i = 0; i < 3; i++){

            Personagem atual = fila.proximoTurno();

            if (atual == null) break;

            System.out.println("Turno de: " + atual.getNome());

            //simula uma ação

            Acao acao = new Acao(
                    atual.getNome(), "atacou e causou 10 de dano"
            );

            historico.registrar(acao);

            //simula o dano
            atual.setHp(atual.getHp() - 10);

            //retorna para a fila se estiver vivo
            fila.retornarAoFinal(atual);
        }

        //resultado final
        System.out.println("Historico de ações");
        historico.mostarHistorico();

        System.out.println("Fila final");
        fila.mostrarFila();
    }
}
