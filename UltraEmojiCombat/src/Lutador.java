import java.util.Random;
public class Lutador {
	private String Nome;
	private String Nacionalidade;
	private int Idade;
	private float Altura;
	private float peso;
	private String Categoria;
	private int Vitorias;
	private int Derrotas;
	private int Empates;
	private int Mortes;

	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.Nome = no;
		this.Nacionalidade = na;
		this.Idade = id;
		this.Altura = al;
		this.setPeso(pe);
		this.Vitorias = vi;
		this.Derrotas = de;
		this.Empates = em;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getNacionalidade() {
		return Nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		Nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public float getAltura() {
		return Altura;
	}

	public void setAltura(float altura) {
		Altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		if (peso < 52.2) {
			this.setCategoria("Inválido");
		} else if (peso <= 70.3) {
			this.setCategoria("Leve");
		} else if (peso <= 63.9) {
			this.setCategoria("Médio");
		} else if (peso <= 120.2) {
			this.setCategoria("Pesado");
		} else {
			this.setCategoria("Inválido ou não suportado.");
		}
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public int getVitorias() {
		return Vitorias;
	}

	public void setVitorias(int vitorias) {
		Vitorias = vitorias;
	}

	public int getDerrotas() {
		return Derrotas;
	}

	public void setDerrotas(int derrotas) {
		Derrotas = derrotas;
	}

	public int getEmpates() {
		return Empates;
	}

	public void setEmpates(int empates) {
		Empates = empates;
	}

	public void Apresentar() {
		System.out.println("==============================");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Nacionalidade: " + this.getNacionalidade());
		System.out.println("Idade: " + this.getIdade() + "Anos");
		System.out.println("Altura: " + this.getAltura() + "m");
		System.out.println("Peso: " + this.getPeso() + "Kg");
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Vitorias: " + this.getVitorias());
		System.out.println("Derrotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
		System.out.println("==============================");
	}

	public void Status() {
		Random random = new Random();
		Mortes = random.nextInt(10);
		System.out.println("============== STATUS ==============");
		System.out.println("O CAMPEÃO DE HOJE É: " + this.getNome());
		System.out.println("");
		System.out.println("Ele leva o conceito de peso: " + this.getCategoria());
		System.out.println("");
		if (this.getVitorias() < 0) {
			System.out.println("O monstro resolveu não especifícar quantas vitórias ele tem.");
			System.out.println("");
		} else if (this.getVitorias() <= 4) {
			System.out.println("TEM POUQISSÍMAS " + this.getVitorias() + " Vitórias.");
			System.out.println("");
		} else if (this.getVitorias() <= 7) {
			System.out.println("TEM UMA MÉDIA DE " + this.getVitorias() + " Vitórias.");
			System.out.println("");
		} else if (this.getVitorias() <= 12) {
			System.out.println("TEM EXATAS " + this.getVitorias() + " Vitórias.");
			System.out.println("");
		} else if (this.getVitorias() <= 15) {
			System.out.println("O LENDÁRIO CONSEGUIU GANHAR " + this.getVitorias() + "RODADAS!");
			System.out.println("");
		}
		if(this.getDerrotas()>0) {
		System.out.println("ELE PERDEU INFELIZMENTE " + this.getDerrotas() + " Rodadas.");
		System.out.println("");
		} else {
			System.out.println("ELE NUNCA PERDEU NENHUMA BATALHA.");
			System.out.println("");
		} if(Mortes<=4) {
		System.out.println("PARA PROVAR QUE ELE NÃO ESTÁ DE BRINCADEIRA, JÁ MATOU O TOTAL DE " + this.Mortes + " PESSOAS NO RING DE BATALHA.");
		} else if(Mortes<=8){
			System.out.println("E É COM TRISTEZA QUE INFORMAMOS QUE ELE JÁ MATOU " + this.Mortes + " PESSOAS NO RING.");
		} else {
			System.out.println("E ESSE MONSTRO JÁ INFELIZMENTE COMETEU AS MORTES DE " + this.Mortes + " PESSOAS NO RING.");
		}
		System.out.println("");
		System.out.println("E POR FIM O MONSTRO EMPATOU " + this.getEmpates() + " Partidas.");
		System.out.println("");
		System.out.println("===================================");
		System.out.println("");
	}

	public void GanharLuta() {
		Vitorias ++;
	}

	public void PerderLuta() {
		Derrotas ++;
	}

	public void EmpatarLuta() {
		Empates ++;
	}

}
