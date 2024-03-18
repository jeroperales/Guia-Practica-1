public class Calcular {
    private int arreglo[];

    public Calcular(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public int sacarSuma(int[] arreglo, int dim) {
        int i = 0;
        int suma = 0;
        while (i < dim) {
            suma = suma + arreglo[i];
            i++;
        }
        return suma;
    }

    public float sacarPromedio(int suma, int dim)
    {
        float sumador = 0;
        sumador = suma / dim;

        return sumador;
    }
    }
