import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class fruteria {
    public static void main(String[] args) {
    List<String> InventarioBase = new ArrayList<>();    

    InventarioBase.add("Manzana");
    InventarioBase.add("Pera");
    InventarioBase.add("Naranja");
    InventarioBase.add("Fresa");
    InventarioBase.add("Mango");

    String [] Inventario2={"Mango","Pera","Mora","Guayaba"};
    List <String> ListaInventario2 =Arrays.asList(Inventario2);


    List<String> Consolidado =new ArrayList<>(InventarioBase);
        
        //ADICIONAR ELEMENTOS DE OTRA COLECCION
        Consolidado.addAll(ListaInventario2);

    System.out.println("\nLISTA DE Inventario2");
        ListaInventario2.forEach(System.out::println);
        System.out.println("\nLISTA DE Consolidado");
        Consolidado.forEach(System.out::println);
        System.out.println("\nLISTA InventarioBase");
        InventarioBase.forEach(System.out::println);

System.out.println("\nLISTA PRESENTADA A TRAVES DEL METODO ListIterator");
        

        ListIterator<String> iterador = InventarioBase.listIterator();
        while (iterador.hasNext()) {
            String fruta = iterador.next();
            System.out.println("Fruta:" + fruta);

            if (fruta.equals("Mango")) {
                iterador.remove();
                System.out.println("\nSe eliminó \"" + fruta + "\". Lista actualizada: " + InventarioBase);
            }
        }
    }
}
        
        
        


