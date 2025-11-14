import javax.swing.*;

public class OneGraffic {


    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Graffica Beca");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 600);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("images-removebg-preview.png");
        frame.setIconImage(image.getImage());
    }
}
