package dream.factory.learning.collections.exceptions;

public class CheckedExceptionsNoException {
    public static void main(String[] args) throws FraneCheckedException {
        String zec = "zec";
        try {
            drugi(false);
            zec = "Uspješan žec";
        } catch (FraneCheckedException e) {
            zec = "Neuspješan žec";
        } finally {
            System.out.println(zec);
        }
    }

    private static void drugi(boolean isException) throws FraneCheckedException {
        System.out.println("tu je nevolja... " + "drugi");
        if(isException){
            throw new FraneCheckedException();
        }
    }
}
