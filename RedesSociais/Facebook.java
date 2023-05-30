public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    //#region reescritas de Metodos
    @Override
    public void postarFoto() {
        try {
            System.out.println("Postou uma foto no Facebook");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao postar a foto no Facebook: " + e.getMessage());
        }
    }

    @Override
    public void postarVideo() {
        try {
            System.out.println("Postou um vídeo no Facebook");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao postar o vídeo no Facebook: " + e.getMessage());
        }
    }

    @Override
    public void postarComentario() {
        try {
            System.out.println("Postou um comentário no Facebook");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao postar o comentário no Facebook: " + e.getMessage());
        }
    }

    @Override
    public void curtirPublicacao() {
        try {
            super.curtirPublicacao();
            System.out.println("no Facebook");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao curtir a publicação no Facebook: " + e.getMessage());
        }
    }

    @Override
    public void compartilhar() {
        try {
            System.out.println("Compartilhou uma publicação no Facebook");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao compartilhar a publicação no Facebook: " + e.getMessage());
        }
    }

    @Override
    public void fazStreaming() {
        try {
            System.out.println("Realizou uma videoconferência no Facebook");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao fazer a videoconferência no Facebook: " + e.getMessage());
        }
    }
    //#endregion
}
