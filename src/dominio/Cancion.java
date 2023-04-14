package dominio;

public class Cancion {
	private String nombre;
	private String artista;
	
	
	public Cancion() {
		
	}
	
	public Cancion(String nombre, String artista) {
		this.setNombre(nombre);
		this.setArtista(artista);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
}
