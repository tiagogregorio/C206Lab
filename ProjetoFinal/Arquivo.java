import Model.RendaFixa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Arquivo {
    public Arquivo() {
    }

    public void escreverArquivo(RendaFixa fixa) {
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            os = new FileOutputStream("RendaFixa.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            bw.write("---------- RendaFixa ----------\n");
            bw.write(fixa.getNome() + "\n");
            bw.write(fixa.getProduto() + "\n");
            bw.write(fixa.getValorInvest() + "\n");
        } catch (FileNotFoundException var14) {
            throw new RuntimeException(var14);
        } catch (IOException var15) {
            throw new RuntimeException(var15);
        } finally {
            try {
                bw.close();
            } catch (IOException var13) {
                throw new RuntimeException(var13);
            }
        }

    }

    public ArrayList<RendaFixa> ler() {
        ArrayList<RendaFixa> encontreiNoArquivo = new ArrayList();
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            is = new FileInputStream("RendaFixa.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            for(String linhaLer = br.readLine(); linhaLer != null; linhaLer = br.readLine()) {
                if (linhaLer.contains("---------- RendaFixa ----------")) {
                    String nome = br.readLine();
                    String produto = br.readLine();
                    int ValorInvest = Integer.parseInt(br.readLine());
                    RendaFixa auxBook = new RendaFixa(nome, produto, ValorInvest);
                    encontreiNoArquivo.add(auxBook);
                }
            }
        } catch (Exception var10) {
        }

        return encontreiNoArquivo;
    }

  public void atualizar(){

        // LEITURA DO ARQUIVO E VERIFICACAO

        // CHAMAR METODO PARA ESCREVER
    }
    public void deletar(){

        // LEITURA DO ARQUIVO E VERIFICACAO

        // CHAMAR DELETAR
    }
}
