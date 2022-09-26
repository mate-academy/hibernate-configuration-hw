package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;
import mate.academy.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    private static Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Movie movie = new Movie();
        movie.setTitle("Hello11");
        movie.setDescription("Good one");

        session.save(movie);

        //transaction.commit();
        //session.close();

        //movieService.add(movie);
        //System.out.println(movieService.get(1L));
    }
}
