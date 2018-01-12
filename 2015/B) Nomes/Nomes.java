import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Stream;

public class Nomes {

    private static String ioFile = "nomes";
    private static ArrayList<String> result = new ArrayList<>();
    private static boolean stopOnZero = true;

    // Seguindo o scaffold, todo o processo de produção de resultado acontece
    // aqui, nenhum outro método é alterado
    public static void process(String line, Iterator<String> lines) {
        Set<String> chars = new HashSet<>(Arrays.asList(line.split("")));

        chars.forEach(System.out::println);
        
        // do{
        //     $line = fgets($in);
        //     $characters = str_split(rtrim($line));
          
        //     $index = array_search(" ", $characters);
        //     unset($characters[$index]);
          
        //     sort($characters);
        //     $characters = array_count_values($characters);
        //     foreach ($characters as $character => $count) {
        //       if($character != " "){
        //         fwrite($out, "$character $count ");
        //       }
        //     }
        //     fwrite($out, "\n");
        //   } while($line != "0");
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