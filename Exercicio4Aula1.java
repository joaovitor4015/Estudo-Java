package exercicio4aula1;

import java.util.Scanner;

public class Exercicio4Aula1 {

    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.print("Digite o salário base do funcionário: ");
        double sal_base = sys.nextDouble();
        
        double sal_grat = sal_base*0.05 + sal_base;
        double sal_final = sal_grat - sal_grat*0.07;
        
        System.out.printf("\nSalário a receber: %.2f: ", sal_final);
        
        

    }
    
}
