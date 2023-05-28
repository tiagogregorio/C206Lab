public class Instagram extends RedeSocial {
    //#region reescritas de Metodos
    @Override
    public void postarFoto() {
        try {
            System.out.println("Postou uma foto no Instagram");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao postar a foto no Instagram: " + e.getMessage());
        }
    }

    @Override
    public void postarVideo() {
        try {
            System.out.println("Postou um vídeo no Instagram");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao postar o vídeo no Instagram: " + e.getMessage());
        }
    }

    @Override
    public void postarComentario() {
        try {
            System.out.println("Postou um comentário no Instagram");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao postar o comentário no Instagram: " + e.getMessage());
        }
    }

    @Override
    public void curtirPublicacao() {
        try {
            super.curtirPublicacao();
            System.out.println("no Instagram");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao curtir a publicação no Instagram: " + e.getMessage());
        }
    }
    //#endregion
}
