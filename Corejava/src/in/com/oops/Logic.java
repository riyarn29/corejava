package in.com.oops;

public class Logic {

public void sum() {
	
	System.out.println("sum method it is....");
}
public static char name() {
	return 'a';
}

public static void summ(int a,int b) {
	int c=a+b;
	System.out.println("sum is ="+c);
	}

//armstrong 
public void isArmstrong(int number) {
	
	int r=0;
	int sum=0;
	int n =number;
	while(n>0) {
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;		
	}
		if(sum==number) {
			System.out.println("ARMSTRONG");
		}
		else {
			System.out.println("not armstrong");
		}}

//palindrom
public void isPalindrom (int num) {
	
	int r=0;
	int sum=0;
	int n=num;
			while(n>0) {
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
if(sum==num) {
	System.out.println("palindrom="+sum);
	
}
else {
	System.out.println("NOT PALINDROM");
}
}

//bubbleshort

public void bubbleshort(int[] arr) {
	
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++)
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			
	
	}
	System.out.println(arr[i]);
}
}

//note count

public void noteCount(int amount) {
	
	int count=0;
	int[]notes= {500,200,100,50,20,10,5,2,1};
	for(int i=0;i<notes.length;i++) {
		count=amount/notes[i];
		amount=amount%notes[i];
		if(count>0) {
			System.out.println(notes[i]+"="+count);
		}
		
	}
}

//largest number

public void isLargestNumber(int[]arr) {
	int max=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	} 
	System.out.println("maximum="+max);
}
}




