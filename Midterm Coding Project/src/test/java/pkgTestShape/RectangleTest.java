package pkgTestShape;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	@Test
	public void getWidthTest() {
		Rectangle x=new Rectangle(20,30);
		assertEquals(x.getWidth(),20);
	}
	@Test
	public void getLengthTest() {
		Rectangle x=new Rectangle(20,30);
		assertEquals(x.getLength(),30);
	}
	@Test
	public void setWidthTest() {
		Rectangle x=new Rectangle(20,30);
		x.setWidth(30);
		assertEquals(x.getWidth(),30);
	}
	@Test
	public void setLengthTest() {
		Rectangle x=new Rectangle(20,30);
		x.setLength(40);
		assertEquals(x.getLength(),40);
	}
	@Test
	public void areaTest() {
		Rectangle x=new Rectangle(20,30);
		assertEquals((int)x.area(),600);
	}
	@Test
	public void perimeterTest() {
		Rectangle x=new Rectangle(20,30);
		assertEquals((int)x.perimeter(),100);
	}
	@Test (expected=IllegalArgumentException.class)
	public void constructionTest1() {
		Rectangle x=new Rectangle(-20,30);
		
	}
	@Test (expected=IllegalArgumentException.class)
	public void constructionTest2() {
		Rectangle x=new Rectangle(20,-30);
		
	}
	@Test (expected=IllegalArgumentException.class)
	public void constructionTest3() {
		Rectangle x=new Rectangle(-20,-30);
		
	}
	@Test (expected=IllegalArgumentException.class)
	public void constructionTest4() {
		Rectangle x=new Rectangle(0,30);
		
	}
}
