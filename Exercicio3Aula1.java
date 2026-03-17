package exercicio3aula1;

import java.util.Scanner;

public class Exercicio3Aula1 {

    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        
        System.out.print("Digite o nome do funcionário: ");
        String nome = sys.nextLine();
        
        System.out.print("Digite sexo do funcionário (F) ou (M): ");
        char sexo = sys.next().charAt(0);
        
        System.out.print("Digite o salário do funcionário: ");
        float salario = sys.nextFloat();
        
        double novo_salario = (salario*0.25 + salario);
        
        System.out.printf("\nO novo salário do funcionário é: %.2f\n",novo_salario);
        
        
    }
    
}
