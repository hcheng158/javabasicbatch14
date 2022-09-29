package com.syntax.class014;

public class Task001 {

	public static void main(String[] args) {
		String[][] arr= {
				{"Yusuf", "Henry", "Adam","John"},
				{"A", "B", "C", "D"}
		};
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			} 
			System.out.println();
		}
		
		for (String[] singleArray:arr) { //loops over 1d or single array
			for(String el:singleArray) { //loops over each element of the id array
				System.out.print(el+" ");
			}
			System.out.println();
		}
		
		
		System.out.println(arr[0][0]+"="+arr[1][0]);
		System.out.println(arr[0][0]+"="+arr[1][2]);
		
		String[][] countries= {
				{"USA","Canada"}, //1st array with index 0
				{"Peru", "Brazil", "Columbia", "Ecuador"}, //2nd array
				{"Ethiopia", "Egypt", "Kenya"},
				{"Germany", "Turkey", "Moldova", "Ukraine"},
				{"Kaz", "Afghan", "Korea"}
				
		};
		System.out.println("getting all values from 2d array using regular++++++++");
			for (String[] country:countries) {
				for (String c:country) {
					System.out.print(c+" ");
				}
				System.out.println();
			}
		
		System.out.println(countries.length); //5 for total# of arrays or rows
		
		int elOf1arr=countries[0].length;
		System.out.println("# of elements from 1 array = "+elOf1arr);
		int elOf2arr=countries[1].length;
		System.out.println("# of elements from 2 array = "+elOf2arr);
		
		System.out.println("getting all avlue from 2d array --------");
		
		for(int r=0; r<countries.length; r++) {//loops over rows
			for(int c=0; c<countries[r].length; c++) {
				System.out.print(countries[r][c]+" ");
			}
			System.out.println();//prints out the rows with a return space
			}
		}
		
		
	}


