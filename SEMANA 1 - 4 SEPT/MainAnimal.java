public class MainAnimal {
    public static void main(String[] args) {
        
        
        Animal a1 = new Animal("Firulais", "Perro", 3, "Guau");
        Animal a2 = new Animal("Michi", "Gato", 2, "Miau");
        Animal a3 = new Animal("Nemo", "Pez", 1, "Blub");
        Animal a4 = new Animal("Dumbo", "Elefante", 5, "Jummmmpp");
        Animal a5 = new Animal("Polly", "Loro", 4, "Quiere cacao");

        System.out.println("=== PASO 3: Objetos creados ===");
        a1.mostrarInfo();
        a2.mostrarInfo();
        a3.mostrarInfo();
        a4.mostrarInfo();
        a5.mostrarInfo();
    
        System.out.println("\n=== PASO 4: Referencia vs valor ===");
        Animal copia = a1;       // copia es una SEGUNDA LLAVE hacia el MISMO objeto
        copia.nombre = "Max";

        System.out.println("Que imprime a1.nombre? Predigan antes de ver:");
        System.out.println("a1.nombre = " + a1.nombre);


        System.out.println("\n=== PASO 5-6: Enlazando los animales ===");
        a1.siguiente = a2;
        a2.siguiente = a3;
        a3.siguiente = a4;
        a4.siguiente = a5;
        a5.siguiente = null; // El último animal apunta a null

        System.out.println("Recorriendo la cadena desde a1:");
        Animal actual = a1;
        while (actual != null) {    
            actual.mostrarInfo();
            actual = actual.siguiente;
        }   
        System.out.println("Llegamos a 'null': no hay mas animales encadenados.");
    
    
    }
}