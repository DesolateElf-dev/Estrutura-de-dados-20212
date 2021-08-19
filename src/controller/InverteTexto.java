package controller;

public class InverteTexto {

	public InverteTexto() {		
		super();		
	}
	
	public String Inversor(String texto, int tamanho) {
		
		String otxet;	
		
		// a) A posi��o de parada � determinada pelo "tamanho" da String, como se fosse um vetor de caracteres
		//    ent�o quando o tamanho desse vetor imagin�rio chega a 0, ele para a recursividade
		
		if (tamanho == 0) {
			
			return "";
			
		} else {
			
//			int position = tamanho - 1;	
			
//			otxet = texto.substring(position,tamanho);
			
//			tamanho--;
			
//			return otxet + Inversor(texto,tamanho);
			
			return texto.substring(tamanho-1, tamanho) + Inversor(texto, tamanho-1);
			
/**			
 				b)	O caracter que ser� tomado na posi��o � apontado pela tamanho da String -1
				ou seja, se � uma String de tamanho 7, ele pegar� o caracter da posi��o 7-1
				Exemplo:
				E d u a r d o  String tamanho 7
				0 1 2 3 4 5 6  Char position
				
				O caracter na posi��o (tamanho  , tamanho-1) ser� o 'o'
				O caracter na posi��o (tamanho-1, tamanho-2) ser� o 'd'
				Assim sucessivamente.
**/		

		}
		
	}

}
