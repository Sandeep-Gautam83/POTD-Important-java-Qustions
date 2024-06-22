class Box1 {
    double length;
    double breadth;
    double height;


    Box1(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }


    double volume() {
        return length * breadth * height;
    }
}

public class Box {
    public static void main(String[] args) {
        
        Box1 myBox = new Box1(5.0, 3.0, 2.0);
        double boxVolume = myBox.volume();
        System.out.println("Volume of the box: " + boxVolume);
    }
}