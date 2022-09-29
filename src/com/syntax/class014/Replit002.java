package com.syntax.class014;

public class Replit002 {

	public static void main(String[] args) {
		/* 
Write a program that creates an array of integers that stores the following 
values: 45,78, 12,  67, 55, 89, 23, 77, 88

Print only values that stored with even index including 0.

**Output:**

```
Write a program that creates an array with the following values{s, a, y,  b, n, c, t,  d, a, e, x} 

Print the values so the output should look like below

```
**Output:**
```

```
syntax
```

```
```*/
		char [] let= {'s','a','y','b','n','c','t','d','a','e','x'};
		for (int i = 0; i < let.length; i++) {
			if (i%2==0) {
		
				System.out.print(let[i]);
		}

		}
		
	}

}
