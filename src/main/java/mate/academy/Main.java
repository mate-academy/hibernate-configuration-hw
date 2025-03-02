package mate.academy;

import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieServiceImpl();
        Movie movie = new Movie();
        movie.setTitle("The Dark Knight");
        movie.setDescription("The best comics movie of cinematography");
        Movie movie2 = new Movie();
        movie2.setTitle("Star Wars");
        movie2.setDescription("Early movies were better");
        Movie movie3 = new Movie();
        movie3.setTitle("Mad Max");
        movie3.setDescription("Very cool action");
        movieService.save(movie);
        movieService.save(movie2);
        movieService.save(movie3);
        System.out.println(movieService.get(2L));
        System.out.println(movieService.get(1L));
        System.out.println(movieService.get(3L));
    }
}
