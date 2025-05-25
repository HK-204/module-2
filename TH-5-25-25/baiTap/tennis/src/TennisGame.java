public class TennisGame {

    public static String scoreToText(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        if (isDraw(scorePlayer1, scorePlayer2))
        {
            return getDrawScore(scorePlayer1);
        }
        if (isEndGame(scorePlayer1, scorePlayer2))
        {
            return getEndGameScore(scorePlayer1, scorePlayer2);
        }

        return getNormalScore(scorePlayer1, scorePlayer2);
    }

    private static String scoreToText(int score) {
        switch(score)
        {
            case 0: return "Love";
            case 1: return "Fifteen";
            case 2: return "Thirty";
            case 3: return "Forty";
            default: return "Unknown";
        }
    }

    private static String getNormalScore(int scorePlayer1, int scorePlayer2) {
        return scoreToText(scorePlayer1) + " - " + scoreToText(scorePlayer2);
    }

    private static String getEndGameScore(int scorePlayer1, int scorePlayer2) {
        int scoreDifferent = scorePlayer1 - scorePlayer2;
        if (scoreDifferent==1) return "Advantage player1";
        else if (scoreDifferent ==-1) return "Advantage player2";
        else if (scoreDifferent>=2) return "Win for player1";
        else return "Win for player2";
    }

    private static boolean isEndGame(int scorePlayer1, int scorePlayer2) {
        return scorePlayer1 >= 4 || scorePlayer2 >= 4;
    }

    private static String getDrawScore(int score) {
        switch (score)
        {
            case 0: return "Love-All";
            case 1: return "Fifteen-All";
            case 2: return "Thirty-All";
            case 3: return "Forty-All";
            default: return "Deuce";
        }
    }

    private static boolean isDraw(int scorePlayer1, int scorePlayer2) {
        return scorePlayer1 == scorePlayer2;
    }
}