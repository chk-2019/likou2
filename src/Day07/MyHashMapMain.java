package Day07;

import java.util.ArrayList;

public class MyHashMapMain {
    public static void main(String[] args) {
//        ArrayList arrayList = new ArrayList();
//        //arrayList.add(1);
//        System.out.println(arrayList.indexOf(2));
//        System.out.println(arrayList.size());
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.get(1);
        hashMap.get(3);
        hashMap.put(2, 1);
        hashMap.get(2);
        hashMap.remove(2);
        hashMap.get(2);


    }

}
//思路一：
class MyHashMap {
    private ArrayList key;
    private ArrayList value;

    /** Initialize your data structure here. */
    public MyHashMap() {
        this.key=new ArrayList();
        this.value=new ArrayList();


    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        if (get(key)==-1){this.key.add(key);
        this.value.add(value);}
        else {
            int index = this.key.indexOf(key);
            this.value.set(index,value);
            }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int index = this.key.indexOf(key);
        if (index==-1||this.key.size()==0)
            return index;
        else
            return (int) this.value.get(index);
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if (this.key.contains(key)){
            int index = this.key.indexOf(key);
            this.key.remove(index);
            this.value.remove(index);
        }

    }
}
//思路二：
class MyHashMap2 {
    private int key[];
    private boolean contains[];
    /** Initialize your data structure here. */
    public MyHashMap2() {
        this.key=new int [1000000];
        this.contains = new boolean [1000000];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
            this.key[key]=value;
            this.contains[key]=true;

    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        if (this.key.length!=0&&contains[key]==true){
            return this.key[key];
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        if (get(key)!=-1){
            this.key[key]=-1;
            this.contains[key]=false;
        }
    }
}

