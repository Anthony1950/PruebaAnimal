import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Consultorio {
    public static void main(String[] args) {
        List<String> Fila = new ArrayList<>();

        // 1. Lista de al menos 5 pacientes
        Fila.add("Paciente 1 (Ana)");
        Fila.add("Paciente 2 (Beto)");
        Fila.add("Paciente 3 (Carlos)");
        Fila.add("Paciente 4 (Diana)");
        Fila.add("Paciente 5 (Elena)");

        System.out.println("--- Reporte de posiciones (Orden de llegada) ---");
        ListIterator<String> iterador = Fila.listIterator();
        
        // Recorrido hacia adelante
        while (iterador.hasNext()) {
            // nextIndex() nos da el índice (0,1,2...). Le sumamos 1 para que sea más humano.
            int posicion = iterador.nextIndex() + 1; 
            String paciente = iterador.next();
            System.out.println("Posición " + posicion + ": " + paciente);
        }

        System.out.println("\n--- Reporte invertido (Llegaron más reciente) ---");
        // El bucle anterior dejó el "cursor" al final de la lista. 
        // Ahora usamos hasPrevious() para ir en reversa.
        while (iterador.hasPrevious()) {
            String paciente = iterador.previous();
            System.out.println(paciente);
        }

        // Después del bucle en reversa, el cursor volvió al principio (índice 0).
        // Nos piden insertar JUSTO DESPUÉS de la segunda persona.
        // Avanzamos el cursor 2 espacios:
        iterador.next(); // Saltamos a Ana
        iterador.next(); // Saltamos a Beto

        // Insertamos usando el método del iterador, NO el de la lista
        iterador.add("Paciente Urgencia (Zack)");

        System.out.println("\n--- Fila final actualizada ---");
        Fila.forEach(System.out::println);
        
        System.out.println("\n**Explicación del Entregable:**");
        System.out.println("El paciente insertado terminó en la posición 3 (índice 2). Al hacer iterador.next() dos veces, el cursor quedó estacionado exactamente entre la segunda y la tercera persona. El método iterador.add() inyecta el dato justo en esa grieta, desplazando a los demás sin borrar a nadie.");
    }
}

