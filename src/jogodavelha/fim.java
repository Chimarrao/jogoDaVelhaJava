package jogodavelha;

import java.util.ArrayList;

public class fim {

    public Boolean verificar(ArrayList seq, GUI g, String jog, String com) {
        int k = 0;
        String txt = "";
        ArrayList chave = new ArrayList();

        chave.add(seq.get(0));
        chave.add(seq.get(1));
        chave.add(seq.get(2));
        chave.add(seq.get(3));
        chave.add(seq.get(4));
        chave.add(seq.get(5));
        chave.add(seq.get(6));
        chave.add(seq.get(7));
        chave.add(seq.get(8));

        chave.add(seq.get(0));
        chave.add(seq.get(3));
        chave.add(seq.get(6));
        chave.add(seq.get(1));
        chave.add(seq.get(4));
        chave.add(seq.get(7));
        chave.add(seq.get(2));
        chave.add(seq.get(5));
        chave.add(seq.get(8));

        chave.add(seq.get(0));
        chave.add(seq.get(4));
        chave.add(seq.get(8));
        chave.add(seq.get(2));
        chave.add(seq.get(4));
        chave.add(seq.get(6));

        for (int i = 0; i < 24; i = i + 3) {
            for (int e = i; e < i + 3; e++) {
                if (chave.get(e).equals(jog)) {
                    k++;
                }
                if (k == 3) {
                    txt = " você";
                }
            }
            k = 0;
            for (int e = i; e < i + 3; e++) {
                if (chave.get(e).equals(com)) {
                    k++;
                }
                if (k == 3) {
                    txt = " o computador";
                }
            }
            k = 0;
        }
        chave.clear();
        //Verificar se o jogo está completo, no caso em vencedor
        if (txt.equals("")) {
            int cont = 0;
            for (int i = 0; i < 9; i++) {
                if (seq.get(i).equals(jog) || seq.get(i).equals(com)) {
                    cont++;
                }
            }
            if (cont == 9) {
                finalizar(g, "ninguém");
                return true;
            }
        } else {
            finalizar(g, txt);
            return true;
        }
        return false;
    }

    public void finalizar(GUI g, String txt) {
        System.out.println("Jogo finalizado " + txt + " ganhou !");

        g.caixaDialogo.setResizable(false);
        g.caixaDialogo.setVisible(true);
        g.label.setText("Jogo finalizado " + txt + " ganhou !");
    }
}
