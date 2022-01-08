package Interfaces.foxnrabbit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

import Interfaces.field.Field;
import Interfaces.field.View;
import Interfaces.field.Location;

import Interfaces.animal.Animal;
import Interfaces.animal.Fox;
import Interfaces.animal.Rabbit;

import Interfaces.cell.Cell;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;


public class FoxAndRabbit {

    //成员变量
    private Field theField;//Field变量，用来管理新的网格
    private View theView;//继承自Jpanel的类，用来显示图形
    private JFrame frame;

    /*------构造函数------*/
    public FoxAndRabbit(int size) {
        //创建网格
        theField=new Field(size,size);

        //遍历网格
        for(int row=0;row<theField.getHeight();row++)
        {
            for(int col=0;col<theField.getWidth();col++)
            {

                double probability=Math.random();

                //随机放入狐狸
                if(probability<0.05)
                {
                    theField.place(row,col,new Fox());
                }

                //随机放入兔子
                else if(probability<0.15)
                {
                    theField.place(row, col,new Rabbit());
                }

            }
        }

        /*------把theField加入到显示框------*/
        theView=new View(theField);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Cells");
        frame.add(theView);
        JButton btnStep = new JButton("单步");
        frame.add(btnStep, BorderLayout.NORTH);
        btnStep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按下啦~");
                step();
                frame.repaint();
            }
        });
        frame.pack();
        frame.setVisible(true);
    }

    /*------开始函数，传入的参数是程序要执行的次数------*/
    public void satrt(int steps)
    {
        for (int i=0;i<steps;i++) {
            step();

            theView.repaint();//Java底层函数

            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*------step()函数，每次更新表格- - - - - -*/
    public void step() {
        for(int row=0;row<theField.getHeight();row++)
        {
            for(int col=0;col<theField.getWidth();col++)
            {
                //获取所有Cell的对象变量
                Cell cell=theField.get(row, col);

                if(cell!=null)
                {
                    //把管理的对象造型为Animal对象
                    Animal animal=(Animal)cell;

                    //年龄增长
                    animal.grow();

                    if(animal.isAlive())
                    {
                        //向周围移动
                        Location loc=animal.move(theField.getFreeNeighbour(row, col));
                        if(loc!=null) { theField.move(row,col,loc); }

                        //获取周围的兔子，储存进容器里面
                        Cell[] neighbour=theField.getNeighbour(row, col);
                        ArrayList<Animal> listRabbit=new ArrayList<Animal>();
                        for(Cell an:neighbour)
                        {//instanceof关键字，判断是不是某个类的实例
                            if(an instanceof Rabbit) { listRabbit.add((Rabbit)an); }
                        }

                        //吃掉兔子
                        if(!listRabbit.isEmpty()) //isEmpty()是ArrayList的函数，没有元素则返回true
                        {
                            //这里涉及到了多态，这个animal实际上是Fox的对象，调用的是Fox的feed()
                            //(animal本身是抽象类，自己不可能有对象的)
                            Animal fed=animal.feed(listRabbit);
                            //fed得到了兔子的对象之后，调用函数删除这个对象(被吃掉
                            if(fed!=null) { theField.remove((Cell)fed); }
                        }

                        //动物繁殖
                        Animal baby=animal.breed();
                        if(baby!=null) { theField.placeRandomAdj(row,col,(Cell)baby); }
                    }
                    else { theField.remove(row ,col); }
                }
            }
        }

    }

    /*------看懂函数先从main函数开始------*/
    public static void main(String[] args) {
        //创建一个30x30的网格
        //走100步
        FoxAndRabbit fr=new FoxAndRabbit(30);
        // fr.satrt(100);
    }

}