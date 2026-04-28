package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieServie;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieServie movieServie = (MovieServie) injector.getInstance(MovieServie.class);

        Movie movie = new Movie();
        movie.setTitle("title");
        movie.setDescription("description");

        movieServie.add(movie);
        movieServie.get(movie.getId());
    }
}
