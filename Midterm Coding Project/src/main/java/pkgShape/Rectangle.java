package pkgShape;

public class Rectangle extends Shape implements Comparable<Rectangle> {
	private int iWidth;
	private int iLength;
	public Rectangle(int width, int length) throws IllegalArgumentException{
		if (iWidth<=0) {
			throw new IllegalArgumentException("Width must be positive.");
		}
		if (iLength<=0) {
			throw new IllegalArgumentException("Length must be positive.");
		}
		iWidth=width;
		iLength=length;
	}
	public int getWidth() {
		return iWidth;
	}
	public void setWidth(int width) throws IllegalArgumentException{
		if (iWidth<=0) {
			throw new IllegalArgumentException("Width must be positive.");
		}
		iWidth=width;
	}
	public int getLength() {
		return iLength;
	}
	public void setLength(int length) throws IllegalArgumentException{
		if (iLength<=0) {
			throw new IllegalArgumentException("Length must be positive.");
		}
		iLength=length;
	}
	@Override
	public double area() {
		
		return (double)iWidth*iLength;
	}

	@Override
	public double perimeter() {
		
		return (double)(iWidth*2+iLength*2);
	}
	@Override
	public int compareTo(Rectangle compRectangle) {
		if (this.area()>compRectangle.area()){
			return 1;
		}
		else if (this.area()<compRectangle.area()) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
