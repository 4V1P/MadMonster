
import java.util.ArrayList;

public class Mao {
int tamanho;
ArrayList<Carta> carta = new ArrayList<>();  


    public int getTamanho(){
        return tamanho;
    }
    
    public void setTamanho(int i){
       this.tamanho= i;   
    }
    
    public Carta getCarta(int i){
        return carta.get(i);
    }
}


