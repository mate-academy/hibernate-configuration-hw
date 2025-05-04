package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.movie.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movieHarryPotter = new Movie();
        movieHarryPotter.setTitle("HarryPotter");
        movieHarryPotter.setDescription("Perfect film about boy");

        Movie movieHobbit = new Movie();
        movieHobbit.setTitle("Hobbit");
        movieHobbit.setDescription("Interesting film about dwarfs voyage");

        Movie movieNemo = new Movie();
        movieNemo.setTitle("Nemo");
        movieNemo.setDescription("Family film about fish");

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        System.out.println(movieService.add(movieHarryPotter));
        System.out.println(movieService.add(movieHobbit));
        System.out.println(movieService.add(movieNemo));

        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(3L));
    }
}
