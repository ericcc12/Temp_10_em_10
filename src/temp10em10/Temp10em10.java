package temp10em10;

import java.util.Scanner;

public class Temp10em10
{

    public static void main(String[] args) 
    {
     Scanner leia = new Scanner(System.in);
     // realizar o calculo de uma temperatura e aumenta-la de 10 em 10..
     double F, C, dez, result, soma;  
     
     System.out.println("Digite  a temperatura em graus celsius ");   
     C = leia.nextDouble();
     
     F = C * 1.8 + 32; 
     
     System.out.println("A temperatura em Fahreint ="+ F);
     
     int ini = 0;
     int fim = 10;
     System.out.println("As respectivas temperaturas são:");
     for(int i = 1; i <= fim ; i++)
     {
      ini = 1+ini; 
      soma = ini * 10;
      result = F + soma;
      
      System.out.println(result);
     }    
    }
}
