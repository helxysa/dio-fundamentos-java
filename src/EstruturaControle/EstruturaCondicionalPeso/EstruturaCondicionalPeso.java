package EstruturaControle.EstruturaCondicionalPeso;

import java.util.Scanner;

public class EstruturaCondicionalPeso {


    public void imc(int peso, float altura) {
        float calc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + String.format("%.2f", calc)); 

 
        if (calc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (calc < 25) { 
            System.out.println("Classificação: Peso ideal");
        } else if (calc < 30) {
            System.out.println("Classificação: Levemente acima do peso");
        } else if (calc < 35) {
            System.out.println("Classificação: Obesidade grau 1");
        } else if (calc < 40) {
            System.out.println("Classificação: Obesidade grau 2 (severa)");
        } else {
            System.out.println("Classificação: Obesidade grau 3 (Mórbida)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga sua altura (ex: 1,75):");
     
        float altura = scanner.nextFloat();

        System.out.println("Diga seu peso (ex: 70):");

        int peso = scanner.nextInt();

        EstruturaCondicionalPeso calculoImc = new EstruturaCondicionalPeso();

     
        calculoImc.imc(peso, altura);

    
    }
}