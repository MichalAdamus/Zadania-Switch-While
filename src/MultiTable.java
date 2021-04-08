public class MultiTable {
    public static void main(String[] args) {
        int n = 115;
        int tab[][] = new int[n][n];

        for (int i = 1; i <= tab.length; i++) {
            tab[i - 1][0] = i;
            tab[0][i - 1] = i;
        }
        for (int j = 1; j < tab.length; j++) {
            for (int i = 1; i < tab.length; i++) {
                tab[j][i] = tab[j][0] * tab[0][i];
            }
        }
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length; i++) {
                System.out.print(tab[j][i] + "\t");
            }
            System.out.println("");
        }
    }
}
