package kata4;

import java.io.File;

public class KATA4 {

    public static void main(String[] args) {

        File file = new File("c:\\pub\\tmp");

        // llamamos al procedimiento print
        print(file.listFiles(), ""); //listFile -> array de ficheros
    }

    private static void print(File[] files, String indent) {

        // si es vacia o nual que salga
        if (files == null) {
            return;
        }
        for (File file : files) {
            //imprimimos el indent y comprobamos si es un directorio
                // si es asi +, sino -
            System.out.println(indent
                    + (file.isDirectory() ? "+" : "-") + file.getName());

            // si no es un directorio o está oculto que pase a la siguiente
            if (!file.isDirectory() || file.isHidden()) {
                continue;
            }
            //llamada recursiva
            print(file.listFiles(), indent +"  ");
        }
    }
}
