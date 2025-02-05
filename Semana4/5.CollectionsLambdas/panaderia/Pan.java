package panaderia;

public class Pan {

	//HAS-A
	private String nombre;
	private Double precio;
	private int stock;

	//Constructor
	public Pan(String nombre, Double precio, int stock) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	
	//Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	//toString
	@Override
	public String toString() {
		return "Pan [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + "]";
	}

	
}
