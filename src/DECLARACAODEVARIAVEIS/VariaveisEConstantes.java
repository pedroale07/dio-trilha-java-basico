package DECLARACAODEVARIAVEIS;

public class VariaveisEConstantes {
	/**
	 * Uma vari�vel � uma �rea de mem�ria, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado, define um conjunto de valores e um conjunto de opera��es. Java � uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo da vari�vel n�o � obrigat�rio.
	 *	No Java, utilizamos identificadores que representam uma refer�ncia (ponteiro) a um valor em mem�ria, e esta refer�ncia pode ser redirecionada a outro valor, sendo portanto esta a causa do nome "vari�vel", pois o valor pode variar.
	 *	J� as Constantes, s�o valores armazenados em mem�ria que n�o podem ser modificados depois de declarados. Em Java, esses valores s�o representados pela palavra reservada final, seguida do tipo.
	 *	Por conven��o, Constantes s�o sempre escritas em CAIXA ALTA.
	 *	Abaixo, temos um exemplo explicativo sobre uso de vari�veis e constantes:
	 */

		public static void main(String[] args) {
			
			/*
			 * esta linha � considerada como declara��o de vari�vel iniciamos a exist�ncia
			 * variavel numero com valor 5 regra: tipo + nome + valor
			 */
			int numero = 5;

			/*
			 * na linha abaixo iremos alterar o valor do var�avel para 10 observe que o tipo
			 * n�o � mais necess�rio, pois a vari�vel j� foi declarada anteriormente
			 */
			numero = 10;

			System.out.print(numero);
			
			/*
			 * ao usar a palavra reservada final, voc� determina que jamais
			 * esta variavel poder� obter outro valor;
			 * logo a linha 25 vai apresentar um erro de compila��o
			 * isso � considerado uma CONSTANTE na linguagem Java
			 */
			double VALOR_DE_PI = 3.14;
			
			VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compila��o!
			
			
		}
}
