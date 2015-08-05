package br.gambiandharralabs.com.br;

public class Program
{   
    public static void main(String[] args) throws InterruptedException
    {
        ExibirNumerosThread th1 = new ExibirNumerosThread();
        ExibirNumerosThread th2 = new ExibirNumerosThread();
        
        th1.start();
        th2.start();
    }
}
