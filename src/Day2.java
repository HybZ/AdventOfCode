/**
 * Day 2 solution of https://adventofcode.com/2021/day/2
 */
public class Day2 {

    /**
     * Input data Intellij style.
     */
    private static String[] split = ("forward 1\n" +
            "down 9\n" +
            "down 4\n" +
            "forward 4\n" +
            "down 2\n" +
            "down 7\n" +
            "up 9\n" +
            "down 5\n" +
            "forward 9\n" +
            "forward 9\n" +
            "down 2\n" +
            "forward 7\n" +
            "forward 9\n" +
            "down 5\n" +
            "down 2\n" +
            "up 9\n" +
            "down 7\n" +
            "forward 6\n" +
            "down 6\n" +
            "down 6\n" +
            "up 1\n" +
            "down 2\n" +
            "forward 8\n" +
            "forward 8\n" +
            "forward 9\n" +
            "up 1\n" +
            "forward 4\n" +
            "up 1\n" +
            "forward 3\n" +
            "forward 5\n" +
            "up 3\n" +
            "up 7\n" +
            "down 4\n" +
            "down 1\n" +
            "forward 3\n" +
            "forward 4\n" +
            "up 3\n" +
            "forward 9\n" +
            "down 2\n" +
            "forward 5\n" +
            "up 2\n" +
            "up 1\n" +
            "up 5\n" +
            "forward 1\n" +
            "up 9\n" +
            "forward 6\n" +
            "up 4\n" +
            "down 4\n" +
            "forward 3\n" +
            "up 7\n" +
            "down 1\n" +
            "down 1\n" +
            "down 8\n" +
            "forward 3\n" +
            "forward 1\n" +
            "up 7\n" +
            "up 1\n" +
            "down 4\n" +
            "up 6\n" +
            "down 6\n" +
            "forward 8\n" +
            "down 3\n" +
            "down 9\n" +
            "down 6\n" +
            "up 8\n" +
            "forward 8\n" +
            "down 9\n" +
            "up 7\n" +
            "down 7\n" +
            "forward 8\n" +
            "down 8\n" +
            "up 6\n" +
            "down 7\n" +
            "down 4\n" +
            "up 7\n" +
            "forward 7\n" +
            "forward 7\n" +
            "forward 2\n" +
            "forward 5\n" +
            "down 5\n" +
            "down 9\n" +
            "down 8\n" +
            "down 5\n" +
            "up 3\n" +
            "down 3\n" +
            "down 6\n" +
            "down 6\n" +
            "forward 1\n" +
            "down 2\n" +
            "forward 2\n" +
            "down 5\n" +
            "up 2\n" +
            "forward 5\n" +
            "down 1\n" +
            "down 3\n" +
            "forward 4\n" +
            "down 2\n" +
            "forward 8\n" +
            "down 6\n" +
            "forward 3\n" +
            "forward 3\n" +
            "forward 9\n" +
            "down 9\n" +
            "down 4\n" +
            "down 8\n" +
            "down 7\n" +
            "down 3\n" +
            "up 6\n" +
            "down 7\n" +
            "forward 9\n" +
            "up 9\n" +
            "down 8\n" +
            "forward 9\n" +
            "forward 8\n" +
            "down 2\n" +
            "up 4\n" +
            "forward 8\n" +
            "up 7\n" +
            "down 2\n" +
            "forward 6\n" +
            "forward 7\n" +
            "down 5\n" +
            "up 4\n" +
            "down 3\n" +
            "down 3\n" +
            "down 5\n" +
            "down 2\n" +
            "down 5\n" +
            "forward 8\n" +
            "forward 8\n" +
            "down 5\n" +
            "up 4\n" +
            "down 6\n" +
            "forward 5\n" +
            "up 6\n" +
            "up 5\n" +
            "down 4\n" +
            "forward 7\n" +
            "forward 5\n" +
            "down 7\n" +
            "up 9\n" +
            "up 4\n" +
            "up 9\n" +
            "forward 8\n" +
            "down 8\n" +
            "down 8\n" +
            "down 2\n" +
            "down 8\n" +
            "down 8\n" +
            "up 6\n" +
            "forward 2\n" +
            "down 9\n" +
            "forward 5\n" +
            "forward 4\n" +
            "down 8\n" +
            "up 5\n" +
            "forward 3\n" +
            "forward 1\n" +
            "down 6\n" +
            "forward 9\n" +
            "forward 2\n" +
            "forward 1\n" +
            "up 5\n" +
            "down 2\n" +
            "forward 5\n" +
            "up 6\n" +
            "up 6\n" +
            "forward 9\n" +
            "up 3\n" +
            "forward 2\n" +
            "forward 9\n" +
            "down 9\n" +
            "down 5\n" +
            "up 4\n" +
            "up 7\n" +
            "up 8\n" +
            "forward 4\n" +
            "forward 3\n" +
            "down 7\n" +
            "down 5\n" +
            "forward 5\n" +
            "down 6\n" +
            "forward 9\n" +
            "up 4\n" +
            "up 6\n" +
            "down 2\n" +
            "forward 6\n" +
            "forward 7\n" +
            "up 9\n" +
            "up 5\n" +
            "down 4\n" +
            "up 5\n" +
            "down 2\n" +
            "forward 4\n" +
            "up 9\n" +
            "down 1\n" +
            "forward 7\n" +
            "down 9\n" +
            "forward 5\n" +
            "down 5\n" +
            "down 2\n" +
            "up 4\n" +
            "up 8\n" +
            "down 8\n" +
            "down 7\n" +
            "up 7\n" +
            "down 1\n" +
            "forward 5\n" +
            "forward 8\n" +
            "down 2\n" +
            "down 1\n" +
            "forward 8\n" +
            "down 7\n" +
            "up 6\n" +
            "forward 9\n" +
            "forward 4\n" +
            "down 8\n" +
            "forward 1\n" +
            "up 8\n" +
            "forward 3\n" +
            "up 4\n" +
            "forward 9\n" +
            "down 6\n" +
            "forward 5\n" +
            "forward 1\n" +
            "forward 8\n" +
            "forward 5\n" +
            "forward 8\n" +
            "down 4\n" +
            "forward 8\n" +
            "forward 2\n" +
            "forward 8\n" +
            "forward 3\n" +
            "down 3\n" +
            "forward 6\n" +
            "up 6\n" +
            "up 9\n" +
            "down 4\n" +
            "down 6\n" +
            "forward 6\n" +
            "down 9\n" +
            "up 2\n" +
            "down 8\n" +
            "down 6\n" +
            "down 1\n" +
            "forward 1\n" +
            "down 2\n" +
            "down 3\n" +
            "forward 5\n" +
            "forward 6\n" +
            "down 5\n" +
            "up 7\n" +
            "up 2\n" +
            "forward 2\n" +
            "down 4\n" +
            "down 4\n" +
            "forward 3\n" +
            "down 4\n" +
            "up 4\n" +
            "forward 1\n" +
            "down 4\n" +
            "forward 9\n" +
            "forward 7\n" +
            "forward 6\n" +
            "down 3\n" +
            "down 4\n" +
            "forward 3\n" +
            "forward 3\n" +
            "forward 3\n" +
            "up 6\n" +
            "forward 4\n" +
            "forward 7\n" +
            "forward 3\n" +
            "forward 5\n" +
            "forward 7\n" +
            "forward 4\n" +
            "down 1\n" +
            "up 2\n" +
            "up 7\n" +
            "forward 4\n" +
            "down 2\n" +
            "forward 2\n" +
            "up 7\n" +
            "down 7\n" +
            "forward 5\n" +
            "forward 9\n" +
            "down 8\n" +
            "forward 5\n" +
            "forward 5\n" +
            "down 9\n" +
            "forward 1\n" +
            "forward 6\n" +
            "down 2\n" +
            "down 3\n" +
            "down 1\n" +
            "down 7\n" +
            "down 3\n" +
            "up 3\n" +
            "down 3\n" +
            "forward 5\n" +
            "down 4\n" +
            "forward 6\n" +
            "forward 2\n" +
            "down 4\n" +
            "forward 4\n" +
            "up 5\n" +
            "up 3\n" +
            "forward 2\n" +
            "forward 5\n" +
            "down 7\n" +
            "up 9\n" +
            "up 5\n" +
            "down 3\n" +
            "forward 8\n" +
            "forward 4\n" +
            "down 8\n" +
            "up 4\n" +
            "forward 8\n" +
            "forward 7\n" +
            "forward 1\n" +
            "down 2\n" +
            "down 6\n" +
            "up 7\n" +
            "forward 9\n" +
            "down 2\n" +
            "down 4\n" +
            "down 3\n" +
            "down 8\n" +
            "up 4\n" +
            "down 2\n" +
            "up 3\n" +
            "forward 1\n" +
            "down 2\n" +
            "up 6\n" +
            "down 9\n" +
            "up 3\n" +
            "down 1\n" +
            "down 1\n" +
            "forward 4\n" +
            "down 2\n" +
            "forward 3\n" +
            "forward 5\n" +
            "forward 7\n" +
            "down 7\n" +
            "up 3\n" +
            "up 5\n" +
            "down 1\n" +
            "down 2\n" +
            "forward 4\n" +
            "down 1\n" +
            "down 1\n" +
            "down 7\n" +
            "up 4\n" +
            "forward 3\n" +
            "down 3\n" +
            "forward 2\n" +
            "down 3\n" +
            "up 7\n" +
            "down 1\n" +
            "up 5\n" +
            "down 7\n" +
            "forward 4\n" +
            "up 2\n" +
            "forward 5\n" +
            "up 4\n" +
            "down 4\n" +
            "down 3\n" +
            "forward 1\n" +
            "up 9\n" +
            "down 5\n" +
            "forward 9\n" +
            "forward 1\n" +
            "down 7\n" +
            "down 2\n" +
            "down 4\n" +
            "down 2\n" +
            "forward 3\n" +
            "down 1\n" +
            "down 2\n" +
            "up 9\n" +
            "forward 2\n" +
            "down 8\n" +
            "forward 1\n" +
            "forward 3\n" +
            "down 5\n" +
            "down 4\n" +
            "forward 2\n" +
            "forward 8\n" +
            "forward 9\n" +
            "down 9\n" +
            "down 6\n" +
            "up 3\n" +
            "forward 1\n" +
            "down 6\n" +
            "down 7\n" +
            "up 3\n" +
            "forward 9\n" +
            "down 2\n" +
            "up 4\n" +
            "forward 3\n" +
            "forward 6\n" +
            "forward 6\n" +
            "down 7\n" +
            "forward 7\n" +
            "forward 6\n" +
            "down 7\n" +
            "up 9\n" +
            "forward 7\n" +
            "down 1\n" +
            "down 8\n" +
            "down 2\n" +
            "down 2\n" +
            "down 9\n" +
            "down 6\n" +
            "forward 1\n" +
            "down 9\n" +
            "forward 9\n" +
            "forward 8\n" +
            "forward 6\n" +
            "forward 9\n" +
            "down 5\n" +
            "forward 9\n" +
            "forward 4\n" +
            "forward 4\n" +
            "down 6\n" +
            "forward 6\n" +
            "forward 5\n" +
            "forward 7\n" +
            "down 7\n" +
            "down 9\n" +
            "forward 4\n" +
            "down 9\n" +
            "up 5\n" +
            "forward 6\n" +
            "down 6\n" +
            "forward 9\n" +
            "up 7\n" +
            "forward 6\n" +
            "up 6\n" +
            "up 9\n" +
            "forward 9\n" +
            "up 4\n" +
            "down 3\n" +
            "up 9\n" +
            "down 8\n" +
            "down 2\n" +
            "forward 4\n" +
            "down 8\n" +
            "down 2\n" +
            "forward 2\n" +
            "down 5\n" +
            "up 3\n" +
            "down 1\n" +
            "forward 4\n" +
            "down 3\n" +
            "forward 3\n" +
            "down 9\n" +
            "forward 6\n" +
            "forward 6\n" +
            "down 9\n" +
            "forward 6\n" +
            "forward 1\n" +
            "down 5\n" +
            "up 1\n" +
            "forward 3\n" +
            "forward 1\n" +
            "forward 5\n" +
            "down 8\n" +
            "forward 7\n" +
            "forward 2\n" +
            "up 3\n" +
            "forward 8\n" +
            "forward 1\n" +
            "forward 7\n" +
            "down 1\n" +
            "down 4\n" +
            "forward 7\n" +
            "forward 9\n" +
            "forward 4\n" +
            "down 2\n" +
            "forward 5\n" +
            "forward 3\n" +
            "forward 9\n" +
            "forward 3\n" +
            "up 3\n" +
            "forward 9\n" +
            "down 3\n" +
            "forward 9\n" +
            "forward 3\n" +
            "forward 7\n" +
            "down 5\n" +
            "forward 6\n" +
            "down 6\n" +
            "forward 5\n" +
            "forward 1\n" +
            "down 1\n" +
            "forward 8\n" +
            "down 3\n" +
            "up 1\n" +
            "down 6\n" +
            "forward 7\n" +
            "up 5\n" +
            "up 7\n" +
            "down 3\n" +
            "forward 8\n" +
            "up 8\n" +
            "down 4\n" +
            "up 6\n" +
            "up 7\n" +
            "forward 1\n" +
            "forward 2\n" +
            "forward 7\n" +
            "down 1\n" +
            "forward 4\n" +
            "down 8\n" +
            "up 6\n" +
            "up 7\n" +
            "up 4\n" +
            "down 7\n" +
            "down 8\n" +
            "down 6\n" +
            "forward 5\n" +
            "forward 9\n" +
            "down 7\n" +
            "forward 8\n" +
            "down 9\n" +
            "down 9\n" +
            "forward 5\n" +
            "forward 2\n" +
            "up 4\n" +
            "down 2\n" +
            "forward 3\n" +
            "down 2\n" +
            "forward 1\n" +
            "down 7\n" +
            "down 6\n" +
            "forward 5\n" +
            "up 2\n" +
            "forward 4\n" +
            "down 4\n" +
            "forward 5\n" +
            "forward 7\n" +
            "up 5\n" +
            "down 7\n" +
            "forward 9\n" +
            "forward 3\n" +
            "forward 6\n" +
            "up 8\n" +
            "down 9\n" +
            "forward 1\n" +
            "up 8\n" +
            "forward 3\n" +
            "down 6\n" +
            "down 1\n" +
            "down 3\n" +
            "down 4\n" +
            "up 2\n" +
            "up 3\n" +
            "forward 8\n" +
            "up 7\n" +
            "down 2\n" +
            "forward 1\n" +
            "down 6\n" +
            "forward 1\n" +
            "down 8\n" +
            "forward 3\n" +
            "forward 5\n" +
            "forward 5\n" +
            "up 5\n" +
            "forward 4\n" +
            "forward 6\n" +
            "down 8\n" +
            "up 7\n" +
            "forward 8\n" +
            "up 6\n" +
            "forward 5\n" +
            "down 4\n" +
            "forward 8\n" +
            "down 3\n" +
            "forward 7\n" +
            "forward 9\n" +
            "forward 8\n" +
            "up 9\n" +
            "forward 4\n" +
            "up 5\n" +
            "up 8\n" +
            "down 8\n" +
            "forward 1\n" +
            "down 1\n" +
            "forward 3\n" +
            "forward 9\n" +
            "down 9\n" +
            "up 2\n" +
            "forward 5\n" +
            "down 1\n" +
            "down 6\n" +
            "forward 2\n" +
            "forward 2\n" +
            "down 2\n" +
            "down 8\n" +
            "forward 5\n" +
            "up 2\n" +
            "up 2\n" +
            "forward 3\n" +
            "down 6\n" +
            "up 2\n" +
            "down 2\n" +
            "down 1\n" +
            "up 9\n" +
            "forward 6\n" +
            "up 4\n" +
            "forward 4\n" +
            "down 2\n" +
            "forward 8\n" +
            "up 9\n" +
            "down 1\n" +
            "forward 9\n" +
            "up 3\n" +
            "up 7\n" +
            "forward 5\n" +
            "down 9\n" +
            "down 2\n" +
            "down 5\n" +
            "up 4\n" +
            "up 8\n" +
            "up 2\n" +
            "down 1\n" +
            "up 4\n" +
            "forward 8\n" +
            "forward 2\n" +
            "down 8\n" +
            "forward 9\n" +
            "forward 1\n" +
            "down 5\n" +
            "forward 3\n" +
            "down 6\n" +
            "forward 3\n" +
            "up 2\n" +
            "down 9\n" +
            "down 6\n" +
            "down 4\n" +
            "down 9\n" +
            "down 8\n" +
            "forward 2\n" +
            "forward 7\n" +
            "up 4\n" +
            "forward 8\n" +
            "up 9\n" +
            "up 6\n" +
            "forward 2\n" +
            "down 1\n" +
            "down 5\n" +
            "down 5\n" +
            "down 3\n" +
            "up 9\n" +
            "up 9\n" +
            "forward 9\n" +
            "forward 5\n" +
            "down 1\n" +
            "down 3\n" +
            "down 8\n" +
            "down 4\n" +
            "forward 5\n" +
            "up 4\n" +
            "down 2\n" +
            "down 5\n" +
            "down 4\n" +
            "down 8\n" +
            "down 2\n" +
            "forward 9\n" +
            "forward 7\n" +
            "up 9\n" +
            "forward 8\n" +
            "down 9\n" +
            "down 2\n" +
            "forward 5\n" +
            "down 9\n" +
            "forward 7\n" +
            "down 2\n" +
            "down 9\n" +
            "forward 4\n" +
            "up 7\n" +
            "down 9\n" +
            "forward 6\n" +
            "forward 2\n" +
            "down 1\n" +
            "down 9\n" +
            "down 3\n" +
            "down 7\n" +
            "down 8\n" +
            "down 5\n" +
            "down 9\n" +
            "down 1\n" +
            "up 9\n" +
            "down 7\n" +
            "forward 7\n" +
            "up 4\n" +
            "down 2\n" +
            "down 4\n" +
            "forward 6\n" +
            "forward 8\n" +
            "forward 1\n" +
            "forward 2\n" +
            "up 2\n" +
            "up 2\n" +
            "forward 9\n" +
            "down 9\n" +
            "forward 8\n" +
            "forward 6\n" +
            "forward 5\n" +
            "down 2\n" +
            "forward 7\n" +
            "up 3\n" +
            "up 8\n" +
            "forward 1\n" +
            "forward 5\n" +
            "down 7\n" +
            "down 7\n" +
            "forward 5\n" +
            "down 1\n" +
            "up 3\n" +
            "up 8\n" +
            "forward 5\n" +
            "forward 7\n" +
            "forward 3\n" +
            "down 6\n" +
            "up 7\n" +
            "forward 8\n" +
            "down 5\n" +
            "up 3\n" +
            "forward 7\n" +
            "down 2\n" +
            "down 1\n" +
            "down 1\n" +
            "forward 1\n" +
            "down 1\n" +
            "down 8\n" +
            "down 3\n" +
            "up 1\n" +
            "forward 8\n" +
            "forward 9\n" +
            "forward 5\n" +
            "forward 8\n" +
            "down 2\n" +
            "forward 3\n" +
            "down 5\n" +
            "up 9\n" +
            "down 9\n" +
            "down 5\n" +
            "forward 1\n" +
            "up 9\n" +
            "up 4\n" +
            "up 7\n" +
            "up 9\n" +
            "up 4\n" +
            "down 2\n" +
            "forward 6\n" +
            "forward 4\n" +
            "up 5\n" +
            "up 6\n" +
            "down 8\n" +
            "down 6\n" +
            "down 6\n" +
            "up 3\n" +
            "forward 3\n" +
            "down 9\n" +
            "down 5\n" +
            "down 5\n" +
            "forward 7\n" +
            "down 6\n" +
            "forward 7\n" +
            "down 9\n" +
            "down 8\n" +
            "down 3\n" +
            "down 7\n" +
            "down 4\n" +
            "down 1\n" +
            "forward 6\n" +
            "up 7\n" +
            "down 1\n" +
            "forward 7\n" +
            "down 2\n" +
            "forward 4\n" +
            "down 3\n" +
            "forward 6\n" +
            "up 7\n" +
            "forward 3\n" +
            "down 3\n" +
            "up 6\n" +
            "down 2\n" +
            "down 4\n" +
            "down 8\n" +
            "forward 6\n" +
            "down 4\n" +
            "forward 7\n" +
            "down 2\n" +
            "forward 9\n" +
            "down 3\n" +
            "down 6\n" +
            "down 3\n" +
            "down 6\n" +
            "forward 4\n" +
            "down 8\n" +
            "up 5\n" +
            "down 6\n" +
            "forward 6\n" +
            "down 6\n" +
            "forward 9\n" +
            "up 8\n" +
            "down 7\n" +
            "up 1\n" +
            "forward 4\n" +
            "up 3\n" +
            "forward 9\n" +
            "up 6\n" +
            "forward 4\n" +
            "up 8\n" +
            "forward 2\n" +
            "down 7\n" +
            "down 7\n" +
            "forward 1\n" +
            "up 9\n" +
            "up 7\n" +
            "forward 3\n" +
            "down 1\n" +
            "up 5\n" +
            "forward 3\n" +
            "forward 1\n" +
            "forward 3\n" +
            "forward 7\n" +
            "down 6\n" +
            "down 1\n" +
            "forward 9\n" +
            "up 1\n" +
            "up 1\n" +
            "down 8\n" +
            "down 7\n" +
            "forward 1\n" +
            "up 8\n" +
            "up 6\n" +
            "down 8\n" +
            "forward 1\n" +
            "up 3\n" +
            "down 7\n" +
            "forward 7\n" +
            "down 7\n" +
            "forward 4\n" +
            "forward 6\n" +
            "up 2\n" +
            "down 9\n" +
            "forward 9\n" +
            "down 4\n" +
            "up 2\n" +
            "forward 7\n" +
            "forward 4\n" +
            "up 8\n" +
            "up 5\n" +
            "down 8\n" +
            "forward 7\n" +
            "forward 6\n" +
            "down 1\n" +
            "up 5\n" +
            "up 5\n" +
            "down 3\n" +
            "forward 7\n" +
            "forward 1\n" +
            "forward 7\n" +
            "forward 1\n" +
            "down 3\n" +
            "forward 3\n" +
            "forward 4\n" +
            "forward 6\n" +
            "down 3\n" +
            "up 4\n" +
            "up 5\n" +
            "down 8\n" +
            "up 3\n" +
            "forward 4\n" +
            "forward 6\n" +
            "forward 8\n" +
            "forward 4\n" +
            "forward 7\n" +
            "down 9\n" +
            "up 3\n" +
            "down 1\n" +
            "up 4\n" +
            "forward 8\n" +
            "forward 5\n" +
            "forward 4\n" +
            "forward 1\n" +
            "down 2\n" +
            "down 7\n" +
            "down 6\n" +
            "forward 4\n" +
            "forward 2\n" +
            "up 2\n" +
            "down 2\n" +
            "forward 2\n" +
            "forward 2\n" +
            "up 6\n" +
            "forward 6\n" +
            "forward 1\n" +
            "forward 8\n" +
            "up 7\n" +
            "forward 4\n" +
            "forward 2\n" +
            "down 2\n" +
            "down 1\n" +
            "forward 4\n" +
            "down 4\n" +
            "up 7\n" +
            "up 2\n" +
            "up 3\n" +
            "down 5\n" +
            "forward 2\n" +
            "forward 9\n" +
            "down 2\n" +
            "down 9\n" +
            "down 4\n" +
            "down 8\n" +
            "up 9\n" +
            "up 5\n" +
            "up 2\n" +
            "forward 6\n" +
            "down 6\n" +
            "forward 9\n" +
            "forward 7\n" +
            "forward 8\n" +
            "forward 4\n" +
            "up 9\n" +
            "forward 9\n" +
            "down 8\n" +
            "down 2\n" +
            "forward 5\n" +
            "down 8\n" +
            "down 8\n" +
            "forward 8\n" +
            "forward 6\n" +
            "forward 7\n" +
            "down 8\n" +
            "forward 1\n" +
            "forward 6\n" +
            "down 4\n" +
            "forward 1\n" +
            "down 3\n" +
            "forward 1\n" +
            "down 8\n" +
            "forward 2\n" +
            "down 4\n" +
            "down 6\n" +
            "down 4\n" +
            "up 9\n" +
            "forward 6\n" +
            "up 3\n" +
            "down 7\n" +
            "forward 3\n" +
            "down 8\n" +
            "forward 6\n" +
            "forward 3\n" +
            "down 1\n" +
            "forward 1\n" +
            "up 6\n" +
            "down 1\n" +
            "down 2\n" +
            "forward 5\n" +
            "down 3\n" +
            "up 5\n" +
            "forward 6\n" +
            "forward 7\n" +
            "forward 2\n" +
            "forward 9\n" +
            "down 7\n" +
            "up 4\n" +
            "forward 6\n" +
            "forward 8\n" +
            "down 6\n" +
            "down 7\n" +
            "down 4\n" +
            "down 5\n" +
            "down 6\n" +
            "down 3\n" +
            "up 1\n" +
            "forward 2\n" +
            "forward 3\n" +
            "down 1\n" +
            "down 7\n" +
            "up 8\n" +
            "forward 1\n" +
            "forward 6\n" +
            "up 3\n" +
            "down 1\n" +
            "up 6\n" +
            "down 2\n" +
            "up 1\n" +
            "up 7\n" +
            "forward 3\n" +
            "up 8\n" +
            "forward 7\n" +
            "forward 5\n" +
            "forward 5").split("\n");

