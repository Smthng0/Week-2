package dream.factory.learning.cupic.chapter5;

public abstract class GeometrijskiLik {
    private String ime;

    public GeometrijskiLik (String ime){
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }

    public double getOpseg () {
        return 0;
    }

    public double getPovrsina () {
        return 0;
    }


}
