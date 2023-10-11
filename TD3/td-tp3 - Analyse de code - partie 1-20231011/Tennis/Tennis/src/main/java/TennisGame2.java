
public class TennisGame2 implements TennisGame
{
    public int pointP1 = 0;
    public int pointP2 = 0;
    
    public String resP1 = "";
    public String resP2 = "";
    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String score = "";
        if (pointP1 == pointP2 && pointP1 < 4)
        {
            if (pointP1==0)
                score = "Love";
            if (pointP1==1)
                score = "Fifteen";
            if (pointP1==2)
                score = "Thirty";
            score += "-All";
        }
        if (pointP1==pointP2 && pointP1>=3)
            score = "Deuce";
        
        if (pointP1 > 0 && pointP2==0)
        {
            if (pointP1==1)
                resP1 = "Fifteen";
            if (pointP1==2)
                resP1 = "Thirty";
            if (pointP1==3)
                resP1 = "Forty";
            
            resP2 = "Love";
            score = resP1 + "-" + resP2;
        }
        if (pointP2 > 0 && pointP1==0)
        {
            if (pointP2==1)
                resP2 = "Fifteen";
            if (pointP2==2)
                resP2 = "Thirty";
            if (pointP2==3)
                resP2 = "Forty";
            
            resP1 = "Love";
            score = resP1 + "-" + resP2;
        }
        
        if (pointP2>pointP2 && pointP1 < 4)
        {
            if (pointP1==2)
                resP1="Thirty";
            if (pointP1==3)
                resP1="Forty";
            if (pointP2==1)
                resP2="Fifteen";
            if (pointP2==2)
                resP2="Thirty";
            score = resP1 + "-" + resP1;
        }
        if (pointP2>pointP1 && pointP2 < 4)
        {
            if (pointP2==2)
                resP2="Thirty";
            if (pointP2==3)
                resP2="Forty";
            if (pointP1==1)
                resP1="Fifteen";
            if (pointP1==2)
                resP1="Thirty";
            score = resP1 + "-" + resP1;
        }
        
        if (pointP1 > pointP2 && pointP2 >= 3)
        {
            score = "Advantage player1";
        }
        
        if (pointP2 > pointP1 && pointP1 >= 3)
        {
            score = "Advantage player2";
        }
        
        if (pointP1>=4 && pointP2>=0 && (pointP1-pointP2)>=2)
        {
            score = "Win for player1";
        }
        if (pointP2>=4 && pointP1>=0 && (pointP2-pointP1)>=2)
        {
            score = "Win for player2";
        }
        return score;
    }
    
    public void setP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            scoreP1();
        }
            
    }
    
    public void setP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            scoreP2();
        }
            
    }
    
    public void scoreP1(){
        pointP1++;
    }
    
    public void scoreP2(){
        pointP2++;
    }

    public void wonPoint(String player) {
        if (player == "player1")
            scoreP1();
        else
            scoreP2();
    }
}