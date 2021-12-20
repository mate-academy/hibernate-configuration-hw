package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Hateful Eight");
        movie.setDescription("western");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        System.out.println("save movie - " + movieService.save(movie));
        System.out.println("get movie - " + movieService.get(movie.getId()));
        }
}
