package mate.academy;

import java.util.Optional;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Optional<Movie> get(Long id) {
        return movieDao.get(id);
    }
}
