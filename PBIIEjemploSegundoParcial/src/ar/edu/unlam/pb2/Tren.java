package ar.edu.unlam.pb2;

public class Tren extends Vehiculo{
	
	private Integer cantidadDeVagones;
	private Integer cantidadMaximoPasajerosPorVagon;
	private Integer velocidadMaxima;
	
	public Tren(String patente,Integer cantidadDeVagones, Integer cantidadMaximoPasajerosPorVagon, Integer velocidadMaxima,
			Double latitud, Double longitud) {
		super(latitud,longitud,patente);
		this.cantidadDeVagones = cantidadDeVagones;
		this.cantidadMaximoPasajerosPorVagon = cantidadMaximoPasajerosPorVagon;
		this.velocidadMaxima = velocidadMaxima;
		
	}
	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}
	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}
	public Integer getCantidadMaximoPasajerosPorVagon() {
		return cantidadMaximoPasajerosPorVagon;
	}
	public void setCantidadMaximoPasajerosPorVagon(Integer cantidadMaximoPasajerosPorVagon) {
		this.cantidadMaximoPasajerosPorVagon = cantidadMaximoPasajerosPorVagon;
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
	public String getPatente() {
		return super.getPatente();
	}

	public void setPatente(String patente) {
		super.setPatente(patente);
	}

	

}
