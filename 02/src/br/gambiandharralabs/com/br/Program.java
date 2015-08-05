package br.gambiandharralabs.com.br; 

public class Program
{
    public static void mostrar()
    {
       for( int i = 0; i < 1000000000; i ++)
        {
            System.out.println(i);
        } 
    }
    
    public static void main(String[] args) throws InterruptedException
    {
     
        ExibirNumerosRunnable runnable = new ExibirNumerosRunnable();
        
        Thread th1 = new Thread(runnable);
        Thread th2 = new Thread(runnable);
        
        th1.start();
        th2.start();
    }
}