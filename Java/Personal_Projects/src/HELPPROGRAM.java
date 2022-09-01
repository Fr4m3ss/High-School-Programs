import java.util.*;

public class HELPPROGRAM {
	/*
	Framess
	*/
public String reverseWord(String original)
{
	String str = "";
	int len = original.length();
	for(int i = len-1; i>=0; i--)
	{
		str = str + original.substring(i, i+1);	
	}
	return str;
}
	
	
	

}
