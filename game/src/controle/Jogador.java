package controle;

public class Jogador {
	
	public static void main(String[] args) {
		
		Jogador j1 = new Jogador();
		Controle c1 = new Controle();
		
		j1.jogar(5, 5, c1);
			
	}
	
	public void jogar(int direita, int esquerda, Controle c1) {
		
		c1.setEsquerda(esquerda);
		c1.setDireita(direita);
		
		
		System.out.println("Direita:"+ c1.direita+ "\nEsquerda:"+c1.esquerda);
		
		
	}
	

}
