public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    //#region reescritas de Metodos
    @Override
    public void postarFoto() {
        try {
            System.out.println("Postou uma foto no Google+");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao postar a foto no Google+: " + e.getMessage());
        }
    }

    @Override
    public void postarVideo() {
        try {
            System.out.println("Postou um vídeo no Google+");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao postar o vídeo no Google+: " + e.getMessage());
        }
    }

    @Override
    public void postarComentario() {
        try {
            System.out.println("Postou um comentário no Google+");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao postar o comentário no Google+: " + e.getMessage());
        }
    }

    @Override
    public void curtirPublicacao() {
        try {
            super.curtirPublicacao();
            System.out.println("no Google+");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao curtir a publicação no Google+: " + e.getMessage());
        }
    }

    @Override
    public void compartilhar() {
        try {
            System.out.println("Compartilhou uma publicação no Google+");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao compartilhar a publicação no Google+: " + e.getMessage());
        }
    }

    @Override
    public void fazStreaming() {
        try {
            System.out.println("Realizou uma videoconferência no Google+");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao fazer a videoconferência no Google+: " + e.getMessage());
        }
    }
    //#endregion
}
