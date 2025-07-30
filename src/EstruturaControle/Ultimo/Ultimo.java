package EstruturaControle.Ultimo;

import java.util.Scanner;

public class Ultimo {
    public void verificacaoDoNumero(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int numeroInicial = scanner.nextInt();

        int numeroAtual;

    
        do {
            System.out.print("Informe um novo número (ou um não-múltiplo de " + numeroInicial + " para sair): ");
            numeroAtual = scanner.nextInt();

            if (numeroAtual < numeroInicial) {
                System.out.println("Número " + numeroAtual + " é menor que o inicial " + numeroInicial + ". Ignorando...");
                continue; 
            }
            
           
            if (numeroAtual % numeroInicial == 0) {
                 System.out.println("O número " + numeroAtual + " é múltiplo de " + numeroInicial + ". Continue.");
            }

        } while (numeroAtual % numeroInicial == 0); 

        System.out.println("\nFim da execução.");
        System.out.println("O número " + numeroAtual + " não é um múltiplo de " + numeroInicial + ".");
        
    }


      public static void main(String[] args) {
        Ultimo ultimo = new Ultimo();
        ultimo.verificacaoDoNumero();
    }


}
