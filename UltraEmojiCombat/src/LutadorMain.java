
public class LutadorMain {

	public static void main(String[] args) {
		Lutador C[] = new Lutador[6];
		C[0] = new Lutador("Pretty Boy", "Fran�a", 31, 1.75f, 68.9f, 11, 2, 1);
		C[0].Status();
		C[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
		C[1].Status();
		C[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
		C[3] = new Lutador("Dead Code", "Austr�lia", 28, 1.93f, 81.6f, 13, 0, 2);
		C[4] = new Lutador("UF0Cobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
		C[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
		
		Luta UEC01 = new Luta();
		UEC01.MarcarLuta(C[0], C[1]);
		UEC01.Lutar();
	}

}
