package dream.factory.learning.chapter11.vice.teaching.exceptions;

public class UncheckedExceptions {
    public static void main(String[] args) {
        Integer frane = Integer.parseInt("1234");

        try {
            System.out.println("try block");
            System.out.println(frane.toString());
            System.out.println("try block prosao");
            frane = null;
            System.out.println(frane.toString());
        } catch (Exception e) {
            System.out.println("catch block");
            System.out.println("frane ne zna programirati jer ");
            System.out.println("catch block prosao");
        }
    }
}
