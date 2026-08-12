package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Fight Club");
        movie.setDescription("16+, Thriller");
        Movie added = movieService.add(movie);
        Movie obtained = movieService.get(added.getId());
        System.out.println(obtained.getDescription() + " " + obtained.getTitle());
    }
}
