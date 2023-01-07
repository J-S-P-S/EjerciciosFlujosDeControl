public class SentenciaSwitchCase {

    public static void main(String[] args) {

        byte n = 4;

        switch (n){

            case 0:
                System.out.println("El número es cero");
            break;

            case 1:
                System.out.println("El número es uno");
            break;

            case 2:
                System.out.println("El número es dos");
            break;

            case 3:
                System.out.println("El número es tres");
            break;

            default:
                System.out.println("Valor no reconocido");
        }

    }

}