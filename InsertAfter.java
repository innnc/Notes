public void insertAfter (IntLink target)
{
    target.next = found.next;
    found.next = target;
} 

list.insertAfter (new IntLink (X, null)); //insert an element whose next is null
