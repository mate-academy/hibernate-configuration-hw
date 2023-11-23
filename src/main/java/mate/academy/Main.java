package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        final Injector injector = Injector.getInstance("mate.academy");
        final MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movieToAdd = new Movie();
        movieToAdd.setTitle("Pain Hustlers");
        movieToAdd.setDescription("After losing her job, a woman who's struggling to raise "
                + "her daughter takes a job out of desperation.");

        movieService.add(movieToAdd);
        final Movie movieFromDb = movieService.get(1L);
        System.out.println(movieFromDb);

    }
}
