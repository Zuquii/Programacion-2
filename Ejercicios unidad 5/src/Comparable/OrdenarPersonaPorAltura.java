package Comparable;

import java.util.Comparator;

public class OrdenarPersonaPorAltura implements Comparator<Persona> {
    public int compare(Persona o1, Persona o2) {
        return o1.getAltura() - o2.getAltura();
    }
}
