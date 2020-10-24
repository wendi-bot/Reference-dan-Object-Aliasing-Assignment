class Categories {
    private String Namabuku ;
    private String judulbuku ;

    public Categories(Categories categories) {
        this(categories.getNamabuku(), categories.getjudulbuku());
    }
    public Categories(String Namabuku, String judulbuku) {
        this.Namabuku = Namabuku;
        this.judulbuku = judulbuku;
    }
    public Object clone() {
        try {
            return (Categories) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Categories(this.getNamabuku(), this.getjudulbuku());
        }
    }
    
    public String getNamabuku() {
        return Namabuku;
    }

    public void setNamabuku(String Namabuku) {
        this.Namabuku = Namabuku;
    }

    public String getjudulbuku() {
        return judulbuku;
    }

    public void setjudubuku(String judulbuku) {
        this.judulbuku = judulbuku;
    }
    @Override
    public String toString() {
        return "Categories{" +
                "Namabuku='" + Namabuku + '\'' +
                ", Judulbuku='" + judulbuku + '\'' +
                '}';
    }
}

    