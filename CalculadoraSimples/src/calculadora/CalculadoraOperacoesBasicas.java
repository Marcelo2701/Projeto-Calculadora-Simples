package calculadora;
import java.util.Scanner;


public class CalculadoraOperacoesBasicas {
	
	//FUNÇÕES QUE CORRESPONDEM A CADA UMA DAS 4 OPERAÇÕES BÁSICAS DA MATEMÁTICA
	public static int somar(int num1, int num2) {
		return num1+num2;
	}
	public static int subtrair(int num1, int num2) {
		return num1-num2;
	}
	public static int multiplicar(int num1, int num2) {
		return num1*num2;
	}
	public static int dividir(int num1, int num2) {
		return num1/num2;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//VARIAVEIS
		int num1,num2,op;
		float calc;
		
		System.out.println("*** CALCULADORA SIMPLES ***\n");
		System.out.println("Escolha uma operação\n");
		System.out.println("1- Adição \n2- Subtração \n3- Multiplicação \n4- Divisão\n");
		
		System.out.print("Operação: ");
		op = scan.nextInt();
		
		//LOOP QUE VERIFICA SE A ALTERNATIVA DIGITADA ESTÁ DENTRO DAS OPÇÕES
		while(op < 1 || op > 4) {
			System.out.print("Alternativa inválida, escolha outra alternativa. Operação: ");
			op = scan.nextInt();
		}
		
		System.out.print("Número 1: ");
		num1 = scan.nextInt();
		System.out.print("Número 2: ");
		num2 = scan.nextInt();
		
		//SWITCH QUE PEGA A OPERAÇÃO DIGITADA PELO USUARIO E PEGA A FUNÇÃO CORRESPONDENTE FAZENDO O CALCULO
		switch(op) {
		case(1):
			calc = somar(num1,num2);
			System.out.printf("%d + %d = %.0f",num1,num2,calc);
			break;
		case(2):
			calc = subtrair(num1,num2);
			System.out.printf("%d - %d = %.0f",num1,num2,calc);
			break;
		case(3):
			calc = multiplicar(num1,num2);
			System.out.printf("%d * %d = %.0f",num1,num2,calc);
			break;
		case(4):
			calc = dividir(num1,num2);
			System.out.printf("%d / %d = %.0f",num1,num2,calc);
			break;
		}
		
		scan.close();
	}

}
