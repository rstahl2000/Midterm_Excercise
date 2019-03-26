package pkgShape;


public class Cuboid extends Rectangle {
	private int iDepth;
	public Cuboid(int width, int length, int depth) {
	super(width, length);
	iDepth=depth;
}
	public int getDepth() {
		return iDepth;
	}
	public void setDepth(int depth) throws IllegalArgumentException{
		if(depth<=0) {
			throw new IllegalArgumentException("Depth must be positive.");
		}
		iDepth=depth;
	}
	public double volume() {
		return (double) super.getLength()*super.getWidth()*iDepth;
	}
	@Override
	public double perimeter() throws UnsupportedOperationException{
		throw new UnsupportedOperationException("Perimeter cannot be calculated for a Cuboid.");
	}
	@Override
	public double area() {
		return (double)(2*super.getWidth()*super.getWidth()+2*super.getWidth()*iDepth+2*super.getLength()*iDepth);
	}
	
	
}
