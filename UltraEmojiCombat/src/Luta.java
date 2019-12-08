import java.util.Random;

public class Luta {
	private Lutador Desafiado;
	private Lutador Desafiante;
	private int Rounds;
	private boolean Aprovada;
	private int Vencedor;

	public void MarcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
			Aprovada = true;
			Desafiado = l1;
			Desafiante = l2;
		} else {
			System.out.println("Luta n�o aprovada parceiro");
			Desafiante = null;
			Desafiado = null;
			Aprovada = false;
		}
	}

	public void Lutar() {
		if (Aprovada) {
			this.Desafiado.Apresentar();
			this.Desafiante.Apresentar();
			Random random = new Random();
			Vencedor = random.nextInt(3);
			System.out.print(" A LUTA EST� ACONTECENDO");
			for (int z = 0; z <= 2; z++) {
				System.out.print(".");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			switch (Vencedor) {
			case 2:
				System.out.println("");
				System.out.println(" A LUTA TEVE O TOTAL DE " + this.Vencedor + " ROUNDS, E O RESULTADO FOI: ");
				System.out.println("");
				System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0");
				System.out.println("0        Empate!        0");
				System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0");
				System.out.println("");
				Desafiado.EmpatarLuta();
				Desafiante.EmpatarLuta();
				break;
			case 1:
				System.out.println("");
				System.out.println(" A LUTA TEVE O TOTAL DE " + this.Vencedor + " ROUNDS, E O RESULTADO FOI: ");
				System.out.println("");
				System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0");
				System.out.println("0   Lutador 1 Ganhou!   0");
				System.out.println("0   Parab�ns " + Desafiado.getNome() + "!0");
				System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0");
				System.out.println("");
				Desafiado.GanharLuta();
				Desafiante.PerderLuta();

				break;
			case 0:
				System.out.println("");
				System.out.println("POR DESIST�NCIA A LUTA TEVE UM TOTAL DE " + this.Vencedor + " ROUNDS, E O RESULTADO FOI: ");
				System.out.println("");
				System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0");
				System.out.println("0   Lutador 2 Ganhou!   0");
				System.out.println("0 Parab�ns " + Desafiante.getNome() + "!   0");
				System.out.println("0-0-0-0-0-0-0-0-0-0-0-0-0");
				System.out.println("");
				Desafiado.PerderLuta();
				Desafiante.GanharLuta();
				break;
			}
		} else {
			System.out.println("Logo, Essa luta n�o ir� Acontecer.");
		}
	}

	public void setDesafiado(Lutador dd) {
		this.Desafiado = dd;
	}

	public Lutador getDesafiado() {
		return Desafiado;
	}

	public Lutador getDesafiante() {
		return Desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		Desafiante = desafiante;
	}
}
