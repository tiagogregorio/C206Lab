import java.io.*;
import java.util.ArrayList;

class Arquivo {
    private String nomeArquivo;

    public Arquivo() {
        this.nomeArquivo = "investimentos.txt"; // Defina o nome do arquivo
    }

    public void salvar(RendaFixa rendaFixa) {
        try (FileWriter fw = new FileWriter(nomeArquivo, true); // Abre o arquivo em modo de escrita (true indica que o conteúdo será anexado ao final do arquivo)
             BufferedWriter bw = new BufferedWriter(fw)) { // Cria um BufferedWriter para melhorar a performance da escrita

            bw.write("---------- RendaFixa ----------\n"); // Escreve uma linha de separação
            bw.write(rendaFixa.getNome() + "\n"); // Escreve o nome do investimento
            bw.write(rendaFixa.getProdutos() + "\n"); // Escreve os produtos do investimento
            bw.write(rendaFixa.getValorInvest() + "\n"); // Escreve o valor do investimento
            bw.write("------------------------------\n"); // Escreve uma linha de separação
        } catch (IOException e) { // Captura uma possível exceção de I/O
            System.out.println("Erro ao salvar o investimento: " + e.getMessage()); // Exibe uma mensagem de erro caso ocorra uma exceção
        }
    }

    public ArrayList<RendaFixa> ler() {
        ArrayList<RendaFixa> rendaFixaEncontrados = new ArrayList<>();

        try (FileReader fr = new FileReader(nomeArquivo); // Abre o arquivo em modo de leitura
             BufferedReader br = new BufferedReader(fr)) { // Cria um BufferedReader para melhorar a performance da leitura

            String linha;
            while ((linha = br.readLine()) != null) { // Lê cada linha do arquivo até o final
                if (linha.equals("---------- RendaFixa ----------")) { // Verifica se a linha indica um investimento de RendaFixa
                    String nome = br.readLine(); // Lê o nome do investimento
                    String produto = br.readLine(); // Lê os produtos do investimento
                    int valorInvest = Integer.parseInt(br.readLine()); // Lê o valor do investimento e converte para inteiro
                    br.readLine(); // Lê a linha vazia após cada investimento

                    RendaFixa rendaFixa;
                    if (produto.equalsIgnoreCase("CDB")) { // Verifica o tipo de produto e cria o objeto RendaFixa correspondente
                        rendaFixa = new Cdbb(nome, valorInvest);
                    } else if (produto.equalsIgnoreCase("Poupança")) {
                        rendaFixa = new Poupanca(nome, valorInvest);
                    } else {
                        rendaFixa = new Selicc(nome, valorInvest);
                    }

                    rendaFixaEncontrados.add(rendaFixa); // Adiciona o investimento encontrado à lista
                }
            }
        } catch (FileNotFoundException e) { // Captura uma possível exceção de arquivo não encontrado
            System.out.println("Arquivo não encontrado: " + e.getMessage()); // Exibe uma mensagem de erro caso ocorra uma exceção
        } catch (IOException e) { // Captura uma possível exceção de I/O
            System.out.println("Erro ao ler o arquivo: " + e.getMessage()); // Exibe uma mensagem de erro caso ocorra uma exceção
        }

        return rendaFixaEncontrados; // Retorna a lista de investimentos encontrados no arquivo
    }

    public void reescreverArquivo(ArrayList<RendaFixa> rendaFixaEncontrados) {
        try (FileWriter fw = new FileWriter(nomeArquivo); // Abre o arquivo em modo de escrita (o conteúdo existente será substituído)
             BufferedWriter bw = new BufferedWriter(fw)) { // Cria um BufferedWriter para melhorar a performance da escrita

            for (RendaFixa rendaFixa : rendaFixaEncontrados) { // Percorre a lista de investimentos
                bw.write("---------- RendaFixa ----------\n"); // Escreve uma linha de separação
                bw.write(rendaFixa.getNome() + "\n"); // Escreve o nome do investimento
                bw.write(rendaFixa.getProdutos() + "\n"); // Escreve os produtos do investimento
                bw.write(rendaFixa.getValorInvest() + "\n"); // Escreve o valor do investimento
                bw.write("------------------------------\n"); // Escreve uma linha de separação
            }
        } catch (IOException e) { // Captura uma possível exceção de I/O
            System.out.println("Erro ao reescrever o arquivo: " + e.getMessage()); // Exibe uma mensagem de erro caso ocorra uma exceção
        }
    }
}
