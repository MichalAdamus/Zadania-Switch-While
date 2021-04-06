public class MultiTable {
    public static void main(String[] args) {
        int tab[][] = new int[10][10];

        for (int i = 1; i < 11; i++) {
            tab[i - 1][0] = i;
            tab[0][i - 1] = i;
        }
        for (int j = 1; j < 10; j++) {
            for (int i = 1; i < 10; i++) {
                tab[j][i] = tab[j][0] * tab[0][i];
            }
        }
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(tab[j][i] + " ");
            }
            System.out.println("");
        }
    }
}
