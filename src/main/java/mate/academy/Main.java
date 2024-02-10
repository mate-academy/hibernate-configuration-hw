package mate.academy;

import mate.academy.lib.Inject;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    @Inject
    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movieBlackSwan = new Movie();
        movieBlackSwan.setTitle("BLACK SWAN");
        movieBlackSwan.setDescription("The story "
                + "about a ballerina is completely consumed with dance");
        movieService.add(movieBlackSwan);
        System.out.println("First added movie: " + movieBlackSwan);

        Movie movieGetByIndex = movieService.get(1L);
        System.out.println("Movie by index 1: " + movieGetByIndex);
    }
}
