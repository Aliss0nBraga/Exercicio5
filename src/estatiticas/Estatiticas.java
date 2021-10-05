package estatiticas;

public class Estatiticas {
	private int taxaNatalidade;
	private float numeroDeCriançasNascidas;
	private float numeroDeHabitantes;
	private float numeroDeCriancasNascidas;

	public Estatiticas(int taxaNatalidade, float numeroDeCriancasNascidas, float numeroDeHabitantes) {
		this.taxaNatalidade = taxaNatalidade;
		this.numeroDeCriancasNascidas = numeroDeCriancasNascidas;
		this.numeroDeHabitantes = numeroDeHabitantes;
	}

	public int getTaxaNatalidade() {
		return taxaNatalidade;
	}

	public float getNumeroDeCriancasNascidas() {
		return numeroDeCriancasNascidas;
	}

	public float getNumeroDeHabitantes() {
		return numeroDeHabitantes;
	}

	public void setTaxaNatalidade(int taxaNatalidade) {
		this.taxaNatalidade = taxaNatalidade;
	}

	public void setNumeroDeCriancasNascidas(float numeroDeCriancasNascidas) {
		this.numeroDeCriancasNascidas = numeroDeCriancasNascidas;
	}

	public void setNumeroDeHabitantes(float numeroDeHabitantes) {
		this.numeroDeHabitantes = numeroDeHabitantes;
	}

	public float calcularNatalidade() {
		return this.calcularNatalidade() * 1000 / this.getNumeroDeCriancasNascidas();
	}

	public class Natalidade {
		public float multiplicar(float nascidos, float n2, float habitantesN) {
			return (nascidos * n2) / habitantesN;

		}

		public class Mortalidade {
			public float multiplicar(float obitos, float n1, float habitantesM) {
				return (obitos * n1) / habitantesM;
			}
		}
	}
}