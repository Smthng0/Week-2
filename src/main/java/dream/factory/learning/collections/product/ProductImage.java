package dream.factory.learning.collections.product;

public class ProductImage {

    private String url;

    public ProductImage(String string, Integer input) {
        this.url = (string + input + ".jpg");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
