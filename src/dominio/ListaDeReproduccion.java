package dominio;

public class ListaDeReproduccion {
	
	private String nombre;
	private final Integer CANTIDAD_MAXIMA_DE_CANCIONES_POR_LISTA = 100;
	private Cancion[] listaDeCanciones = new Cancion[CANTIDAD_MAXIMA_DE_CANCIONES_POR_LISTA];
	private Integer indiceActual;
	private Integer cantCanciones;
	
	public ListaDeReproduccion() {
		
	}
	
	public ListaDeReproduccion(String nombre) {
		this.nombre = nombre;
		this.listaDeCanciones = new Cancion[CANTIDAD_MAXIMA_DE_CANCIONES_POR_LISTA];
		this.indiceActual = 0;
		this.cantCanciones = 0;
		inicializarLista();
	}

	private void inicializarLista() {
		for (int i = 0; i < listaDeCanciones.length; i++) {
			listaDeCanciones[i] = null;
		}
		
	}

	public boolean agregarCancion(Cancion cancion) {
		
		for (int i = 0; i < listaDeCanciones.length; i++) {
			if(listaDeCanciones[i] == null) {
				listaDeCanciones[i] = cancion;
				
				return true;
			}
		}
		return false;
	}
	
	public Integer contarCantidadCanciones() {
		Integer cantCanciones = 0;
		for (int i = 0; i < listaDeCanciones.length; i++) {
			if(listaDeCanciones[i] != null) {
				cantCanciones++;
			}
		}
		return cantCanciones;
	}
	
	 public void reproducir() {
	       Cancion cancionActual = this.listaDeCanciones[this.indiceActual];
	 }
	 
	 public void siguiente() {
	     if (this.indiceActual < this.listaDeCanciones.length - 1) {
	          this.indiceActual++;
	     } else {
	         this.indiceActual = 0;
	     }
	      reproducir();
	 }
	 
	 public void anterior() {
	        if (this.indiceActual > 0) {
	            this.indiceActual--;
	        } else {
	            this.indiceActual = this.listaDeCanciones.length - 1;
	        }
	        reproducir();
	 }
	 
	 
	 public String getCancionActual() {
	        return this.listaDeCanciones[this.indiceActual].getNombre();
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cancion[] getListaDeCanciones() {
		return listaDeCanciones;
	}

	public void setListaDeCanciones(Cancion[] listaDeCanciones) {
		this.listaDeCanciones = listaDeCanciones;
	}

	public Integer getCantCanciones() {
		return this.listaDeCanciones.length;
	}

	public void setCantCanciones(Integer cantCanciones) {
		this.cantCanciones = cantCanciones;
	}
	
}
