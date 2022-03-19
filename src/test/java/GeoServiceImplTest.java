import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {
    @Test
    void testByIp() {
        GeoService geoService = new GeoServiceImpl();
        Location act = geoService.byIp("127.56.0.3");
        Location exp = new Location(null, null, null, 0);
        Assertions.assertNotEquals(exp, act);
    }
}
