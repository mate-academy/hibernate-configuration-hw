package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        MovieService movieService = new MovieServiceImpl(movieDao);
        Movie movie = new Movie();
        movie.setTitle("new Movie");
        movie.setDescription("exciting movie");

        Movie add = movieService.add(movie);

        Movie get = movieService.get(1L);
        System.out.println(add);
        System.out.println(get);
    }
}
