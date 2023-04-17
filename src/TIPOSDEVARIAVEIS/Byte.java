package TIPOSDEVARIAVEIS;

public class Byte {
	
	/**
	 * O byte é um tipo de dado base primitivo, que e base da programacao, é o tipo de
	 * dado de mais baixo nivel do Java, com ele é possivel criar qualquer outro tipo 
	 */
	
	//1 byte e comporto de 8(oito) bits
	
		/**
		 * em linguagem de auto nível como o Java, ele não é utilizado em alguns casos
		 * Onde existem outros tipos derivados que se adequam melhor ao caso, como String.
		 * 
		 */
		
		public static void main(String[] args) {
				
		byte a = 5;
		byte b = 6;
		byte soma = (byte) (a + b);
		System.out.println(soma);
				
				
				
	}
		/**
		 * O tipo de dados byte pode ser convertido(sem a necessidade de cast) para 
		 * os seguintes tipos
		 * 
		 * byte -->short -->int -->long -->float -->double
		 */
		
		
}
