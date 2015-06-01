
import java.util.Random;

public class Inteligencia {
int nivel;
Random r = new Random();

public boolean verificadorDeJogada(){
    int rr = r.nextInt(10);
    
    return rr <= this.nivel;
}
    
//Esse metodo ja gera a carta da mão, porem por hora só retorna o indice
public int jogadaRuim(Mao m){
    int indice = r.nextInt(m.getTamanho());
    return indice;
}
//Mesmo comentário do de cima
public int jogadaBoa(Mao m, int poder){
    int maior = 0;
    int indice=0;
    for(int x=0; x < m.getTamanho(); x++){
        if(m.getCarta(x).getAtributo(poder)>maior){
            maior = m.getCarta(x).getAtributo(poder);
            indice = x;
        }
    }
     return indice;
}
   
}
