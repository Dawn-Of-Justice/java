//Program which has an abstract class named shape and has an abstract method numberOfSides() and Area(),
// It is extended by Triangle, Rectangle, Hexagon. Each one of the classes contains only the method
// numberOfSides() that shows the number of sides in the given geometrical structures.
import java.util.Scanner;
abstract class shape {
    Scanner sc = new Scanner(System.in);
    public abstract void numberOfSides();

    public void Area(int side){
        switch(side){
            case 3:
                System.out.print("Base : ");
                int b = sc.nextInt();
                System.out.print("height : ");
                int h = sc.nextInt();
                System.out.println("Area of the Triangle " + 0.5*b*h);
                break;
            case 4:
                System.out.print("length : ");
                int l = sc.nextInt();
                System.out.print("breadth : ");
                b = sc.nextInt();
                System.out.println("Area of the Rectangle " + l*b);
                break;
            case 6:
                System.out.print("side : ");
                int s = sc.nextInt();
                System.out.print("Area of the Regular Hexagon " + 2.598*s*s);
                break;
            default:
                System.out.println("Sorry please try a different number");
                break;
        }
    }
}

class Rectangle extends shape{
    @Override
    public void numberOfSides() {
        System.out.println("Rectangle has 4 sides");
    }
}

class Triangle extends shape{

    @Override
    public void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends shape{

    @Override
    public void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class ImplementAbstract {
    public static void main(String[] args){
        Rectangle re = new Rectangle();
        Triangle tr = new Triangle();
        Hexagon hr = new Hexagon();
        Scanner sc = new Scanner(System.in);

        System.out.println("Which shape would you like to choose?");
        System.out.println("1 : Triangle");
        System.out.println("2 : Rectangle");
        System.out.println("3 : Hexagon");
        System.out.print("Your choice : ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                tr.numberOfSides();
                tr.Area(3);
                break;
            case 2:
                re.numberOfSides();
                re.Area(4);
                break;
            case 3:
                hr.numberOfSides();
                hr.Area(6);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
