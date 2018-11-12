package run;

import windows.Welcome;

public class Run {

    private static Welcome w;
    
    public static void main(String[] args) {

       w = new Welcome();
       w.setVisible(true);
    }
}
