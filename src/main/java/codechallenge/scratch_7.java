package codechallenge;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Scratch7 {
    public static void main(String[] args) {
        List<String> inputs = Arrays.asList("money", "wishyouwerehere", "welcometothemachine", "time");
        System.out.println(playlist(inputs, 3 ,"money"));

        inputs = Arrays.asList("wheniseeyouagain", "borntorun", "nothingelsematters", "cecelia");
        System.out.println(playlist(inputs, 1 ,"cecelia"));
    }

    public static int playlist(List<String> songs, int k, String q) {
        int i = k;
        int j =  k;
        int count=0;

        while(true) {
            if(j < 0) {
                j = songs.size()-1;
            }

            if(i>songs.size()-1) {
                i = 0;
            }

            if(songs.get(i).equals(q)) {
                return count;
            }
            if(songs.get(j).equals(q)) {
                return count;
            }
            i++;
            j--;
            count++;
        }
    }
}