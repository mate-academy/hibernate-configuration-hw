package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.impl.MovieDaoImpl;
import mate.academy.model.Movie;

public class Main {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();

        Movie movie = new Movie();
        movie.setTitle("Transformers");
        movie.setDescription("A film about robots capable of being "
                + "either a humanoid robot or transport");

        movieDao.save(movie);

        Movie movieFromDb = movieDao.get(movie.getId());

        System.out.println(movieFromDb);
    }
}
