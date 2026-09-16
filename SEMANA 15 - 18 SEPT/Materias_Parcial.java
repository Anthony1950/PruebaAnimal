import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class Materias_Parcial {
  
    public static void main(String[] args) {
    List<String> Materias = new ArrayList<>();    //Creo la lista de materias


    //Agrego las materias a la lista


    Materias.add("PilotoMatemáticas");
    Materias.add("PilotoFísica");
    Materias.add("PilotoQuímica");
    Materias.add("PilotoBiología");
   
//agrego la lista fija de proveedor, osea un array
    String [] Proveedor={"Filosofia","Calculo","Programacion","Ingles"};
   
   //Para poder unir las dos listas, se debe convertir en ArrayList la del proveedor
   
    List <String> MateProveedor =Arrays.asList(Proveedor);

    //Para poder unir las dos listas, se debe convertir en ArrayList la del proveedor
    List<String> Consolidado =new ArrayList<>(Materias);
        
    //Uno las dos listas en una sola, esta es la que falta    
    Consolidado.addAll(MateProveedor);

    
    // Muestro la lista del consolidado de todas las materias
    System.out.println("\nLista del Consolidado");
        Consolidado.forEach(System.out::println);

    
    ListIterator<String> iterador = Consolidado.listIterator();
    while (iterador.hasNext()) {
    String materia = iterador.next();
    System.out.println("Materia: " + materia);

    // Convertimos a minúsculas para evitar problemas con mayúsculas/minúsculas
    // y validamos tanto con tilde como sin tilde
    String materiaMinuscula = materia.toLowerCase();
    
    if (materiaMinuscula.startsWith("piloto") || materiaMinuscula.startsWith("píloto")) {
        iterador.remove();
        System.out.println("\nSe eliminó \"" + materia + "\"");


        

}   } } }
