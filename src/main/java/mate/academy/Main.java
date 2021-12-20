package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    private static final Injector injector = Injector.getInstance("mate.academy");

    public static void main(String[] args) {
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);
        Movie movie = new Movie();
        movie.setTitle("Пірати Карибського моря");
        movie.setDescription("Жизнь харизматичного авантюриста, капитана Джека Воробья, "
                + "полная увлекательных приключений, резко меняется, "
                + "когда его заклятый враг — капитан Барбосса — похищает корабль Джека,"
                + " Черную Жемчужину, а затем нападает на Порт Ройал и крадет прекрасную"
                + " дочь губернатора, Элизабет Свонн.\n"
                + "Друг детства Элизабет, Уилл Тернер, вместе с Джеком возглавляет спасательную "
                + "экспедицию на самом быстром корабле Британии, в попытке вызволить девушку из "
                + "плена и заодно отобрать у злодея Черную Жемчужину. "
                + "Вслед за этой парочкой отправляется амбициозный коммодор Норрингтон, "
                + "который к тому же числится женихом Элизабет.\n"
                + "Однако Уилл не знает, что над Барбоссой висит вечное проклятие, "
                + "при лунном свете превращающее его с командой в живых скелетов. "
                + "Проклятье будет снято лишь тогда, когда украденное золото Ацтеков будет "
                + "возвращено пиратами на старое место.");
        Movie savedMovie = movieService.add(movie);
        System.out.println(savedMovie);
        System.out.println(movieService.get(movie.getId()));
    }
}
