package br.gambiandharralabs.com.br; 

public class ExibirNumerosRunnable implements Runnable {
    
    
    @Override
    public void run()
    {
        for( int i = 0; i < 1000000000; i ++)
        {
            System.out.println( Thread.currentThread().getName() + " - " + i );
        }
    }

}