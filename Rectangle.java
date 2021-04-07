public class Rectangle{
    double width,height;
    Rectangle() {};
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
     private void setWidth(double width) {
        this.width = width;
     }

    private void setHeight(double height) {
        this.height = height;
    }

    private double getArea(){
        return width * height ;
    }
    
    private double getPerimeter() {
        return (width + height) * 2;
    }
    private void display() {
        System.out.println("Hình chữ nhật có chiều dài : " + width );
        System.out.println("Hình chữ nhật có chiều rộng : " + height );
        System.out.println("Hình chữ nhật có diện tích : " + getArea() );
        System.out.println("Hình chữ nhật có chu vi : " + getPerimeter() );
    }




    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(5,5);
        rectangle1.display();
        rectangle.setHeight(10);
        rectangle.setWidth(10);
        rectangle.display();
    }



}
