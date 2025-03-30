import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void fillFormTest() {
        // открываем страницу в браузере
        open("https://demoqa.com/text-box");
        // находим поле Full Name по id и заполняем
        $("#userName").setValue("Alex Urse");
        // находим поле Email по id и заполняем
        $("#userEmail").setValue("alex_urse@gmail.com");
        // находим поле Current Address по id и заполняем
        $("#currentAddress").setValue("Moscow, Gerc str., 8");
        // находим поле Permanent Address по id и заполняем
        $("#permanentAddress").setValue("Moscow, Glagol str., 12");
        // находим кнопку Submit по id и нажимаем
        $("#submit").click();
        // находим блок с выводом по id и проверяем наличие текста
        $("#output").shouldHave(text("Alex Urse"), text("alex_urse@gmail.com"),
                text("Moscow, Gerc str., 8"), text("Moscow, Glagol str., 12"));
    }
}
