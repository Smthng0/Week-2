package dream.factory.learning.collections.exceptions;

public class CheckedExceptions {
    public static void main(String[] args) throws FraneCheckedException {
        try {
            drugi();
            System.out.println("Ovo se ne izvrši");
        } catch (FraneCheckedException e) {
            System.out.println("Checked exception: " + e.getMessage());
        } finally {
            System.out.println("Ovo se uvijek izvrši");
            drugi();
            System.out.println("Osim ako se dogodi exception unutar finally blocka.");
        }
    }

    private static void prvi() throws FraneCheckedException {
        System.out.println("tu je nevolja... " + "prvi");
        drugi();
        System.out.println("tu je nevolja... " + "prvi2");
    }

    private static void drugi() throws FraneCheckedException {
        System.out.println("tu je nevolja... " + "drugi");
        throw new FraneCheckedException();
    }
}
