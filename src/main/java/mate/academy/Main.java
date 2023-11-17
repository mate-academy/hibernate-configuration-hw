package mate.academy;

import mate.academy.lib.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movieToAdd = new Movie();
        movieToAdd.setTitle("Inception");
        Movie addedMovie = movieService.add(movieToAdd);
        System.out.println("Added Movie: " + addedMovie);

        Long movieIdToGet = addedMovie.getId();
        Movie retrievedMovie = movieService.get(movieIdToGet);
        System.out.println("Retrieved Movie: " + retrievedMovie);
    }
}
