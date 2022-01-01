package Interfaces.animal;

import java.util.ArrayList;

import Interfaces.field.Location;

public abstract class Animal {

    //成员变量
    private int ageLimit;
    private int breedableAge;
    private int age;
    private boolean isAlive=true;

    //构造函数，传入生命上限和可繁殖年龄
    public Animal(int ageLimit, int breedableAge) {
        this.ageLimit = ageLimit;
        this.breedableAge = breedableAge;
    }

    public int getAge() {
        return age;
    }

    protected double getAgePercent() {
        return (double)age/ageLimit;
    }

//	public abstract Animal breed();

    /**
     * 在之前的讨论中，我们用新的breed()函数，代替了原来的函数
     * 这个函数做的事情是是到达了生育年龄
     * 并且符合一定的几率
     * 产生一个新的对象（Fox或者Rabbit
     */
    public Animal breed()
    {
        Animal ret=null;
        if(isBreedable()&&Math.random()<getValue())
        {
            ret=getAnimal();
        }
        return ret;
    }
    public abstract Animal getAnimal();
    public abstract double getValue();

    //生长函数
    public void grow() {
        age++;
        if(age>=ageLimit)
        {
            die();
        }

    }

    protected void die() {
        isAlive=false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    protected boolean isBreedable()
    {
        return age>=breedableAge;
    }

    /**
     * Animal的move()函数
     *  传入Location的数组作为参数
     *  如果传入的参数不为空，几率符合
     *  由ret接管数组里面的一个随机位置对象
     *  最后返回这个位置
     */
    public Location move(Location[] freeAdj) {
        Location ret=null;
        if(freeAdj.length>0&&Math.random()<0.02) {
            ret=freeAdj[(int)(Math.random()*freeAdj.length)];
        }
        return ret;
    }

    @Override
    public String toString() {
        return ""+age+":"+(isAlive?"live":"dead");
    }

    //让子类覆盖，实际这个函数并没有被调用
    public Animal feed(ArrayList<Animal> neighbour) {
        return null;
    }

    //吃掉兔子之后增加生命上限
    protected void longerLife(int inc) {
        ageLimit+=inc;
    }

}
