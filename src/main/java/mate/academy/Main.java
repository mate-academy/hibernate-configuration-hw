package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie1 = new Movie();
        movie1.setTitle("Kac Vegas");
        movie1.setDescription("Comedy");

        Movie movie2 = new Movie();
        movie2.setTitle("Godzilla");
        movie2.setDescription("Sci-Fi");

        movieService.add(movie1);
        movieService.add(movie2);

        Long id1 = movie1.getId();
        Long id2 = movie2.getId();

        System.out.println(id1);
        System.out.println(id2);

    }
}
