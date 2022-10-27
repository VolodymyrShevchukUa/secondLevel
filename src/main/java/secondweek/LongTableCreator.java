package secondweek;

public class LongTableCreator extends TableCreator {
    protected LongTableCreator(String max, String min, String increment) {
        super(max, min, increment);
    }

    @Override
    public void createTable() {
        StringBuilder stringBuilder = new StringBuilder();
        long inc = Long.parseLong(this.inc);
        long max = Long.parseLong(this.max);
        long min = Long.parseLong(this.min);
        for (; min <= max; min += inc) {
            for (int j = 1; j <= max; j += inc) {
                stringBuilder.append(String.format("%5d", min * j));
            }
            stringBuilder.append("\n");
        }
        Assigment2.logger.info("The table :".concat("\n".concat(stringBuilder.toString())));
    }
}
