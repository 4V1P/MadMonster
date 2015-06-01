import java.util.ArrayList;

public class Baralho{
ArrayList<Carta> cartas = new ArrayList<Carta>();
boolean validacao;
int vitorias;


//Construtor, quando um novo baralho � feito o n�mero de v�torias vai para 0
//e sua validacao � dada como false at� que passe pelo m�todo de avaliacao
public Baralho(){ 
this.vitorias = 0;
this.validacao = false;
}


//Retorna Carta especifica
public Carta getCarta(int i){
return cartas.get(i);
}

//Aqui edita a carta do baralho mudando o indice que deve ser colocado
public void setCarta(int i, Carta novaCarta){
this.cartas.set(i, novaCarta);
}

//Adiciona carta ao barlaho
public void addCarta(Carta novaCarta){
this.cartas.add(novaCarta);
}

//Metodo para avaliar se o deck pode ser validado
public void validar(){

//Avalia as 20 cartas, caso alguma delas seja null imediatamente o loop
//� quebrado e a validacao � falsa;
	for(int i=0; i<20; i++){
		if(cartas.get(i) == null){
			this.validacao = false;
			break;
		}
		else{
			this.validacao = true;
		}
	}
//Se houver mais de 20 cartas validacao falsa!
	if(cartas.size() > 20){
	this.validacao = false;
	}

}

//Verifica validacao de baralho
public boolean getValidacao(){
return validacao;
}

public int quantidadeDeCartas(){
return this.cartas.size();
}

public void diminuirQntDeDeCartas(){
    for(int i=0; i<this.cartas.size(); i++){
        if(this.getCarta(i) != null)
            this.setCarta(i, this.getCarta(i+1));
        
        else{
         this.cartas.remove(i);
        }
    }
    
}

}