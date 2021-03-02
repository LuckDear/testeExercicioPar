import java.util.Scanner;

public class ExercicioPar {
    public static void main(String[] args) {
        Par p = new Par();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número");
        p.setFuncao(scan.nextInt());
        System.out.println("Os números pares são " + p.getS());

    }
}
