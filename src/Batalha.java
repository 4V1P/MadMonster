
import java.util.Random;

public class Batalha {
    Random rand;
    
    public int selecpoder(){
        rand = new Random();
       int poder = rand.nextInt(16);
        return (poder/4)-1;
        
    }
    
    public int ganhadorDoTurno(int p1, int p2){
        //Retorna 1 para p1, 2 para p2 e 3 para empate
        if(p1<p2){
         return 1;   
        }
        else if(p1>p2){
        return 2;
        }
        else{
            return 3;
        }
    }
    
    public boolean ganhou(int vitorias){
        //Se alguem ganhar true se não false (capitão obvio)
        return vitorias > 5;
    }
    
    public Carta comprarCarta(Baralho b){
    
        Carta retorno =  b.getCarta(0);
       b.diminuirQntDeDeCartas();
       return retorno;
        
    }
    
}
