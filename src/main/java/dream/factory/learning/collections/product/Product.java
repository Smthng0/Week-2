package dream.factory.learning.collections.product;

public class Product {
    private String name;
    private int price;
    private String id;
    private String category;

    public Product (ProductBuilder builder){
        this.name = builder.name;
        this.price = builder.price;
        this.id = builder.id;
        this.category = builder.category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public int hashCode(){
        if (this.id == null){
            return 0;
        }

        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if (! (obj instanceof Product)){
            return false;
        }

        Product test = (Product)obj;

        return this.id.equals(test.id);
    }

    public static class ProductBuilder{
        private String name;
        private int price;
        private String id;
        private String category;

        public ProductBuilder(String name) {
            this.name = name;
        }

        public ProductBuilder price(int price) {
            this.price = price;
            return this;
        }

        public ProductBuilder id(String id) {
            this.id = id;
            return this;
        }

        public ProductBuilder category(String category) {
            this.category = category;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

}
