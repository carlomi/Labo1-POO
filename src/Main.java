import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //EntradaYSalida();
        //HacerCondicional();
        int salir;

        do {
            salir = HacerSwitch();
        } while (salir != 1);
    }

    public static void HacerCondicional() {
        if (18 == 19) {
            System.out.println("Error lógico");
        } else if (10 > 11) {
            System.out.println("Error lógico");
        } else {
            System.out.println("Todo está bien");
        }
    }

    public static int HacerSwitch() {
        Scanner sc = new Scanner(System.in);
        int opcion, salir = 0;
        float a, b = 0;

        System.out.println("----Calculadora----");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Salir");
        System.out.println();
        System.out.println("Ingrese la opcion: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Suma");
                System.out.println("Ingrese el primer numero");
                a = sc.nextInt();

                System.out.println("Ingrese el segundo numero");
                b = sc.nextInt();

                System.out.println("El resultado de la suma es: " + (a+b));
                salir = 0;
                break;

            case 2:
                System.out.println("Resta");
                System.out.println("Ingrese el primer numero");
                a = sc.nextInt();

                System.out.println("Ingrese el segundo numero");
                b = sc.nextInt();

                System.out.println("El resultado de la resta es: " + (a-b));
                salir = 0;
                break;

            case 3:
                System.out.println("Multiplicacion");
                System.out.println("Ingrese el primer numero");
                a = sc.nextInt();

                System.out.println("Ingrese el segundo numero");
                b = sc.nextInt();

                System.out.println("El resultado de la multiplicacion es: " + (a*b));
                salir = 0;
                break;

            case 4:
                System.out.println("Division");
                System.out.println("Ingrese el primer numero");
                a = sc.nextInt();

                System.out.println("Ingrese el segundo numero");
                while (b == 0) {
                    b = sc.nextInt();

                    if (b == 0) {
                        System.out.println("Es imposible dividir entre 0. Intente otro numero: ");
                    }
                }

                System.out.println("El resultado de la division es: " + (a/b));
                salir = 0;
                break;

            case 5:
                System.out.println("Gracias por utilizar esta calculadora.");
                salir = 1;
                break;
        }

        return salir;
    }
    public static void EntradaYSalida() {
        System.out.println("Hello and welcome!");

        Scanner sc = new Scanner(System.in);

        System.out.println("Your Name: ");
        String nombre = sc.nextLine();

        System.out.println("Your age: ");
        int edad = sc.nextInt();
    }
}