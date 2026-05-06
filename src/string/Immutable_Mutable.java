package string;

import java.util.Arrays;

public class Immutable_Mutable {
    public static void main(String[] args) {
        String str = "Arvind";
        str.replace('A','W'); // Arvind : cant change it; (immutable)
        System.out.println(str);

        char[] ch = str.toCharArray()  ;
        ch[0]='W';
        System.out.println(ch); // Wrvind : can change (mutable)

    }

}
