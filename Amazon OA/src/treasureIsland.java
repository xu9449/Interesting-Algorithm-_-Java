import java.util.LinkedList;
import java.util.Queue;

public class treasureIsland {
    final int [][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int treasureIsland (char[][] islands) {
        if(islands.length == 0 || islands[0].length == 0 || islands[0][0] == 'D') return -1;
        if(islands[0][0] == 'X') return 0;
        int R = islands.length, C = islands[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int steps = 1;
        queue.add(new int[]{0, 0});
        islands[0][0] = 'D';
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; ++i) {
                int[] pos = queue.poll();
                for(int[] dir: dirs) {
                    int x = pos[0] + dir[0], y = pos[1] + dir[1];
                    if(x < 0 || x >= R || y < 0 || y >= C || islands[x][y] == 'D') continue;
                    if(islands[x][y] == 'X') return steps;
                    queue.add(new int[]{x, y});
                    islands[x][y] = 'D';
                }
            }
            ++steps;
        }
        return -1;
    }
}
