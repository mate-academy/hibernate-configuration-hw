package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    private static final Injector injector = Injector
            .getInstance("mate.academy");
    private static final MovieService movieService = (MovieService) injector
            .getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Lord of the Rings");
        movie1.setDescription("Fantasy");
        Movie movie2 = new Movie();
        movie2.setTitle("Road 666");
        movie2.setDescription("Horror");
        Movie movie3 = new Movie();
        movie3.setTitle("Poker Face");
        movie3.setDescription("Family");
        Movie movie4 = new Movie();
        movie4.setTitle("Halloween");
        movie4.setDescription("Horror");

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);
        movieService.add(movie4);
    }
}
