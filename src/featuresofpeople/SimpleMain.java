package featuresofpeople;

import clothes.ClothesOfPeoples;
import featuresface.FeaturesFace;
import baseofname.NamesPeoples;

public class SimpleMain {

	public static void main(String[] args) {
		
		NamesPeoples namesPpl = new NamesPeoples();
		
		namesPpl.letsTryWriteInConstructor("Kacper", " Jakobczak");
		
		namesPpl.dimensions(185, 42, 40);
		
		FeaturesFace featface = new FeaturesFace();
		featface.characteristicFace("green"," little red",  "big", "huge");
		
		ClothesOfPeoples cop = new ClothesOfPeoples();
		cop.coloursOfClothes("red", " pink", "grey");
		
		ShowEvents se = new ShowEvents();
		se.showEvent();
			
		}
	}
