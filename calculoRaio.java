import java.util.Locale;
import java.util.Scanner;

public class CalculoRaio {

	public static void main(String[] args) {
		
		// ========================================================
		//Faça um programa para ler o valor do raio de um círculo, 
		// e depois mostrar o valor da área deste círculo com quatro
		// casas decimais conforme exemplos.
		
		// Fórmula da área: area = PI . raio2
		// Considere o valor de PI = 3.14159
		// ========================================================

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double valor1 = sc.nextDouble();
		double valorRaio = 3.14159;
		
		double calculoRaio = valorRaio * (valor1 * valor1);
		
		System.out.println("O valor do Raio é de " + valor1 + " é : " + calculoRaio);
		
		sc.close();
		
		

	}

}
