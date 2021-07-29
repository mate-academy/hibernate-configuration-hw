package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");
    private static final MovieService movieService =
            (MovieService) injector.getInstance(MovieService.class);

    public static void main(String[] args) {
        Movie movieToyStory = new Movie();
        movieToyStory.setTitle("Toy Story");
        movieToyStory.setDescription("Adventures of two friends");
        movieService.add(movieToyStory);

        Movie movieZootopia = new Movie();
        movieZootopia.setTitle("Zootopia");
        movieZootopia.setDescription("Story about bunny policemen");
        movieService.add(movieZootopia);

        System.out.println(movieService.get(movieToyStory.getId()));
        System.out.println(movieService.get(movieZootopia.getId()));
    }
}
