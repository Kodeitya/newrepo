public class array {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 8, 4, -8 };
        int element = 8;
        boolean flag = false;
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }

            if (element == arr[i]) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
