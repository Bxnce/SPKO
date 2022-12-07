import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.LinkedList;
import java.util.List;

public final class Functional {
    private Functional() { }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Files.newBufferedReader(Paths.get(args[0]));
        var lines = new LinkedList<String>();

        long start = System.nanoTime();
        int n = input.lines().filter(line -> line.length() > 0).filter(line -> line.length() > MIN_LENGTH).mapToInt(line -> line.length()).sum();

        long stop = System.nanoTime();
        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }
}
