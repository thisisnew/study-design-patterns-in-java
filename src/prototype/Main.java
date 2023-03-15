package prototype;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('*');
        manager.register("strong message", underlinePen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        Product p1 = manager.create("strong message");
        p1.use("Hello world");
    }
}
