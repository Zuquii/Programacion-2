public class buscarPalabra {
    public static void main(String args []){
        if (args.length != 2){
            System.out.println("Usar: java BuscarPalabra <texto> <palabra>");
        }

        String texto = args [0];
        String palabra = args [1];

        if (texto.contains(palabra)){
            System.out.println("La palabra "+palabra +" esta contenida en el texto.");
        } else { 
                System.out.println("La palabra " +palabra + " NO esta contenida en el texto.");
            }
    }
}