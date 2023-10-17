
public class TennisGame2 implements TennisGame
{
    public int p1Point = 0;
    public int p2Point = 0;
    
    public String p1Res = "";
    public String p2Res = "";
    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String score = "";
        if (p1Point == p2Point && p1Point < 4)
        {
            switch(p1Point){
                case 0:
                    score = "Love";
                    break;
                case 1 :
                    score = "Fifteen";
                    break;
                case 2:
                    score = "Thirty";
                    break;
                default:   score = "Erreur";
            }

        }
        if (p1Point == p2Point && p1Point >=3)
            score = "Deuce";
        
        if (p1Point > 0 && p2Point ==0)
        {
            switch(p1Point) {
                case 1:
                    p1Res = "Fifteen";
                    break;
                case 2:
                    p1Res = "Thirty";
                    break;
                case 3:
                    p1Res = "Forty";
                    break;
                default: score = "Erreur";
            }
            p2Res = "Love";
            score = p1Res + "-" + p2Res;
        }
        if (p2Point > 0 && p1Point ==0)
        {
            switch(p2Point) {
                case 1:
                    p2Res = "Fifteen";
                    break;
                case 2:
                    p2Res = "Thirty";
                    break;
                case 3:
                    p2Res = "Forty";
                    break;
                default: score = "Erreur";
            }
            
            p1Res = "Love";
            score = p1Res + "-" + p2Res;
        }
        
        if (p1Point > p2Point && p1Point < 4)
        {
            if (p1Point ==2)
                p1Res ="Thirty";
            else if (p1Point ==3) {
                p1Res ="Forty";
            }
            else{score="Erreur";}

            if (p2Point ==1)
                p2Res ="Fifteen";
            else if (p2Point ==2) {
                p2Res ="Thirty";
            }
            else{score="Erreur";}
            score = p1Res + "-" + p2Res;
        }
        if (p2Point > p1Point && p2Point < 4)
        {
            if (p2Point ==2)
                p2Res ="Thirty";
            else if (p2Point ==3) {
                p2Res ="Forty";
            }
            else{score="Erreur";}

            if (p1Point ==1)
                p1Res ="Fifteen";
            else if (p1Point ==2) {
                p1Res ="Thirty";
            }
            else{score="Erreur";}

            score = p1Res + "-" + p2Res;
        }
        
        if (p1Point > p2Point && p2Point >= 3)
        {
            score = "Advantage player1";
        }
        
        if (p2Point > p1Point && p1Point >= 3)
        {
            score = "Advantage player2";
        }
        
        if (p1Point >=4 && p2Point >=0 && (p1Point - p2Point)>=2)
        {
            score = "Win for player1";
        }
        if (p2Point >=4 && p1Point >=0 && (p2Point - p1Point)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }
    public void p1Score(){
        p1Point++;
    }
    
    public void p2Score(){
        p2Point++;
    }

    public void wonPoint(String player) {
        if (player.equals("player1"))
            p1Score();
        else
            p2Score();
    }
}