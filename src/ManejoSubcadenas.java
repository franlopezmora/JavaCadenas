public class ManejoSubcadenas {
    public static void main(String[] args) {
        String cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
        String cadena2 = cadena1.substring(2,5);
        System.out.println("cadena2 = " + cadena2);
        
        //Ejercicio
        
        String cadena3 = cadena1.substring(0,4);
        System.out.println("cadena3 = " + cadena3);

        String cadena4 = cadena1.substring(5,10);
        System.out.println("cadena4 = " + cadena4);
    }
}
