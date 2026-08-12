package mate.academy.service.impl;

import mate.academy.dao.MovieDao;
import mate.academy.exception.DataProcessingException;
import mate.academy.model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

class MovieServiceImplTest {
    @Mock
    private MovieDao movieDao;

    @InjectMocks
    private MovieServiceImpl movieService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void addMovie_Ok() {
        Movie movie = buildMovie();
        when(movieDao.add(movie)).thenReturn(movie);
        Movie savedMovie = movieService.add(movie);
        assertEquals(movie.getTitle(), savedMovie.getTitle());
    }

    @Test
    void getMovie_ok() {
        Long id = 1L;
        Movie movie = buildMovie();
        when(movieDao.get(id)).thenReturn(Optional.of(movie));
        Movie foundMovie = movieService.get(id);
        assertEquals(movie.getTitle(), foundMovie.getTitle());
    }

    @Test
    public void getMovie_notFound() {
        Long id = 1L;
        when(movieDao.get(id)).thenReturn(Optional.empty());
        assertThrows(DataProcessingException.class,
                () -> movieService.get(id));
    }

    private static Movie buildMovie() {
        return new Movie.Builder().setTitle("Title").setDescription("Description").build();
    }
}
