package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.util.HibernateUtil;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("The Matrix");
        movie.setDescription("A computer hacker learns about the true nature of reality");

        Movie addedMovie = movieService.add(movie);
        System.out.println("Added movie: " + addedMovie);
        System.out.println("Movie from DB: " + movieService.get(addedMovie.getId()));

        HibernateUtil.getSessionFactory().close();
    }
}
