package br.gambiandharralabs.downloader;  

import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Informe a URL");
            String endereco = scanner.nextLine();
            
            TransferenciaRunnable tr = new TransferenciaRunnable(endereco);
            new Thread(tr).start();
        }
    }
}