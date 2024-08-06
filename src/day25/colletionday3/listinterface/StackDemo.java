package day25.colletionday3.listinterface;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Character> stack=new Stack();
		Scanner sc=new Scanner(System.in);					//   'n'  => "n"
		System.out.println("Enter a String");				//   'i'  => "i"
		String input=sc.next();   //nitin					//   't'  => "t"
		String output="";									//   'i'  => "i"
		for(char c: input.toCharArray())					//   'n'  => 'n'
		{
			stack.push(c);
		}
		while(!stack.isEmpty())
		{
			output=output.concat(String.valueOf(stack.pop()));   //""  "n" "ni" "nit" "niti"  "nitin"
		}
		System.out.println(output);
		if(input.equals(output))
		System.out.println("Palindrome");
		else
		System.out.println("Not Palindrome");
			
		//the quick brown fox jumps over the lazy dog

	}

}
