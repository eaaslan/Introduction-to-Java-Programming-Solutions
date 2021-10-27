package homework.chapter04;

public class Q16 {
    public static void main(String[] args) {

        int number = (int) (65 + (Math.random() * 26)); // between 65 - 90 in ascii table
        char c = (char) number;
        System.out.println("The random letter is: " + c);
    }

}

