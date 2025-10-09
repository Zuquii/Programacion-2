package Iterator;
import java.util.*;

public class UsoIterator {
    public static void main(String [] args) {
        ArrayList<String>ejemplo = new ArrayList<String>();

        ejemplo.add("manzana");
        ejemplo.add("banana");
        ejemplo.add("pera");
        ejemplo.add("kiwi");

        //While
        Iterator<String>it = ejemplo.iterator();
        while (it.hasNext()){
            System.out.println("Fruta: "+it.next());
        }
        System.out.println("---------------------------------------------------");

        //For
        for(Iterator <String> it2 = ejemplo.iterator(); it2.hasNext();){
            System.out.println("Fruta: "+it2.next());
        }
        System.out.println("------------------------------------------------");

        System.out.println("Recorrido inverso.");

        //Usando for
        for (int i = ejemplo.size() - 1; i >= 0; i--) {
            System.out.println("Fruta: " + ejemplo.get(i));
        }
        System.out.println("------------------------------------------------");

        //Usando ListIterator
        ListIterator<String> listIt = ejemplo.listIterator(ejemplo.size());

        while (listIt.hasPrevious()){
            System.out.println("Fruta: " + listIt.previous());
        }
        System.out.println("----------------------------------------------");
    }
}
