
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        int[] vetorA = new int[6];
        int[] vetorB = new int[6];

        System.out.println("Informe os 6 valores do primeiro vetor: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = teclado.nextInt();

        }
        System.out.println("Informe os 6 valores do segundo vetor: ");
        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = teclado.nextInt();

        }
        teclado.close();

        Set<Integer> setA = new HashSet<>();
        Set<Integer> intersecao = new HashSet<>();

        for (int num : vetorA) {
            setA.add(num);
        }

        for (int num : vetorB) {
            if (setA.contains(num)) {
                intersecao.add(num);
            }
        }

        System.out.println("Vetor C (intersecao de A e B): ");
        if (intersecao.isEmpty()) {
            System.out.println("Nenhum elemento comum encontrado.");
        } else {
            for (int num : intersecao) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
