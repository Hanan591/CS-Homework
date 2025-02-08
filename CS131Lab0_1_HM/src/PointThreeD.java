public class PointThreeD {
    private double xPoint;
    private double yPoint;
    private double zPoint;

    public PointThreeD(double x, double y, double z) {
        this.xPoint = x;
        this.yPoint = y;
        this.zPoint = z;
    }

    public double getxPoint() {
        return xPoint;
    }

    public double getyPoint() {
        return yPoint;
    }

    public double getzPoint() {
        return zPoint;
    }

    @Override
    public String toString() {
        return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
    }
}