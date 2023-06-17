package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;



public class TestCases {

	@Test
	public void queSePuedaCrearUnAuto() {
		Auto nuevo = new Auto("JJZ526", 5, 240, 41.40338, 2.17403);

		assertEquals("JJZ526", nuevo.getPatente());
		assertEquals((Integer) 5, nuevo.getCantidadMaximoPasajeros());
		assertEquals((Integer) 240, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
	}
	
	@Test
	public void queSePuedaCrearUnaMoto() {
		Moto nuevo = new Moto("094AB5",2 ,200, 41.40338, 2.17403);
		
		assertEquals("094AB5", nuevo.getPatente());
		assertEquals((Integer) 2, nuevo.getCantidadMaximoPasajeros());
		assertEquals((Integer) 200, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
	}
	
	@Test
	public void  queSePuedaCrearUnaBicicleta() {
		Bicicleta nuevo = new Bicicleta(41.40338, 2.17403,"ase321");
		
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
		
	}
	
	@Test
	public void  queSePuedaCrearUnTren() {
		Tren nuevo = new Tren("avb105",15, 250, 100, 41.40338, 2.17403);
		
		assertEquals((Integer) 15, nuevo.getCantidadDeVagones());
		assertEquals((Integer) 250, nuevo.getCantidadMaximoPasajerosPorVagon());
		assertEquals((Integer) 100, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
		
	}

	@Test
	public void  queSePuedanIncorporarDistintosVehiculos() throws ColitionException{		
		
			Mapa actual = new Mapa("Buenos Aires");
			Vehiculo auto1=new Auto("JJZ526", 5, 240, 10.40338, 1.17403);
			Vehiculo auto2=new Moto("094AB5", 2,200, 50.40338, 2.5656);
			Vehiculo auto3=new Auto ("AAA001", 5, 100, 25.40338, 5.17403);
			Vehiculo auto4=new Bicicleta(33.333, 8.12345,"asdasd");
			Vehiculo auto5=new Tren("asasd",15, 250, 100, 45.826541, 3.965412);
			actual.agregarVehiculo(auto1);
			actual.agregarVehiculo(auto2);
			actual.agregarVehiculo(auto3);
			actual.agregarVehiculo(auto4);
			actual.agregarVehiculo(auto5);


			assertEquals((Integer) 5, actual.getCantidadDeVehiculos());
			assertTrue(actual.hayCoalicion("JJZ526",10.40338, 1.17403));
	}
	
	@Test (expected = ColitionException.class)
	public void  queChoquenDosVehiculos() throws ColitionException {	
		
		Vehiculo unAuto = new Auto("JJZ526", 5, 240, 41.40338, 2.17403);
		Vehiculo unaMoto = new Moto("094AB5",2, 200, 25.1234, 1.1234);
		Coordenadas coordenada = new Coordenadas(25.1234, 2.1233);
		
		
		Mapa actual = new Mapa("Buenos Aires");
		actual.agregarCoordenadas(coordenada);
		
		actual.agregarVehiculo(unAuto);
		actual.agregarVehiculo(unaMoto);

		
		unAuto.actualizarCoordenadas(25.1234, 2.1233);
		unaMoto.actualizarCoordenadas(25.1234, 2.1233);
		
		actual.hayCoalicion("JJZ526",25.1234, 2.1233);
		
		
		
	}
}
