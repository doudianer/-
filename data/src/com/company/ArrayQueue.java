package com.company;
/*
* 队列
* 2018.5.7
* */

public class ArrayQueue<E> implements Queue<E>{
    private Array<E> array;
    public ArrayQueue(int capacity)
    {
        array=new Array<>(capacity);

    }
    public ArrayQueue()
    {
        array=new Array<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        array.addlast(e);
    }

    @Override
    public E dequeue() {
       return array.removefrist();
    }

    @Override
    public E getFront() {
        return array.getfirst();
    }
    public int getCapacity()
    {
        return array.getcapacity();
    }

    @Override
    public String toString()
    {
        StringBuilder res=new StringBuilder();
        res.append("Queue:");
        res.append("front[");
        for (int i=0;i<array.getSize();i++)
        {
            res.append(array.get(i));
            if(i!=array.getSize()-1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }
}
