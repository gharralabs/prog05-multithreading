package br.com.ghlabs.downloader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TransferenciaRunnable implements Runnable 
{
    private final String recurso;
    
    public TransferenciaRunnable( String recurso )
    {
        this.recurso = recurso;
    }
    
    @Override
    public void run()
    {
        try
        {
            URL url = new URL(recurso);
            InputStream is = url.openStream();

            String nomeArquivo;
            nomeArquivo = recurso.substring(recurso.lastIndexOf("/") + 1,
                                            recurso.length());

            FileOutputStream fos = new FileOutputStream("./" + nomeArquivo);
            byte[] buffer = new byte[1024];
            int len = is.read(buffer);
            while (len != -1)
            {
                fos.write(buffer, 0, len);
                len = is.read(buffer);
            }
            is.close();
            fos.close();

            System.out.println("Arquivo: " + nomeArquivo + " foi transferido"
                    + " com sucesso.");
        }
        catch (MalformedURLException ex)
        {
            Logger.getLogger("Endereço invalido" + 
                             TransferenciaRunnable.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Endereço invalido");
        }
        catch (IOException ex)
        {
            Logger.getLogger(TransferenciaRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
