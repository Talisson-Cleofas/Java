
public abstract class somaMedia {
     private int media;
     protected Leitor leitor;
     
     public float calculaMedia() {
 		float soma=0;
 		for(int i = 0; i < Leitor.getNumerosInsridos().length; i++) {
 			soma += Leitor.getNumero(i);
 		}
}
}