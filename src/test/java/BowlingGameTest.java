import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {

    static BowlingGame game;
    @BeforeAll
    static void InitGame(){
        game = new BowlingGame();
            game.roll(1);
            game.roll(4);
            game.roll(4);
            game.roll(5);
            game.roll(6);
            game.roll(4);
            game.roll(5);
            game.roll(5);
            game.roll(10);
            game.roll(0);
            game.roll(1);
            game.roll(7);
            game.roll(3);
            game.roll(6);
            game.roll(4);
            game.roll(10);
            game.roll(2);
            game.roll(8);
            game.roll(6);
    }



    @org.junit.jupiter.api.Test
    void score_Game_Return_133() {
        assertEquals(133,game.Score());
    }
}