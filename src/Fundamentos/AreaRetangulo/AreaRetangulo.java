package Fundamentos.AreaRetangulo;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga a base do retangulo");
        var base = scanner.nextInt();
        System.out.println("Diga a altura");
        var altura = scanner.nextInt();
        var resultado = base * altura;
        System.out.printf("A area e de %s", resultado);


    }
}
