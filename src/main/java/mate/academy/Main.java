package mate.academy;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie it = new Movie();
        it.setTitle("IT");
        it.setDescription("Legendary horror story about a clown");
        Movie it2 = new Movie();
        it2.setTitle("IT 2");
        it2.setDescription("Legendary horror story about a clown (part 2)");
        movieService.add(it);
        movieService.add(it2);

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(121212L));
    }
}
