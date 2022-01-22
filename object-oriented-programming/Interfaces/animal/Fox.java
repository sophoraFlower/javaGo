package Interfaces.animal;

import Interfaces.cell.Cell;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Fox extends Animal implements Cell {

    public Fox() {
        super(20, 4);//生命上限20岁，生育年龄4岁
    }

    @Override
    public void draw(Graphics g, int x, int y, int size) {
        int alpha = (int) ((1 - getAgePercent()) * 255);
        g.setColor(new Color(0, 0, 0, alpha));//用数字代表颜色，最后一个值是颜色深度，逐渐递减
        g.fillRect(x, y, size, size);
    }

    //已经改写过的函数，增加可扩展性
    @Override
    public Animal breed() {
        return super.breed();
    }

    @Override
    public Animal getAnimal() {
        return new Fox();
    }

    @Override
    public double getValue() {
        return 0.05;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Fox:" + super.toString();
    }

    /**
     * Fox的feed()函数，他的参数是Animal的容器(周围的兔子
     * 定义Animal类型的变量ret
     * 在一定的几率下接收任意一个兔子
     * 提高两个生命上限
     * 返回这只兔子
     */
    @Override
    public Animal feed(ArrayList<Animal> neighbour) {
        Animal ret = null;
        if (Math.random() < 0.2) {
            ret = neighbour.get((int) (Math.random() * neighbour.size()));
            longerLife(2);
        }
        return ret;
    }
}