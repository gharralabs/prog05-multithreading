package br.gambiandharralabs.com.br;

public class ExibirNumerosThread extends Thread {
    
    
    @Override
    public void run()
    {
        for( int i = 0; i < 1000000000; i ++)
        {
            System.out.println( getName() + " - " + i );
        }
    }
}