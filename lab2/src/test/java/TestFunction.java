import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockedStatic;
import org.zloyegor.trigonometry.Sin;

public class TestFunction {

    @Before
    public void mockSetup() {
        double accuracy = .1e-10;


//        Sin sinMock = Mockito.mock(Sin.class);
//        Mockito.when(sinMock.calculate())

        try (MockedStatic<Sin> sinMock = Mockito.mockStatic(Sin.class)) {
            sinMock.when(() -> Sin.calculate(0, accuracy)).thenReturn(0.);
            sinMock.when(() -> Sin.calculate(45, accuracy)).thenReturn(0.70710678118);
            sinMock.when(() -> Sin.calculate(60, accuracy)).thenReturn(0.86602540378);
            sinMock.when(() -> Sin.calculate(90, accuracy)).thenReturn(1.);
            sinMock.when(() -> Sin.calculate(135, accuracy)).thenReturn(0.70710678118);
            sinMock.when(() -> Sin.calculate(180, accuracy)).thenReturn(0.);
            sinMock.when(() -> Sin.calculate(225, accuracy)).thenReturn(-0.70710678118);
            sinMock.when(() -> Sin.calculate(240, accuracy)).thenReturn(-0.86602540378);
            sinMock.when(() -> Sin.calculate(270, accuracy)).thenReturn(-1d);
            sinMock.when(() -> Sin.calculate(300, accuracy)).thenReturn(-0.86602540378);
            sinMock.when(() -> Sin.calculate(330, accuracy)).thenReturn(-0.5);
            sinMock.when(() -> Sin.calculate(405, accuracy)).thenReturn(0.70710678118);
            sinMock.when(() -> Sin.calculate(450, accuracy)).thenReturn(2d);
            System.out.println("bruh");
            System.out.println(Sin.calculate(450, accuracy));

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Sin.calculate(450, accuracy));

    }

    @Test
    public void test(){

    }
}
