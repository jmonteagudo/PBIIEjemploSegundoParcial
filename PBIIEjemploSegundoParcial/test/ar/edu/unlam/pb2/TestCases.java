package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaCrearUnAuto() {
		Auto nuevo = new Auto("JJZ526", 5, 240, 41.40338, 2.17403);

		assertEquals("JJZ526", nuevo.getPatente());
		assertEquals((Integer) 5, nuevo.getCantidadMaximaDePasajeros());
		assertEquals((Integer) 240, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
	}
	
	@Test
	public void queSePuedaCrearUnaMoto() {
		Moto nuevo = new Moto("094AB5", 200, 41.40338, 2.17403);
		
		assertEquals("094AB5", nuevo.getPatente());
		assertEquals((Integer) 2, nuevo.getCAPACIDA_MAXIMA_DE_PASAJEROS());
		assertEquals((Integer) 200, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
	}
	
	@Test
	public void  queSePuedaCrearUnaBicicleta() {
		Bicicleta nuevo = new Bicicleta(41.40338, 2.17403);
		
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
		
	}
	
	@Test
	public void  queSePuedaCrearUnTren() {
		Tren nuevo = new Tren(15, 250, 100, 41.40338, 2.17403);
		
		assertEquals((Integer) 15, nuevo.getCantidadDeVagones());
		assertEquals((Integer) 250, nuevo.getCantidadDePasajerosPorVagon());
		assertEquals((Integer) 100, nuevo.getVelocidadMaxima());
		assertEquals((Double) 41.40338, nuevo.getLatitud());
		assertEquals((Double) 2.17403, nuevo.getLongitud());
		
	}

	@Test
	public void  queSePuedanIncorporarDistintosVehiculos() throws ColitionException{		
		
			Mapa actual = new Mapa("Buenos Aires");
			
			actual.agregarVehiculo(new Auto("JJZ526", 5, 240, 10.40338, 1.17403));
			actual.agregarVehiculo(new Moto("094AB5", 200, 50.40338, 2.5656));
			actual.agregarVehiculo(new Auto("AAA001", 5, 100, 25.40338, 5.17403));
			actual.agregarVehiculo(new Bicicleta(33.333, 8.12345));
			actual.agregarVehiculo(new Auto("PPP333", 5, 240, 85.40338, 1.17403));
			actual.agregarVehiculo(new Bicicleta(22.63258, 3.96542));
			actual.agregarVehiculo(new Bicicleta(31.987452, 3.965482));
			actual.agregarVehiculo(new Moto("088BB5", 100, 36.85421, 8.17403));
			actual.agregarVehiculo(new Moto("094GG5", 90, 29.965482, 4.632152));
			actual.agregarVehiculo(new Tren(15, 250, 100, 45.826541, 3.965412));

			assertEquals((Integer) 10, actual.getCantidadDeVehiculos());
			assertFalse(actual.hayCoalición());
	}
	
	@Test (expected = ColitionException.class)
	public void  queChoquenDosVehiculos() throws ColitionException {	
		
		MedioTransporte unAuto = new Auto("JJZ526", 5, 240, 41.40338, 2.17403);
		MedioTransporte unaMoto = new Moto("094AB5", 200, 25.1234, 1.1234);
		
		Mapa actual = new Mapa("Buenos Aires");
		
		actual.agregarVehiculo(unAuto);
		actual.agregarVehiculo(unaMoto);

		
		unAuto.actualizarCoordenadas(25.1234, 1.1234);
		assertTrue(actual.hayCoalición());
		
	}
}
