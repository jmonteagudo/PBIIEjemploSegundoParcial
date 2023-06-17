package ar.edu.unlam.pb2;

public abstract class Vehiculo {
	
	private Double latitud;
	private Double longitud;
	private String patente;
	
	public Vehiculo(Double latitud,Double longitud,String patente) {
		this.latitud=latitud;
		this.longitud=longitud;
		this.patente=patente;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public void actualizarCoordenadas(Double latitud, Double longitud) {
		
		 setLatitud(latitud);
		 setLongitud(longitud);
	}
	
	

}
