package DECLARACAODEVARIAVEIS;

public class DeclaracaoDeVariaveis {
	/**
	 * Variavel é uma identificacao de um espaco em memoria, utilizado pelos programas 
	 * toda variavel e composta por; tipos de dados, identificacao, valor atribuido
	 * 
	 */
	
		//a estrutura padrao para se declarar uma variavel é
		/**
		 * <Tipo> <nomeVariavel> = <atribuicao do valor opcional>
		 *  
		 */
	
	int idade1; //Tipo "int", nome "idade", com nenhum valor atribuído. 
	int anoFabricacao = 2021; //tipo "int", nome "anoFabricacao", com valor 2021.
	double salarioMinimo = 2.500; //tipo "double", nome "salarioMinimo", valor 2.500.
	
	/**
	 * Atenção: existe algumas peculiaridades a trabalhar com alguns tipos específicos. Observe no exemplo abaixo:
	 */
	
	byte idade = 123;
	short ano = 2021;
	int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
	long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
	float pi = 3.14F;
	double salario = 1275.33;
	
	//Observe que o tipo long precisa terminar com L, o tipo float precisa terminar com F e alguns cenários do dia-a-dia, podem estimular uma alteração de tipos de dados convencional.
	
	
	

}
