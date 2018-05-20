package Stack;

public class Stack {

    //cea mai recenta insertie
    private int top = 0;
    // boolean isEmpty;
    private int[] content = new int[5];
    // public Stack(){top tot 0 ramane
    //   content[0] =5;
    //}

    public boolean isEmpty() {
        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int element) {
        if (content.length < top + 2) {//vrem sa marim dimensiunea vectorului doar atunci cand ea a fost depasita
            increaseStack();
        }
        content[top + 1] = element;
        top++;
    }

    public int pop() {
        int element = content[top];
        top--;
        return element;
    }

    private void increaseStack() {//face loc la inca un element pentru al adauga
        int[] newArray = new int[content.length + content.length / 2];
        System.arraycopy(content, 0, newArray, 0, content.length);
        content = newArray;
    }
}

