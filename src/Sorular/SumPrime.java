/*
n e kadar olan asal sayıların toplamı
 */
package Sorular;

import java.util.Scanner;


public class SumPrime 
{
    
    public static void main(String[] args) 
    {  
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayı : ");
        int n = oku.nextInt();
        //int sum = 0;
        
        System.out.println("sum : "+getSumPrime(n));
    }
    
    public static int getSumPrime(int m)
    {
        int sum2=0;
        
        for (int i = 2; i < m; i++) 
        {
            boolean isPrime = true;
            
            for (int j = 2; j <= i/2; j++) 
            {
                if(i%j==0) isPrime=false;
                
            }
            
            if (isPrime) 
            {
                sum2=sum2+i;
                //System.out.println("asal : "+i);
                //System.out.println("top : "+sum2);
            }
        }
        return sum2;
    }
    
}
