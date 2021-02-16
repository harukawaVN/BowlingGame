public class BowlingGame {
    int[] rolls;
    int currentRoll = 0;

    public BowlingGame() {

        rolls = new int[22];
    }

    public int Score() {
        int score = 0;
        int roll = 0;
        int frame = 0;
        while(frame < 9){
            if(isStrick(roll)){
                score += sumStrick(roll);
                roll++;
                frame++;
            }
            if (isSpare(roll)){
                score+= sumSpare(roll);
                roll+=2;
                frame++;
            }
            else if (!isStrick(roll) && !isSpare(roll)){
                score+= sumTurn(roll);
                roll+=2;
                frame++;
            }
        }

        return score;
    }

    public void roll(int pins){

        rolls[currentRoll++] = pins;
    }

    public int sumSpare(int roll){

        return 10 + rolls[roll+2];
    }

    public int sumStrick(int roll){

        return 10 + rolls[roll+1] + rolls[roll+2];
    }

    public boolean isStrick(int roll){

        return rolls[roll] == 10;
    }

    public boolean isSpare(int roll){

        return rolls[roll] + rolls[roll+1] == 10;
    }

    public int sumTurn(int roll) {
        return  rolls[roll] + rolls[roll+1];
    }
}
