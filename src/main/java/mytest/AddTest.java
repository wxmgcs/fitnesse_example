package mytest;

import fit.ColumnFixture;
public class AddTest extends ColumnFixture {
    public int x,y;
    Add anum = new Add(x,y);
    public int result(){
       return anum.getSum();
    }
}