package secondweek;

public class LongTableCreator extends TableCreator {

    long max;
    long min;
    long inc;
    private StringBuilder stringBuilder;



    protected LongTableCreator(Number max, Number min, Number inc) {
        super(max, min, inc);
        this.max = super.max.longValue();
        this.min = super.min.longValue();
        this.inc = super.inc.longValue();
    }

    @Override
    public String createTable() {
        stringBuilder = new StringBuilder();
        long[] numbers = getNumbers(max, min, inc);
        for (long row : numbers) {
            stringBuilder.append("\n").append(row).append("|");
            for (long column : numbers) {
                stringBuilder.append(String.format("%5d", row * column));
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
            stringBuilder.append("  ");
        for(int i = 0;i<arraySize;i++){
            longs[i] = min += inc;
            stringBuilder.append(String.format("%5d" ,longs[i]));
            separator.append("______");
        }
        stringBuilder.append("\n").append(separator);
        return longs;
    }
}
