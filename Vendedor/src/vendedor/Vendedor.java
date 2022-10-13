
package vendedor;

import java.util.Scanner;


public class Vendedor {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("nome ");
        String nome = ler.next();
        System.out.println("salario ");
        double salario;
        salario = ler.nextDouble();
        System.out.println("descontos ");
        double desconto = ler.nextDouble();
        
        
        
        
        double novoSalario = salario * 1/1 + desconto *- 1/3;
        
        System.out.println("Receber R$: "+ novoSalario 
                + " desconto de % " +  desconto);
        
    }
    
}
