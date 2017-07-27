package edu.berliner;

public class Fbcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean hit; //marker to check if something's been printed out
		
		for(int counter=1; counter<=100; counter++)//loop, checking 1-100
		{
			hit=false;  //set marker to false to start loop
			
			if(counter%3==0) //number is divisible by 3
			{
				System.out.print("Fizz");
				hit=true;
			}
			if(counter%5==0) //number is divisible by 5
			{
				System.out.print("Buzz");
				hit=true;
			}
			if(counter%2==0) //number is divisible by 2
			{
				System.out.print("Copy");
				hit=true;
			}
			if(counter%10==0) //number is divisible by 10
			{
				System.out.print("Cat");
				hit=true;
			}
			if(hit)
			{
				System.out.println(""); //print a new line if text has been printed
			}
			else
			{
				System.out.println(counter); //otherwise print the number we're on
			}
		}
	}

}
