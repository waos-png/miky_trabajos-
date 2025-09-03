package Dandadan;
import java.util.Scanner;

public class main_dandadan {
    public static void main(String[] args) {
        personajes momo = new Momo("Momo Ayase", 16);
        personajes okarun = new Okarun("Okarun", 16);
        personajes jiji = new Jiji("Jiji", 16, "caliente");
        personajes aira = new Aira("Aira Shiratori", 17);

        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n______________________________");
            System.out.println("      MENU DANDADAN");
            System.out.println("______________________________");
            System.out.println("  1. Elegir personaje y ver accion");
            System.out.println("  2. Mostrar descripcion de todos");
            System.out.println("  3. Salir");
            System.out.println("______________________________");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\n___ Elige un personaje ___");
                    System.out.println("  1. Momo");
                    System.out.println("  2. Okarun");
                    System.out.println("  3. Jiji");
                    System.out.println("  4. Aira");
                    System.out.print("Opcion: ");
                    int p = sc.nextInt();
                    if (p == 1) momo.accion();
                    else if (p == 2) okarun.accion();
                    else if (p == 3) jiji.accion();
                    else if (p == 4) aira.accion();
                    else System.out.println("Opcion no valida");
                    break;
                case 2:
                    System.out.println("\n______________________________");
                    System.out.println("  DESCRIPCION DE PERSONAJES");
                    System.out.println("______________________________");
                    System.out.print("Momo: ");
                    momo.mostrarInfo();
                    System.out.print("Okarun: ");
                    okarun.mostrarInfo();
                    System.out.print("Jiji: ");
                    jiji.mostrarInfo();
                    System.out.print("Aira: ");
                    aira.mostrarInfo();
                    break;
                case 3:
                    System.out.println("\nSaliendo...");
                    break;
                default:
                    System.out.println("\nOpcion no valida");
            }
        } while (opcion != 3);

        sc.close();
    }
}