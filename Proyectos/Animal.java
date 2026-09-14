public class Animal {
    String nombre;
    String especie;
    int edad;
    String sonido;

    Animal siguiente; 
    
    Animal(String nombre, String especie, int edad, String sonido) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.sonido = sonido;
        this.siguiente = null; 
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Especie: " + especie 
                + " | Edad: " + edad + " | Sonido: " + sonido);
    }

}
