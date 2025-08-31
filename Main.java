// Importar la clase Scanner del paquete java.util para poder leer entradas de usuario desde la consola
import java.util.Scanner;

// Crear clase principal llamada Main
public class Main {
    // Método principal: punto de entrada del programa
    public static void main(String[] args) {

        // Crear objeto Scanner para leer entradas desde la consola
        Scanner sc = new Scanner(System.in);

        // ------------------- Bloque A: Nombre y edad -------------------

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");
        // Leer el nombre ingresado y almacenarlo en la variable "nombre"
        String nombre = sc.nextLine();

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        // Leer la edad ingresada y almacenarla en la variable "edad"
        int edad = sc.nextInt();
        // Limpiar el buffer de entrada para evitar errores en la próxima lectura de texto
        sc.nextLine();

        // Mostrar en consola los datos ingresados: nombre y edad
        System.out.println("Nombre ingresado: " + nombre);
        System.out.println("Edad ingresada: " + edad);

        // ------------------- Bloque B: Datos del vehículo -------------------

        // Solicitar al usuario que ingrese la marca del vehículo
        System.out.print("Ingrese la marca: ");
        // Leer la marca ingresada y almacenarla en la variable "marca"
        String marca = sc.nextLine();

        // Solicitar al usuario que ingrese el modelo del vehículo
        System.out.print("Ingrese el modelo: ");
        // Leer el modelo ingresado y almacenarlo en la variable "modelo"
        String modelo = sc.nextLine();

        // Solicitar al usuario que ingrese la cilindrada del vehículo
        System.out.print("Ingrese la cilindrada: ");
        // Leer la cilindrada ingresada y almacenarla en la variable "cilindrada"
        int cilindrada = sc.nextInt();
        // Limpiar el buffer de entrada nuevamente
        sc.nextLine();

        // Solicitar al usuario que ingrese el tipo de combustible
        System.out.print("Ingrese el tipo de combustible: ");
        // Leer el combustible ingresado y almacenarlo en la variable "combustible"
        String combustible = sc.nextLine();

        // Solicitar al usuario que ingrese la capacidad de pasajeros
        System.out.print("Ingrese la capacidad de pasajeros: ");
        // Leer el valor ingresado y almacenarlo en la variable "capacidad"
        int capacidad = sc.nextInt();

        // ------------------- Salida de resultados -------------------

        // Mostrar en consola todos los datos ingresados por el usuario
        System.out.println("\nLa marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        // Cerrar el objeto Scanner (buena práctica para liberar recursos)
        sc.close();
    }
}
