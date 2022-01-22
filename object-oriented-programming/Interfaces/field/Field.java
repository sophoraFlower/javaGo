package Interfaces.field;

import java.util.ArrayList;
import java.util.function.IntFunction;

import Interfaces.animal.Fox;
import Interfaces.animal.Rabbit;
import Interfaces.cell.Cell;

public class Field {

    //测试代码
    private static final Location[] adjacent= {
            new Location(-1,-1),new Location(-1,0),new Location(-1,1),
            new Location(0,-1),new Location(0,0),new Location(0,1),
            new Location(1,-1),new Location(1,0),new Location(1,1)
    };

    //成员变量
    private int height;
    private int width;
    private Cell[][] field;

    //构造函数
    public Field(int height, int width) {
        this.height=height;
        this.width=width;
        field=new Cell[height][width];
    }

    public int getHeight()	{	return height;	}
    public int getWidth()	{	return width;	}

    /**
     * place函数，
     * 在Field类中，先定义Cell类型的变量ret
     * Field的成员变量同时也是Cell类型的变量数组field[][]，
     * 让ret和field[row][col]管理同一个对象，此时ret管理的是null
     * 让field[row][col]管理传入的细胞对象变量
     * （不能实例化，但是可以管理实现了它的接口的Fox和Rabbit,
     * 此时ret也会跟着管理这个对象
     */
    public Cell place(int row, int col, Cell o) {
//		Cell ret=field[row][col];
        field[row][col]=o;
//		return ret;
        return field[row][col];//改写了这个函数，这样看条例更清晰
    }

    //获取当前对象
    public Cell get(int row,int col) {
        return field[row][col];
    }

    /**
     *Field的getNeighbour()函数用于获取周围有对象的空格
     *他要遍历周围所有的位置
     *并且定义一个容器来储存Cell型变量（实际上可能是Fox或Rabbit的对象
     *返回list长度的Cell变量数组
     */
    public Cell[] getNeighbour(int row,int col) {
        ArrayList<Cell> list=new ArrayList<Cell>();
        for(int i=-1;i<2;i++)
        {
            for(int j=-1;j<2;j++)
            {
                int r = row+i;
                int c = col+j;

                if ( r >-1 && r<height && c>-1 && c<width && !(r== row && c == col) )
                {
                    list.add(field[r][c]);
                }
            }
        }
        return list.toArray(new Cell[list.size()]);
    }

    /**
     *Field的getFreeNeighbour()函数用于获取周围没有管理对象的位置
     *它会遍历周围所有的位置
     *如果周围的位置是空的
     *它就会用ArrayList把这些位置存到容器里面
     *最后返回该数组长度的数组
     */
    public Location[] getFreeNeighbour(int row,int col) {
        ArrayList<Location> list=new ArrayList<Location>();
        for(int i=-1;i<2;i++) {
            for(int j=-1;j<2;j++)
            {
                int r=row+i;
                int c=col+j;
                //这里为什么不用排除掉自己呢，因为自己一定是有对象的
                if(r>-1&&r<height&&c>-1&&c<width&&field[r][c]==null)
                {
                    list.add(new Location(r,c));
                }
            }
        }
        return list.toArray( new Location[list.size()]);
    }

    /**
     * 由于Animal的移动以后，当前loc的位置已经发生了变化
     * 由发生变化的位置接管原来位置上面的对象
     * 把原来位置上的对象清除
     */
    public void move(int row, int col, Location loc) {
        field[loc.getCol()][loc.getRow()]=field[row][col];
        remove(row,col);
    }

    //删除对象，这个函数在FoxAndRabbit类里面被调用
    public void remove(Cell cell) {
        for(int row=0;row<height;row++)
        {
            for(int col=0;col<width;col++)
            {
                if(field[row][col]==cell) { field[row][col]=null; break; }
            }
        }
    }

    //删除对象,这个函数在类里面调用
    public Cell remove(int row, int col) {
        Cell ret=field[row][col];
        field[row][col]=null;
        return ret;
    }

    /**
     *这个函数的作用把产生的小baby放入到随机一个格子里面去
     *首先定义Location数组，接收周围没有对象的空格
     *如果有空格，获取一个0到该数组长度之间的一个随机整数
     *用该空格去管理传进来的baby(已经造型为Cell
     *返回true
     *这里的返回值我并不清楚它的作用
     */
    public boolean placeRandomAdj(int row, int col, Cell baby) {
        boolean ret=false;
        Location[] FreeAdj=getFreeNeighbour(row, col);
        if(FreeAdj.length>0)
        {
            int index=(int)(Math.random()*FreeAdj.length);
            field[FreeAdj[index].getRow()][FreeAdj[index].getCol()]=baby;
            ret=true;
        }
        return ret;
    }

    //清除所有对象
    public void clear(){
        for(int i=0;i<height;i++)
        {
            for(int j=0;j<width;j++)
            {
                field[i][j]=null;
            }
        }
    }
}