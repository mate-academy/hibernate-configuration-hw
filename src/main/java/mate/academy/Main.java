package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        MovieDao movieDao = new MovieDaoImpl();

        Movie movie = new Movie();
        movie.setId(10L);
        movie.setTitle("Ninja turtles 2");
        movie.setDescription("cartoon");

        movieDao.save(movie);

        Optional<Movie> movieFromDB = movieDao.get(1L);
        System.out.println(movieFromDB);
    }
}
