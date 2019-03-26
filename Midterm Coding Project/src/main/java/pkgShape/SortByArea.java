package pkgShape;

import java.util.Comparator;

public class SortByArea implements Comparator<Cuboid> {
SortByArea() {
	
}
public int compare(Cuboid compare1, Cuboid compare2){
	if(compare1.area()<compare2.area()) {
		return -1;
	}
	else if(compare1.area()>compare2.area()) {
		return 1;
	}
	else {
		return 0;
	}
}
}
