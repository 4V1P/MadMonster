import java.util.Random;

public class Embaralhador{
Carta[] cartas = new Carta[20];
Random rand = new Random();
int indice; 
Baralho embaralhado= new Baralho();

//Assim que chamado o construtor pegará as cartas do baralho existente e
//joga as cartas aleatoriamente depois passa essas cartas para um novo baralho
//chamado "embaralhado"

public Embaralhador(Baralho b){
int i=0;
	do{	
		indice = rand.nextInt(20);
		if(cartas[indice] == null){
			this.cartas[indice] = b.getCarta(i);
			i++;
		}
	}while(i<20);

	for(int x=0; i<20; i++){
	embaralhado.addCarta(this.cartas[i]);
	}
}

public Baralho getBaralhoEmbaralhado(){
return this.embaralhado;
}

}