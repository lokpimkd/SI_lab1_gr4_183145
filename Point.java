class Point {
	String id, boja;
	static double x;
	static double y;
	public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
	public static void setX(double u){
        x = u;
    }
    public static void setY(double z){
        y = z;
    }
	public static double getX() {
        return x;
    }
	public static double getY() {
		return y;
	}
	public static void move (char xDirection, char yDirection) {
		double x = getX();
		double y = getY();
		if(xDirection=='L') {
			double nova = x-1.0;
			setX(nova);
		}
		if(xDirection=='R') {
			double nova = x+1.0;
			setX(nova);
		}
		if(yDirection=='U') {
			double nova = y+1.0;
			setY(nova);
		}
		if(xDirection=='D') {
			double nova = x-1.0;
			setY(nova);
		}
	}

	public static void draw () {
		System.out.println( "("+ getX()+","+getY()+")");
	}
}