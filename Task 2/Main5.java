class Printer {

    public void printData(String text) {
        System.out.println("Print text:" + text);
    }

    public void printData(int number) {
        System.out.println("Print numver:" + number);
    }

}


public class Main5 {
    public static void main(String[] args) {
        
        Printer myprinter = new Printer();

        myprinter.printData("Hellow world");

        myprinter.printData("42");

    }
}

