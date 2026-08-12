package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService = (MovieService)
            injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            Movie movie = new Movie();
            movie.setTitle("title" + i);
            movie.setDescription("description" + i);
            System.out.println(movieService.add(movie));
        }
        System.out.println(movieService.get(3L));

    }
}
