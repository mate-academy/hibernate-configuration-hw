package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie scaryMovie = new Movie();
        scaryMovie.setTitle("Gone Girl");
        scaryMovie.setDescription("With his wife's disappearance having become the focus of "
                + "an intense media circus, a man s the spotlight turned on him when "
                + "it's suspected that he may not be innocent.");
        movieService.add(scaryMovie);
        System.out.println(movieService.get(1L));
    }
}
