import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Media media = new Media();

        System.out.print("Digite a nota da NP1: ");
        int np1 = input.nextInt();

        System.out.print("Digite a nota da NP2: ");
        int np2 = input.nextInt();

        int mediaFinal = media.calcularMedia(np1, np2);
      
        System.out.println("A média final é: " + mediaFinal);
        input.close();
    }
}
