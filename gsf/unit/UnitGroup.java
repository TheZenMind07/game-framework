package gameframework.gsf.unit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UnitGroup {
    private Map units;

    public UnitGroup(List unitList){
        units = new HashMap();
        for(Iterator i = unitList.iterator(); i.hasNext();){
            Unit unit = (Unit)i.next();
            units.put(unit.getId(), unit);
        }
    }

    public UnitGroup(){
        this(new LinkedList());
    }

    public void addUnit(Unit unit){
        units.put(unit.getId(), unit);
    }

    public void removeUnit(int id){
        units.remove(id);
    }

    public void removeUnit(Unit unit){
        units.remove(unit.getId());
    }

    public Unit getUnit(int id){
       return (Unit)units.get(id);
    }

    public List getUnits(){
        List unitList = new LinkedList();
        for(Iterator i = units.entrySet().iterator(); i.hasNext(); ){
            Unit unit = (Unit)i.next();
            unitList.add(unit);
        }
        return unitList;
    }
}
