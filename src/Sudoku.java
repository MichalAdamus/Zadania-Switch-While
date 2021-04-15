public class Sudoku {
    public static void main(String[] args) {
        int[][] numbers = {{1, -1, 3}, {-1, 1, 2}, {2, 3, -1}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
        // 1. Dla każdego wiersza wykonujemy kroki
        // a. w ramach wiersza poszukujemy pustej pozycji
        // b. jak ją znajdziemy to wtedy zaczynamy obliczać jaka wartośc należy wstawić => suma 6, od 6 odejmujemy kolejne wartości w danym wierszu o ile różna od -1;
        // c. ustawiamy tą wartość

        System.out.print(numbers[0][0]);
        System.out.print(numbers[0][1]);
        System.out.print(numbers[0][2]);
        System.out.println();


        int i = 0;
        while (i < 3) {
            //a
            int j = 0;
            while (j < 3) {
                System.out.print(numbers[i][j]);
                if (numbers[i][j] == -1) {
                    // b
                    int k = 6;
                    int x = 0;
                    int sum = 0;
                    while (x < numbers[i].length) {
                        if (numbers[i][x] != -1) {
                            sum += numbers[i][x];
                        }
                        x++;
                    }
                    // c
                    numbers[i][j] = k-sum;
                }
                j++;
            }
            i++;
        }
        System.out.println();
        for (i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }
}



