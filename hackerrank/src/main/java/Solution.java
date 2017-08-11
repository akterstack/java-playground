import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        String tagLine = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        Map<Integer, Hotel> hotels = new HashMap<>();
        for (int i = 0; i < count; i++) {
            Hotel hotel = new Hotel();
            hotel.id = Integer.parseInt(scanner.nextLine());
            hotel.reviews.add(scanner.nextLine());
            hotels.put(hotel.id, hotel);
        }

        //Solution
        String[] tags = tagLine.split(" ");
        for (Hotel hotel : hotels.values()) {
            for (String review : hotel.reviews) {
                String[] words = review.split(" ");
                for (int i = 0; i < words.length; i++) {
                    words[i] = words[i].replace(".", "");
                    words[i] = words[i].replace(",", "");
                    for (String tag : tags) {
                        if (tag.equalsIgnoreCase(words[i])) {
                            hotel.star++;
                        }
                    }
                }
            }
        }
        Arrays.sort(hotels.values().toArray());
        String res = "";
        for (Hotel hotel : hotels.values()) {
            res += hotel.id + " ";
        }
        System.out.println(res.substring(0, res.length() - 1));

    }

    static class Hotel implements Comparable<Hotel> {
        int id;
        List<String> reviews = new ArrayList<>();
        int star = 0;


        @Override
        public int compareTo(Hotel source) {
            if (star == source.star) return source.id - id;
            return source.star - star;
        }
    }
}