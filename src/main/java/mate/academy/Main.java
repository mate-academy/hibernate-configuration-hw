package mate.academy;

import mate.academy.dao.MovieDaoImpl;
import mate.academy.model.Movie;

public class Main {
    public static void main(String[] args) {
        MovieDaoImpl movieDao = new MovieDaoImpl();
        Movie movie = new Movie();
        movie.setTitle("Pulp fiction");
        movie.setDecription("Pulp Fiction is a 1994 American independent crime film "
                + "written and directed by Quentin Tarantino "
                + "from a story he conceived with Roger Avary.");

        movieDao.add(movie);
        System.out.println(movieDao.get(1L));
    }
}
