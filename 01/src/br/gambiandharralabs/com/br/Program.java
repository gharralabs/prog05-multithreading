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
        mostrar();
        Thread.sleep(10000);
        mostrar();  
    }
    
}
