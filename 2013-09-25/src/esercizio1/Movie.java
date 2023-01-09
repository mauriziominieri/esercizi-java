package esercizio1;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Movie {

    private final String title;

    private int year;

    private Movie movie;

    private static final Map<Integer, Set<Movie>> movieMap = new HashMap<>();

    private final List<Movie> movieList;

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
        Set<Movie> movieSet = movieMap.get(year) == null ? new HashSet<>() : movieMap.get(year);
        movieSet.add(this);
        movieMap.put(year, movieSet);
        this.movieList = new ArrayList<>();
        this.movieList.add(this);
    }

    public Movie(String title, int year, Movie movie) {
        this.title = title;
        this.year = year;
        this.movie = movie;
        Set<Movie> movieSet = movieMap.get(year) == null ? new HashSet<>() : movieMap.get(year);
        movieSet.add(this);
        movieMap.put(year, movieSet);
        this.movieList = movie.movieList;
        this.movieList.add(this);
    }

    public List<Movie> getSeries() {
        return movieList;
    }

    public static Set<Movie> selectByYear(int year) {
        return movieMap.get(year);
    }

    @Override
    public String toString() {
        return title;
    }
}
