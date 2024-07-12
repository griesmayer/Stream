import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TeasStream
{
    public static void main(String[] args) throws IOException
    {
        List<String> shoppinglist = new ArrayList<>();
        shoppinglist.add("Cannelloni");
        shoppinglist.add("Ahornsirup");
        shoppinglist.add("Avocado");
        shoppinglist.add("B");
        shoppinglist.add("A");
        shoppinglist.add("Bergkäse");
        shoppinglist.add("Ajvar");
        shoppinglist.add("Banane");
        shoppinglist.add("Backwerk");
        shoppinglist.add("Blutorange");
        shoppinglist.add("C");
        shoppinglist.add("Butter");
        shoppinglist.add("Camembert");
        shoppinglist.add("Brot");
        shoppinglist.add("Cashew");

        shoppinglist.stream()
                .filter(element -> element.length()>2)
                .map(element -> element.toUpperCase())
                //.sorted()
                .sorted( (e1, e2) -> e1.length()-e2.length() )
                .filter(element -> element.startsWith("B"))
                .forEach(element -> System.out.println(element));
        List<String> lines = Files.readAllLines(Path.of("shopping.txt"));
        lines.stream()
                .forEach(element -> System.out.println(element));
        System.out.println("================");
        Stream<String> lines2 = Files.lines(Path.of("shopping.txt"));
        lines2
                .forEach(element -> System.out.println("sdfasfd " + element));
    }
}
