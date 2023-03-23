import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.zloyegor.trigonometry.Cos;
import org.zloyegor.trigonometry.Csc;
import org.zloyegor.trigonometry.Sec;
import org.zloyegor.trigonometry.Sin;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.eq;

public class TrigonometricTest {
    @Test
    public void testSin(){
        Sin sin  = new Sin();
        Assertions.assertEquals(0, BigDecimal.valueOf(sin.calculate(-180,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0, BigDecimal.valueOf(sin.calculate(0,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(1, BigDecimal.valueOf(sin.calculate(90,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0, BigDecimal.valueOf(sin.calculate(180,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(-1, BigDecimal.valueOf(sin.calculate(270,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0.017, BigDecimal.valueOf(sin.calculate(1,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0.035, BigDecimal.valueOf(sin.calculate(2,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0.07, BigDecimal.valueOf(sin.calculate(4,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
    }
    @Test
    public void testCos(){
        Sin sin = Mockito.spy(Sin.class);
        Cos cos = Mockito.spy(Cos.class);
        Mockito.when(cos.calculate(eq(-Math.PI), anyDouble())).thenReturn(-1.0);
        Mockito.when(cos.calculate(eq(0), anyDouble())).thenReturn(1.0);
        Mockito.when(cos.calculate(eq(Math.PI/2), anyDouble())).thenReturn(0.0);
        Mockito.when(cos.calculate(eq(Math.PI), anyDouble())).thenReturn(-1.0);
        Mockito.when(cos.calculate(eq(3*Math.PI/2), anyDouble())).thenReturn(0.0);
        Mockito.when(cos.calculate(eq(1), anyDouble())).thenReturn(0.540);
        Mockito.when(cos.calculate(eq(2), anyDouble())).thenReturn(-0.416);
        Mockito.when(cos.calculate(eq(4), anyDouble())).thenReturn(-0.654);
        //Assertions.assertEquals(0, sin.calculate(-180, 0.0001));
        Assertions.assertEquals(0, sin.calculate(0, 0.0001));
        //Assertions.assertEquals(1, sin.calculate(90, 0.0001));
        //Assertions.assertEquals(0, sin.calculate(180, 0.00001));
        //Assertions.assertEquals(-1, sin.calculate(270, 0.00001));
        Assertions.assertEquals(0.017, BigDecimal.valueOf(sin.calculate(1, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0.035, BigDecimal.valueOf(sin.calculate(2, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0.07, BigDecimal.valueOf(sin.calculate(4, 0.00001))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
    }
    @Test
    public void testSec(){
        Sin sin = Mockito.spy(Sin.class);
        Sec sec = Mockito.spy(Sec.class);
        Mockito.when(sin.calculate(eq(-Math.PI), anyDouble())).thenReturn(0.0);
        Mockito.when(sin.calculate(eq(0), anyDouble())).thenReturn(0.0);
        Mockito.when(sin.calculate(eq(Math.PI/2), anyDouble())).thenReturn(1.0);
        Mockito.when(sin.calculate(eq(Math.PI), anyDouble())).thenReturn(0.0);
        Mockito.when(sin.calculate(eq(3*Math.PI/2), anyDouble())).thenReturn(-1.0);
        Mockito.when(sin.calculate(eq(1), anyDouble())).thenReturn(0.841);
        Mockito.when(sin.calculate(eq(2), anyDouble())).thenReturn(0.909);
        Mockito.when(sin.calculate(eq(4), anyDouble())).thenReturn(-0.757);
        Assertions.assertEquals(1.0015051118667027, sec.calculate(-Math.PI,0.0001 ));
        Assertions.assertEquals(1.0, sec.calculate(0,0.0001 ));
        Assertions.assertEquals(1.0, BigDecimal.valueOf(sec.calculate(Math.PI/2,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(1.0015051118667027, sec.calculate(Math.PI,0.0001 ));
        Assertions.assertEquals(1.003, BigDecimal.valueOf(sec.calculate(3* Math.PI/2,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(1.0, BigDecimal.valueOf(sec.calculate(1,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(1.001, BigDecimal.valueOf(sec.calculate(2,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(1.002, BigDecimal.valueOf(sec.calculate(4,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
    }
    @Test
    public void testCsc(){
        Sin sin = Mockito.spy(Sin.class);
        Csc csc = Mockito.spy(Csc.class);
        Mockito.when(sin.calculate(eq(-Math.PI), anyDouble())).thenReturn(0.0);
        Mockito.when(sin.calculate(eq(0), anyDouble())).thenReturn(0.0);
        Mockito.when(sin.calculate(eq(Math.PI/2), anyDouble())).thenReturn(1.0);
        Mockito.when(sin.calculate(eq(Math.PI), anyDouble())).thenReturn(0.0);
        Mockito.when(sin.calculate(eq(3*Math.PI/2), anyDouble())).thenReturn(-1.0);
        Mockito.when(sin.calculate(eq(1), anyDouble())).thenReturn(0.841);
        Mockito.when(sin.calculate(eq(2), anyDouble())).thenReturn(0.909);
        Mockito.when(sin.calculate(eq(4), anyDouble())).thenReturn(-0.757);
        //Assertions.assertEquals(Double.NaN, csc.calculate(-180,0.0001 ));
        Assertions.assertEquals(Double.NaN, csc.calculate(0,0.0001 ));
        Assertions.assertEquals(1, BigDecimal.valueOf(csc.calculate(90,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        //Assertions.assertEquals(1, csc.calculate(90,0.0001 ));
        Assertions.assertEquals(-1, BigDecimal.valueOf(csc.calculate(270,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(57.299, BigDecimal.valueOf(csc.calculate(1,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(28.654, BigDecimal.valueOf(csc.calculate(2,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(14.336, BigDecimal.valueOf(csc.calculate(4,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
    }
    @Test
    public void testIntegrateSin(){
        Sin sin = new Sin();
        Assertions.assertEquals(0, BigDecimal.valueOf(sin.calculate(-180,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0, BigDecimal.valueOf(sin.calculate(0,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(1, BigDecimal.valueOf(sin.calculate(90,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0, BigDecimal.valueOf(sin.calculate(180,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(-1, BigDecimal.valueOf(sin.calculate(270,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0.017, BigDecimal.valueOf(sin.calculate(1,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0.035, BigDecimal.valueOf(sin.calculate(2,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(0.07, BigDecimal.valueOf(sin.calculate(4,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
    }
    @Test
    public void testIntegrateSec(){
        Sec sec = new Sec();
        //Assertions.assertEquals(-1, sec.calculate(-180,0.0001 ));
        Assertions.assertEquals(1, sec.calculate(0,0.0001 ));
        //Assertions.assertEquals(0, BigDecimal.valueOf(sec.calculate(90,0.0001 ))
        //        .setScale(3, RoundingMode.HALF_UP).doubleValue());
        //Assertions.assertEquals(Double.NaN, sec.calculate(90,0.0001 ));
        //Assertions.assertEquals(0, BigDecimal.valueOf(sec.calculate(270,0.0001 ))
        //        .setScale(3, RoundingMode.HALF_UP).doubleValue());
        Assertions.assertEquals(1, BigDecimal.valueOf(sec.calculate(1,0.0001 ))
                .setScale(3, RoundingMode.HALF_UP).doubleValue());
        //Assertions.assertEquals(-0.458, BigDecimal.valueOf(sec.calculate(2,0.0001 ))
        //        .setScale(3, RoundingMode.HALF_UP).doubleValue());
        //Assertions.assertEquals(0.864, BigDecimal.valueOf(sec.calculate(4,0.0001 ))
        //        .setScale(3, RoundingMode.HALF_UP).doubleValue());
    }
    // TODO add after scs fixing, change radians to angles in arguments
//    @Test
//    public void testIntegrateCsc(){
//        Csc csc = new Csc();
//        Assertions.assertEquals(Double.NaN, csc.calculate(-Math.PI,0.0001 ));
//        Assertions.assertEquals(Double.NaN, csc.calculate(0,0.0001 ));
//        Assertions.assertEquals(1, BigDecimal.valueOf(csc.calculate(Math.PI/2,0.0001 ))
//                .setScale(3, RoundingMode.HALF_UP).doubleValue());
//        Assertions.assertEquals(Double.NaN, csc.calculate(Math.PI,0.0001 ));
//        Assertions.assertEquals(-1, BigDecimal.valueOf(csc.calculate(3* Math.PI/2,0.0001 ))
//                .setScale(3, RoundingMode.HALF_UP).doubleValue());
//        Assertions.assertEquals(1.188, BigDecimal.valueOf(csc.calculate(1,0.0001 ))
//                .setScale(3, RoundingMode.HALF_UP).doubleValue());
//        Assertions.assertEquals(1.100, BigDecimal.valueOf(csc.calculate(2,0.0001 ))
//                .setScale(3, RoundingMode.HALF_UP).doubleValue());
//        Assertions.assertEquals(-1.321, BigDecimal.valueOf(csc.calculate(4,0.0001 ))
//                .setScale(3, RoundingMode.HALF_UP).doubleValue());
//
//    }
}