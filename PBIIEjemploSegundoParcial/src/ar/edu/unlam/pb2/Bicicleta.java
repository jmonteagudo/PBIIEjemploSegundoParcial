package ar.edu.unlam.pb2;

public class Bicicleta extends Vehiculo {
	
	
	
	public Bicicleta(Double latitud, Double longitud,String patente) {
		super(latitud,longitud,patente);
		
	}
	public Double getLatitud() {
		return super.getLatitud();
	}
	public void setLatitud(Double latitud) {
		super.setLatitud(latitud);
	}
	public Double getLongitud() {
		return super.getLongitud();
	}
	public void setLongitud(Double longitud) {
		super.setLongitud(longitud);
	}
	
	public String getPatente() {
		return super.getPatente();
	}

	public void setPatente(String patente) {
		super.setPatente(patente);
	}
	
}
