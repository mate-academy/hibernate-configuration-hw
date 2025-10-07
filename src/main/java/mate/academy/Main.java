package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.movieservice.MovieServiceImpl;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieServiceImpl movieServiceImplInstance =
                (MovieServiceImpl) injector.getInstance(MovieServiceImpl.class);
        Movie movie = new Movie();
        movie.setTitle("The Shawshank Redemption");
        movie.setDescription("Description of The Shawshank Redemption");
        movieServiceImplInstance.add(movie);
    }
}
