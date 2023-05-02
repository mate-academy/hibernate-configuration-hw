package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setTitle("Batmen");
        movie.setDescription("about batman");

        MovieDao movieDao = new MovieDaoImpl();
        movieDao.add(movie);
        System.out.println(movieDao.get(1L));
    }
}
