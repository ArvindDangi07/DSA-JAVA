package string;

public class methods {
    public static void main(String[] args) {
        String str = "Arvind Dangi";
        System.out.println(str.substring(0,3)); // Arv
        System.out.println(str.length()); // 12
        System.out.println(str.charAt(9)); // n
        System.out.println(str.equalsIgnoreCase("Arvnd Dangi")); // false
        System.out.println(str.equalsIgnoreCase("Arvind Dangi")); // true
        System.out.println(str.contains("Dangi")); // true
        System.out.println(str.indexOf(" ")); // 6


    }
}
