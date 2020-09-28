public class Queue
{
    private Link front;
    private Link rear;
}

public void enqueue (Object item)
{
    Link newLink = new Link(item);
    if (front == null)
        front = newLink;
    if (rear != null) //if there is a element, then the new item will be enqueue at the rear
        rear.next = newLink;
    rear = newLink;
}

public Object dequeue ()
{
    Object toReturn = null;
    if (front != null) {
        toReturn = front.item;
        front = front.next;
    }
    if (front == null)
        rear = null;
    return toReturn;
}
