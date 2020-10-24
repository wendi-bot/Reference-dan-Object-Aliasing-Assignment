class Product {
    private String Idproduct;
    private Categories categories;

    public Product(Product product) {
        this(product.getIdproduct(),new Categories(product.getcategories()));
    }

    public Product(String Idproducct, Categories categories) {
        this.Idproduct = Idproducct;
        this.categories = categories;
    }

    public Object clone() {
        Product product = null;
        try {
            product = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            product = new Product(
                    this.getIdproduct(), this.getcategories());
        }
        product.categories = (Categories) this.categories.clone();
        return product;
    }

    public String getIdproduct() {
        return Idproduct;
    }

    public void setIdproduct(String Idproduct) {
        this.Idproduct = Idproduct;
    }

    public Categories getcategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }
    @Override
    public String toString() {
        return "Product{" +
                "Idproduct='" + Idproduct + '\'' +
                ", categories=" + categories +
                '}';
    }
}
