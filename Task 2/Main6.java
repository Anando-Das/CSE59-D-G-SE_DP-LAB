class Applet {
    public void launch() {
        System.out.println("Applet launced");
    }
}

class GamApplet extends Applet {
    public void play() {
        System.out.println("Playing game");
    }
}


public class Main6 {
    public static void main(String[] args) {
        
        GamApplet myGame = new GamApplet();

        myGame.launch();

        myGame.play();


    }
}

