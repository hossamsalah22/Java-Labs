
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise2 {

        public static void main(String[] args) {
                CountryDao countryDao = InMemoryWorldDao.getInstance();
                // write your answer here
                BiConsumer<String, Optional<City>> printCity = (key, value) -> {
                        City city = value.get();
                        System.out.println("Continent: " + key + " ,City: " + city.getName() + " ,Population: "
                                        + city.getPopulation());
                };
                Collector<City, ?, Map<String, Optional<City>>> highestPopulatedCities = Collectors.groupingBy(
                                city -> countryDao.findCountryByCode(city.getCountryCode()).getContinent(),
                                Collectors.maxBy(Comparator.comparing(City::getPopulation)));
                Map<String, Optional<City>> highestCity = countryDao.findAllCountries()
                                .stream()
                                .flatMap(country -> country.getCities().stream())
                                .collect(highestPopulatedCities);
                highestCity.forEach(printCity);
        }
}