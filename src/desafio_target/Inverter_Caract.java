package desafio_target;

import java.util.Scanner;

public class Inverter_Caract {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;
		String aux1 = "";

		System.out.print("Digite uma palavra: ");
		String p = sc.nextLine();

		b = p.length();

		for (int i = (b - 1); i >= 0; i--) {
			aux1 = aux1 + p.charAt(i);
		}
		System.out.println(aux1);
		sc.close();
	}
}
