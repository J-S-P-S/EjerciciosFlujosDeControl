public class SentenciaForEach {

    public static void main(String[] args) {

        int[] n = {1,3,5,7,9,11,13,15};
        String[] nombres = {"Andres","Pepe","Maria","Paco","Lalo","Bea","Pato","Pepa"};

        for(int num:n){
            System.out.println(" num = " + num);
        }

        for(String name:nombres){
            if(name.equalsIgnoreCase("pepa")) {
                System.out.print(name + ".");
            } else{
                System.out.print(name + ", ");
            }
        }

    }

}