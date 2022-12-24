package JavaSyntax.rand;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class bla {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> answers = new ArrayList<Integer>();
        Map<Integer , Integer> count = new HashMap<Integer , Integer>();
        Set<Integer> valueSet = new HashSet<Integer>();


        for (List<Integer> query : queries) {

            int choice = query.get(0);
            int number = query.get(1);

            switch (choice) {
                case 1:
                    if (count.containsKey(number)) {
                        int currentCount = count.get(number);
                        count.put(number, currentCount + 1);
                    } else
                        count.put(number, 1);
                    break;

                case 2:
                    if (count.containsKey(number)) {
                        int currentCount2 = count.get(number);
                        if (currentCount2 >0 )
                            count.put(number, currentCount2 - 1);
                    }
                    break;

                case 3:
                    if (count.containsValue(number))
                        answers.add(1);
                    else
                        answers.add(0);
                    break;
            }
        }
        return answers;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> ans = freqQuery(queries);

        bufferedWriter.write(
                ans.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
