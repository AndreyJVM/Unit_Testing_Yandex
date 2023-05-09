package selenide;
import org.junit.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class Praktikum {


    @Test
    public void test() {
        // создай драйвер для браузера Chrome
        // перейди на страницу тестового стенда
        LoginPageMestoSelenide loginPage =
                open("https://qa-mesto.praktikum-services.ru/",
                        LoginPageMestoSelenide.class);
        // выполни авторизацию
        ...
        // кликни по изображению профиля
        $...
        // в поле ссылки на изображение введи ссылку
        $...
        // сохрани новое изображение
        $...
    }


    // вход в приложение
        loginPage.login("Введи сюда email твоей учётной записи",
                "Введи сюда пароль твоей учётной записи");
}
