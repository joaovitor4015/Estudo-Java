package exercicioaula1;

import java.util.Scanner;

public class ExercicioAula1 {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        
        System.out.print("Digite o 1* valor: ");
        int n1 = sys.nextInt();
        
        System.out.print("Digite o 2* valor: ");
        int n2 = sys.nextInt();
        
        System.out.print("Digite o 3* valor: ");
        int n3 = sys.nextInt();
        
        System.out.print("Digite o 4* valor: ");
        int n4 = sys.nextInt();
        
        int resultado = n1+n2+n3+n4;
        
        System.out.println("\nO seu resultado é: " + resultado);
    }
    
}
