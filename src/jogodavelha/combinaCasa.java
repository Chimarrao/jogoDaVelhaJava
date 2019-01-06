package jogodavelha;

import java.util.ArrayList;
import java.util.Random;

public class combinaCasa {
    public combinaCasa() {
        
    }
    public int retornaCasa(ArrayList seq, String jog, String com){
        int casa;
        
        casa = triangulo(seq, jog);
        
        if(casa == 0){
            casa = bloqueio(seq, jog);
        }
        
        if(casa == 0){
            casa = construir(seq, jog, com);
        }
        
        return casa;
    }
    public int triangulo(ArrayList s, String jog){
        int casa = 0;
        if(s.get(0).equals(jog) || s.get(6).equals(jog)){
            casa = 6;
        }
        if(s.get(2).equals(jog) || s.get(8).equals(jog)){
            casa = 4;
        }
        
        return casa;
    }
    
    public int bloqueio(ArrayList s, String jog){
        int chave[] = {1, 2, 3,/**/4, 5, 6,/**/7, 8, 9,
                       1, 4, 7,/**/2, 5, 8,/**/3, 6, 9,
                       1, 5, 9,/**/3, 5, 7};
        
        int i = 0, casa = 0;
        
        while(i < 24){
            int a, b, c;
            a = chave[i];   b = chave[i+1];   c = chave[i+2];
            
            if(s.get(a-1).equals(jog) && s.get(b-1).equals(jog) && s.get(c-1).equals("")){
               casa = c;
            }
            if(s.get(a-1).equals(jog) && s.get(b-1).equals("") && s.get(c-1).equals(jog)){
               casa = b;
            }
            if(s.get(a-1).equals("") && s.get(b-1).equals(jog) && s.get(c-1).equals(jog)){
               casa = c;
            }
            i = i+3;
        }
        return casa;
    }
    public int construir(ArrayList s, String jog, String com){
        Random gerador = new Random();
        int chave[] = {1, 2, 3,/**/4, 5, 6,/**/7, 8, 9,
                       1, 4, 7,/**/2, 5, 8,/**/3, 6, 9,
                       1, 5, 9,/**/3, 5, 7};
        
        int i = 0, casa = 0;
        
        while(i < 24){
            int a, b, c;
            a = chave[i];   b = chave[i+1];   c = chave[i+2];
            
            if(s.get(a-1).equals("") && s.get(b-1).equals(com) && s.get(c-1).equals(com)){
               casa = a;
            }
            if(s.get(a-1).equals(com) && s.get(b-1).equals("") && s.get(c-1).equals(com)){
               casa = b;
            }
            if(s.get(a-1).equals(com) && s.get(b-1).equals(com) && s.get(c-1).equals("")){
               casa = c;
            }
            i = i+3;
        }
        
        while(i < 24){
            int a, b, c;
            a = chave[i];   b = chave[i+1];   c = chave[i+2];
            
            if(s.get(a-1).equals(com) && s.get(b-1).equals("") && s.get(c-1).equals("")){
                if(gerador.nextInt(2)+1 == 1){
                    casa = b;
                }else{
                    casa = c;
                }
            }
            if(s.get(a-1).equals("") && s.get(b-1).equals(com) && s.get(c-1).equals("")){
               if(gerador.nextInt(2)+1 == 1){
                    casa = a;
                }else{
                    casa = c;
                }
            }
            if(s.get(a-1).equals("") && s.get(b-1).equals("") && s.get(c-1).equals(com)){
               if(gerador.nextInt(2)+1 == 1){
                    casa = b;
                }else{
                    casa = c;
                }
            }
            i = i+3;
        }
        
        if(casa == 0){
            if(s.get(4).equals("")){
                casa = 0;
            }
            if(s.get(0).equals("")){
                casa = 1;
            }
            if(s.get(2).equals("")){
                casa = 3;
            }
            if(s.get(6).equals("")){
                casa = 7;
            }
            if(s.get(8).equals("")){
                casa = 9;
            }
        }
        return casa;
    }
}
