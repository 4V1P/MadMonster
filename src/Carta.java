public class Carta{
    //Na ordem: Força, Alcance, Magia, Velocidade
int[] atributo = new int[4];
String nome;

//Construtor para adionar uma carta com suas caracteristicas principais;
	public Carta(int f, int a, int m, int v, String n){
		this.atributo[0] = f;
                this.atributo[1] = a;
                this.atributo[2] = m;
                this.atributo[3] = v;
                                    
		this.nome = n;
	}

        public int getAtributo(int i){
            return atributo[i];
        }
        
}