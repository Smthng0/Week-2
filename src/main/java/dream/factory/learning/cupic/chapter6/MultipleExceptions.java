package dream.factory.learning.cupic.chapter6;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            obrada();
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("test1");
        } catch(ClassCastException | NullPointerException ex) {
            System.out.println("test2");
        } catch(RuntimeException ex) {
            System.out.println("test3");
        }
    }

    private static void obrada() {
        int broj = (int) (Math.random() * 300 + 0.5) % 3;
        switch (broj) {
            case 0:
                obrada1();
                break;
            case 1:
                obrada2(null);
                break;
            case 2:
                obrada3(new Integer(5));
                break;
        }
    }

    private static void obrada1() {
        int[] polje = new int[2];
        polje[3] = 17;
    }

    private static void obrada2(Object o) {
        String s = o.toString();
        System.out.println(s);
    }

    private static void obrada3(Object o) {
        Double d = (Double) o;
        System.out.println(d.doubleValue()+1);
    }

}
