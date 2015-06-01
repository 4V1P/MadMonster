
import java.util.ArrayList;

public class Mao {
    
ArrayList<Carta> carta = new ArrayList<>();  


    public Mao(ArrayList cartas){
        carta = cartas;
    }
    
    public int getTamanho(){
        return this.carta.size();
    }
    
    public void setTamanho(int i){
       this.carta.remove((this.carta.size()-1));
    
    }
       
    public Carta getCarta(int i){
        return carta.get(i);
    }
    
    
}


