import java.util.Scanner;

public class Control {
    public Jogo jogo;
    public JogoView view;
    public Scanner scanner;

    public void jogoControle(){
        jogo = new Jogo();
        view = new JogoView();
        scanner = new Scanner(System.in);
    }

    public void iniciaJogo(){
        while(true){
            view.mostraTabuleiro(Jogo);
            view.pedirJogada();
            int linha = scanner.nextInt();
            int coluna = scanner.nextInt();

            if(jogo.posicaoLivre(linha,coluna)){
                jogo.fazerJogada(linha,coluna,3);
                if(jogo.verificaVitoria()==27||jogo.verificaVitoria()==1){
                    view.mostraTabuleiro(jogo);
                    ///retorna uma msg se o player ganhou ou mensagem se a maquinha ganhou, ou empate
                    System.out.println("Jogo Empatou!");
                    break;
                }

                ///aqui adiciona a logica para a jogada do computador
                ///exemplo computadorJoga();

                else {
                    System.out.printfn("Posicao ja esta ocupada! tente novamente.");
                }
            }
            scanner.close();
        }
    }
}
