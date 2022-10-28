package secondweek;

public abstract class TableCreator  {


    protected String max ;
    protected String min ;
    protected String inc ;

    protected TableCreator(String max, String min, String inc) {
        this.max = max;
        this.min = min;
        this.inc = inc;
    }

    public abstract String createTable();

}
