package esercizio1;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class City {

    private final String name;

    private boolean visited;

    private final Set<City> cities;

    private static final List<City> cityList = new ArrayList<>();

    public City(String name) {
        this.name = name;
        cities = new HashSet<>();
        cityList.add(this);
    }

    public void connect(City city) {
        this.cities.add(city);
        city.cities.add(this);
    }

    public Collection<City> getConnections() {
        return cities;
    }

    public boolean isConnected(City city) {
        initCities();
        return isConnected2(city);
    }

    public void initCities() {
        for(City c : cityList)
            c.visited = false;
    }

    public boolean isConnected2(City arrivo) {
        boolean response = false;
        if(this == arrivo || this.cities.contains(arrivo))
            return true;
        for(City c : arrivo.cities) {
            if(response)
                break;
            if(!c.visited) {
                arrivo.visited = true;
                response = isConnected2(c);
            }
        }
        return response;
    }

    @Override
    public String toString() {
        return name;
    }
}
