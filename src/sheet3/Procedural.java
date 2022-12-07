import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.LinkedList;
import java.util.List;

public final class Procedural {
    private Procedural() { }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Files.newBufferedReader(Paths.get(args[0]));
        var lines = new LinkedList<String>();

        long start = System.nanoTime();

        readLines(input, lines);
        removeEmptyLines(lines);
        removeShortLines(lines);
        int n = totalLineLengths(lines);

        long stop = System.nanoTime();

        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }

    //readlines implementation without using loops
    private static void readLines(BufferedReader input, List<String> lines) throws IOException {
        input.lines().forEach(lines::add);
    }

    private static void removeEmptyLines(List<String> lines) {
        lines.removeIf(String::isEmpty);
    }

    private static void removeShortLines(List<String> lines) {
        lines.removeIf(s -> s.length() < MIN_LENGTH);
    }

    private static int totalLineLengths(List<String> lines) {
        return lines.stream().mapToInt(String::length).sum();
    }

    // TODO: Klassenmethoden readLines, removeEmptyLines, removeShortLines, totalLineLengths
}
