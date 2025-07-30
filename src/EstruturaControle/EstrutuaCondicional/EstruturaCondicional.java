package EstruturaControle.EstrutuaCondicional;

import java.util.Scanner;

public class EstruturaCondicional {
    
    public int Tabuada(int number){
        
        for(var i = 1; i < number + 1; i++){
            System.out.println(i);
        }

        return 0;
    }



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite ai um numero");
        var valor = scanner.nextInt();
        EstruturaCondicional tabuada = new EstruturaCondicional( );
        tabuada.Tabuada(valor);
    }

}


