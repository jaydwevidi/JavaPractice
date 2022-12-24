package JavaSyntax.rand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {
    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
    Set<List<Integer>> tripletSet  = new HashSet<>();
    Set<Long> arr2 = new HashSet<Long>();
    arr2.addAll(arr);
        for(int i=0 ; i< arr.size()  ; i++){
            long secondNo = arr.get(i)*r;
            long thirdNo = arr.get(i)*r*r;
            if (arr2.contains(secondNo) && arr2.contains(thirdNo)) {
                int lastIndexOf2 = arr.lastIndexOf(secondNo);
                for(int j=i+1;j<=lastIndexOf2;j++){
                    if(arr.get(j)==secondNo){
                        int lastIndexOf3 = arr.lastIndexOf(thirdNo);
                        for (int k=j+1 ; k<=lastIndexOf3 ; k++){
                            if (arr.get(k)==thirdNo){
                                List<Integer> ll = new ArrayList();
                                ll.add(i);
                                ll.add(j);
                                ll.add(k);
                                tripletSet.add(ll);
                            }
                        }
                    }
                }
            }
        }

        return tripletSet.size();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long ans = countTriplets(arr, r);

        //bufferedWriter.write(String.valueOf(ans));
        System.out.println(String.valueOf(ans));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
