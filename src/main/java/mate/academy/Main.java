package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Terminator");
        movie1.setDescription("Robots kill people");

        Movie movie2 = new Movie();
        movie2.setTitle("Gambit");
        movie2.setDescription("Yes, it's gambit!");

        Movie movie3 = new Movie();
        movie3.setTitle("Don't touch my knees");
        movie3.setDescription("Really, don't do this");

        MovieService movieService = (MovieServiceImpl) injector.getInstance(MovieService.class);

        movieService.add(movie1);
        movieService.add(movie2);
        movieService.add(movie3);

        Movie movie4 = new Movie();
        movie4.setId(2L);
        movie4.setTitle("Wakanda");
        movie4.setDescription("bzzzt..");

        movieService.update(movie4);

        movieService.delete(1L);

        Movie presentMovie = movieService.get(2L);
        System.out.println(presentMovie);
    }
}
