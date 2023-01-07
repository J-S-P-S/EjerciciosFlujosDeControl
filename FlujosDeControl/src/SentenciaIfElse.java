public class SentenciaIfElse {

    public static void main(String[] args) {

        float promedio = 7.2f;

        /*if(promedio >= 6.5) // La estructura del if else permite omitir escribir las llaves, solamente si se va a ejecutar una sola linea de código.
            System.out.println("Felicitaciones, excelente promedio!");
        else
            System.out.println("Necesitas esforzarte un poco más!");
        */
        if(promedio >= 6.5)
            System.out.println("Felicitaciones, excelente promedio!");
         else if (promedio >= 6.0)
            System.out.println("Muy buen promedio!");
         else if (promedio >= 5.5)
            System.out.println("Buen promedio!");
         else if (promedio >= 5.0)
            System.out.println("Regular, necesitas esforzarte un poco más!");
         else if (promedio >= 4.0)
            System.out.println("Insuficiente, necesitas estudiar más!");
         else
            System.out.println("Reprobado");
        System.out.println("El promedio es: " + promedio);
    }

}