/* Below is the DrivableMap class, which is a map that contains a
 * HashMap mapping Strings to Drivable objects.
 * (Think of Python dictionaries as a comparison -- the concept is
 * similar!)
 *
 * Implement the requested methods as stated in the TODOs. We've
 * created the constructor for you already.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DrivableMap {
    HashMap<String, Drivable> drivable_map;

    /**
     * A generic constructor that initializes car_map
     * as an empty HashMap.
     */
    public DrivableMap() {
        drivable_map = new HashMap<>();
    }

    public boolean addDrivable(String ID, Drivable obj){
        if (!(drivable_map.keySet().contains(ID))){
            drivable_map.put(ID, obj);
            return true;
        }
        return false;
    }

    /* TODO: Write a method named addDrivable that takes a String (the ID)
     *       and a Drivable object. If the ID string does not appear as a key
     *       in drivable_map, then add the pair to drivable_map.
     *       Return true if the Drivable was added to drivable_map.
     */



    public boolean hasFasterThan(int speed){
        double max;
        if (drivable_map.isEmpty()){
            return false;
        }else{
            max = drivable_map.values().iterator().next().getMaxSpeed();
            for (Drivable item: drivable_map.values()){
                if (item.getMaxSpeed() > max){
                    max = item.getMaxSpeed();
                }
            }
        }
        return max >= speed;
    }


    /* TODO: Write a method named hasFasterThan that takes an int (a speed)
     *       and returns true iff there is at least one item in drivable_map
     *       that has a maxSpeed >= the speed given.
     * You may want to use drivable_map.keys() or drivable_map.values() to
     * iterate through drivable_map.
     */


    public List getTradable(){
    ArrayList a = new ArrayList();
    for (Drivable item: drivable_map.values()){
        if (item instanceof Tradable){
            a.add(0, item);
        }
    }
    return a;
    }


    /* TODO: Write a method named getTradable that takes no arguments and
     *       returns a List containing all of the Tradable items in
     *       drivable_map.
     */



    
}