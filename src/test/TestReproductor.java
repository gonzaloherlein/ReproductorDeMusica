package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dominio.Cancion;
import dominio.ListaDeReproduccion;
import dominio.Usuario;

public class TestReproductor {

	@Test
	public void queSePuedaGuardarMisDatosPersonales() {
		Usuario nuevoUsuario = new Usuario("Juan");
		
		String nombre = nuevoUsuario.getNombre();
		String nombreAComparar = "Juan";
		
		assertEquals(nombre, nombreAComparar);
	}
	
	@Test
	public void queSePuedaCrearUnaListaDeReproduccion() {
		ListaDeReproduccion nuevaLista = new ListaDeReproduccion();
		assertNotNull(nuevaLista);
	}
	
	@Test
	public void queSePuedaAgregarUnaCancionAUnaLista() {
		ListaDeReproduccion nuevaLista = new ListaDeReproduccion();
		Cancion nuevaCancion = new Cancion();
		
		assertTrue(nuevaLista.agregarCancion(nuevaCancion));
	}
	
	@Test
	public void queSeReproduzcaLaLista() {
		ListaDeReproduccion nuevaLista = new ListaDeReproduccion("Nueva lista");
		Cancion nuevaCancion = new Cancion("primera", "a");
		Cancion nuevaCancion1 = new Cancion("segunda", "a");
		Cancion nuevaCancion2 = new Cancion("tercera", "a");
		Cancion nuevaCancion3 = new Cancion("cuarta", "a");
		
		nuevaLista.agregarCancion(nuevaCancion);
		nuevaLista.agregarCancion(nuevaCancion1);
		nuevaLista.agregarCancion(nuevaCancion2);
		nuevaLista.agregarCancion(nuevaCancion3);
		
		nuevaLista.siguiente();
		
		
		String cancionActual = nuevaLista.getCancionActual();
		String cancionPedida = "segunda";
		

		assertEquals(cancionActual, cancionPedida);
	}
	
	@Test
	public void queSeMuestreCantidadDeCanciones() {
		ListaDeReproduccion nuevaLista = new ListaDeReproduccion("Nueva lista");
		Cancion nuevaCancion = new Cancion("primera", "a");
		Cancion nuevaCancion1 = new Cancion("segunda", "a");
		Cancion nuevaCancion2 = new Cancion("tercera", "a");
		Cancion nuevaCancion3 = new Cancion("cuarta", "a");
		
		nuevaLista.agregarCancion(nuevaCancion);
		nuevaLista.agregarCancion(nuevaCancion1);
		nuevaLista.agregarCancion(nuevaCancion2);
		nuevaLista.agregarCancion(nuevaCancion3);
		
		
		Integer valorEsperado = 4;
		
		Integer valorObtenido = nuevaLista.contarCantidadCanciones();
		
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
}
