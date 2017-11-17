package dream.factory.learning.cupic.chapter7;

public class Lambda {
    public static void main(String[] args) {

        double[] polje = new double[] {1,2,3,4,5,6,7,8,9,10};
        double[] transformirano = transformiraj(polje, new SinTransform());
        double[] transformirano2 = transformiraj(polje, new CosTransform());
        double[] transformirano3 = transformiraj(polje, value -> 2 * value - 4);

        ispisi(polje, transformirano);
        ispisi(polje, transformirano2);
        ispisi(polje, transformirano3);
    }

    private static void ispisi(double[] arg, double[] f) {
        for (int i = 0; i < arg.length; i++) {
            System.out.format("%f -> %f%n", arg[i], f[i]);
        }
    }

    public interface ITransform {
        double transform (double value);
    }

    public static class SinTransform implements ITransform {
        public double transform(double value){
            return Math.sin(value);
        }
    }

    public static class CosTransform implements ITransform {
        public double transform(double value){
            return Math.cos(value);
        }
    }

    private static double[] transformiraj(double[] polje, ITransform transformer) {
        if (polje == null) {
            throw new IllegalArgumentException(
                    "Predana je null referenca kao polje!"
            );
        }
        double[] rezultat = new double[polje.length];
        for (int i = 0; i < rezultat.length; i++) {
            double vrijednost = transformer.transform(polje[i]);
            rezultat[i] = vrijednost;
        }
        return rezultat;
    }

}
