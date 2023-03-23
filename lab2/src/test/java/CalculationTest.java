import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.zloyegor.application.Equation;
import org.zloyegor.logarithmic.*;
import org.zloyegor.trigonometry.Cos;
import org.zloyegor.trigonometry.Csc;
import org.zloyegor.trigonometry.Sec;
import org.zloyegor.trigonometry.Sin;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.eq;

public class CalculationTest {
    @Test
    public void testFunc(){
        Log log = Mockito.spy(Log.class);
        Log2 log2 = Mockito.spy(Log2.class);
        Log3 log3 = Mockito.spy(Log3.class);
        Log5 log5 = Mockito.spy(Log5.class);
        Log10 log10 = Mockito.spy(Log10.class);
        Cos cos = Mockito.spy(Cos.class);
        Sin sin = Mockito.spy(Sin.class);
        Csc csc = Mockito.spy(Csc.class);
        Sec sec = Mockito.spy(Sec.class);
        Mockito.when(log.calculate(eq(1), anyDouble())).thenReturn(0.0);
        Mockito.when(log.calculate(eq(2), anyDouble())).thenReturn(0.693);
        Mockito.when(log.calculate(eq(4), anyDouble())).thenReturn(1.386);

        //Mockito.when(l.log2(eq(1), anyDouble())).thenReturn(0.0);
        Mockito.when(log2.calculate(eq(2), anyDouble())).thenReturn(1.0);
        Mockito.when(log2.calculate(eq(4), anyDouble())).thenReturn(2.0);

        //Mockito.when(l.log3(eq(1), anyDouble())).thenReturn(0.0);
        Mockito.when(log3.calculate(eq(2), anyDouble())).thenReturn(0.631);
        Mockito.when(log3.calculate(eq(4), anyDouble())).thenReturn(1.262);

        //Mockito.when(l.log5(eq(1), anyDouble())).thenReturn(0.0);
        Mockito.when(log5.calculate(eq(2), anyDouble())).thenReturn(0.431);
        Mockito.when(log5.calculate(eq(4), anyDouble())).thenReturn(0.861);

        //Mockito.when(l.log10(eq(1), anyDouble())).thenReturn(0.0);
        Mockito.when(log10.calculate(eq(2), anyDouble())).thenReturn(0.301);
        Mockito.when(log10.calculate(eq(4), anyDouble())).thenReturn(0.602);

        Mockito.when(cos.calculate(eq(-1), anyDouble())).thenReturn(0.540);
        Mockito.when(cos.calculate(eq(-2), anyDouble())).thenReturn(-0.416);
        Mockito.when(cos.calculate(eq(-4), anyDouble())).thenReturn(-0.654);

        Mockito.when(sin.calculate(eq(-1), anyDouble())).thenReturn(-0.814);
        Mockito.when(sin.calculate(eq(-2), anyDouble())).thenReturn(-0.909);
        Mockito.when(sin.calculate(eq(-4), anyDouble())).thenReturn(0.757);

        Mockito.when(sec.calculate(eq(-1), anyDouble())).thenReturn(-0.642);
        Mockito.when(sec.calculate(eq(-2), anyDouble())).thenReturn(0.458);
        Mockito.when(sec.calculate(eq(-4), anyDouble())).thenReturn(-0.863);

        Mockito.when(csc.calculate(eq(-1), anyDouble())).thenReturn(-1.188);
        Mockito.when(csc.calculate(eq(-2), anyDouble())).thenReturn(-1.100);
        Mockito.when(csc.calculate(eq(-4), anyDouble())).thenReturn(1.321);

        Equation e = new Equation();

        Assertions.assertEquals(1.149, BigDecimal.valueOf(e.calculateFirstSystem(-1, 0.001)).setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(859.800, BigDecimal.valueOf(e.calculateFirstSystem(-2, 0.001)).setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(14.336, BigDecimal.valueOf(e.calculateFirstSystem(-4, 0.001)).setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(Double.NaN, e.calculateFirstSystem(1, 0.001));
        Assertions.assertEquals(0, BigDecimal.valueOf(e.calculateFirstSystem(2, 0.001)).setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0, BigDecimal.valueOf(e.calculateFirstSystem(4, 0.001)).setScale(3, RoundingMode.HALF_UP).doubleValue());

        Assertions.assertEquals(1.149, BigDecimal.valueOf(e.calculateSecondSystem(-1, 0.001)).setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(859.800, BigDecimal.valueOf(e.calculateSecondSystem(-2, 0.001)).setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(14.336, BigDecimal.valueOf(e.calculateSecondSystem(-4, 0.001)).setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(Double.NaN, e.calculateSecondSystem(1, 0.001));
        Assertions.assertEquals(0, BigDecimal.valueOf(e.calculateSecondSystem(2, 0.001)).setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0, BigDecimal.valueOf(e.calculateSecondSystem(4, 0.001)).setScale(3, RoundingMode.HALF_UP).doubleValue());

    }
}