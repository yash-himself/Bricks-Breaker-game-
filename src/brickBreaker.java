
import javax.swing.JFrame;


public class brickBreaker{
    public static void main(String[] args) {

        JFrame obj = new JFrame();
        Gameplay gameplay=new Gameplay();

        obj.setBounds(100, 100, 700, 600);
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);


    }
}