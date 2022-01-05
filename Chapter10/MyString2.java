package chapter10;

public class MyString2 {
    String str;

    public MyString2(String s) {

        this.str = "";
        for (int i = 0; i < s.length(); i++) {
            str += s.charAt(i);
        }

    }

//    public int compare(String s){
//        String.valueOf();
//    }


}
