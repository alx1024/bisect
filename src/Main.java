import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(isAscending(readIntsFromFile()));
    }

    private static List<Integer> readIntsFromFile() throws IOException {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            Path path= Paths.get("C:\\Users\\Alex\\Desktop\\bisect\\src\\data\\" + i + ".txt");
            if (Files.exists(path)) {
                numbers.add(Integer.valueOf(Files.readString(path).split(";")[1]));
            }
        }

        return numbers;
    }

    private static boolean isAscending(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) > numbers.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
}