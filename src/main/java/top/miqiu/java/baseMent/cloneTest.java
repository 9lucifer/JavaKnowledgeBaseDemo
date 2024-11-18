package top.miqiu.java.baseMent;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;

/**
*@Author：丁浩然
*@Package：top.miqiu.java
*@Project：JavaKnowledgeBaseDemo
*@name：baseMent
*@Date：2024/11/18  23:50
*@Filename：baseMent
*@Purpose：实操clone接口的实现，实现简单的浅拷贝
*/

class cloneTest implements Cloneable{
    private String name ;

    @Override
    public cloneTest clone(){
        try{
            return (cloneTest) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
