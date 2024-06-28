import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
public class Entrada {


        public static void main(String[] args) {
            try {

                InputStream inputStream = Entrada.class.getResourceAsStream("/resources/ejercicio1.txt");

                if (inputStream != null) {

                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));

                    int character;
                    while ((character = reader.read()) != -1) {
                        char ch = (char) character;
                        System.out.println("Carácter: " + ch + " | Código ASCII: " + character);
                    }

                    reader.close();
                } else {
                    System.err.println("No se encontró el archivo.");
                }
            } catch (Exception e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        }
    }



