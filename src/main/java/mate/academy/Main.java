package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService = (MovieService) injector
                .getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("movie");
        movie.setDescription("Awesome");

        movieService.add(movie);

        Movie optional = movieService.get(1L);
        System.out.println(optional);
    }
}
