private void moveTower0(int numDisks, int start, int end, int temp)
{
    if (numDisks == 1)
        moveOneDisk(start, end);
    else {
        moveTower0(numDisks-1, start, temp, end); //top tower to peg 2
        moveOneDisk(start, end);                 // bottom to peg 3
        moveTower0(numDisks-1, temp, end, start);  // top tower to peg 3.
    }
}
