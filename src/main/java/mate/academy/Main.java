package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.domain.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.MovieServiceImpl;

public class Main {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();
        MovieService movieService = new MovieServiceImpl(movieDao);
        movieService.add(new Movie("aaaa", "bbbbb"));
        System.out.println(movieService.get(1L));
    }
}
