//Java methods are same as functions, they is hardly any change, syntax is almost same but we use access specifiers
//function declaration and definition  can be done at the same place static use krna padega ig, idk. refer gfg.
//java also has self pre-defined methods just as in c/c++ in the java library. user defined toh ham hi krna



class Stack{
    int elem[];
    int top;

    void initStack(int size){
        elem = new int[size];
        top=-1;

    }

    void initStack(Stack another){
        elem =new int[another.elem.length];
        top=-1;
        for(int item:another.elem)
            push(item);

    }

    void initStack(int [] a){
        elem=new int[a.length];
        top=-1;
        for(int item:a)
            push(item);

    }

    void push(int item){
        if(top==elem.length){
            System.out.println("Stack is full");

        }
        else{
            elem[++top]=item;
            System.out.println("Element pushed is "+item);
        }

    }

    int pop(){
        if(top == -1){
           System.out.println("Stack is empty");
           return -1;
        }
        else
            return elem[top--];

    }

    int peek(){

        return elem[top];

    }


}


public class Main
{
	public static void main(String[] args) {
		Stack s1=new Stack();
        Stack s2=new Stack();
        s1.initStack(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s2.initStack(s1);
        int[] array={1,2,3,4};
        Stack s3=new Stack();
        s3.initStack(array);
        System.out.println("Popped element in S1 object is "+s1.pop());
        System.out.println("Element on top of the stack of object s1 is "+s1.peek());
        System.out.println("Element on top of the stack of object s2 is "+s2.peek());

	}
}
