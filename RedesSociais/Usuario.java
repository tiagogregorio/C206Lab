public class Usuario {
    private String nome; // Variável para armazenar o nome do usuário
    private String email; // Variável para armazenar o email do usuário
    RedeSocial[] redeSocial = new RedeSocial[100]; // Array de objetos RedeSocial para armazenar as redes sociais do usuário

    //#region Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //#endregion

    //#region Metodos
    public void Usuario(RedeSocial redeSocials) {
        try {
            for (int i = 0; i < redeSocial.length; i++) { // Percorre o array de redes sociais do usuário
                if (redeSocial[i] == null) { // Verifica se a posição atual está vazia
                    redeSocial[i] = redeSocials; // Adiciona a rede social fornecida na posição atual do array
                    if (redeSocial[i] instanceof Facebook) { // Verifica se a rede social é do tipo Facebook
                        System.out.println("Facebook criado com sucesso!"); // Imprime mensagem informando que o Facebook foi criado com sucesso
                        break; // Sai do loop
                    } else if (redeSocial[i] instanceof Twitter) { // Verifica se a rede social é do tipo Twitter
                        System.out.println("Twitter criado com sucesso!"); // Imprime mensagem informando que o Twitter foi criado com sucesso
                        break;
                    } else if (redeSocial[i] instanceof GooglePlus) { // Verifica se a rede social é do tipo GooglePlus
                        System.out.println("GooglePlus criado com sucesso!"); // Imprime mensagem informando que o GooglePlus foi criado com sucesso
                        break;
                    } else if (redeSocial[i] instanceof Instagram) { // Verifica se a rede social é do tipo Instagram
                        System.out.println("Instagram criado com sucesso!"); // Imprime mensagem informando que o Instagram foi criado com sucesso
                        break;
                    }
                    break; // Sai do loop
                }
            }
        } catch (Exception e) {
            // Tratamento de exceção
            System.out.println("Ocorreu um erro ao adicionar a rede social: " + e.getMessage());
        }
    }
    //#endregion
}
