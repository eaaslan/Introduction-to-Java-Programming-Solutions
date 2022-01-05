package chapter10;

public class MyString1 {
    char[] chars;

    public MyString1(char[] chars) {

        this.chars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] substr = new char[end - begin];

        for (int i = begin; i < end; i++) {
            substr[i - begin] = chars[begin];
        }
        return new MyString1(substr);

    }

    public MyString1 toLowerCase() {
        char[] lowercase = new char[chars.length];
//        for (int i = 0; i < chars.length; i++) {
//            if (!Character.isLowerCase(chars[i])) {
//                Character.toLowerCase(chars[i]);
//            }
//        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 'Z' && chars[i] >= 'A') {
                lowercase[i] = (char) (chars[i] + 32);
            } else lowercase[i] = chars[i];
        }
        return new MyString1(lowercase);
    }

    public boolean equals(MyString1 s) {
        if (chars.length != s.length()) return false;
        for (int i = 0; i < chars.length; i++) {
            if (!s.equals(chars)) return false;
        }
        return true;
    }

//    public static MyString1 valueOf(int i) {
//
//    }
}

class TestMyString1 {
    public static void main(String[] args) {
        MyString1 myString1 = new MyString1(new char[]{'A', 'b', 'c'});
        System.out.println(myString1);
        String a = myString1.toLowerCase().toString();
        System.out.println(a);
    }
}
