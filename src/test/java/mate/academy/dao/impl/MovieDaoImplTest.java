package mate.academy.dao.impl;

import mate.academy.dao.MovieDao;
import mate.academy.model.Movie;
import org.junit.Assert;
import org.junit.Test;

public class MovieDaoImplTest extends AbstractTest {

    @Override
    protected Class<?>[] entities() {
        return new Class[]{Movie.class};
    }


    @Test
    public void create_Ok() {
        MovieDao movieDao = new MovieDaoImpl(getSessionFactory());
        insertMovies(movieDao);
    }

    @Test
    public void getById_Ok() {
        MovieDao movieDao = new MovieDaoImpl(getSessionFactory());
        insertMovies(movieDao);
        Movie actual = movieDao.get(1L);
        Assert.assertNotNull(actual);
        Assert.assertEquals(1L, actual.getId().longValue());
        Assert.assertEquals(Movies.shawshankRedemption.getTitle(), actual.getTitle());
    }

    private void insertMovies(MovieDao movieDao) {
        Movie shawshankRedemption = Movies.shawshankRedemption.clone();
        verifyCreateMovieWorks(movieDao, shawshankRedemption, 1L);

        Movie godfather = Movies.godfather.clone();
        verifyCreateMovieWorks(movieDao, godfather, 2L);

        Movie darkKnight = Movies.darkKnight.clone();
        verifyCreateMovieWorks(movieDao, darkKnight, 3L);

        Movie fightClub = Movies.fightClub.clone();
        verifyCreateMovieWorks(movieDao, fightClub, 4L);

        Movie forrestGump = Movies.forrestGump.clone();
        verifyCreateMovieWorks(movieDao, forrestGump, 5L);

        Movie matrix = Movies.matrix.clone();
        verifyCreateMovieWorks(movieDao, matrix, 6L);

        Movie interstellar = Movies.interstellar.clone();
        verifyCreateMovieWorks(movieDao, interstellar, 7L);

        Movie gladiator = Movies.gladiator.clone();
        verifyCreateMovieWorks(movieDao, gladiator, 8L);
    }

    private void verifyCreateMovieWorks(MovieDao movieDao, Movie movie, Long expectedId) {
        Movie actual = movieDao.add(movie);
        Assert.assertNotNull("Check you have implemented the `create` method " +
                "in the MovieDaoImpl class", actual);
        Assert.assertNotNull("ID for movie should be autogenerated", actual.getId());
        Assert.assertEquals(expectedId, actual.getId());
        Assert.assertEquals(movie.getTitle(), actual.getTitle());
    }

}
