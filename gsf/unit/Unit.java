package gameframework.gsf.unit;

import java.util.*;

public class Unit {
    // UnitType and properties are common across all the units
    private String type, name;
    private int id;
    private List weapons;
    private Map properties;

    public Unit(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void addWeapon(Weapon weapon){
        if(weapons == null){
            weapons = new LinkedList();
        }
        weapons.add(weapon);
    }

    public List getWeapons(){
        return weapons;
    }

    public void setProperty(String property, Object value){
        if(properties == null){
            properties = new HashMap();
        }
        properties.put(property, value);
    }
    public Object getProperty(String property) throws RuntimeException{
        if(properties == null){
            throw new RuntimeException("WHat are you doing no such prperty?");
        }
        return properties.get(property);
    }
}