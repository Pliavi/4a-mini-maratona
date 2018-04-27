
public class Cedula {
    
    String linhas;
    double valor;
    int[] contagem = new int[7];
    int[] notas = {100, 50, 20, 10, 5, 2, 1};
    PrintWriter out = new PrintWriter("cedula.out", "UTF-8");
    Scanner in = new Scanner(new FileReader("cedula.in"));

    public static void main(String[] args) {
        while(in.hasNext()) {
            linhas = Integer.parseInt(in.next());
            if(linhas = 0) break;

            for(int i = 0; i < linhas; i++) {
                valor = Double.parseDouble(in.next());

                for(int j = 0; j < 7; j++){
                    contagem[j] = valor / notas[j];
                    valor -= contagem[j] * notas[j];
                }
            }

            out.println(
                String.format(
                    "%i %i %i %i %i %i %i",
                    contagem[0],
                    contagem[1],
                    contagem[2],
                    contagem[3],
                    contagem[4],
                    contagem[5],
                    contagem[6]
                )
            )

        }

        in.close();
        out.close();
    }
}