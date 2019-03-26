package pkgTestShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import pkgShape.Cuboid;
import pkgShape.SortByArea;
public class CuboidTest {

	@Test
	public void getDepthTest() {
		Cuboid x=new Cuboid(20,30,40);
		assertEquals(x.getDepth(),40);
	}
	@Test
	public void getWidthTest() {
		Cuboid x=new Cuboid(20,30,40);
		assertEquals(x.getWidth(),20);
	}
	@Test
	public void getLengthTest() {
		Cuboid x=new Cuboid(20,30,40);
		assertEquals(x.getLength(),30);
	}
	@Test
	public void setDepthTest() {
		Cuboid x=new Cuboid(20,30,40);
		x.setDepth(50);
		assertEquals(x.getDepth(),50);
	}
	@Test
	public void setWidthTest() {
		Cuboid x=new Cuboid(20,30,40);
		x.setWidth(50);
		assertEquals(x.getWidth(),50);
	}
	@Test
	public void setLengthTest() {
		Cuboid x=new Cuboid(20,30,40);
		x.setLength(50);
		assertEquals(x.getLength(),50);
	}
	@Test
	public void areaTest() {
		Cuboid x=new Cuboid(20,30,40);
		assertEquals((int)x.area(),5200);
	}
	@Test
	public void volumeTest() {
		Cuboid x=new Cuboid(20,30,40);
		assertEquals((int)x.volume(),24000);
	}
	@Test (expected=UnsupportedOperationException.class)
	public void perimeterTest() {
		Cuboid x=new Cuboid(20,30,40);
		x.perimeter();
	}
	@Test (expected=IllegalArgumentException.class)
	public void constructorTest1() {
		Cuboid x=new Cuboid(20,30,-40);
	}
	@Test (expected=IllegalArgumentException.class)
	public void constructorTest2() {
		Cuboid x=new Cuboid(20,30,0);
	}
	@Test (expected=IllegalArgumentException.class)
	public void constructorTest3() {
		Cuboid x=new Cuboid(-20,30,40);
	}
	@Test (expected=IllegalArgumentException.class)
	public void constructorTest4() {
		Cuboid x=new Cuboid(0,30,40);
	}
	@Test (expected=IllegalArgumentException.class)
	public void constructorTest5() {
		Cuboid x=new Cuboid(20,-30,40);
	}
	@Test (expected=IllegalArgumentException.class)
	public void constructorTest6() {
		Cuboid x=new Cuboid(20,0,40);
	}
}
