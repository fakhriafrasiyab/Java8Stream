import java.util.function.Function;

public class Mapper {
    public static Function<String, CharactersCount> getDistinctCharactersCount() {
        return string -> new CharactersCount(string, Math.toIntExact(string.chars().distinct().count()));
    }
}
