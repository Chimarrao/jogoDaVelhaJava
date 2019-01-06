package jogodavelha;

public class main {

    public static void main(String args[]) {
        jogoDaVelha jogo = new jogoDaVelha();

        GUI g = new GUI(jogo);
        g.setBounds(300, 300, 480, 400);
        g.setResizable(false);//Deixa a janela fixa
        g.setVisible(true);

        g.caixaDeEscolha.setBounds(300, 300, 400, 240);
        g.textoCaixaEscolha.setText("Escolha seu lado: ");
        g.X.setText("X");
        g.O.setText("O");
        g.caixaDeEscolha.setVisible(true);

        g.caixaDialogo.setBounds(300, 300, 350, 175);
    }
}
