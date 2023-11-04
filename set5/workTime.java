package set5;

import java.util.*;

import java.util.Arrays;
import java.util.Comparator;

import java.util.Arrays;

import java.util.Arrays;

public class workTime {
    public static void main(String[] args) {
        int[] start = {1230, 1200, 1600};
        int[] end = {131, 100, 1700};

        System.out.println(minWorkers(start, end));
    }

    public static int minWorkers(int[] start, int[] end) {
        // Sort the start and end times
        Arrays.sort(start);
        Arrays.sort(end);

        // Initialize pointers for start and end times
        int startPointer = 0, endPointer = 0;

        // Initialize count of rooms and maximum count of rooms
        int workers = 0, maxWorkers = 0;

        // Iterate over intervals
        while (startPointer < start.length) {
            if (start[startPointer] < end[endPointer]) {
                // A new work has started before the previous one ends, increment count of workers
                workers++;
                // Update maximum count of workers if necessary
                maxWorkers = Math.max(workers, maxWorkers);
                // Move to next work
                startPointer++;
            } else {
                // The current work has ended, decrement count of workers
                workers--;
                // Move to next ending time
                endPointer++;
            }
        }

        return maxWorkers;
    }
}
