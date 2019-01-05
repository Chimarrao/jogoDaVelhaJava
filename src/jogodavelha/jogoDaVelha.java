package jogodavelha;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;

public class jogoDaVelha {
    
    String jog = "X";//Jogador default é X
    String com = "O";//Computador default é O
    
    fim fim = new fim();

    public boolean regJogada(JButton casa) {
        if (casa.getText().equals("")) {
            casa.setText(jog);
            return true;
        }else{
            return false;
        }
    }

    public void jogar(ArrayList seq, GUI g) {
        Boolean b = fim.verificar(seq, g, jog, com);
        
        if(b == false){
            System.out.println("Vetor jogadas: " + seq);
            int proxCasa = buscarCasa(seq);
            swcase(proxCasa, g);
            seq.set(proxCasa-1, com);//Adicionar a casa jogada pelo computador
            fim.verificar(seq, g, jog, com);
        }
    }
    
    public int buscarCasa(ArrayList seq){
        Random gerador = new Random();
        combinaCasa comb = new combinaCasa();
        
        int i = comb.retornaCasa(seq, jog, com);
        
        if(gerador.nextInt(10)+1 > 8){ //Evita a total programação das jogadas
            int a = gerador.nextInt(9)+1;
            System.out.println("Jogada programada na casa " + i +" alternada para aleatória na casa " + a);
            i = a;
        }else{
            if(i != 0){
                System.out.println("Jogada programada na casa " + i);
            }
        }
        
        if(i == 0){
            i = gerador.nextInt(9)+1;
            System.out.println("Jogada aleatória na casa " + i);
        }
                
        if(seq.get(i - 1).equals(jog) || seq.get(i - 1).equals(com)) {
            i = gerador.nextInt(8) + 1;
            System.out.println("Jogada aleatoria na casa " + i);
            
            while(seq.get(i - 1).equals(jog) || seq.get(i - 1).equals(com)){
                int c = gerador.nextInt(8) + 1;
                System.out.println("-> Casa " + i + " ocupada jogada alterada para casa " + c);
                i = c;
            }
        }
        return i;
    }
    
    public void swcase(int casa, GUI g){
        switch (casa) {
            case 1:
                g.casa1.setText(com);
                break;
            case 2:
                g.casa2.setText(com);
                break;
            case 3:
                g.casa3.setText(com);
                break;
            case 4:
                g.casa4.setText(com);
                break;
            case 5:
                g.casa5.setText(com);
                break;
            case 6:
                g.casa6.setText(com);
                break;
            case 7:
                g.casa7.setText(com);
                break;
            case 8:
                g.casa8.setText(com);
                break;
            case 9:
                g.casa9.setText(com);
                break;
        }
    }
}
