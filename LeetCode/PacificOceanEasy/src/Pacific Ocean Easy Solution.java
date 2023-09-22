import java.awt.*;
import java.util.*;
import java.util.List;

class PacificAtlanticSolution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        //Can only flow if neighbouring cell is less than or equal to
        //Adjacent cells
        List<List<Integer>> results = new ArrayList<>();
        for(int r = 0; r < heights.length; r++){
            ArrayList<Integer> thisList = new ArrayList<>();
            for(int c = 0; c < heights[r].length; c++){
                List<Point> adjacentPoints = getAdjacentPoints(new Point(c, r));
                for(Point cell: adjacentPoints){
                    if(heights[cell.y][cell.x] <= heights[r][c]){
                        heights[cell.y][cell.x] += heights[r][c];
                        heights[r][c] = 0;
                    }
                }
                thisList.add(heights[r][c]);
            }
            results.add(thisList);
        }

        return results;
    }

    private List<Point> getAdjacentPoints(Point point){
        List<Point> adjacentList = new ArrayList<>();
        adjacentList.add(new Point(point.x - 1, point.y));
        adjacentList.add(new Point(point.x + 1, point.y));
        adjacentList.add(new Point(point.x, point.y + 1));
        adjacentList.add(new Point(point.x, point.y - 1));

        return adjacentList;
    }
}
