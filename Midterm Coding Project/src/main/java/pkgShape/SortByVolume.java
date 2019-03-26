package pkgShape;

import java.util.Comparator;

public class SortByVolume implements Comparator<Cuboid> {
SortByVolume(){
	
}
public int compare(Cuboid compare1, Cuboid compare2){
	if(compare1.volume()<compare2.volume()) {
		return -1;
	}
	else if(compare1.volume()>compare2.volume()) {
		return 1;
	}
	else {
		return 0;
	}
}
}
