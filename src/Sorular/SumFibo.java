/*
  n'e kadar olan fibonacci dizisindeki elamanların toplamı
*/
package Sorular;

import java.util.Scanner;

public class SumFibo 
{
    public static void main(String[] args) 
    {    
        Scanner oku = new Scanner(System.in);
        System.out.print("Number : ");
        int n = oku.nextInt();
     
//        solution(n);

                   
        int f1=0, f2=1, tmp=0;
        int sum =0;
        
        while (n>f2) 
        {
            System.out.println(f2);
            sum+=f2;
            
            tmp = f1 + f2;
            f1=f2;
            f2 = tmp;
            
        }
        System.out.println("n'e kadar olan Fibonacci sayılarının toplamı : "+ sum);
    }
    
    
    
    
