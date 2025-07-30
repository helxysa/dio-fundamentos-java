package Fundamentos.AreaQuadrado;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diga a lado do quadrado");
        var lado = scanner.nextInt();
        var resultado = lado * lado;
        System.out.printf("A area e de %s", resultado);
    }
}
