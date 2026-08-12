package mate.academy;

import mate.academy.exception.DataProcessingException;
import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.services.MovieService;
import mate.academy.util.HibernateUtil;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        // Create an instance of MovieService using the injector

        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie1 = new Movie("Inception", "AAAAA");
        Movie addedMovie1 = movieService.add(movie1);

        Movie movie2 = new Movie("The Matrix", "BBBBB.");
        Movie addedMovie2 = movieService.add(movie2);

        if (addedMovie1.getId() != null) {
            try {
                movieService.get(addedMovie1.getId());
            } catch (Exception e) {
                throw new DataProcessingException("Помилка доступу індифікатора: "
                        + addedMovie1.getId(), e);
            }
        }

        if (addedMovie2.getId() != null) {
            try {
                movieService.get(addedMovie2.getId());
            } catch (Exception e) {
                throw new DataProcessingException("Помилка доступу індифікатора: "
                        + addedMovie2.getId(), e);
            }
        }

        Long nonExistentId = 999L;
        try {
            movieService.get(nonExistentId);
        } catch (Exception e) {
            throw new DataProcessingException(
                    "Тест на отримання індифікатора неіснуйочого фільму", e);
        } finally {
            HibernateUtil.shutdown();
        }
    }
}
