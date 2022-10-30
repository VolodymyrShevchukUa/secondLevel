package secondweek;

import java.math.BigDecimal;

public class DoubleTableCreator extends TableCreator{

    int offsetCof;
    double max;
    double min;
    double inc;

    private final StringBuilder stringBuilder;

    protected DoubleTableCreator(Number max, Number min, Number inc) {
        super(max, min, inc);
        this.inc = super.inc.doubleValue();
        this.min = super.min.doubleValue();
        this.max = super.max.doubleValue();
        offsetCof = super.max.toString().length()*2;
        stringBuilder = new StringBuilder();

    }
// changes sdsadas
    @Override
    public String createTable() {
        BigDecimal[] numbers = getNumbers(max, min, inc);
        for (BigDecimal row : numbers) {
            stringBuilder.append("\n").append(String.format("%15f",row)).append("|");
            for (BigDecimal column : numbers) {
                stringBuilder.append(String.format("%15f", row.multiply(column)));
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public BigDecimal[] getNumbers(double max, double min, double inc) {
        int arraySize = (int)((max - min) / inc) + 1;
        BigDecimal minimal;
        BigDecimal[] doubles = new BigDecimal[arraySize];
        StringBuilder separator = new StringBuilder();
        minimal = BigDecimal.valueOf(min).subtract(BigDecimal.valueOf(inc));
        stringBuilder.append(" ".repeat(Math.max(0, offsetCof * 2)));
        for(int i = 0;i<arraySize;i++){
            doubles[i] = minimal.add(BigDecimal.valueOf(inc));
            minimal = doubles[i];
            stringBuilder.append(String.format("%15f" ,doubles[i]));
            separator.append("__________________________________");
        }
        stringBuilder.append("\n").append(separator);
        return doubles;
    }
}
