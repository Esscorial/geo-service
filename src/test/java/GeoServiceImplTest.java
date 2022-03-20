import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {

    @Test
    void testByIp1() {
        GeoService geoService = new GeoServiceImpl();

        Location act1 = geoService.byIp("172.193.0.21");
        Assertions.assertEquals(Country.RUSSIA, act1.getCountry());

        Location act2 = geoService.byIp("96.193.0.21");
        Assertions.assertEquals(Country.USA, act2.getCountry());

    }
}
