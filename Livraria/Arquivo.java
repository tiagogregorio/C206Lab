import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public void escreverArquivo(Livro livro) {
        // Importando as classes que nos permitirão escrever no Arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            // Recebe o nome do meu arquivo
            os = new FileOutputStream("Livros.txt", true);

            // Mostra em qual arquivo estaremos escrevendo
            osw = new OutputStreamWriter(os);

            // Permite que escrevamos no arquivo
            bw = new BufferedWriter(osw);

            // Efetivamente escrevendo no arquivo
            bw.write("++ Livros ++\n");
            bw.write(livro.getNome() + "\n");
            bw.write(livro.getAutor() + "\n");
            bw.write(livro.getEditora() + "\n");
            bw.write(livro.getQtdPaginas() + "\n");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public ArrayList<Livro> ler() {
        // Criando array list que armazena os livros encontrados no arquivo
        ArrayList<Livro> encontreiNoArquivo = new ArrayList<>();

        // Estruturas que servirão para a leitura dos dados
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaLer; // Auxiliar que servirá como ponteiro para ler o arquivo

        try {
            is = new FileInputStream("Livros.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            // Posiciando o cursor no inicio do Arquivo
            linhaLer = br.readLine();

            // Verificando e rodando o código enquanto tiver informações no txt
            while (linhaLer != null) {
                // Verificando se já estamos na estrutura de um livro
                if (linhaLer.contains("++ Livros ++")) {

                    // Preenchendo as informações do Livro
                    String nome = br.readLine();
                    String autor = br.readLine();
                    String editora = br.readLine();
                    int qtdPaginas = Integer.parseInt(br.readLine());

                    // Criando um objeto auxiliar de Livros
                    Livro auxBook = new Livro(nome, autor, editora, qtdPaginas);

                    // Adicionando o livro ao arrayList, para informar que encontrei o livro
                    encontreiNoArquivo.add(auxBook);
                }
                // Passando para a próxima linha
                linhaLer = br.readLine();
            }
        } catch (Exception e) {

        }
        return encontreiNoArquivo;
    }
}
