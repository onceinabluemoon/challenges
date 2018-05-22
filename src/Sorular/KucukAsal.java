/*
bir büyük asal sayı ve bu asal sayı içindeki en büyük asal sayıyı bulmam isteniliyordu.
 */
package Sorular;

import java.util.Scanner;


public class KucukAsal 
{
    public static void main(String[] args) 
    {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı : ");
        int num = oku.nextInt()-1;
        
        getLittlePrime(num);
    }
    
    public static int getLittlePrime(int m)
    {
        //for (int i =m ; i >=2; i--) 
        while(true)
        {
            boolean isPrime = true;
            
            if(m<2) isPrime=false;
            
            for (int j =2 ; j <m; j++) 
            {
                if (m%j==0)         {isPrime=false;  break;}
                
            }
            if (isPrime) {
                System.out.println("ilk asal : "+m); break;
            }
            else m--;
        }
       
        
        return m;
        
    }
    
}
