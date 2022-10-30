package secondweek;

import java.math.BigInteger;

public class LongTableCreator extends TableCreator {

    int offsetCof;
    long max;
    long min;
    long inc;
    private final StringBuilder stringBuilder;



    protected LongTableCreator(Number max, Number min, Number inc) {
        super(max, min, inc);
        this.max = super.max.longValue();
        this.min = super.min.longValue();
        this.inc = super.inc.longValue();
        offsetCof = (int) (super.max.toString().length()*Math.sqrt(max.toString().length())+3);
        stringBuilder = new StringBuilder();
    }

    @Override
    public String createTable() {
        long[] numbers = getNumbers(max, min, inc);
        for (long row : numbers) {
            stringBuilder.append("\n").append(row).append("|");
            for (long column : numbers) {
                stringBuilder.append(String.format("%".concat(offsetCof+"").concat("d"),
                        BigInteger.valueOf(column).multiply(BigInteger.valueOf(row))));
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public long[] getNumbers(long max,long min,long inc) {
        int arraySize = (int) ((max - min) / inc) + 1;
        long[] longs = new long[arraySize];
        StringBuilder separator = new StringBuilder();
        min -= inc;
        stringBuilder.append(" ".repeat((super.max.toString().length()-1)));
        for(int i = 0;i<arraySize;i++){
            longs[i] = min += inc;
            stringBuilder.append(String.format("%".concat(offsetCof+"").concat("d"),BigInteger.valueOf(longs[i])));
            separator.append("__________________");
        }
        stringBuilder.append("\n").append(separator);
        return longs;
    }
}
