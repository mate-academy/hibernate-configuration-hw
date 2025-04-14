package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.util.HibernateUtil;
import org.hibernate.SessionFactory;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        injector.registerInstance(SessionFactory.class, sessionFactory);

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("title");
        movie.setDescription("description");

        Movie addedMovie = movieService.add(movie);
        System.out.println("Added movie: " + addedMovie);

        Movie fetchedMovie = movieService.get(addedMovie.getId());
        System.out.println("Fetching the movie: " + fetchedMovie);
    }
}
