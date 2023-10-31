package mate.academy;

import java.util.ArrayList;
import java.util.List;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector =
            Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        //MovieDao movieDao = (MovieDao) injector.getInstance(MovieDao.class);
        MovieService movieService =
                (MovieService) injector.getInstance(MovieService.class);

        List<Movie> movies = createMovies(movieService);

        for (int i = 1; i <= movies.size(); i++) {
            System.out.println(movieService.get(Long.valueOf(i)));
        }
    }

    public static List<Movie> createMovies(MovieService movieService) {
        List<Movie> movies = new ArrayList<>();

        Movie lady = new Movie();
        lady.setTitle("Lady Bird");
        lady.setDescription("drama, komedy");
        Movie ladyAdd = movieService.add(lady);
        movies.add(ladyAdd);

        Movie star = new Movie();
        star.setTitle("A Star Is Born");
        star.setDescription("musical romantic drama");
        Movie starAdd = movieService.add(star);
        movies.add(starAdd);

        Movie coco1 = new Movie();
        coco1.setTitle("Coco");
        coco1.setDescription("animated fantasy");
        Movie coco1Add = movieService.add(coco1);
        movies.add(coco1Add);

        return movies;
    }
}
