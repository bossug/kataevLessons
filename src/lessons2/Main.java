public class Main {
    public static void main(String[] args) {
        isMinMax();
    }
    public static void invertArrayV1() {
        System.out.println("\r\n1 - задание");
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
    }
    public static void invertArrayV2() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0)
                System.out.print(arr[i] + 1);
            else
                System.out.print(arr[i] - 1);
    }

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i*3);
        }
    }

    public static void changeArray() {
        System.out.println("\r\n3 - задание");
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < w.length; i++) {
            if ( w[i] < 6 ) w[i] *= 2;
            System.out.println(w[i]);
        }
    }

    public static void fillDiagonal() {
        System.out.println("\r\n4 - задание");
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                if (i == j) arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.print("\r\n");
        }
    }

    public static void isMinMax(){
        System.out.println("\r\n5 - задание");
        int[] arr5 = {18, 3, 1, 9, 10, 2, 7, 5, 6, 15, 12, 16};
        int min = arr5[0], max = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
            }
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);
    }
}
