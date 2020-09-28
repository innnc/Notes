// Constructor
public class Stack
{
	private int size;
	private int top;
	private Object[] stackArray;
}

// push
public boolean push (Object item)
{
	// stack overflow error – stack out of memory
	if (top == stackArray.length)
		return false;
	// push item onto the stack
	stackArray[top] = item;
	top++;
	return true;
}

//pop
public Object pop ()
{
	// stack underflow error – nothing in the stack
	if (top == 0)
		return null;
	// pop item off of the stack
	top--;
	return stackArray[top];
}
