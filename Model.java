public class Model {
    private int [][] tabuleiro;
    private int [] horizontal;
    private int [] vertical;
    private int [] diagonais;

    public Model() {
        tabuleiro = new int[3][3];
        horizontal = new int[3];
        vertical = new int[3];
        diagonais = new int[2];
        incializaJogo();
    }

    private void iniciliaJogo() {
        diagonais[0] = 2;
        diagonais[1] = 2;
        for(int i= 0; i<3; i++){
            for(int j= 0; j<3; j++){
                tabuleiro[i][j] = 2;
                horizontal[i] = 2;
                vertical[i] = 2;

            }
        }
    }
    public int getValor(int linha,int coluna){
        return tabuleiro[linha][coluna];
    }

    public void fazerJogada(int linha, int coluna, int jogador){
        tabuleiro[linha][coluna] = jogador;
    }

    public boolean posicaoLivre(int linha, int coluna){
        return tabuleiro[linha][coluna] == 2;
    }

    public int verificaVitoria (){
        ///verifcação de vitoria
    }

    public void calculaPesos({
        ///logica de peses aqui


    })

}
