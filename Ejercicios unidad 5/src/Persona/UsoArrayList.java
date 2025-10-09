package Persona;

import java.util.ArrayList;

public class UsoArrayList {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Persona per1,per2,per3;
        per1 = new Persona("43546523","Rozales","Eduardo","23/12/03");
        per2 = new Persona("43546523","Rozales","Eduardo","23/12/03");
        per3 = new Persona("43546523","Rozales","Eduardo","23/12/03");

        personas.add(per1);
        personas.add(per2);
        personas.add(per3);

        System.out.println(personas.size());
        System.out.println(personas.toString());
        personas.get(1).setApellido("Fernandez");
        System.out.println(personas.get(1).getApellido());

        for(int contador = 1; contador < personas.size(); contador++){
            System.out.println(personas.get(contador));
        }
    }
}
