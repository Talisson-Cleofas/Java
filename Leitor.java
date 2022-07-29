
public final class Leitor {
	private static Leitor registro;
	private int[] numero;

	public static Leitor getLeitor (int numero) {
		if (registro == null) {
			registro = new Leitor();
		}
		return registro;
	}
	public int[] getNumerosInsridos() {	
		return numero;
	}
	public int getNumero(int indice) { 
			return numero [indice];

	}
	public boolean setNumero(int verifica, int valor) {
		 if (valor < 0 || valor >10) {
			 System.out.println("Nomeros incorretos");
		 return false;
		 }
	
		else if (verifica < this.getNumerosInsridos().length && verifica >= 0) {
		this.getNumerosInsridos() [verifica] = valor;
		
		return true;
		 }
	
		else {
			System.out.println("Numero insrido INVALIDO!");
			return false;
			}
}
}
