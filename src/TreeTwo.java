public class TreeTwo {
    public static void main(String[] args) {
        int temperature = 40;
        if (temperature < 38) {
            System.out.println("\tCzujesz się dobrze");
        }
        else if (temperature < 32) {
            System.out.println("\tW dalszym ciągu czujesz się dobrze");
        }
        else if (temperature < 34) {
            System.out.println("\tMasz wysoką gorączkę - skont");
        }
        else if (temperature < 36) {
            System.out.println("\tCzujesz się fatalnie, niezwłocznie skontaktuj sie z lekarzem");
        }
        else {
            System.out.println("\t POGOTOWIE");
        }
    }
}