package school.mjc.stage0.conditions.task2;

public class CoinFlip {
    public void throwCoin(int from1UpTo1000) {
        int equalFlip = 500;

        if (from1UpTo1000 < equalFlip) {
            System.out.println("Eagle");
        } else {
            System.out.println("Tail");
        }
    }
}
