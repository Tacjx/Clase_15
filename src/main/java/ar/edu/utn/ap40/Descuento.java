package ar.edu.utn.ap40;

public class Descuento {
	
	private String tipo;
	private Double cantidad;
	private int tope;
	
	private String fechaDesde;
	private String fechaHasta;
	
	public Descuento() {
		
	}
	
	public Descuento(String tipo,Double cantidad, int tope, String fechaDesde, String fechaHasta) {
		super();
		this.tipo=tipo;
		this.cantidad=cantidad;
		this.tope=tope;
		this.fechaDesde=fechaDesde;
		this.fechaHasta=fechaHasta;
	}
	
	
	
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public int getTope() {
		return tope;
	}

	public void setTope(int tope) {
		this.tope = tope;
	}
	
	
	public String getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(String fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	
	
	public String getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(String fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	
	
	
	@Override
	public String toString() {
		return "Descuento[tipo="+tipo+ ", cantidad="+cantidad+", tope="+tope+", fechaDesde="+fechaDesde+", fechaHasta="+fechaHasta+"]";
	}

}
