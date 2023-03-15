package stringArrayList;

import java.util.ArrayList;

public class StringArrayList {
    private ArrayList<String> place = new ArrayList<>();

    public void addLocation(String location){
        place.add(location);
    }
    public void removeLocation(String location){
        place.remove(location);
    }

    public int getSizeOfList(){
        return place.size();
    }

    public String getLocation(int index){
        return place.get(index);
    }
    public void displayForEachLocation(){
        for (Object address : place){
            System.out.println("Places to go: " + address);
        }
    }
    public void displayForLocation(){
        for (int i = 0; i<place.size(); i++){
            System.out.println("Here to go: " + place.get(i));
        }
    }
}
