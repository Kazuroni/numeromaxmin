package numeromaxmin;

import java.util.Random;

public class numero{

    public static void main(String[] args) {
        // Tamanho do array
        int tamanhoArray = 15;

        // Cria um objeto Random para gerar números aleatórios
        Random random = new Random();

        // Cria um array para armazenar os números aleatórios
        int[] numerosAleatorios = new int[tamanhoArray];

        // Preenche o array com números aleatórios entre 1 e 100
        for (int i = 0; i < tamanhoArray; i++) {
            numerosAleatorios[i] = random.nextInt(100) + 1;
        }

        // Inicializa as variáveis para o maior e o menor valores
        int maiorValor = numerosAleatorios[0];
        int menorValor = numerosAleatorios[0];

        // Encontra o maior e o menor valor no array
        for (int i = 1; i < tamanhoArray; i++) {
            if (numerosAleatorios[i] > maiorValor) {
                maiorValor = numerosAleatorios[i];
            }
            if (numerosAleatorios[i] < menorValor) {
                menorValor = numerosAleatorios[i];
            }
        }

        // Imprime o array de números aleatórios
        System.out.println("Array de números aleatórios:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.print(numerosAleatorios[i] + " ");
        }

        // Imprime o maior e o menor valor
        System.out.println("\nMaior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }
}
