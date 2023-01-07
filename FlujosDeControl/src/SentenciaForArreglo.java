import javax.swing.*;

public class SentenciaForArreglo {

    public static void main(String[] args) {

        String[] nombres = {"Andres","Pepe","Maria","Paco","Lalo","Bea","Pato","Pepa"};
        int count = nombres.length;
        boolean encontrado = false;

        for (int i = 0 ; i < count; i++){
            if (nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("pepa")){
                continue;
            }
            System.out.println("Nombre " + (i+1) + " = " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\": " );
        JOptionPane.showMessageDialog(null,buscar,"resultado",1);

        for (int i = 0; i < count; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null,"El nombre " + buscar + " fue encontrado","Encontrado!",1);
        } else {
            JOptionPane.showMessageDialog(null,"El nombre " + buscar + " no existe en el sistema!" ,"Error",0);
        }

    }
}