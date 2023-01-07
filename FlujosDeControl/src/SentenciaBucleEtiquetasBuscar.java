public class SentenciaBucleEtiquetasBuscar {

    public static void main(String[] args) {

        String frase = "trigo tres tristes tigres tragan trigotrigo en un trigaltrigo", palabra = "trigo";
        int maxFrase = frase.length(), maxPalabra = palabra.length(), cantidad = 0, k = 0;
        char letra = 'g';


        System.out.println("Contar la cantidad de veces que aparece la letra/caracter t");

        for (int i = 0; i < maxFrase; i++) {
            if ( frase.charAt(i) != letra ){
                continue;
            }
            cantidad++;
        }

        System.out.println("Encontrado = " + cantidad + " veces la letra/caracter " + letra + " en la frase");


        System.out.println();
        System.out.println("Contar la cantidad de veces que se repite una palabra en la frase");

        cantidad = 0;
        maxFrase = frase.length() - maxPalabra + 1; //se utiliza para saltar entre cada iteración una vez se encuentra la palaraba y no volver a recorrer caracter por caracter la misma palabra, para optimizar

        buscar: for (int i = 0; i < maxFrase;) {
            k = i;
            for (int j = 0; j < maxPalabra; j++){
                if (frase.charAt(k++) != palabra.charAt(j)){ //se utiliza la k para iterar la frase sin alterar el clico principal/padre del for int i = 0
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;
        }
        /*Palabra a buscar (trigo), frase (trigo tres tristes), resultado compara la palabra trigo con la frase,
        * pero cada vez que encuentra la palabra (trigo) salta al siguiente carácter de la frase
        * Así se optimiza más la búsqueda y el código al no comparar carácter por carácter de la frase con
        * la palabra a buscar, en cambio, realiza la comparación y si encuentra la palabra avanza a comparar con
        * el resto de caracteres de la frase y se evita repeticiones en la comparación.*/

        System.out.println("Se encontró = " + cantidad + " veces la palabra "+ palabra + " en la frase" );

    }

}