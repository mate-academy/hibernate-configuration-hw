package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.exception.DataProcessingException;

public class Main {
    public static void main(String[] args) throws DataProcessingException {
        MovieDao movieDao = new MovieDaoImpl();
    }
}
