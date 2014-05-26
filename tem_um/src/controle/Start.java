package controle;

public class Start {
	
	public static void main (String[] args){
		
		Pessoa p1 	= 	new Pessoa ();
		p1.idade	=	33;
		p1.nome		=	"camila";
		p1.sexo		=	"feminio";
		
		Pessoa p2 	=	new Pessoa();
		p2.nome		=	"jeyson";
		p2.sexo		= 	"masculino";
		p2.idade	=	25;		
		
		Carro c1	= 	new Carro();
		c1.ano		=	1984;
		c1.nome		=	"mustang";
		c1.cor		=	"rosa";
		
		Carro c2	=	new Carro();
		c2.ano		=	1993;
		c2.nome		=	"fusca";
		c2.cor		=	"preto";
		
		p1.carro 	=	c1;
		p1.carro.andar("69 Km");
		
		p2.carro	=	c2;
		p2.carro.andar("200 km");
		
		
		
	}

}
