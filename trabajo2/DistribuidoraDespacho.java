import java.util.Scanner;

/**
 * The DistribuidoraDespacho class represents a program that calculates the cost of delivery for a vehicle purchase.
 * It prompts the user to enter information about the vehicle and the purchase, and then calculates the delivery cost
 * based on the business rules. Finally, it displays a summary of the entered data and the calculated cost.
 */
public class DistribuidoraDespacho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitud de datos del vehículo
        System.out.print("Ingrese la marca del vehículo: ");
        String marca = scanner.nextLine();
        
        System.out.print("Ingrese el modelo del vehículo: ");
        String modelo = scanner.nextLine();
        
        System.out.print("Ingrese la cilindrada del vehículo: ");
        String cilindrada = scanner.nextLine();
        
        System.out.print("Ingrese el tipo de combustible del vehículo: ");
        String combustible = scanner.nextLine();
        
        System.out.print("Ingrese la capacidad en pasajeros: ");
        int capacidadPasajeros = scanner.nextInt();
        
        // Solicitud de datos de la compra
        System.out.print("Ingrese el monto total de la compra: ");
        int montoCompra = scanner.nextInt();
        
        System.out.print("Ingrese la distancia en kilómetros del despacho: ");
        int distanciaKm = scanner.nextInt();
        
        // Calcular el costo de despacho según las reglas de negocio
        double costoDespacho = calcularCostoDespacho(montoCompra, distanciaKm);
        
        // Mostrar los datos ingresados y el resultado del cálculo
        System.out.println("\nResumen del Vehículo:");
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + combustible);
        System.out.println("Tiene una capacidad de " + capacidadPasajeros + " pasajeros.");
        
        System.out.println("\nDetalles de la Compra:");
        System.out.println("El monto de la compra es: $" + montoCompra);
        System.out.println("La distancia del despacho es: " + distanciaKm + " km");
        System.out.println("El costo del despacho es: $" + costoDespacho);
    }

    // Método para calcular el costo de despacho según las reglas de negocio
    public static double calcularCostoDespacho(int monto, int distancia) {
        if (monto >= 50000 && distancia <= 20) {
            return 0; // Despacho gratuito dentro de 20 km
        } else if (monto >= 25000) {
            return distancia * 150; // Tarifa de $150 por kilómetro
        } else {
            return distancia * 300; // Tarifa de $300 por kilómetro
        }
    }
}
