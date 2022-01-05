package homework.chapter07;

public class Q15 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 6, 3, 4, 5, 2};

        int[] distinct = eliminateDuplicates(array);
        System.out.println("The distinct numbers are: ");
        for (int i : distinct) {
            if (i > 0) System.out.println(i);
        }
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] eliminated = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            boolean check = true;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                eliminated[i] = list[i];
            }
        }
        return eliminated;
    }
}
