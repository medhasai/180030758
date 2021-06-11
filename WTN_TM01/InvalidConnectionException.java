//exception
package WTN_TM01;
public class InvalidConnectionException extends Exception{
public String toString()
{
return "Invalid ConnectionType";
}
public InvalidConnectionException()
{
super();
}
}

