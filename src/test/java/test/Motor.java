package test;

public class Motor {
	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	void cambiarRegistro(int numero) {
		this.registro = numero;
	}
	
	
	
	public void asignarTipo(String tipoMotor) {
		if (tipoMotor.equals("gasolina")||tipoMotor.equals("electrico")) {
			
			this.tipo = tipoMotor;
		
		}
	
	}
	
}
