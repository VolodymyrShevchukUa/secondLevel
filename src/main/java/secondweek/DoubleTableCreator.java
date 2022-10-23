package secondweek;

public class DoubleTableCreator extends TableCreator{
    protected DoubleTableCreator(String max, String min, String increment) {
        super(max, min, increment);
    }

    @Override
    public void createTable() {
        double inc = Double.parseDouble(this.inc);
        double max = Double.parseDouble(this.max);
        double min = Double.parseDouble(this.min);
        for (; min <= max; min += inc) {
            for (double j = 1; j <= max; j += inc) {
                System.out.printf("%15f", (min * j));
            }
            System.out.println();
        }
    }
}
