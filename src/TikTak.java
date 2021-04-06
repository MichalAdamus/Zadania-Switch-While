public class TikTak {
    public static void main(String[] args) {
        for (int i = 427; i <= 529; i++) {
            if (i % 3 == 0 & i % 5 == 0) {
                System.out.println(i + " TikTak");
            } else if ((i % 3) == 0) {
                System.out.println(i + " Tik ");
            } else if ((i % 5) == 0) {
                System.out.println(i + " Tak ");
            } else {
                System.out.println(i);
            }
        }
    }
}