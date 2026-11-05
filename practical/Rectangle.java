class Rectangle {
    double length, width;

 
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    void calculateArea() {
        System.out.println("Area: " + (length * width));
    }

  
    void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (length + width)));
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 5);

       
        r1.calculateArea();
        r1.calculatePerimeter();
    }
}