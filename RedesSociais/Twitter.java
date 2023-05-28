public class Twitter extends RedeSocial implements Compartilhamento {
    @Override
    public void postarFoto() {
        try {
            System.out.println("Postou uma foto no Twitter");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao postar a foto no Twitter: " + e.getMessage());
        }
    }

    @Override
    public void postarVideo() {
        try {
            System.out.println("Postou um vídeo no Twitter");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao postar o vídeo no Twitter: " + e.getMessage());
        }
    }

    @Override
    public void postarComentario() {
        try {
            System.out.println("Postou um comentário no Twitter");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao postar o comentário no Twitter: " + e.getMessage());
        }
    }

    @Override
    public void curtirPublicacao() {
        try {
            super.curtirPublicacao();
            System.out.println("no Twitter");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao curtir a publicação no Twitter: " + e.getMessage());
        }
    }

    @Override
    public void compartilhar() {
        try {
            System.out.println("Compartilhou uma publicação no Twitter");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao compartilhar a publicação no Twitter: " + e.getMessage());
        }
    }
}
