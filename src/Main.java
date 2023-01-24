import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, imposto;
		
		System.out.println("CÁLCULO DE IMPOSTO DE RENDA\n");
		System.out.println("Informe o Salário: ");
		
		salario = sc.nextDouble();
		
		if (salario > 4500) {		
			imposto = 80 + 270 + (salario - 4500) * 0.28;
			System.out.printf("Imposto = R$ %.2f", imposto);
		}
		else if (salario > 3000){	
			imposto = 80 + (salario - 3000) * 0.18;
			System.out.printf("Imposto = R$ %.2f", imposto);
		}
		else if (salario > 2000){
			imposto = 80 + (salario - 2000) * 0.08;
			System.out.printf("Imposto = R$ %.2f" + imposto);
		}
		else {
			System.out.println("Isento");
		}
		
		sc.close();

	}

}
