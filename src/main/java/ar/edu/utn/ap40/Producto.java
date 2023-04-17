package ar.edu.utn.ap40;

public class Producto {
	
	private String nombre;
	private String peso;
	private int precio;


	public Producto() {

	}

	public Producto(String nombre, String peso, int precio) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.precio = precio;
	}


	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", peso=" + peso + ", precio=" + precio + "]";
	}
}
