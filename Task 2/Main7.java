interface Clicable {

    void onClick();
    
}

class Button implements Clicable {
    public void onClick() {
        System.out.println("Button was clicked");
    }
}

public class Main7 {
    public static void main(String[] args) {
        Button myButton = new Button();

        myButton.onClick();
    }
}

