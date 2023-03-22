import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import org.zloyegor.trigonometry.Sin;

public class TestFunction {

    @Before
    public void mockSetup() {
        double accuracy = .1e-10;

        Sin sinMock = Mockito.mock(Sin.class);

        Mockito.when(sinMock.calculate(0, accuracy)).thenReturn(0.);
        Mockito.when(sinMock.calculate(45, accuracy)).thenReturn(0.70710678118);
        Mockito.when(sinMock.calculate(60, accuracy)).thenReturn(0.86602540378);
        Mockito.when(sinMock.calculate(90, accuracy)).thenReturn(1.);
        Mockito.when(sinMock.calculate(135, accuracy)).thenReturn(0.70710678118);
        Mockito.when(sinMock.calculate(180, accuracy)).thenReturn(0.);
        Mockito.when(sinMock.calculate(225, accuracy)).thenReturn(-0.70710678118);
        Mockito.when(sinMock.calculate(240, accuracy)).thenReturn(-0.86602540378);
        Mockito.when(sinMock.calculate(270, accuracy)).thenReturn(-1d);
        Mockito.when(sinMock.calculate(300, accuracy)).thenReturn(-0.86602540378);
        Mockito.when(sinMock.calculate(330, accuracy)).thenReturn(-0.5);
        Mockito.when(sinMock.calculate(405, accuracy)).thenReturn(0.70710678118);
        Mockito.when(sinMock.calculate(450, accuracy)).thenReturn(1d);

        System.out.println(sinMock.calculate(135, accuracy));

    }

    @Test
    public void test() {

    }
}
