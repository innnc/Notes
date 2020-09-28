try
{
    zone = code.charAt(9);
    district = Integer.parseInt(code.substring(3, 7));
    valid++;
    if (zone == 'R' && district > 2000)
      banned++;
}
catch (StringIndexOutOfBoundsException exception)
{
  System.out.println("Improper code length: " + code);
}
catch (NumberFormatException exception)
{
  System.out.println("District is not numeric: " + code);
}
