/*
  n'e fibonacci dizisindeki elamanların toplamını, 


 */
package Sorular;

import java.util.Scanner;

public class SumFibo 
{
    public static void main(String[] args) {
        
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
    
    
    
    
    
    
    
    
    public static int solution(int nNumber)
    {
        // n 2 ise 1,3-- 2 fazla      3 se ---- 1,3,5--- 4 fazla      4 ise 1,3,5,7--- 6 fazla       5 ise 1,3,5,7,9  8 fazla
        
        int result=0;
        
        for (int i = 1; i <= nNumber; i++ ) 
        {
            System.out.println(2*i-1);
            result+=(2*i-1)*(2*i-1);
            
        }
        System.out.println("Sum : "+result);
        return result;
    }
    
}
