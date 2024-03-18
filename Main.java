import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Calcular el promedio de un arreglo de números enteros. Realizar
        //variantes con arreglos ya inicializados e ingreso por teclado.
        int dim;
        int suma;
        int i;
        float promedio;

        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESE CANTIDAD DE NUMEROS A CARGAR\n");
        dim = scanner.nextInt();
        int[] arregloIngresado = new int[dim] ;

        System.out.println("Ingrese los elementos del arreglo");
        for (i = 0; i<dim; i++){
            System.out.println("INGRESE NUMERO EN POSICION: " + i);
            arregloIngresado[i] = scanner.nextInt();
        }

    Calcular calcular = new Calcular(arregloIngresado);

        suma = calcular.sacarSuma(arregloIngresado, dim);
        System.out.println("Suma: " + suma);
    }
}