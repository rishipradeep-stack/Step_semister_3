public class Scorecard {

 
    private final boolean[] results;

    private int answered;
    public Scorecard(int totalQuestions) {
        results = new boolean[totalQuestions];
        answered = 0;
    }

  
    public void recordAnswer(boolean correct) {
        if (answered < results.length) {
            results[answered] = correct;
            answered++;
        } else {
            System.out.println("No more answers can be recorded.");
        }
    }
    public int getScore() {
        int score = 0;

        for (int i = 0; i < answered; i++) {
            if (results[i]) {
                score++;
            }
        }

        return score;
    }

  
    public static void main(String[] args) {

        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Score: " + sc.getScore());

    
        sc.recordAnswer(true);

        System.out.println("Final score: " + sc.getScore());
    }
}