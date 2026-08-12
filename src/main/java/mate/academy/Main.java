package mate.academy;

import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.impl.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImpl();
        Movie movie1 = new Movie();
        movie1.setTitle("Twilight");
        movie1.setDescription("Movie About vampires");
        movieService.add(movie1);
        Movie movie2 = new Movie();
        movie2.setTitle("Harry_Potter");
        movie2.setDescription("Movie about magicians");
        movieService.add(movie2);
        System.out.println(movieService.get(2L));
    }
}
