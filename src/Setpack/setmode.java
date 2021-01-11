package Setpack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setmode {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("河池学院");
        set.add(123456);
        set.add(1);
        set.add("palse");
        set.add(123.f);
        set.add(1);
        System.out.println("当前元素个数："+set.size());
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println("集合内的元素："+iterator.next());
        }
    }
}
