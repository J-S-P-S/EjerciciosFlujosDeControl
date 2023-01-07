public class SentenciasBucleEtiquetas {

    public static void main(String[] args) {


        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int k = 0; k < 5; k++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("i = " + i + ", k = " + k);
            }
        }

        System.out.println();
        System.out.println("Ejemplo 2");
        bucle2:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int k = 0; k < 5; k++) {
                if (i == 2) {
                    break bucle2;
                }
                System.out.print("i = " + i + ", k = " + k);
            }
        }

    }
}