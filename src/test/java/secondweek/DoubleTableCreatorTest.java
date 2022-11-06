package secondweek;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DoubleTableCreatorTest {
    String expectedResult =
                                            "1,000000       2,500000       4,000000       5,500000       7,000000       8,500000      10,000000\n" +
                    "______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________\n" +
                    "       1,000000|       1,000000       2,500000       4,000000       5,500000       7,000000       8,500000      10,000000\n" +
                    "\n" +
                    "       2,500000|       2,500000       6,250000      10,000000      13,750000      17,500000      21,250000      25,000000\n" +
                    "\n" +
                    "       4,000000|       4,000000      10,000000      16,000000      22,000000      28,000000      34,000000      40,000000\n" +
                    "\n" +
                    "       5,500000|       5,500000      13,750000      22,000000      30,250000      38,500000      46,750000      55,000000\n" +
                    "\n" +
                    "       7,000000|       7,000000      17,500000      28,000000      38,500000      49,000000      59,500000      70,000000\n" +
                    "\n" +
                    "       8,500000|       8,500000      21,250000      34,000000      46,750000      59,500000      72,250000      85,000000\n" +
                    "\n" +
                    "      10,000000|      10,000000      25,000000      40,000000      55,000000      70,000000      85,000000     100,000000";

    @Test
    void checkGetNumbers() {
        DoubleTableCreator doubleTableCreator = new DoubleTableCreator(10,1,1.5);
        BigDecimal[] expected = new BigDecimal[]{BigDecimal.valueOf(1.0), BigDecimal.valueOf(2.5), BigDecimal.valueOf(4.0),
                BigDecimal.valueOf(5.5), BigDecimal.valueOf(7.0), BigDecimal.valueOf(8.5), BigDecimal.valueOf(10.0)};
        BigDecimal[] actual = doubleTableCreator.getNumbers(doubleTableCreator.max,doubleTableCreator.min
                ,doubleTableCreator.inc);
        assertArrayEquals(expected, actual);
    }
}