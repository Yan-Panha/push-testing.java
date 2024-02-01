import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame f=new Frame("Testing");
        Button btn = new Button("Testing Click");
        TextField tf = new TextField( 20);
        f.add(btn);
        f.add(tf);
        f.setLayout(new FlowLayout());
        f.setSize(500,500);
        f.setVisible(true);
        f.setSize(7 , 55);

    }
}