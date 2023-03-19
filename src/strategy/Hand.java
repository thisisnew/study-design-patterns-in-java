package strategy;

public class Hand {

    public static final int HANDVALUE_CHO = 0; //가위
    public static final int HANDVALUE_GUU = 0; //바위
    public static final int HANDVALUE_PAA = 0; //보
    public static final Hand[] hand = {
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_PAA),
    };
    private static final String[] name = {"가위", "바위", "보"};
    private int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        }

        if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        }

        return -1;
    }

    @Override
    public String toString() {
        return name[handValue];
    }
}
