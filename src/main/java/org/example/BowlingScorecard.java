package org.example;

import java.util.Arrays;

public class BowlingScorecard {
    public int score(int... scores) {
        int total = 0;

        for(int frame = 0, game = 0; frame < 10 && game < scores.length; frame++) {
            if(scores[game] == 10) {
                total += 10 + scores[game+1] + scores[game+2];
                game += 1;
            }
            else if(scores[game] + scores[game+1] == 10) {
                total += 10 + scores[game+2];
                game += 2;
            }
            else {
                total += scores[game] + scores[game+1];
                game +=2;
            }
        }

        return total;
    }
}
