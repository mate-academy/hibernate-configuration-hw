package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie townOfCringe = new Movie();
        townOfCringe.setTitle("Town of Cringe");
        townOfCringe.setDescription("Horror movie for 75+");
        movieService.add(townOfCringe);
        Movie myHornyPony = new Movie();
        myHornyPony.setTitle("My Horny Pony");
        myHornyPony.setDescription("Adventures of Abraham the Pony");
        movieService.add(myHornyPony);
        System.out.println(movieService.get(myHornyPony.getId()));
        System.out.println(movieService.get(townOfCringe.getId()));
    }
}
