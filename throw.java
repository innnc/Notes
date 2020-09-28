public static void main(String[] args) throws OutOfRangeException
{
  \\...
  OutOfRangeException problem =
           new OutOfRangeException("Input value is out of range.");
  \\...
  if (value < MIN || value > MAX)
           throw problem;
}
