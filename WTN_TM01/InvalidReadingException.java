//exception
package WTN_TM01;
public class InvalidReadingException extends Exception{
public String toString()
{
return "Incorrect Reading";
}
public InvalidReadingException()
{
super();
}
}
