import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args){
		CalculadoraSimples calc = new CalculadoraSimples();
		calc.init2();
	}	

	public void init(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o primeiro numero da soma");
		Double numeroUm = Double.parseDouble(scanner.nextLine());

		System.out.println("Informe o segundo numero da soma");
		Double numeroDois = Double.parseDouble(scanner.nextLine());

		Double resultado = soma(numeroUm, numeroDois);

		System.out.println("resultado : " + resultado.toString());

	}

	public void init2(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("######Calculadora Simples######");

		bolean operacao = -1;

		

		System.out.println("Informe a operacao [1 = soma, 2 = subtracao, 3 = exponenciacao, 4 = multiplicacao, 5 = divisao, 0 = sair]");
		operacao = Integer.parseInt(scanner.nextLine());

		while(operacao != 0){			

			if(operacao == 1){ //soma
				System.out.println("Informe o primeiro numero da soma");
				Double numeroUm = Double.parseDouble(scanner.nextLine());

				System.out.println("Informe o segundo numero da soma");
				Double numeroDois = Double.parseDouble(scanner.nextLine());

				Double resultado = soma(numeroUm, numeroDois);

				System.out.println("resultado da soma: " + resultado.toString());

			} else if(operacao == 2){ //subtracao
				System.out.println("Informe o primeiro numero da subtracao");
				Double numeroUm = Double.parseDouble(scanner.nextLine());

				System.out.println("Informe o segundo numero da subtracao");
				Double numeroDois = Double.parseDouble(scanner.nextLine());

				Double resultado = subtrai(numeroUm, numeroDois);

				System.out.println("resultado da subtracao: " + resultado.toString());
			} else if(operacao == 3){
				System.out.println("Informe o numero da exponenciacao");
				Double numero = Double.parseDouble(scanner.nextLine());
				System.out.println("Informe o expoente");
				int expoente = Integer.parseInt(scanner.nextLine());

				Double resultado = expoente(numero, expoente);

				System.out.println("resultado da exponenciacao: " + resultado.toString());

			} else if(operacao == 4) {
				System.out.println("Informe o primeiro numero da multiplicacao");
				Double numeroUm = Double.parseDouble(scanner.nextLine());

				System.out.println("Informe o segundo numero da multiplicacao");
				Double numeroDois = Double.parseDouble(scanner.nextLine());

				Double resultado = multiplica(numeroUm, numeroDois);

				System.out.println("resultado da multiplicacao: " + resultado.toString());				
			
			} else if(operacao == 5) {
				System.out.println("Informe o primeiro numero da divisao");
				Double numeroUm = Double.parseDouble(scanner.nextLine());

				System.out.println("Informe o segundo numero da divisao");
				Double numeroDois = Double.parseDouble(scanner.nextLine());

				Double resultado = divide(numeroUm, numeroDois);

				System.out.println("resultado da divisao: " + resultado.toString());				
			} else {
				System.out.println("Operacao nao suportada");
			}

			System.out.println("Informe a operacao [1 = soma, 2 = subtracao, 3 = exponenciacao, 4 = multiplicacao, 5 = divisao, 0 = sair]");
			operacao = Integer.parseInt(scanner.nextLine());
		}

		System.out.println("######Obrigado e volte sempre!######");

	}

	public Double multiplica(Double numero1, Double numero2){
		return numero1 * numero2;
	}

	public Double divide(Double numero1, Double numero2){
		return numero1  / numero2;
	}

	public Double soma(Double numero1, Double numero2){

		return numero1 + numero2;
	}

	public Double subtrai(Double numero1, Double numero2){

		return numero1 - numero2;
	}

	public Double expoente(Double numero, int expoente){
		Double controle = numero;
		for(int i = 0; i < expoente-1; i++){
			System.out.println("i agora e:" + i);
			controle = controle * numero;
		}

		return controle;

	}

}