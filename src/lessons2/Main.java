public class Main {
    public static void main(String[] args) {
        //Задание 1
        invertArray();

        //Задание 2
        fillArray();

        //Задание 3
        changeArray();

        //Задание 4
        fillDiagonal();

        //Задание 5
        isMinMax();

        //Задание 6
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("\r\n6 - задание, результат = " + checkBalance(arr));

        //Задание 7
        System.out.println("\r\n7 - задание +3 сдвига");
        shiftOfNumbersArray(arr, 3);
        System.out.println("\r\n7 - задание -3 сдвига");
        shiftOfNumbersArray(arr, -3);
    }
    public static void invertArray() {
        System.out.println("\r\n1 - задание");
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] == 0 ? 1 : 0);
    }

    public static void fillArray() {
        System.out.println("\r\n2 - задание");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++)
            System.out.print(i*3 + " ");
        System.out.println("\r\n");
    }

    public static void changeArray() {
        System.out.println("\r\n3 - задание");
        int[] w = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < w.length; i++) {
            if ( w[i] < 6 ) w[i] *= 2;
            System.out.print(w[i] + " ");
        }
        System.out.println("\r\n");
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
        int[] arrs = {18, 3, 1, 9, 10, 2, 7, 5, 6, 15, 12, 16};
        int min = arrs[0], max = arrs[0];
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] > max) {
                max = arrs[i];
            }
            if (arrs[i] < min) {
                min = arrs[i];
            }
        }
        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);
    }
    public static boolean checkBalance(int[] arrParam) {
        int leftSum, rightSum;
        for (int i = 0; i < arrParam.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arrParam[j];
            }
            for (int j = i; j < arrParam.length; j++) {
                rightSum += arrParam[j];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }

    private static void shiftOfNumbersArray(int[] arrParam, int n) {
        //массив до сдвмга
        for (int i : arrParam) System.out.print(i + " ");
        System.out.println("\r\n");

        if (n > 0) {
            for (int x = 0; x < n; x++) {
                int buf = arrParam[arrParam.length - 1];
                if (arrParam.length-1 >= 0) System.arraycopy(arrParam, 0, arrParam, 1, arrParam.length - 1);
                arrParam[0] = buf;
            }
            //массив после сдвмга
            for (int i : arrParam) System.out.print(i + " ");
            System.out.println();
        }
        if (n < 0) {
            for (int x = 0; x > n; x--) {
                int buf = arrParam[0];
                System.arraycopy(arrParam, 1, arrParam, 0, arrParam.length - 1);
                arrParam[arrParam.length-1] = buf;
            }
            //массив после сдвмга
            for (int i : arrParam) System.out.print(i + " ");
            System.out.print("\r\n");
        }
    }
}
