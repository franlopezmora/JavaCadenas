public class ReemplazSubcadenas {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        //Reemplazar subcadena ---
        String cadena2 = cadena.replace("Mundo", "a todos");
        System.out.println("cadena2 = " + cadena2);

        String cadena3 = cadena.replace("Hola", "Adios");
        System.out.println("cadena3 = " + cadena3);

        //Las cadenas son inmutables, ejecutar el metodo replace, simplemente crea un objeto nuevo, no modifica el original


    }
}
