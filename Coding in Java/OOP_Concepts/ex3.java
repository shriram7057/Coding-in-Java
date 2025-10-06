class Box {
    protected int L, B, H;

    public void setDimension(int x, int y, int z) {
        L = x;
        B = y;
        H = z;
    }

    public void volume() {
        int v = L * B * H;
        System.out.println("Volume is " + v);
    }

    public void surfaceArea() {
        int a = 2 * L * H + 2 * B * H + 2 * L * B;
        System.out.println("Surface Area is " + a);
    }
}

class OpenBox extends Box {
    public void surfaceArea() {
        int a = 2 * L * H + 2 * B * H + 2 * L * B;
        System.out.println("Surface Area is " + a);
    }
}

class demo8 {
    public static void main(String args[]) {
        Box a = new Box();
        a.setDimension(2, 2, 2);
        a.volume();
        a.surfaceArea();
        OpenBox b = new OpenBox();
        b.setDimension(1, 1, 1);
        b.volume();
        b.surfaceArea();
    }
}