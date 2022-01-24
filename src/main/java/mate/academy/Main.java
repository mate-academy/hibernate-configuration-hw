package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.models.Movie;
import mate.academy.services.MovieService;
import mate.academy.services.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.setTitle("Ghost Busters");
        firstMovie.setDescription("great!");

        Movie secondMovie = new Movie();
        secondMovie.setTitle("Harry Potter and the Chamber of Secrets");
        secondMovie.setDescription("great either!");

        Injector instanceService = Injector.getInstance("mate.academy.services");
        MovieService movieService = (MovieServiceImpl) instanceService
                .getInstance(MovieService.class);
        movieService.add(firstMovie);
        movieService.add(secondMovie);
    }
}
