package mate.academy;

import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.service.implementation.MovieServiceImpl;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure(Thread.currentThread()
                .getContextClassLoader()
                .getResource("hibernate.cfg.xml"));

        MovieService movieService = new MovieServiceImpl(new MovieDaoImpl());

        Movie firstMovie = new Movie();
        firstMovie.setTitle("Film 1");
        firstMovie.setDescription("Some film '" + firstMovie.getTitle() + "'");
        System.out.println("Film was added: " + movieService.add(firstMovie));
        System.out.println("Film with id '" + firstMovie.getId() + "':"
                + movieService.get(firstMovie.getId()));
    }
}
