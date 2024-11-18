package top.miqiu.java.baseMent;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;

/**
*@Author：丁浩然
*@Package：top.miqiu.java
*@Project：JavaKnowledgeBaseDemo
*@name：baseMent
*@Date：2024/11/18  23:50
*@Filename：baseMent
*@Purpose：实操clone接口的实现
*/

public class cloneTest2 implements Cloneable{
    private cloneTest cloneTest;

    @Override
    public cloneTest2 clone(){
        try{
            return (cloneTest2) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public top.miqiu.java.baseMent.cloneTest getCloneTest() {
        return cloneTest;
    }

    public void setCloneTest(top.miqiu.java.baseMent.cloneTest cloneTest) {
        this.cloneTest = cloneTest;
    }

    public static void main(String[] args) {
        cloneTest2 c1 = new cloneTest2();
        cloneTest2 c2 = c1.clone();
        //运行结果是一样的
        System.out.println(c1.getCloneTest() == c2.getCloneTest());
    }
}
