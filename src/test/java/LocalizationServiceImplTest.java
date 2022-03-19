import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @Test
    void testLocal(){
        LocalizationService localizationService = new LocalizationServiceImpl();
        String act = localizationService.locale(Country.USA);
        String exp = "Welcome";
        Assertions.assertEquals(exp, act);

    }
}
