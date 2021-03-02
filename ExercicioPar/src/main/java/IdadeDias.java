import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        IdadeFuncao id = new IdadeFuncao();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade em dias");
        int s  = scan.nextInt();
        id.setDias(s);

        System.out.println(id.getAnos() + " ano(s)");
        System.out.println(id.getMeses() + " Mes(es)");
        System.out.println(id.getDias() + " dia(s)");
    }
}
