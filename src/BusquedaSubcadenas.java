public class BusquedaSubcadenas {
    public static void main(String[] args) {
        //indexOf ---- Devuelve el indice de la primera aparicion de la subcadena buscada
        String cadena1 = "Mundo";
        int indiceAparacion = cadena1.indexOf(" M");
        System.out.println("indiceAparacion = " + indiceAparacion);

        // lastIndexOf ---- Devuelve el indice de la ultima aparicion de la subcadena
        int ultimoIndice = cadena1.lastIndexOf("Hola");
        System.out.println("ultimoIndice = " + ultimoIndice);
    }
}
