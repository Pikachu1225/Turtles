
public class App {
    public static void main(String[] args) throws Exception {
        double x0 = 0.025;
        double y0 = 0.025;
        double a0 = 0;
        Turtle franklin = new Turtle(x0, y0, a0);

        double x1 = .1;
        double y1 = .45;
        double a1 = 0;
        Turtle bob = new Turtle(x1, y1, a1);

        double x2 = .225;
        double y2 = .45;
        double a2 = 0;
        Turtle mo = new Turtle(x2, y2, a2);

        double x3 = .35;
        double y3 = .45;
        double a3 = 0;
        Turtle larry = new Turtle(x3, y3, a3);

        double x4 = .2;
        double y4 = .025;
        double a4 = 0;
        Turtle jo = new Turtle(x4, y4, a4);

        double x5 = .275;
        double y5 = .96;
        double a5  = 0;
        Turtle harry = new Turtle(x5, y5, a5);

        jo.setCanvasSize(500, 500);

        franklin.goForward(0.5);
        franklin.turnLeft(90);
        franklin.goForward(.5);
        franklin.turnLeft(30);
        franklin.goForward(.5);
        franklin.turnLeft(120);
        franklin.goForward(.5);
        franklin.turnLeft(30);
        franklin.goForward(.5);
        franklin.turnLeft(180);
        franklin.goForward(.5);
        franklin.turnRight(90);
        franklin.goForward(.5);

        bob.goForward(.1);
        bob.turnRight(90);
        bob.goForward(.1);
        bob.turnRight(90);
        bob.goForward(.1);
        bob.turnRight(90);
        bob.goForward(.1);
        bob.turnRight(90);

        mo.goForward(.1);
        mo.turnRight(90);
        mo.goForward(.1);
        mo.turnRight(90);
        mo.goForward(.1);
        mo.turnRight(90);
        mo.goForward(.1);
        mo.turnRight(90);

        larry.goForward(.1);
        larry.turnRight(90);
        larry.goForward(.1);
        larry.turnRight(90);
        larry.goForward(.1);
        larry.turnRight(90);
        larry.goForward(.1);
        larry.turnRight(90);

        jo.turnLeft(90);
        jo.goForward(.25);
        jo.turnRight(90);
        jo.goForward(.15);
        jo.turnRight(90);
        jo.goForward(.25);

        harry.goForward(.375);
        //harry

        franklin.show();
        bob.show();
        mo.show();
        larry.show();
        jo.show();  
        harry.show();
    }
}