    /**
     * All has a beginning
     *
     * @param args
     */
    public static void main(String...args) {
        depthPosition();
        aimPosition();
    }

    /**
     * java 1.5 style
     */
    private static void aimPosition() {
        long horizontalPosition = 0;
        long depth = 0;
        long aim = 0;
        long currentValue;
        for (int i = 0; i < split.length; i++) {
            currentValue = Integer.parseInt(split[i].split(" ")[1]);
            switch (split[i].length()) {
                case 6: //down X
                    aim += currentValue;
                    break;
                case 9: //forward X & depth change
                    horizontalPosition += currentValue;
                    depth += aim * currentValue;
                    break;
                default: //up X
                    aim -= currentValue;
            }
        }
        System.out.println("Horizontal value " + horizontalPosition + " times depth value " + depth + " : " + (horizontalPosition*depth) + "\nFinal aim : " + aim);
    }

    /**
     * Java 1.5 style
     */
    private static void depthPosition() {
        int horizontalPosition = 0;
        int depth = 0;
        int currentValue;
        for (int i = 0; i < split.length; i++) {
            currentValue = Integer.parseInt(split[i].split(" ")[1]);
            switch (split[i].length()) {
                case 6: //down X
                    depth += currentValue;
                    break;
                case 9: //forward X
                    horizontalPosition += currentValue;
                    break;
                default: //up X
                    depth -= currentValue;
            }
        }
        System.out.println("Horizontal value " + horizontalPosition + " times depth value " + depth + " : " + (horizontalPosition*depth));
    }

}
