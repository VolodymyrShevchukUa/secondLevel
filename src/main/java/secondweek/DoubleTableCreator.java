package secondweek;

public class DoubleTableCreator extends TableCreator{

    double max;
    double min;
    double inc;

    private StringBuilder stringBuilder;

    protected DoubleTableCreator(Number max, Number min, Number inc) {
        super(max, min, inc);
        this.inc = super.inc.doubleValue();
        this.min = super.min.doubleValue();
        this.max = super.max.doubleValue();

    }

    @Override
    public String createTable() {
        stringBuilder = new StringBuilder();
        double[] numbers = getNumbers(max, min, inc);
        for (double row : numbers) {
            stringBuilder.append("\n").append(row).append("|");
            for (double column : numbers) {
                stringBuilder.append(String.format("%15f", row * column));
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public double[] getNumbers(double max,double min,double inc) {
        int arraySize = (int)((max - min) / inc) + 1;
        double[] doubles = new double[arraySize];
        StringBuilder separator = new StringBuilder();
        min -= inc;
        stringBuilder.append("    ");
        for(int i = 0;i<arraySize;i++){
            doubles[i] = min += inc;
            stringBuilder.append(String.format("%15f" ,doubles[i]));
            separator.append("________________");
        }
        stringBuilder.append("\n").append(separator);
        return doubles;
    }
}
