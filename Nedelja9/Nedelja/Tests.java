package Nedelja9.nedelja;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

import static Nedelja9.nedelja.Nedelja.zadatak1.sortArray;
import static org.junit.Assert.assertEquals;

public class Tests {
    public static int[] randomArr() {
        int arrayLength = (int) Math.floor(Math.random() * (15 - 1 + 1) + 1);
        List<Integer> arr = new ArrayList<>(arrayLength);
        for (int i = 0; i < arrayLength; i++) {
            arr.add(ThreadLocalRandom.current().nextInt(10));
        }
        return arr.stream().mapToInt(k -> k).toArray();
    }

    @Test
    public void Test1000() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("TEST.txt"));
            for (int i = 0; i < 1000; i++) {

                int[] testArray = randomArr();
                List<Integer> solvedArray = sortArray(testArray);
                assertEquals(solvedArray, sortArray(testArray));
                writer.write("assertEquals(new int[]" +
                        solvedArray.toString().replace("[", "{").replace("]", "}") +
                        ", sortArray(new int[]" + Arrays.toString(testArray).replace("[", "{").replace("]", "}") + "));");
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
