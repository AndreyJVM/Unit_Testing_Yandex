/*Создай стаб для объекта класса List, который при вызове метода size() возвращает значение 100. Используй аннотацию @Mock.*/

package moki;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class Praktikum1 {
    @Mock // добавь аннотацию
    List<String> list;

    @Test
    public void friendsTest() {
        Friend friend = new Friend(list); // создай объект класса Friend
        Mockito.when(list.size()).thenReturn(100); // создай стаб
        Assert.assertEquals(100, friend.getFriendsCount());
    }
}
/*Допиши аннотацию @Mock.
Создай объект класса Friend: Friend friend = new Friend(list);.
Чтобы создать стаб, используй методы when() и thenReturn(). Получится так: Mockito.when(list.size()).thenReturn(100);.*/