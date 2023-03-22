import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.zloyegor.trigonometry.Sin;

public class TestFunction {

    @Before
    public void mockSetup() {
        double accuracy = .1e-10;

        // TODO: Надо сделать похожие заглушки для всех остальных тригонометрических функций и логарифмов в этом методе (пункт 4 в задании)
        Sin sinMock = Mockito.mock(Sin.class);

        //Здесь по три точки в каждом классе эквивалентности (квадранты) + граничные значения + пара больших углов
        //Стоит наверное по аналогии отрицательные углы добавить ещё
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

    }

    @Test
    public void testSin() {
        /* TODO:
            Как я понял, надо в каждом отдельном тесте провести интеграцию по одному модулю.
            Берешь, описываешь фунцию полностью из заглушек, только синус здесь остается настоящий.
            ассертишь в конце и усё.
            По аналогии тестируешь по отдельности каждый из настоящих методов.
            Можно еще бахнуть тест на все логарифмы и на все тригон. функции.
         */
    }
}
