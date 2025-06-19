public class ProxyDemo {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image1: first display will load, second will use cache
        image1.display();
        image1.display();

        // Image2: will load once
        image2.display();
    }
}