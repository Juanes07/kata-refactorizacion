package scores;

public class scoreCaseTenisGame2 {

    protected String score = "";
    protected int P1point = 0;
    protected int P2point = 0;
    public String P1res = "";
    public String P2res = "";

    public String firstCase(int P1point, int P2point) {
        switch (P1point) {
            case 0:
                score = "Love";
                break;
            case 1:
                score = "Fifteen";
                break;
            case 2:
                score = "Thirty";
                break;
            default:
                score = "";
        }
        return score += "-All";
    }

    public String secondCase(int P1point, int P2point) {
        switch (P1point) {
            case 1:
                P1res = "Fifteen";
                break;
            case 2:
                P1res = "Thirty";
                break;
            case 3:
                P1res = "Forty";
                break;
            default:
                P1res = "Love";
        }
        return score = P1res + "-" + P2res;
    }

    public String thirdCase(int P1point, int P2point) {
        switch (P2point) {
            case 1:
                P2res = "Fifteen";
                break;
            case 2:
                P2res = "Thirty";
                break;
            case 3:
                P2res = "Forty";
                break;
        }
        return score = P1res + "-" + P2res;
    }

    public String fourthCase(int P1point, int P2point) {
        switch (P1point) {
            case 2:
                P1res = "Thirty";
                break;
            case 3:
                P1res = "Forty";
                break;
        }
        switch (P2point) {
            case 1:
                P2res = "Fifteen";
                break;
            case 2:
                P2res = "Thirty";
                break;
        }
        return score = P1res + "-" + P2res;
    }

    public String fifthCase(int P1point, int P2point) {
        switch (P2point){
            case 2: P2res = "Thirty";
            break;
            case 3: P2res = "Forty";
            break;
        }
        switch (P1point){
            case 1: P1res = "Fifteen";
            break;
            case 2: P1res = "Thirty";
            break;
        }
        return score = P1res + "-" + P2res;
    }
}
