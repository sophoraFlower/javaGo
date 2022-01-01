package Interfaces.field;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

import Interfaces.cell.Cell;

public class View extends JPanel {

    private static final long serialVersionUID = -5258995676212660595L;
    private static final int GRID_SIZE = 16;

    //定义自己的变量
    private Field theField;

    //构造函数
    public View(Field field) {
        theField = field;
    }

    /**
     * paint()函数,由于继承了JPanel类，该函数在对象初始化的会被自动调用
     * drawLine()函数，前两个数是第一个点的坐标值，后两个数是第二个点的坐标值
     * 该函数会先画一个与区域大小一样
     * 然后会遍历整个区域，如果存在对象，给网格上色
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);//Invoked by Swing to draw components. 画出传入的图形
        g.setColor(Color.gray);
        for(int i=0;i<theField.getHeight();i++)
        {
            g.drawLine(0, i*GRID_SIZE, theField.getWidth()*GRID_SIZE, i*GRID_SIZE);
            g.drawLine(i*GRID_SIZE, 0, i*GRID_SIZE, theField.getHeight()*GRID_SIZE);
        }
        //遍历传入的区域
        for ( int row = 0; row<theField.getHeight(); row++ )
        {
            for ( int col = 0; col<theField.getWidth(); col++ )
            {
                //用细胞变量依次管理被遍历的 Cell对象
                Cell cell = theField.get(row, col);
                if ( cell != null ) //该区域有Cell的对象
                {//调用draw函数 对象为传入的 g, x=1x16,y=1x16,y=2x16...
                    cell.draw(g, col*GRID_SIZE, row*GRID_SIZE, GRID_SIZE);
                }
            }
        }
    }

    //这个函数我并没由找到他的作用说明，根据在细胞自动机里面的代码，写上就好了
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(theField.getWidth()*GRID_SIZE+1, theField.getHeight()*GRID_SIZE+1);
    }
}