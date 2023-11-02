import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("pensar", "think");
        diccionario.put("mirar", "look");
        diccionario.put("bueno", "good");
        diccionario.put("tomar", "take");
        diccionario.put("saber", "know");
        diccionario.put("gustar", "like");
        diccionario.put("puede", "can");
        diccionario.put("hacer", "make");
        diccionario.put("obtener", "get");
        diccionario.put("afuera", "out");
        diccionario.put("copiar", "Copy");
        diccionario.put("llorar", "Cry");
        diccionario.put("bailar", "Dance");
        diccionario.put("adivinar", "Guess");
        diccionario.put("suceder", "Happen");
        diccionario.put("ayudar", "Help");
        diccionario.put("imaginar", "Imagine");
        diccionario.put("matar", "Kill");
        diccionario.put("besar", "Kiss");
        diccionario.put("jugar", "Play");
        // Agrega aquí más palabras al diccionario

        ArrayList<String> palabra = seleccionarPalabrasAleatorias(diccionario, 5);

        int Correctas = 0;
        int Incorrectas = 0;

        Scanner scanner = new Scanner(System.in);

        for (String palabraEsp : palabra) {
            String palabraIngles = diccionario.get(palabraEsp);
            System.out.println("Traduce la palabra '" + palabraEsp + "' al inglés: ");
            String respuestaUsuario = scanner.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(palabraIngles)) {
                System.out.println("¡Correcto!");
                Correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + palabraIngles);
                Incorrectas++;
            }
        }

        System.out.println("Respuestas correctas: " + Correctas);
        System.out.println("Respuestas incorrectas: " + Incorrectas);
    }

    public static ArrayList<String> seleccionarPalabrasAleatorias(HashMap<String, String> diccionario, int numPalabras) {
        ArrayList<String> palabra = new ArrayList<>(diccionario.keySet());
        Collections.shuffle(palabra);
        return new ArrayList<>(palabra.subList(0, numPalabras));
    }
}