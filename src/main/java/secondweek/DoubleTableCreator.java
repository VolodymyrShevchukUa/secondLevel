package secondweek;

public class DoubleTableCreator extends TableCreator{


    protected DoubleTableCreator(String max, String min, String increment) {
        super(max, min, increment);
    }

    @Override
    public void createTable() {
        StringBuilder stringBuilder = new StringBuilder();
        double inc = Double.parseDouble(this.inc);
        double max = Double.parseDouble(this.max);
        double min = Double.parseDouble(this.min);

        for (; min <= max; min += inc) {
            for (double j = 1; j <= max; j += inc) {
                stringBuilder.append(String.format("%15f", (min * j)));
            }
            stringBuilder.append("\n");
        }
        Assigment2.logger.info("The table :".concat("\n".concat(stringBuilder.toString())));
    }
}
