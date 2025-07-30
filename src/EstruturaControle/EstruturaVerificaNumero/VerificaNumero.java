package EstruturaControle.EstruturaVerificaNumero;

import java.util.Scanner;

public class VerificaNumero {
    
    public void ParOuImpar(){
         Scanner scanner = new Scanner(System.in);

        System.out.println("--- Exercício 3: Pares ou Ímpares em Intervalo (Versão Simples) ---");
        System.out.print("Digite o primeiro número (o menor): ");
        int primeiroNumero = scanner.nextInt();

        int segundoNumero;
        do {
            System.out.print("Digite o segundo número (deve ser maior que o primeiro): ");
            segundoNumero = scanner.nextInt();
            if (segundoNumero <= primeiroNumero) {
                System.out.println("Erro: O segundo número deve ser maior que o primeiro. Tente novamente.");
            }
        } while (segundoNumero <= primeiroNumero);

        System.out.print("Você quer ver os números pares ou ímpares? Digite 'par' ou 'impar': ");
        String escolha = scanner.next();

        System.out.println("\nResultado em ordem decrescente:");

        // Laço de processamento
        for (int i = segundoNumero; i >= primeiroNumero; i--) {
            if (escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }
        
    }


    public static void main(String[] args){
        VerificaNumero numero = new VerificaNumero();
        numero.ParOuImpar();
    }



}
