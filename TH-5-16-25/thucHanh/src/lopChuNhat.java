public class lopChuNhat {
    double width, height;

    public lopChuNhat() {
    }

    public lopChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double chuVi() {
        return (width + height) * 2;
    }

    public double dienTich() {
        return width * height;
    }

    public String hienThi() {
        return "Hinh chu nhat{" + "width=" + width + "," + "height=" + height + "}";
    }
}