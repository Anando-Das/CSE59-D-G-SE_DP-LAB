class Countdown {
    public void Start() {
        for (int i = 5; i>= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Go!");
    }
}

public class Main3 {
    public static void main(String[] args) {
        
        Countdown timer  = new Countdown();
        timer.Start();
    }
}

