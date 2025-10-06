class rectangle {
    private int length, breadth;

    public void setdimension(int l, int b) {
        l = length;
        b = breadth;
    }

    public void area() {
        int a = (length * breadth);
        System.out.println("Area =" + a);
    }

    public void perimeter() {
        int p = 2 * (length + breadth);
        System.out.println("perimeter=" + p);
    }
}

class Rect {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();
        r1.setdimension(3, 05);
        r2.setdimension(5, 7);
        r1.area();
        r2.area();
        r1.perimeter();
        r2.perimeter();
    }
}