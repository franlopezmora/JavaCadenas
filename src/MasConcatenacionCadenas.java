public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        //Mas formas de concatenar cadenas en Java

        String cadena1 = "Hola";
        String cadena2 = "Mundo";
        String cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);

        // Metodo concat
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena3 = " + cadena3);

        // Usando el Metodo StringBuilder
        StringBuilder constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);

        System.out.println("constructorCadenas = " + constructorCadenas);

        String resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        System.out.println("stringBuffer = " + stringBuffer);

        String stringBuffer1 = stringBuffer.toString();
        System.out.println("stringBuffer1 = " + stringBuffer1);

        stringBuffer1 = String.join(" ", cadena1, cadena2);
        System.out.println("stringBuffer1 = " + stringBuffer1);
    }
}
