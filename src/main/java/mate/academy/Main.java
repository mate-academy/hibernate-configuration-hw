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
        movie.setDescription("In a world terrified by rodents, brave mice hunt giant rats to "
                + "save their neighborhood. This fantasy-action comedy pits the toothy heroes "
                + "against terrifying rodents in an epic clash!");

        System.out.println("Movie added: " + movieService.add(movie));
        System.out.println("Movie get by id 1: " + movieService.get(movie.getId()));
        System.out.println("Movie get by id 2: " + movieService.get(2L));
    }
}
