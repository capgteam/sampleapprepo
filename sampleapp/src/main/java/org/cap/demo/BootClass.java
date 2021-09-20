package org.cap.demo;

public class BootClass {

	public static void main(String[] args) {
		System.out.println("Hello! from STS!");
		show();
	}
	
	public static void show() {
<<<<<<< HEAD
		int[] arr= {1,2,3,4,4};
=======
		int[] arr= {12,34,56,56};
>>>>>>> 54befd1b2d2844234d4e00344fe3694b88cdd68f
		int sum=0;
		for(int n:arr) {
			sum+=n;
			System.out.println(n);
		}
		System.out.println("Show Method here!");
	}

}
