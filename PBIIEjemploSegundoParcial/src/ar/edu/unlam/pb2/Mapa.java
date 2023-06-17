package ar.edu.unlam.pb2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Mapa {

	private String localidad;

	private Set<Vehiculo> vehiculos = new HashSet<Vehiculo>();
	private HashSet<Coordenadas> coordenadas = new HashSet<Coordenadas>();

	public Mapa(String localidad) {
		this.localidad = localidad;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
	}
	
	public void agregarCoordenadas(Coordenadas coordenada) {
		coordenadas.add(coordenada);
	}

	public Integer getCantidadDeVehiculos() {
		return vehiculos.size();
	}

	public Boolean hayCoalicion(Vehiculo vehiculo1, Vehiculo vehiculo2) throws ColitionException {
		if (vehiculo1.getLatitud().equals(vehiculo2.getLatitud())  && vehiculo1.getLongitud().equals(vehiculo2.getLongitud())) {
			throw new ColitionException("mira lo espejo pibe");
		}
		return true;
	}
	
	
	public Boolean hayCoalicion(String patente,Double latitud,Double longitud) throws ColitionException {
		Vehiculo vehiculo = buscarVehiculo(patente);
		if(buscarCoordenadas(latitud, longitud)==null) {
			coordenadas.remove(buscarCoordenadas(vehiculo.getLatitud(),vehiculo.getLongitud()));
			coordenadas.add(new Coordenadas(latitud,longitud));
			vehiculo.setLatitud(latitud);
			vehiculo.setLongitud(longitud);
			return true;
		}
		
		throw new ColitionException("chocaste");
	}

	private Vehiculo buscarVehiculo(String patente) {
		for (Vehiculo vehiculo : vehiculos) {
			if(vehiculo.getPatente().equals(patente)) {
				return vehiculo;
			}
		}
		return null;
	}
	
	public Coordenadas buscarCoordenadas(Double latitud,Double longitud) {
		for (Coordenadas coordenadas2 : coordenadas) {
			if(coordenadas2.getLatitud().equals(latitud) && coordenadas2.getLongitud().equals(longitud)) {
				return coordenadas2;
			}
		}
		return null;
	}


}
