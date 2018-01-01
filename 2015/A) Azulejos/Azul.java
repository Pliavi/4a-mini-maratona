import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Azul {

    private static String ioFile = "azul";
    private static ArrayList<String> result = new ArrayList<>();
    private static boolean stopOnZero = true;

    public static void process(String line, Iterator<String> lines) {
        int conjuntos = 0;
        int total = Integer.parseInt(line);
        int azulejos = total;

        while(azulejos > 3){
            double raiz = Math.sqrt(azulejos);

            if ((int) raiz == raiz){
                azulejos = total - azulejos;
                total = azulejos;
                conjuntos++;
            } else {
                azulejos--;
            }
        }
      
        conjuntos += azulejos;
        result.add(String.valueOf(conjuntos));

        System.out.println(conjuntos);
    }

    public static void main(String ... args) {
        try {
            Stream<String> lineStream = getFileStream(ioFile + ".in");
            Iterator<String> lines = lineStream.iterator();

            while(lines.hasNext()){
                String nextLine = lines.next().trim();
                if(stopOnZero && !nextLine.equals("0")){
                    process(nextLine, lines);
                }
            }

            writeFile(ioFile + ".out", result);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void writeFile(String filename, List<String> lines) throws IOException {
        Files.write(Paths.get(filename), lines, UTF_8);
    }

    public static Stream<String> getFileStream(String filename) throws IOException {
        Stream<String> stream = 
            Files.lines(Paths.get(filename));

        return stream;
    }

}