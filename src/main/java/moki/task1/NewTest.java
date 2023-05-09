/*Представь, что в тесте нужно получить определенное значение зарплаты курьера.
Для этого используют метод calcSalary() класса PayrollCalculator.
Не важно как именно будет подсчитана зарплата. Для этого можно использовать стаб.*/

/*Создай стаб для PayrollCalculator, который при вызове метода calcSalary() со значениями 0, 0, 0 будет возвращать 50000.*/

package moki.task1;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NewTest {

    @Mock // добавь аннотацию
    PayrollCalculator payrollCalculator;

    @Test
    public void calcSalaryTest() {
        Mockito.when(payrollCalculator.calcSalary(0, 0, 0))
                .thenReturn(50000); // опиши стаб
        Assert.assertEquals(50000, payrollCalculator.calcSalary(0, 0, 0));
    }

}

/*Допиши аннотацию @Mock
Когда описываешь стаб, используй методы when() и thenReturn() класса Mockito
Внутри when()понадобится метод calcSalary() стаба PayrollCalculator
Получится так: Mockito.when(payrollCalculator.calcSalary(0, 0, 0)).thenReturn(50000);*/
