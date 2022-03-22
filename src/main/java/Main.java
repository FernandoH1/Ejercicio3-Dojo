import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int coeficiente=0, potencia=0 ,numero=0, xc=0, xp=0;
        derivada(coeficiente,potencia,numero,xc,xp);
    }

    public static void derivada(int coeficiente, int potencia, int numero, int xc, int xp){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Derivar funciones de la forma ax^b \n");
        do {
            System.out.println("Escribe el coeficiente:");
            coeficiente = teclado.nextInt();
            System.out.println("Escribe la potencia:");
            potencia = teclado.nextInt();
            xc = coeficiente * potencia;
            xp = potencia - 1;
            System.out.println("La derivada es: " + xc + "x^" + xp + "\n");
            System.out.println("Sacar otra derivada 1-SI / 2-NO");
            numero = teclado.nextInt();
        }
        while (numero == 1);
    }




}

