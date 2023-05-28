public class Main {
    public static void main(String[] args) {
        // Criação do objeto "usuario1" da classe Usuario com nome e email
        Usuario usuario1 = new Usuario();
        usuario1.setNome("Javarlindo");
        usuario1.setEmail("javarlindo@inatel.br");

        // Criação dos objetos das redes sociais com suas respectivas senhas e número de amigos
        Facebook facebook1 = new Facebook();
        Twitter twitter1 = new Twitter();
        // Instagram instagram1 = new Instagram();
        //GooglePlus googlePlus1 = new GooglePlus();

        // Imprime informações do usuário
        System.out.println("==================================");
        System.out.println("Nome: " + usuario1.getNome());
        System.out.println("Email: " + usuario1.getEmail());
        System.out.println("==================================");

        // Adiciona as redes sociais ao usuário
        usuario1.Usuario(facebook1);
        usuario1.Usuario(twitter1);
        //  usuario1.Usuario(instagram1);
        //  usuario1.Usuario(googlePlus1);

        // Loop for para percorrer as redes sociais do usuário
        for (int i = 0; i < usuario1.redeSocial.length; i++) {
            if (usuario1.redeSocial[i] != null) { //Se diferente de null

                //Caso ocorra uma exceção durante a execução dos métodos ou criação dos objetos, o bloco catch correspondente será acionado
                // exibindo uma mensagem de erro e permiti tomar ações específicas para lidar com o problema.
                if (usuario1.redeSocial[i] instanceof Facebook) {
                    try {
                        //executa os metodos especificos do face
                        System.out.println("==================================");
                        Facebook face = (Facebook) usuario1.redeSocial[i];
                        face.postarFoto();
                        face.postarVideo();
                        face.fazStreaming();
                        System.out.println("----------------------------------");
                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro ao executar os métodos do Facebook: " + e.getMessage());
                    }

                    //Executa os metodos especificos do Twitter e trata exceção
                } else if (usuario1.redeSocial[i] instanceof Twitter) {
                    try {
                        Twitter tw = (Twitter) usuario1.redeSocial[i];
                        tw.curtirPublicacao();
                        tw.compartilhar();
                        tw.postarComentario();
                        System.out.println("----------------------------------");
                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro ao executar os métodos do Twitter: " + e.getMessage());
                    }

                    //Executa os metodos especificos do Google+ e trata exceção
                } else if (usuario1.redeSocial[i] instanceof GooglePlus) {
                    try {/* Exercicio solicitou para usuario utilizar duas redes sociais
                        GooglePlus google = (GooglePlus) usuario1.redeSocial[i];
                        google.fazStreaming();
                        google.compartilhar();
                        google.curtirPublicacao();
                        System.out.println("----------------------------------");*/
                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro ao executar os métodos do GooglePlus: " + e.getMessage());
                    }

                    //Executa os metodos especificos do Instagram e trata exceção
                } else if (usuario1.redeSocial[i] instanceof Instagram) {
                    try {
                       /* Exercicio solicitou para usuario utilizar duas redes sociais
                        Instagram insta = (Instagram) usuario1.redeSocial[i];
                        insta.postarComentario();
                        insta.postarVideo();
                        insta.postarFoto();
                        System.out.println("----------------------------------");*/
                    } catch (Exception e) {
                        System.out.println("Ocorreu um erro ao executar os métodos do Instagram: " + e.getMessage());
                    }
                }
            }
        }
    }
}
