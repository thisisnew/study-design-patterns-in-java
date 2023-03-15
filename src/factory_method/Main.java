package factory_method;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p1 = factory.create("홍길동");
        Product p2 = factory.create("이순신");
        Product p3 = factory.create("강감찬");

        p1.use();
        p2.use();
        p3.use();
    }
}

