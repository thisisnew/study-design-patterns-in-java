package adapter2;

import adapter1.Print;
import adapter1.PrintBanner;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("HEllO");
        p.printStrong();
        p.printWeak();
    }
}
