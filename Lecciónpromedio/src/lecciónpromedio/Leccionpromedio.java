/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecciónpromedio;

/**
 *
 * @author SARANGO
 */
public class Leccionpromedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables a utilizar.
        int[] arreglo1 = {110, 220, 430, 140, 250, 460};
        int[] arreglo2 = {10, 20, 30, 40, 50, 60};
        double promedio, promedio_final = 0;
        String reporte;
        double[] arreglo3 = new double[arreglo1.length];
        //Creando cabezera de reporte.
        reporte = String.format("%-16s%-16s%-16s\n", "Arreglo1", "Arreglo2", "Resultado");
        //Este for recorre los arreglos  y obtiene el promedio guardandolo en el  arreglo3
        for (int contador = 0; contador < arreglo1.length; contador++) {
            promedio = (arreglo1[contador] + arreglo2[contador]) / 2;
            arreglo3[contador] = promedio;
            promedio_final = arreglo3[contador] + promedio_final;
            reporte = String.format("%s%-16d%-16d%-16.2f\n", reporte, arreglo1[contador], arreglo2[contador], arreglo3[contador]);
        }
        promedio_final = promedio_final / arreglo3.length;
        //Imprime reporte.
        reporte = String.format("%s\nEl Promedio del arreglo 3 es: %.2f", reporte, promedio_final);
        System.out.println(reporte);
    }

}
