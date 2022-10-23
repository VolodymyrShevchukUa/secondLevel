package secondweek;

public class LongTableCreator extends TableCreator{
    protected LongTableCreator(String max, String min, String increment) {
        super(max, min, increment);
    }

    @Override
    public void createTable() {
        long inc = Long.parseLong(this.inc);
        long max = Long.parseLong(this.max);
        long min = Long.parseLong(this.min);
        for (; min <= max; min += inc) {
            for (int j = 1; j <= max; j += inc) {
                System.out.printf("%5d", min * j);
            }
            System.out.println();
        }

    }
}
