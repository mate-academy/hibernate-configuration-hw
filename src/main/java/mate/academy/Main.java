package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        MovieService movieService = (MovieService) Injector.getInstance("mate.academy").getInstance(MovieService.class);
      Movie movie = new Movie();
      movie.setDescription("Fantastic film about Robin Hood");
      movie.setTitle("Robin Hood");
      System.out.println(movieService.add(movie));
      System.out.println(movieService.get(1L));
    }
}
