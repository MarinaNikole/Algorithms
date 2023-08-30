package homework4;

import java.util.ArrayList;

public class SpecialStack {
    ArrayList<Integer> items;
    public SpecialStack(){
        this.items = new ArrayList<>();
    }
    public int push(int element){
        items.add(element);
        return element;
    }

    public int pop(){
        int last = items.get(items.size()-1);
        items.remove(items.size()-1);
        return last;
    }


    public int peek(){
        return items.get(items.size()-1);
    }


    public boolean isEmpty() {
        return items.size() == 0;
    }


    public void clear(){
        items=new ArrayList<>();
    }

    public int getMax(){
        int max = items.get(0);
        for (int i=1;i<items.size();i++){
            if(items.get(i)>max)
                max = items.get(i);
        }
        return max;
    }

    public int getMin(){
        int min = items.get(0);
        for (int i=1;i<items.size();i++){
            if(items.get(i)<min)
                min = items.get(i);
        }
        return min;
    }

}
