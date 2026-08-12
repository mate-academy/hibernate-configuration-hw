package mate.academy;

import mate.academy.lib.Injector;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("The Matrix");
        movie.setDescription("A computer programmer discovers a mysterious world...");

        movieService.add(movie);

        movieService.get(movie.getId()).ifPresent(savedMovie ->
                System.out.println("Found movie: " + savedMovie.getTitle()));
    }
}
