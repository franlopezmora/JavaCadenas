public class Ejercicio_GeneradorDeEmail {
    public static void main(String[] args) {
        String nombre = "Francisco";
        String apellido = "Lopez";
        String empresa = "Globant SA";
        String dominio = "com";

        nombre = nombre.toLowerCase();
        System.out.println("nombre = " + nombre);
        apellido = apellido.toLowerCase();
        System.out.println("apellido = " + apellido);
        apellido = apellido.replace(" ", ".");
        System.out.println("apellido = " + apellido);

        empresa = empresa.toLowerCase();
        empresa = empresa.replace(" ", "");
        System.out.println("empresa = " + empresa);


        String resultado = nombre + "." + apellido + "@" + empresa + dominio;
        System.out.println("resultado = " + resultado);
    }
}
