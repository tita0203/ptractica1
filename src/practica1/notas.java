package practica1;
import java.util.Scanner;

/**
 * Clase que permite el ingreso de notas de un estudiante, realiza comprobaciones,
 * calcula la nota final y muestra los resultados.
 * 
 * @author TuNombre
 * @version 1.0
 */
public class notas {
    
    // Declaramos las variables necesarias
    private double uf1, uf2, uf3;  // Notas de las unidades formativas
    private double acu1, acu2, acu3, def; // Acumulados y nota definitiva
    
    // Scanner para la entrada de datos desde el teclado
    private Scanner entrada = new Scanner(System.in);
    
    /**
     * Método para ingresar las notas del estudiante.
     * Se solicita al usuario que introduzca las notas de tres unidades formativas.
     */
    public void IngresaNotas() {
        System.out.println("Ingrese las notas del estudiante");
        
        System.out.print("Ingrese nota 1: ");
        uf1 = entrada.nextDouble();

        System.out.print("Ingrese nota 2: ");
        uf2 = entrada.nextDouble();
        
        System.out.print("Ingrese nota 3: ");
        uf3 = entrada.nextDouble();
    }
    
    /**
     * Método para comprobar si las notas introducidas son correctas.
     * Se verifica que cada nota no supere el valor máximo permitido (10).
     */
    public void comprobarcion() {
        if (uf1 > 10) {
            System.out.println("Nota 1 mal introducida");
        } else {
            System.out.println("Nota 1 correcta");
        }
        
        if (uf2 > 10) {
            System.out.println("Nota 2 mal introducida");
        } else {
            System.out.println("Nota 2 correcta");
        }
        
        if (uf3 > 10) {
            System.out.println("Nota 3 mal introducida");
        } else {
            System.out.println("Nota 3 correcta");
        }
    }
    
    /**
     * Método para calcular la nota definitiva del estudiante.
     * Se aplica un porcentaje a cada nota para obtener la nota final.
     */
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;
        def = acu1 + acu2 + acu3;
    }
    
    /**
     * Método para mostrar las notas introducidas y la nota definitiva del estudiante.
     */
    public void Mostrar() {
        System.out.println("Notas introducidas son:");
        System.out.println("Nota 1 = " + uf1);
        System.out.println("Nota 2 = " + uf2);
        System.out.println("Nota 3 = " + uf3);
        
        System.out.println("Acumulado 1 = " + acu1);
        System.out.println("Acumulado 2 = " + acu2);
        System.out.println("Acumulado 3 = " + acu3);
        
        System.out.println("Nota definitiva = " + def);
    }

    /**
     * Método para determinar si el estudiante ha aprobado o suspendido.
     * Se muestra un mensaje indicando el resultado.
     */
    public void aprobado() {
        if (def < 5 && def >= 0) {
            System.out.println("Suspendió");
        } else {
            if (def >= 5 && def <= 10) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Error en las notas");
            }
        }
    }
    
    /**
     * Método principal que ejecuta el programa.
     * Llama a los métodos para ingresar, comprobar, calcular y mostrar las notas.
     * 
     * @param args Argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        // Creación del objeto notas para ejecutar los métodos
        notas fc = new notas();
        
        fc.IngresaNotas();
        fc.comprobarcion();
        fc.Calculonotas();
        fc.Mostrar();
        fc.aprobado();
    }
}
