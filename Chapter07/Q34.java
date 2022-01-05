package homework.chapter07;

public class Q34 {
    public static void main(String[] args) {
        System.out.println(sort("cba"));
    }

    public static char[] sort(String s) {
        char[] strArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            strArray[i] = s.charAt(i);
        }
        for (int i = 0; i < strArray.length - 1; i++) {
            char currentMax = strArray[i];
            int currentMaxIndex = i;

            for (int j = i + 1; j < strArray.length; j++) {
                if (currentMax > strArray[j]) {
                    currentMax = strArray[j];
                    currentMaxIndex = j;
                }
                if (currentMaxIndex != i) {
                    strArray[currentMaxIndex] = strArray[i];
                    strArray[i] = currentMax;
                }
            }
        }
        return strArray;
    }
}

