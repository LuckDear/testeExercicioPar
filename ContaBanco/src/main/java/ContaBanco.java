import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {


        System.out.println("Bem vindo, Deseja abrir uma nova conta? (s/n)");
        Scanner scan = new Scanner(System.in);
        String i = scan.next();

       switch (i){
           case "s":
            Conta c1 = new Conta();
            System.out.println("digite o nome do dono da conta ");

            Scanner scan2 = new Scanner(System.in);
            String c = scan2.next();
            c1.setDono(c);

            System.out.println("Deseja abrir uma conta cc ou cp?");
            Scanner scan3 = new Scanner(System.in);
            String t = scan3.next();

            switch (t){
                case "cc": c1.abrirConta("cc");
                break;
                case "cp": c1.abrirConta("cp");
                break;
            }

            c1.setNumConta(1234);

               System.out.println("deseja fazer um saque? (S/N)");

            c1.estadoAtual();
            break;

           case "n":  System.out.println("Obrigado, volte sempre");
           break;
        }


    }
}
