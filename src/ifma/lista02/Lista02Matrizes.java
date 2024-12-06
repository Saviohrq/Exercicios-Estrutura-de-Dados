package ifma.lista02;

public class Lista02Matrizes {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        q01(matriz);
        q02(matriz);
        q03(matriz);
        q04(matriz);
        q05(matriz);
        q06(matriz);
        q07(matriz);
        q08(matriz);
        q09(matriz);
        q10(matriz);
        q11(matriz);
        q12(matriz);
        q13(matriz);
        q14(matriz);
        q15(matriz);
        q16(matriz);
        q17(matriz);
        q18();
    }

    // Questão 1
    public static void q01(int[][] matriz) {
        System.out.println("Questão 1:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Questão 2
    public static void q02(int[][] matriz) {
        System.out.println("\nQuestão 2:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Questão 3
    public static void q03(int[][] matriz) {
        System.out.println("\nQuestão 3:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
        }
        System.out.println();
    }

    // Questão 4
    public static void q04(int[][] matriz) {
        System.out.println("\nQuestão 4:");
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][matriz.length - 1 - i];
        }
        System.out.println("Soma: " + soma);
    }

    // Questão 5
    public static void q05(int[][] matriz) {
        System.out.println("\nQuestão 5:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j >= matriz.length - 1) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    // Questão 6
    public static void q06(int[][] matriz) {
        System.out.println("\nQuestão 6:");
        int soma = 0, count = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j >= matriz.length - 1) {
                    soma += matriz[i][j];
                    count++;
                }
            }
        }
        double media = (double) soma / count;
        System.out.printf("Média: %.2f%n", media);
    }

    // Questão 7
    public static void q07(int[][] matriz) {
        System.out.println("\nQuestão 7:");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = matriz.length - i; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }

    // Questão 8
    public static void q08(int[][] matriz) {
        System.out.println("\nQuestão 8:");
        int maior = Integer.MIN_VALUE;
        for (int i = 1; i < matriz.length; i++) {
            for (int j = matriz.length - i; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println("Maior: " + maior);
    }

    // Questão 9
    public static void q09(int[][] matriz) {
        System.out.println("\nQuestão 9:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= matriz.length - 1 - i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }

    // Questão 10
    public static void q10(int[][] matriz) {
        System.out.println("\nQuestão 10:");
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= matriz.length - 1 - i; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("Menor: " + menor);
    }

    // Questão 11
    public static void q11(int[][] matriz) {
        System.out.println("\nQuestão 11:");
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length - 1 - i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println();
    }

    // Questão 12
    public static void q12(int[][] matriz) {
        System.out.println("\nQuestão 12:");
        int produto = 1;
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length - 1 - i; j++) {
                produto *= matriz[i][j];
            }
        }
        System.out.println("Produto: " + produto);
    }

    // Questão 13
    public static void q13(int[][] matriz) {
        System.out.println("\nQuestão 13:");
        int[][] b = new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    b[i][j] = matriz[i][j] * matriz[i][j];
                } else {
                    b[i][j] = matriz[i][j] * matriz[i][j] * matriz[i][j];
                }
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Questão 14
    public static void q14(int[][] matriz) {
        System.out.println("\nQuestão 14:");
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = matriz.length - 1; i >= 0; i--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Questão 15
    public static void q15(int[][] matriz) {
        System.out.println("\nQuestão 15:");
        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Questão 16
    public static void q16(int[][] matriz) {
        System.out.println("\nQuestão 16:");
        for (int j = matriz[0].length - 1; j >= 0; j--) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Questão 17
    public static void q17(int[][] matriz) {
        System.out.println("\nQuestão 17:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 1) {
                    System.out.print("  ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Questão 18
    public static void q18() {
        System.out.println("\nQuestão 18:");
        int[][] matrizC = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] transposta = new int[matrizC[0].length][matrizC.length];
        for (int i = 0; i < matrizC.length; i++) {
            for (int j = 0; j < matrizC[i].length; j++) {
                transposta[j][i] = matrizC[i][j];
            }
        }

        for (int i = 0; i < transposta.length; i++) {
            for (int j = 0; j < transposta[i].length; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }
    }

}
