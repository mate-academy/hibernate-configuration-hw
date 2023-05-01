package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.lib.MovieDao;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate");
    private static final MovieDao dao = (MovieDao) injector.getInstance(MovieDao.class);
    private static final MovieService service =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setDescription("vyacheslavs story");
        movie.setTitle("Vyacheslavinha life");
        service.add(movie);
        Movie obtained = service.get(1L);
        System.out.println(obtained);
    }
}
