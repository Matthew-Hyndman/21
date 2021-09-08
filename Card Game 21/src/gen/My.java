package gen;

import java.util.Random;
import java.util.Scanner;
import java.util.Date;
import java.time.*;
import java.io.*;
import java.util.*;

public class My {

		static Scanner key= new Scanner(System.in);
		Random rand = new Random();

		public static void p(String s){
		System.out.print(s);
		}
				
		public static int randI (int min, int max) {
			int i;
			Random rand = new Random();
			i = min + rand.nextInt(max);
			return i;
		}
		
		
		public static int getOpt(int min, int max){
			int opt=0;
			while(opt<min || opt>max){
				opt= key.nextInt();
				if(opt<min || opt >max )
				{	p("\n\t Must be between" + min + " - "+ max);
					p("\n\t\t\tPlease reenter");
				}
			}
			return opt;
		}
		
		public static char getYN(){
			String s;
			char ch;
			
			do{
			p("\n\t\t\tEnter Y/N   or y/n:  ");
			s= key.next();
			ch= s.toUpperCase().charAt(0);
			}while(ch!='Y' && ch!='N' );
			
			return ch;
		}
		
		public static void pressKey(){
			String s;
			p("\n\t\t\tPress any key to continue  :");
			s= key.next();
						
			}
		
}

