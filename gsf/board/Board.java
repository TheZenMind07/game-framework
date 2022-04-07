package gsf.board;

import java.util.List;

import gsf.unit.Unit;

import java.util.ArrayList;
import java.util.Iterator;

public class Board{
    private int width, height;
    private List tiles;
    Board(int width, int height, int[][] tiles){
        this.width = width;
        this.height = height;
        initialize();
    }

    private void initialize(){
        tiles = new ArrayList(width);
        for(int i=0; i<width; i++){
            tiles.add(i, new ArrayList(height));
            for(int j=0; j<height; j++){
                ((ArrayList)tiles.get(i)).add(j, new Tile());
            }
        }
    }

    public Tile getTile(int x , int y){
        return (Tile)((ArrayList)tiles.get(x-1)).get(y-1);
    }

    public void addUnit(Unit unit, int x , int y){
        Tile tile = getTile(x, y);
        // delegating  logic for adding tile into tile class itself
        tile.addUnit(unit);
    }

    public void removeUnit(Unit unit, int x , int y){
        Tile tile = getTile(x, y);
        // delegating  logic for adding tile into tile class itself
        tile.removeUnit(unit);
    }

    // removing all units
    public void removeUnits(int x , int y){
        Tile tile = getTile(x, y);
        tile.removeUnits();
    }

    public List getUnits(int x, int y){
        Tile tile = getTile(x, y);
        return tile.getUnits();
    }


    // return tile type
    //adding untis 
    // return units at given position

    public static void main(String[] args) {
        System.out.println("dude");
    }
}