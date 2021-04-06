public class TreeThree {
    public static void main(String[] args) {
        char[][] numbers = {{' ', ' ', '*', ' ', ' '},{' ', '*', '*', '*', ' '}, {'*', '*', '*', '*', '*'}};

        char x = 0;
        while (x < numbers[0].length) {
            System.out.print(numbers[0][x] + " ");
            x++;
        }
        System.out.println();

        x = 0;
        while (x < numbers[1].length) {
            System.out.print(numbers[1][x] + " ");
            x++;
        }
        System.out.println();

        x = 0;
        while (x < numbers[2].length) {
            System.out.print(numbers[2][x] + " ");
            x++;
        }
    }
}
