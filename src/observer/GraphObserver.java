package observer;

public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.print("GraphObserver");
        int count = numberGenerator.getNumbers();

        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }

        System.out.print(" ");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
