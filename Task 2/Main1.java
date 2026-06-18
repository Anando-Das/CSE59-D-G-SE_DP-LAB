
class ContestStats  {
    int[] scores = {80,85,90};

    void printFirstScore() {
        System.out.println(scores[0]);
    }
}

public class Main1 {

    public static void main(String[] args) {
        
        ContestStats  contest = new ContestStats();
        contest.printFirstScore();
    }

}
