public abstract class RedeSocial { //A Classe RedeSocial é abstrata
    //#region Atributos
    protected String senha;
    protected int numAmigos;
    //#endregion

    //#region construtores
    public RedeSocial(String senha, int numAmigos) {
        this.senha = senha;
        this.numAmigos = numAmigos;
    }
    //#endregion

    //#region Metodos publicos e abstratos (estao em italico na UML)
    abstract public void postarFoto(); // Método abstrato para postar foto

    abstract public void postarVideo(); // Método abstrato para postar vídeo

    abstract public void postarComentario(); // Método abstrato para postar comentário
    //#endregion

    //#region Metodo publico e NAO abstrato
    public void curtirPublicacao() {
        System.out.print("Curtiu uma publicacao "); // Método não abstrato para curtir uma publicação
    }
}    //#endregion

