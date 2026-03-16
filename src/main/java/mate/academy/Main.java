package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;

public class Main {
    public static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieServiceImpl.class);

        Movie movie = new Movie();
        movie.setTitle("Interstellar");
        movie.setDescription("The future and space travel");

        movieService.add(movie);
        System.out.println("Movie" + movie.getTitle() + "Was added to db");

        Movie getMovieFromDB = movieService.get(1L);
        System.out.println(getMovieFromDB.toString());
    }
}
