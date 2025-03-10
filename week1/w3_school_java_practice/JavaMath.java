// WAP to use math module and it's methods in java
public class JavaMath {
    public static void main(String[] args) {
        System.out.println(Math.max(3,5));
        System.out.println(Math.min(4,8));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.random());

        int randNumber = (int)(Math.random() * 21);
        System.out.println(randNumber);
    }
}