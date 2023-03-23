import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.zloyegor.logarithmic.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.eq;

public class LogarithmTest {
    @Test
    public void testLog(){
        Log log = new Log();
        Assertions.assertEquals(0, log.calculate(1,0.00001));
        Assertions.assertEquals(Double.NaN, log.calculate(0,0.00001));
        Assertions.assertEquals(1.000, BigDecimal.valueOf(log.calculate(Math.E, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(-1.386, BigDecimal.valueOf(log.calculate(0.25, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(-0.693, BigDecimal.valueOf(log.calculate(0.5, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(-0.288, BigDecimal.valueOf(log.calculate(0.75, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(1.609, BigDecimal.valueOf(log.calculate(5, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(2.303, BigDecimal.valueOf(log.calculate(10, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
    }
    @Test
    public void testModuleLN(){
        Log log = Mockito.spy(Log.class);
        Log2 log2 = Mockito.spy(Log2.class);
        Log3 log3 = Mockito.spy(Log3.class);
        Log5 log5 = Mockito.spy(Log5.class);
        Log10 log10 = Mockito.spy(Log10.class);

        Mockito.when(log.calculate(eq(1), anyDouble())).thenReturn(0.0);
        Mockito.when(log.calculate(eq(0), anyDouble())).thenReturn(Double.NaN);
        Mockito.when(log.calculate(eq(0.25), anyDouble())).thenReturn(-1.386);
        Mockito.when(log.calculate(eq(0.75), anyDouble())).thenReturn(-0.288);
        Mockito.when(log.calculate(eq(5), anyDouble())).thenReturn(1.609);

        Assertions.assertEquals(0, BigDecimal.valueOf(log2.calculate(1, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(Double.NaN, log3.calculate(0,0.00001));
        Assertions.assertEquals(-0.861, BigDecimal.valueOf(log5.calculate(0.25, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(-0.125, BigDecimal.valueOf(log10.calculate(0.75,0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(2.322, BigDecimal.valueOf(log2.calculate(5,0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(2.096, BigDecimal.valueOf(log3.calculate(10, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
    }
    @Test
    public void testIntegrateLN(){
        Log2 log2 = new Log2();
        Log3 log3 = new Log3();
        Log5 log5 = new Log5();
        Log10 log10 = new Log10();
        Assertions.assertEquals(0, log2.calculate(1,0.00001));
        Assertions.assertEquals(Double.NaN, log2.calculate(0, 0.00001));
        Assertions.assertEquals(0.91, BigDecimal.valueOf(log3.calculate(Math.E, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(-0.861, BigDecimal.valueOf(log5.calculate(0.25, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(-0.301, BigDecimal.valueOf(log10.calculate(0.5, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(-0.415, BigDecimal.valueOf(log2.calculate(0.75, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(1.465, BigDecimal.valueOf(log3.calculate(5, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(1.431, BigDecimal.valueOf(log5.calculate(10, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
    }
}