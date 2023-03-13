import utils.Pen;
import utils.PenFactory;

public class Client {
    public static void printHashCode(Pen pen) {
        System.out.println(pen.hashCode());
    }

    public static void main(String[] args) throws Exception {
        Pen yellowThickPen1 = PenFactory.getThinPen("amarelo");
        yellowThickPen1.draw("Olá, mundo!");

        Pen yellowThickPen2 = PenFactory.getThickPen("amarelo");
        yellowThickPen2.draw("Olá, mundo!");

        Pen blueThinPen = PenFactory.getThinPen("azul");
        blueThinPen.draw("Olá, mundo!");

        printHashCode(yellowThickPen1);
        printHashCode(yellowThickPen2);
        printHashCode(blueThinPen);

    }
}
