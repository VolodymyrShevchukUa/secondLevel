package secondweek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LongTableCreatorTest {

    String expectedResult =
            "         100     200     300     400     500     600     700     800     900    1000\n" +
                    "____________________________________________________________________________________________________________________________________________________________________________________\n" +
                    "100|   10000   20000   30000   40000   50000   60000   70000   80000   90000  100000\n" +
                    "\n" +
                    "200|   20000   40000   60000   80000  100000  120000  140000  160000  180000  200000\n" +
                    "\n" +
                    "300|   30000   60000   90000  120000  150000  180000  210000  240000  270000  300000\n" +
                    "\n" +
                    "400|   40000   80000  120000  160000  200000  240000  280000  320000  360000  400000\n" +
                    "\n" +
                    "500|   50000  100000  150000  200000  250000  300000  350000  400000  450000  500000\n" +
                    "\n" +
                    "600|   60000  120000  180000  240000  300000  360000  420000  480000  540000  600000\n" +
                    "\n" +
                    "700|   70000  140000  210000  280000  350000  420000  490000  560000  630000  700000\n" +
                    "\n" +
                    "800|   80000  160000  240000  320000  400000  480000  560000  640000  720000  800000\n" +
                    "\n" +
                    "900|   90000  180000  270000  360000  450000  540000  630000  720000  810000  900000\n" +
                    "\n" +
                    "1000|  100000  200000  300000  400000  500000  600000  700000  800000  900000 1000000\n" +
                    "\n" +
                    "\n" ;
    @Test
    void testDoubleCreateTable(){
        LongTableCreator longTableCreator = new LongTableCreator(1000,100,100);
        String table = longTableCreator.createTable();
        Assertions.assertEquals(expectedResult.replace(" ","").replace("\n","")
                        .replace("|","").replace("_","")
                ,table.replace(" ","").replace("\n","")
                        .replace("|","").replace("_",""));
    }
    @Test
    void checkGetNumbers() {
        LongTableCreator longTableCreator = new LongTableCreator(1000,100,100);
        long[] expected = new long[]{100,200,300,400,500,600,700,800,900,1000};
        long[] actual = longTableCreator.getNumbers(longTableCreator.max,longTableCreator.min
                ,longTableCreator.inc);
        assertArrayEquals(expected, actual);
    }
}