package top.miqiu.java.baseMent;

/**
 * @Author：丁浩然
 * @Package：top.miqiu.java.baseMent
 * @Project：JavaKnowledgeBaseDemo
 * @name：deepCopy
 * @Date：2024/11/19 0:09
 * @Filename：deepCopy
 * @Purpose：深拷贝，我原称之为是递归拷贝
 */
public class deepCopy implements Cloneable{
    private cloneTest cloneTest;

    public deepCopy(top.miqiu.java.baseMent.cloneTest deepCopy) {
        this.cloneTest = deepCopy;
    }


    @Override
    public deepCopy clone(){
        try {
            deepCopy deepCopy01 = (deepCopy) super.clone();
            deepCopy01.setCloneTest(deepCopy01.getCloneTest().clone());
            return deepCopy01;
        }catch (CloneNotSupportedException e) {
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
        deepCopy deep = new deepCopy(new cloneTest());
        deepCopy deep2 = deep.clone();
        System.out.println(deep.getCloneTest() == deep2.getCloneTest());

    }
}
