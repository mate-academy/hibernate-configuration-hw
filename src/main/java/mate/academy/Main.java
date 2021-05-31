package mate.academy;

import mate.academy.dao.MovieDao;
import mate.academy.dao.MovieDaoImpl;
import mate.academy.lib.Inject;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static Injector injector = Injector.getInstance("mate");
    private static MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie terminator1 = new Movie();
        Movie avatar = new Movie();
        terminator1.setTitle("Terminator 5");
        terminator1.setDescription("Awesome movie");
        avatar.setTitle("Avatar");
        avatar.setDescription("Sci-fi movie");
        movieService.add(terminator1);
        movieService.add(avatar);
        movieService.get(terminator1.getId());
        movieService.get(avatar.getId());
    }
}
