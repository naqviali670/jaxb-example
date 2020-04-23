package Legoset;

import Legoset.LegoSet;
import jaxb.JAXBHelper;

import javax.xml.bind.JAXBException;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws JAXBException {
        LegoSet legoSet = new LegoSet();
        legoSet.setNumber("75211");
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);

        Set<String> tags = new HashSet<>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");
        legoSet.setTags(tags);

        List<legoset.Minifig> minifigs = new ArrayList<>();
        minifigs.add(new legoset.Minifig(2,"Imperial Mudtrooper"));
        minifigs.add(new legoset.Minifig(1,"Imperial Pilot"));
        minifigs.add(new legoset.Minifig(1,"Mimban Stormtrooper"));
        legoSet.setMinifigs(minifigs);

        legoSet.setWeight(new legoset.Weight(0.89,"kg"));
        legoSet.setUrl("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter");
        JAXBHelper.toXML(legoSet, System.out);




    }
}
