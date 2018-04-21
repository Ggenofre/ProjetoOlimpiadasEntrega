package model;

public class Pais {
	int id; 
	String nome; 
	int populacao;
	double area;

	static {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		throw new RuntimeException(e);
		}
	}
	
	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pais(int id, String nome, int populacao, double area) {
		super();
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getPopulacao() {
		return populacao;
	}
	
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (id != other.id)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (populacao != other.populacao)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pais [id=" + id + ", nome=" + nome + ", populacao=" + populacao + ", area=" + area + "]";
	}
	

}	