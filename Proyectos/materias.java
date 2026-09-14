import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class materias {
    public static void main(String[] args) {
    List<String> Materias = new ArrayList<>();    

    Materias.add("PilotoMatemáticas");
    Materias.add("PilotoFísica");
    Materias.add("PilotoQuímica");
    Materias.add("PilotoBiología");
    Materias.add("Geografia");
    Materias.add("Ingles");
    Materias.add("Español");
    Materias.add("Programación");

    System.out.println("\nLista de Materias");
        Materias.forEach(System.out::println);



    ListIterator<String> iterador = Materias.listIterator();
while (iterador.hasNext()) {
    String materia = iterador.next();
    System.out.println("Materia: " + materia);

    // Convertimos a minúsculas para evitar problemas con mayúsculas/minúsculas
    // y validamos tanto con tilde como sin tilde
    String materiaMinuscula = materia.toLowerCase();
    
    if (materiaMinuscula.startsWith("piloto") || materiaMinuscula.startsWith("píloto")) {
        iterador.remove();
        System.out.println("\nSe eliminó \"" + materia + "\". Lista actualizada: " + Materias);
    }
}    

    
    }
}
