package mate.academy;

import java.util.List;
//import java.util.Optional;
//
//import mate.academy.dao.MovieDao;
//import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService bookDao = (MovieService) injector.getInstance(MovieService.class);
        List<Movie> list = List.of(
                new Movie("film1", "good"),
                new Movie("film2", "good"),
                new Movie("film3", "good")
        );
        list.stream()
                .map(bookDao::add)
                .forEach(System.out::println);
        Movie findeMovi = bookDao.get(3L);
        System.out.println(findeMovi);
    }
}
