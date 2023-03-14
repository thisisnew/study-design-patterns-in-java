package adapter1;

public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAsher() {
        System.out.println("*" + string + "*");
    }
}
