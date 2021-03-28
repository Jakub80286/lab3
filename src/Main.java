import javax.swing.*;

        public class Main {
            public static void main(String[] args) {
                JFrame frame = new JFrame();
                Bezier bezierAlgorytm = new Bezier();
                frame.setBounds(0,0,600,400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(bezierAlgorytm);
                frame.setVisible(true);
            }
        }

