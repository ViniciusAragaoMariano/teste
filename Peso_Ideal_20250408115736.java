package peso_ideal;

import java.util.Scanner;

public class Peso_Ideal {

	
public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	double peso=0, altura;
	String sexo;

	System.out.println("Programa que calcula seu peso ideal baseado no seu sexo");

	System.out.println("Informe o seu sexo: ");
	sexo = leia.nextLine();
	System.out.println("Informe a sua altura: ");
	altura = leia.nextFloat();
	if (sexo.equals("M")) {
	peso = (72 * altura)-58 ;
	System.out.println("Seu peso ideal é: " + peso);
	}else if (sexo.equals("F")) {
	peso = ( 62 * altura)- 44;
	System.out.println("Seu peso ideal é: " + peso);
    
}
	leia.close();
}
}

