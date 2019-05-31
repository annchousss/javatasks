import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;


public class Main {
    public static void main(String[] args) throws IOException {
        Set<Film> films = Files.lines(Paths.get("films.txt"))
                .map(string -> {
                    String[] array = string.split(",");
                    return new Film(parseInt(array[0]), new Date(array[1]), parseInt(array[2]));
                })
                .collect(Collectors.toSet());

        Set<Actor> actors = Files.lines(Paths.get("actors.txt"))
                .map(string -> {
                    String[] array = string.split(",");
                    return new Actor(parseInt(array[0]), array[1]);
                })
                .collect(Collectors.toSet());

        Set<Producer> producers = Files.lines(Paths.get("producers.txt"))
                .map(string -> {
                    String[] array = string.split(",");
                    return new Producer(parseInt(array[0]), array[1]);
                })
                .collect(Collectors.toSet());

        Set<FilmParticipation> filmParticipations = Files.lines(Paths.get("filmparticipation.txt"))
                .map(string -> {
                    String[] array = string.split(",");
                    return new FilmParticipation(parseInt(array[0]), parseInt(array[1]));
                })
                .collect(Collectors.toSet());

        films.stream()
                .filter(x -> x.getYear().before(new Date()))
                .
    }
}
