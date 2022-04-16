import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {

    LocalizationService localizationService = new LocalizationServiceImpl();

    @Test
    public void testLocal() {
        String actual = localizationService.locale(Country.RUSSIA);
        String expected = "Добро пожаловать";
        Assertions.assertEquals(expected, actual);
    }
}