package tabuadachatgpt;

import java.util.Scanner;

public class TabuadaChatGpt {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        double num1, num2;
        
        System.out.print("Digite um número, o qual deseja consultar a tabuada: ");
        num1 = sys.nextDouble();
        System.out.println();
        for (num2=1;num2<=10;num2++){
            System.out.printf("%.2f x %.2f = %.2f\n", num1, num2, num1*num2);
        }       
    }    
}
