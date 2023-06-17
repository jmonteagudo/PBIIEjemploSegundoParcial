package ar.edu.unlam.pb2;

public class Moto extends Vehiculo{
	
	private Integer cantidadMaximoPasajeros;
	private Integer velocidadMaxima;
	
	
	
	public Moto(String patente, Integer cantidadMaximoPasajeros, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(latitud,longitud,patente);
		
		this.cantidadMaximoPasajeros = cantidadMaximoPasajeros;
		this.velocidadMaxima = velocidadMaxima;
		
	}


	public String getPatente() {
		return super.getPatente();
	}

	public void setPatente(String patente) {
		super.setPatente(patente);
	}


	public Integer getCantidadMaximoPasajeros() {
		return cantidadMaximoPasajeros;
	}


	public void setCantidadMaximoPasajeros(Integer cantidadMaximoPasajeros) {
		this.cantidadMaximoPasajeros = cantidadMaximoPasajeros;
	}


	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}


	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
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
	
	
	

}
