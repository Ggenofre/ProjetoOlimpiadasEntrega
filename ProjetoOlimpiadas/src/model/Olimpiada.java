package model;

public class Olimpiada {
	private int id_ano; 
	private String tipo;
	
	public Olimpiada() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Olimpiada(int id_ano, String tipo) {
		super();
		this.id_ano = id_ano;
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getId_ano() {
		return id_ano;
	}
	public void setId_ano(int id_ano) {
		this.id_ano = id_ano;
	}
	@Override
	public String toString() {
		return "Olimpiada [id_ano=" + id_ano + ", tipo=" + tipo + "]";
	}
		@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Olimpiada other = (Olimpiada) obj;
		if (id_ano != other.id_ano)
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}
		
}

