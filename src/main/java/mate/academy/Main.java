package mate.academy;

import mate.academy.model.Movie;
import mate.academy.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Movie movie = new Movie();
        movie.setTitle("Movie 1");
        session.save(movie);
        transaction.commit();
        session.close();

    }
}
