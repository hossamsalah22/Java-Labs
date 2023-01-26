
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao = InMemoryWorldDao.getInstance();
      // Write your code here
      List<City> highPopulatedCity = countryDao.findAllCountries()
            .stream()
            .map(country -> country.getCities().stream().max(Comparator.comparing(City::getPopulation)))
            .filter(Optional::isPresent)
            .map(Optional::get)
            .collect(Collectors.toList());
      highPopulatedCity.forEach(System.out::println);
   }
}