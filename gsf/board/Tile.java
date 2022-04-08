package gameframework.gsf.board;

import java.util.LinkedList;
import java.util.List;

import gameframework.gsf.unit.Unit;

public class Tile {
    private List units;
    
    public Tile(){
        units = new LinkedList();
    }

    protected void addUnit(Unit unit){
        units.add(unit);
    }

    protected void removeUnit(Unit unit){
        units.remove(unit);
    }

    protected void removeUnits(){
        units.clear();
    }

    protected List getUnits(){
        return units;
    }
}
