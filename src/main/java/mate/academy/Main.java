package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Movie movieFast;

    static {
        movieFast = new Movie();
        movieFast.setTitle("Fast");
        movieFast.setDescription("Movie about fast cars");
    }

    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movieFastWithId = movieService.add(movieFast);
        System.out.println("Added movie - " + movieFast
                            + " In DB this movie is - " + movieFastWithId);
        Long movieFastId = movieFastWithId.getId();
        Movie movieFoundById = movieService.get(movieFastId);
        System.out.println("Tried to get Movie by id - " + movieFastId + ". "
                            + "Found the following movie: " + movieFoundById);
    }
}
