package featuresofpeople;

import featuresface.FeaturesFace;
import baseofname.NamesPeoples;

public class SimpleMain {

	public static void main(String[] args) {
		
		NamesPeoples namesPpl = new NamesPeoples();
		
		namesPpl.letsTryWriteInConstructor("Kacper", " Jakobczak");
		
		namesPpl.dimensions(185, 42, 40);
		
		FeaturesFace featface = new FeaturesFace();
		featface.characteristicFace("green"," little red",  "big", "huge");
		
	}

}
