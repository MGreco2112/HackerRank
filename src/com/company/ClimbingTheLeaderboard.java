package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClimbingTheLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> output = new ArrayList<>();



        for (int playerPointer = 0; playerPointer < player.size(); playerPointer++) {
            int place = 1;

            ranked.add(player.get(playerPointer));

            Collections.sort(ranked);

            for (int scorePointer = ranked.size() - 1; scorePointer > - 1; scorePointer--) {
                if (scorePointer != ranked.size() - 1) {
                    if (ranked.get(scorePointer + 1) > ranked.get(scorePointer)) {
                        place++;
                    }
                }

                if (player.get(playerPointer) == ranked.get(scorePointer)) {
                    output.add(place);
                    break;
                }
            }
        }



        return output;
    }
}
