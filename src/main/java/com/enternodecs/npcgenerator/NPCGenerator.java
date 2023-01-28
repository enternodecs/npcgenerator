package com.enternodecs.npcgenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NPCGenerator {
    public static NPC generate() throws IOException {
        return generate("test");
    }

    public static NPC generate(String homeland) throws IOException {
        return new NPC(
                generateFirstName(homeland),
                generateLastName(homeland),
                null,
                homeland
        );
    }

    /**
     * Based on the given homeland, return a random first name.
     * @param homeland A homeland with a "firstname-homeland.txt" file.
     * @return A first name, randomly selected from the file.
     * @throws IOException If the file could not be read.
     */
    private static String generateFirstName(String homeland) throws IOException {
        return pickRandomFromFile(String.format("firstname-%s.txt", homeland));
    }

    /**
     * Based on the given homeland, return a random last name.
     * @param homeland A homeland with a "lastname-homeland.txt" file.
     * @return A last name, randomly selected from the file.
     * @throws IOException If the file could not be read.
     */
    private static String generateLastName(String homeland) throws IOException {
        return pickRandomFromFile(String.format("lastname-%s.txt", homeland));
    }

    private static String pickRandomFromFile(String fileName) throws IOException {
        List<String> result;
        Random random = new Random();
        Path filepath = Paths.get(fileName);
        try (Stream<String> lines = Files.lines(filepath)) {
            result = lines.collect(Collectors.toList());
            return result.get(random.nextInt(result.size()));
        }
    }
}
