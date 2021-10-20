package test;

public class Motor {
	
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int numero) {
		this.registro = numero;
	}
	
	void asignarTipo(String tipo) {
		if (tipo.equals("gasolina")||tipo.equals("electrico")) {
			this.tipo = tipo;
		}
	}
}