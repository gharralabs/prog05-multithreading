package br.gambiandharralabs.downloader;  

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args) throws IOException 
    {
        Scanner scanner = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Informe a URL");
            String endereco = scanner.nextLine();
            
            try
            {
                URL url = new URL(endereco);
                InputStream is = url.openStream();
                
                String nomeArquivo;
                nomeArquivo = endereco.substring( endereco.lastIndexOf("/") + 1, endereco.length());
                
		FileOutputStream fos = new FileOutputStream("./" + nomeArquivo);
		byte[] buffer = new byte[1024];
		int len = is.read(buffer);
		while (len != -1) {
		    fos.write(buffer, 0, len);
		    len = is.read(buffer);
		}
		is.close();
		fos.close();
                
                System.out.println("Arquivo: " + nomeArquivo + " foi transferido"
                                    + " com sucesso.");
            }
            catch(MalformedURLException ex)
            {
                System.out.println("Endereço invalido");
            }
        }
    }
}