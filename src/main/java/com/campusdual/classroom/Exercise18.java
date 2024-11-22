package com.campusdual.classroom;

import com.campusdual.util.Utils;

import java.util.Arrays;

public class Exercise18 {

	public static int[] createAndInitializeArray(int length){
		int[] intArray = new int[length];
		for (int i = 1; i <= length; i++) {
			intArray[i - 1] = i;
		}
		return intArray;
	}

	public static void showInlineArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.print(arr[i]);
			}
		}
	}

	public static void main(String[] args) {

		int numInput = Utils.integer("Introduce un número entero: ");
		int[] array = createAndInitializeArray(numInput);
		showInlineArray(array);

	}
}
