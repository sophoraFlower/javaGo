package code022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DijkstraAlgorithm {

    private static String getMinCostPoint(List<String> points, List<String> checked, Integer[] costs) {
        String currentPoint;
        int index = 0;
        int length = Integer.MAX_VALUE;
        for (int i = 1; i < costs.length; i++) {
            //不含已经检查过的点
            if (checked.contains(points.get(i))) {
                continue;
            }
            if (costs[i] != null && costs[i] < length) {
                length = costs[i];
                index = i;
            }
        }
        currentPoint = points.get(index);
        return currentPoint;
    }

    public static void main(String[] args) {
        //初始化最短路径拓扑图
        List<String> points = Arrays.asList("start", "A", "B", "end");

        int size = points.size();
        Object[][] graph = new Object[size][size];
        graph[points.indexOf("start")][points.indexOf("A")] = 6;
        graph[points.indexOf("start")][points.indexOf("B")] = 2;
        graph[points.indexOf("A")][points.indexOf("end")] = 1;
        graph[points.indexOf("B")][points.indexOf("A")] = 3;
        graph[points.indexOf("B")][points.indexOf("end")] = 5;

        //当前节点
        String currentPoint = points.get(0);
        //记录所有检查过的点
        List<String> checked = new ArrayList<>();
        //记录各个点到起点的距离，下标与points对应
        Integer[] costs = new Integer[size];
        //起点到起点的距离为0，其他节点距离暂时未知
        costs[0] = 0;

        while (true) {
            int pointIndex = points.indexOf(currentPoint);
            System.out.println("当前检查点：" + currentPoint);
            for (int i = 0; i < graph[pointIndex].length; i++) {
                //当前节点到邻居的距离
                Object currentCost = graph[pointIndex][i];
                //过滤空节点和当前节点
                if (currentCost == null || i == pointIndex) {
                    continue;
                }
                //从当前节点出发，到达邻居节点的距离比邻居节点原来的距离更短，则更新邻居节点的总里程。
                int newCost = costs[pointIndex] + (int) currentCost;
                if (costs[i] == null || newCost < costs[i]) {
                    costs[i] = newCost;
                    System.out.println("发现点" + points.get(i) + "更短距离：" + newCost);
                }
            }

            //记录已经检查过的点
            checked.add(currentPoint);
            //查找还未检查过的，距离起点最短的点
            currentPoint = getMinCostPoint(points, checked, costs);

            //如果当前节点为终点，跳出循环
            if (currentPoint.equals(points.get(points.size() - 1))) {
                break;
            }
            System.out.println("下一个检查点为：" + currentPoint);
            System.out.println("--------------------------");
        }

        System.out.println("--------------------------");
        System.out.println("当前最短路径为：" + costs[size - 1]);

    }
}
