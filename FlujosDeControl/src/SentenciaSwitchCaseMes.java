public class SentenciaSwitchCaseMes {

    public static void main(String[] args) {
        //pendiente pedir datos por consola o interfaz grafica
        int mes = 1;
        String nmes = "";

        switch (mes){

            case 1:
                nmes = "Enero";
            break;

            case 2:
                nmes = "Febrero";
            break;

            case 3:
                nmes = "Marzo";
            break;

            case 4:
                nmes = "Abril";
            break;

            case 5:
                nmes = "Mayo";
            break;

            case 6:
                nmes = "Junio";
            break;

            case 7:
                nmes = "Julio";
            break;

            case 8:
                nmes = "Agosto";
            break;

            case 9:
                nmes = "Septiembre";
            break;

            case 10:
                nmes = "Octubre";
            break;

            case 11:
                nmes = "Noviembre";
            break;

            case 12:
                nmes = "Diciembre";
            break;

            default:
                nmes = "Indefinido";
        }

        System.out.println("Mes : " + nmes);

    }
}