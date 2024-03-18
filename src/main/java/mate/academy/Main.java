package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector INJECTOR = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) INJECTOR.getInstance(MovieService.class);

        Movie movie = new Movie();
        movie.setTitle("Nightmare on Big Mouse Street");
        movie.setDescription("In a world where rodents have become humanity's greatest terror, "
                + "a group of relentless mice sets out on a hunt for giant rats to save their "
                + "neighborhood from the tyranny of terrifying rodents. In this fantasy-action "
                + "comedy, the toothy heroes will battle for their territory in an epic clash "
                + "between the eared and tailed!");

        System.out.println("Movie added: " + movieService.add(movie));
        System.out.println("Movie get by id 1: " + movieService.get(movie.getId()));
        System.out.println("Movie get by id 2: " + movieService.get(2L));
    }
}
