package controller;

public class InverteTexto {

	public InverteTexto() {		
		super();		
	}
	
	public String Inversor(String texto, int tamanho) {
		
		String otxet;	
		
		// a) A posição de parada é determinada pelo "tamanho" da String, como se fosse um vetor de caracteres
		//    então quando o tamanho desse vetor imaginário chega a 0, ele para a recursividade
		
		if (tamanho == 0) {
			
			return "";
			
		} else {
			
//			int position = tamanho - 1;	
			
//			otxet = texto.substring(position,tamanho);
			
//			tamanho--;
			
//			return otxet + Inversor(texto,tamanho);
			
			return texto.substring(tamanho-1, tamanho) + Inversor(texto, tamanho-1);
			
/**			
 				b)	O caracter que será tomado na posição é apontado pela tamanho da String -1
				ou seja, se é uma String de tamanho 7, ele pegará o caracter da posição 7-1
				Exemplo:
				E d u a r d o  String tamanho 7
				0 1 2 3 4 5 6  Char position
				
				O caracter na posição (tamanho  , tamanho-1) será o 'o'
				O caracter na posição (tamanho-1, tamanho-2) será o 'd'
				Assim sucessivamente.
**/		

		}
		
	}

}
