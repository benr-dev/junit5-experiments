/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class TestBowlingScorecard {
    @Test public void when_initialised_then_noErrors() {
        new BowlingScorecard();
    }

    @Test public void when_gutterGame_then_scoreIs0() {
        // given
        BowlingScorecard scorecard = new BowlingScorecard();

        // when
        int score = scorecard.score(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);

        // then
        assertThat(score, equalTo(0));
    }

    @Test public void when_all1sGame_then_scoreIs20() {
        // given
        BowlingScorecard scorecard = new BowlingScorecard();

        // when
        int score = scorecard.score(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);

        // then
        assertThat(score, equalTo(20));
    }

    @Test public void when_spareFollowedBy1Game_then_scoreIs12() {
        // given
        BowlingScorecard scorecard = new BowlingScorecard();

        // when
        int score = scorecard.score(5,5, 1,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);

        // then
        assertThat(score, equalTo(12));
    }

    @Test public void when_strikeFollowedBy1And1Game_then_scoreIs14() {
        // given
        BowlingScorecard scorecard = new BowlingScorecard();

        // when
        int score = scorecard.score(10, 1,1, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);

        // then
        assertThat(score, equalTo(14));
    }

    @Test public void when_perfectGame_then_scoreIs300() {
        // given
        BowlingScorecard scorecard = new BowlingScorecard();

        // when
        int score = scorecard.score(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);

        // then
        assertThat(score, equalTo(300));
    }
}