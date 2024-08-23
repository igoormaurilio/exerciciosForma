package entidade;

public class Forma {
	protected double base;
	private double largura;
	protected double altura;
		
	public Forma(double base, double largura, double altura) {
		super();
		this.base = base;
		this.largura = largura;
		this.altura = altura;
	}
	
	public double calcularArea() {
		return base * altura;
		
	}
	public double CalcularArea() {
		return largura * altura;
	}
	public String mostrarInfo() {
		return "Triangulo" + calcularArea();
	}
	public String mostrarInfo2() {
		return "Retangulo" + CalcularArea();
	
	
	
	
	

	}
}
