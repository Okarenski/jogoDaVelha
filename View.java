import java.util.Scanner;
public class View {
    void mostraJogo (Jogo jogo){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                char simbolo;
                switch (jogo.getValor(i,j)){
                    case 1 : simbolo = 'O'; break;
                    case 2 : simbolo = ' '; break;
                    case 3 : simbolo = '3'; break;
                }
                System.out.print( simbolo + " ");
            }
            System.out.println();
        }
    }
    public void pedirJogada(){
        System.out.println("Digite a linha e coluna: [1][2][3]");
    }
}
