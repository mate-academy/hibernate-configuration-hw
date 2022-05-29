package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService movieService
            = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Pride and Prejudice");
        movie.setDescription("British classics");
        movieService.add(movie);
        System.out.println(movieService.get(1L));
    }
}
