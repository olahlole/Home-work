package homeWork4;

public class main {

    public static void  main(String[] args) {

        String y = new String("I study Basic Java!");

        System.out.println(y.charAt(y.length()-1));

        System.out.println(y.contains("Java"));

        System.out.println(y.replace( 'a', 'o'));

        System.out.println(y.toLowerCase());
        System.out.println(y.toUpperCase());
        System.out.println(y.substring(13, 18));


//        int length = y.length();
//        System.out.println("Длина строки:" + length);
//        System.out.println(y.charAt(18));

    }
}
