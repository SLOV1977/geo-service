import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {

    GeoService geoService = new GeoServiceImpl();

    @Test
    public void testByIp_Local() {
        String ip = "172.0.0.1";
        Location result = geoService.byIp(ip);
        Assertions.assertInstanceOf(Location.class, result);
    }

    @Test
    public void testByIp_Russia() {
        String ip = "172.0.0.1";
        Country expected = Country.RUSSIA;
        Country result = geoService.byIp(ip).getCountry();
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testByIp_USA() {
        String ip = "96.0.0.1";
        Country expected = Country.USA;
        Country result = geoService.byIp(ip).getCountry();
        Assertions.assertEquals(expected, result);
    }
}