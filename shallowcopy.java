public class Shallowcopy {
    public static void main(String args[]) {
        Shallowcopy main = new Shallowcopy();
        main.whenShallowCopying_thenObjectsShouldNotBeSame();
    }
    public void whenShallowCopying_thenObjectsShouldNotBeSame() {
        Categories categories = new Categories("bejalar java bersama ridwan","pbo");
        Product buku1 = new Product("0001", categories);

        Product buku2 = new Product(buku1.getIdproduct(),buku1.getcategories());
        
        buku2.setIdproduct("0002");
        buku2.getcategories().setNamabuku("belajar Jaringan dasar bersama ridwan");

        System.out.println(buku1);
        System.out.println(buku2);
} 
}

//
