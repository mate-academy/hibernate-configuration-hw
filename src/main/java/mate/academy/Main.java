package mate.academy;

import mate.academy.model.Movie;
import mate.academy.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session mySession = sessionFactory.openSession();
        Transaction transaction = mySession.beginTransaction();
        Movie move = new Movie();
        move.setTitle("mymoive");
        move.setId(BigInteger.ONE);
        move.setDescription("desc");
        mySession.save(move);
        transaction.commit();
        mySession.close();
    }
}
