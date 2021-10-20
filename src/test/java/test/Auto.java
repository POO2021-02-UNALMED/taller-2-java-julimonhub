package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	
	public int cantidadAsientos() {
		int n = 0;
		for (int i = 0; i < this.asientos.length; i++) {
			if (this.asientos[i] instanceof Asiento) {
				n = n+1;
			
			}	
		}
		return n;
	}
	
	public String verificarIntegridad() {
		if(motor.registro != registro) {
			return "Las piezas no son originales";
		} else {
			for(int i = 0; i< asientos.length; i++) {
				if(Asientos[i] != null && registro != Asientos[i].registro) {
					return "Las piezas no son originales";
				}
			}
		return "Auto original";
		}
	}	
}