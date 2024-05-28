package mate.academy;

import java.util.List;
import java.util.stream.Collectors;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static MovieService service;

    public static void main(String[] args) {
        service = (MovieService) injector.getInstance(MovieService.class);

        List movies = List.of(
                new Movie("Harry Potter", "Magic gay"),
                new Movie("Titanic", "submarine"),
                new Movie("The Cars", "KCHAY"),
                new Movie("The green mile", "I cry"));

        movies.stream().map(movie -> service.add((Movie) movie)).collect(Collectors.toList());

        System.out.println(service.get(1L));
    }
}
