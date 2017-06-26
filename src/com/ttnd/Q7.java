package com.ttnd;

//Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
// and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))

import java.util.*;

class SpecialStack {
    
    static int min, itemCount, pop_flag;
    final int max_size = 10;
    Stack stack;
    List list;
    
    
    
    public int getMin() {
        return min;
    }
    
    public SpecialStack() {
        stack = new Stack<Integer>();
        list = new ArrayList();
    }
    
    public int pushToStack(int num) {
        
        if (itemCount < max_size) {
            num = (Integer) stack.push(num);
            min = setMin(num);
            list.add(num);
            Collections.sort(this.list);
            itemCount++;
            return 1;
        }
        return 0;
    }
    
    public int popFromStack() {
        if (itemCount <= 0) {
            return 0;
        } else {
            Integer num = (Integer) this.stack.pop();
            list.remove(num);
            pop_flag = 1;
            itemCount--;
            min = setMin(num);
            return num;
        }
    }
    
    public int setMin(int num) {
        
        if (pop_flag == 1) {
            pop_flag = 0;
            if (itemCount > 0)
                min = (int) list.get(0);
            else
                min = 0;
        } else if (min == 0) {
            min = num;
        } else if (num < min && pop_flag == 0) {
            min = num;
        }
        return min;
    }
    
    
    public String isStackEmpty() {
        
        if (this.stack.isEmpty()) {
            return "Stack empty";
        }
        
        return "Stack is not empty";
    }
    
    
    public String isStackFull() {
        
        if (itemCount<=max_size) {
            return "Stack is not full yet. Space left:" + (max_size - itemCount);
        }
        
        return "Stack full";
    }
    
    
    public void showStack() {
        Iterator itr = this.stack.iterator();
        while (itr.hasNext())
            System.out.println("Item in stack are:" + itr.next());
    }
    
}


public class Q7 {
    
    public static void main(String[] args) {
        
        SpecialStack obj = new SpecialStack();
        System.out.println("is stack empty: " + obj.isStackEmpty());
        System.out.println("is stack full: " + obj.isStackFull());
        obj.pushToStack(22);
        obj.pushToStack(24);
        obj.pushToStack(12);
        obj.pushToStack(6);
        obj.pushToStack(23);
        obj.showStack();
        System.out.println("Minimum item is:" + obj.getMin());
        System.out.println("Item popped: " + obj.popFromStack());
        System.out.println("Item popped: " + obj.popFromStack());
        System.out.println("Min. is:" + obj.getMin());
        System.out.println("is stack empty: " + obj.isStackEmpty());
        System.out.println("is stack full: " + obj.isStackFull());
        System.out.println("Item popped: " + obj.popFromStack());
        System.out.println("Item popped: " + obj.popFromStack());
        System.out.println("Min. is:" + obj.getMin());
        
    }
    
}
