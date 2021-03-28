import javax.swing.*;
import java.awt.*;

public class Bezier extends JPanel {


    int xj1[]={79,90,79};
    int yj1[]={114,75,75};
    int xj2[]={80,178,177};
    int yj2[]={76,91,83};
    int xj3[]={178,179,179};
    int yj3[]={84,322,318};
    int xj4[]={165,175,179};
    int yj4[]={315,314,319};
    int xj5[]={95,91,120};
    int yj5[]={310,291,290};
    int xj6[]={120,138,143};
    int yj6[]={290,290,290};
    int xj7[]={147,147,140};
    int yj7[]={289,115,115};
    int xj8[]={165,95,95};
    int yj8[]={314,340,315};
    int xj9[]={139,96,81};
    int yj9[]={115,115,115};

    int xw1[]={314,322,321};
    int yw1[]={87,255,315};
    int xw2[]={323,380,374};
    int yw2[]={315,277,255};
    int xw3[]={372,390,430};
    int yw3[]={250,280,315};
    int xw4[]={430,460,460};
    int yw4[]={315,104,90};
    int xw5[]={455,407,410};
    int yw5[]={90,192,252};
    int xw6[]={410,370,370};
    int yw6[]={252,198,210};
    int xw7[]={370,347,347};
    int yw7[]={208,245,250};
    int xw8[]={345,330,315};
    int yw8[]={251,86,86};

    double szerokosc;
    double wysokosc;

    private static double silnia(int i) {
        if (i <1)
            return 1;
        else
            return i * silnia(i - 1);
    }

    public void wzor(int[] x, int[] y, Graphics g) {

        double t;

        for (t = 0.0; t < 1.0; t += 0.005) {
            szerokosc=0;
            wysokosc=0;
            for (int i = 0; i < x.length; i++) {
                szerokosc += (silnia(x.length - 1)) / (silnia(i) * silnia(x.length - 1 - i)) * Math.pow(1 - t, x.length - 1 - i) * Math.pow(t, i) * x[i];
            }
            for (int i = 0; i < y.length; i++) {
                wysokosc += (silnia(y.length - 1)) / (silnia(i) * silnia(y.length - 1 - i)) * Math.pow(1 - t, y.length - 1 - i) * Math.pow(t, i) * y[i];

            }
            g.drawLine((int) szerokosc, (int) wysokosc, (int) szerokosc, (int) wysokosc);
        }
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0,0,600,400);
        g2d.setColor(Color.green);
        g2d.setStroke(new BasicStroke(5));
        wzor(xj1, yj1,g);
        wzor(xj2, yj2,g);
        wzor(xj3, yj3,g);
        wzor(xj4, yj4,g);
        wzor(xj5, yj5,g);
        wzor(xj6, yj6,g);
        wzor(xj7, yj7,g);
        wzor(xj8, yj8,g);
        wzor(xj9, yj9,g);


        wzor(xw1,yw1,g);
        wzor(xw2,yw2,g);
        wzor(xw3,yw3,g);
        wzor(xw4,yw4,g);
        wzor(xw5,yw5,g);
        wzor(xw6,yw6,g);
        wzor(xw7,yw7,g);
        wzor(xw8,yw8,g);


    }

}

