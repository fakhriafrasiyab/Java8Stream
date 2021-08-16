import java.util.function.Predicate;

public class Filter {
    public static Predicate<String> nameStartingWithPrefix(String prefix) {
        return name -> name.startsWith(prefix);
    }
}
