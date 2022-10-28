package secondweek;

public abstract class TableCreator {


    protected Number max;
    protected Number min;
    protected Number inc;


    protected TableCreator(Number max, Number min, Number inc) {
        this.max = max;
        this.min = min;
        this.inc = inc;
    }

    public abstract String createTable();

}
