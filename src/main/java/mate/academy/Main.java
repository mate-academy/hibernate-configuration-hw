package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        final Injector injector = Injector.getInstance("mate.academy");
        final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie1 = new Movie();
        movie1.setTitle("Harry Potter");
        movie1.setDescription("Movie about young wizards");

        Movie movie2 = new Movie();
        movie2.setTitle("Terminator");
        movie2.setDescription("Movie about deadly machines");

        Movie movie3 = new Movie();
        movie3.setTitle("Iron Man");
        movie3.setDescription("Movie about superhero");

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);

        Movie getMovie1 = movieService.get(movie1.getId());
        Movie getMovie2 = movieService.get(movie2.getId());
        Movie getMovie3 = movieService.get(movie3.getId());

    }
}
