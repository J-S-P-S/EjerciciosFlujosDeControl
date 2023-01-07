public class SentenciaSwitchBisiesto {

    public static void main(String[] args) {

        int mes = 2, numDias = 0, a = 2020; //pendiente pulir con interfaz grafica o pedir datos por consola

        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                if( a % 400 == 0 || ( a % 4 == 0) && !( a % 100 == 0)){
                    numDias = 29;
                } else{
                    numDias = 28;
                }
                break;
            default:
                numDias = 0;
        }
        System.out.println("Número de días = " + numDias);
    }

}