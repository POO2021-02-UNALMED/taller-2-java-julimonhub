package test;


public class Motor {

	public int numeroCilindros;
	public String tipo;
	public int registro;
	
	
	public void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	public void asignarTipo(String tipoM) {
		switch (tipoM) {
		case"electrico":
		case"gasolina": {
		this.tipo = tipoM;
		break;
		}
	}
	}
	
	
}

