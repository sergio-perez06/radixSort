package meli.ejerc;

import java.util.ArrayList;
import java.util.List;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{
		// 1. Convertir arr de int a string
		String [] stringArr = StringUtil.toStringArray(arr);
		/*for(String s: stringArr)
			System.out.println(s);*/

		// 2. Strings con misma longitud (completar con 0)
		StringUtil.lNormalize(stringArr,'0');

		/*System.out.println("normalized string");
		for(String s: stringArr)
			System.out.println(s);*/

		int maxLength = StringUtil.maxLength(stringArr);

		while(maxLength>0){
			stringArr = listsSort(stringArr,maxLength-1);
			maxLength --;
		}


		arr = StringUtil.toIntArray(stringArr);

		System.out.println("\n" +"FINAL list : ");
		for(int i: arr){
			System.out.println(i);
		}

		System.out.println("\n");
	}

	public static String[] listsSort(String[] numbers, int charPos){

		String[] newNumberArray = new String[numbers.length];
		List<String> newNumberList = new ArrayList<String>();

		// create list of list to hold the 10 lists of elements based on the ending
		List<List<String>> bigList = new ArrayList<List<String>>();
		for(int i=0;i<10;i++){
			bigList.add(new ArrayList<String>());
		}
		//System.out.println("Size of bigList = "+ bigList.size());


		//classify elements on each list based on ending
		for(int i=0;i<numbers.length;i++){
			if(numbers[i].charAt(charPos) == '0'){
				bigList.get(0).add(numbers[i]);
			}else if (numbers[i].charAt(charPos) == '1'){
				bigList.get(1).add(numbers[i]);
			}else if (numbers[i].charAt(charPos) == '2'){
				bigList.get(2).add(numbers[i]);
			}else if (numbers[i].charAt(charPos) == '3'){
				bigList.get(3).add(numbers[i]);
			}else if (numbers[i].charAt(charPos) == '4'){
				bigList.get(4).add(numbers[i]);
			}else if (numbers[i].charAt(charPos) == '5'){
				bigList.get(5).add(numbers[i]);
			}else if (numbers[i].charAt(charPos) == '6'){
				bigList.get(6).add(numbers[i]);
			}else if (numbers[i].charAt(charPos) == '7'){
				bigList.get(7).add(numbers[i]);
			}else if (numbers[i].charAt(charPos) == '8'){
				bigList.get(8).add(numbers[i]);
			}else if (numbers[i].charAt(charPos) == '9'){
				bigList.get(9).add(numbers[i]);
			}
		}

		//iterate over each least of the list of list and get each element into a common list
		// (newNumberList,newNumberArray)
		int index =0;
		for(List<String> list: bigList){
			for(String s: list){
				newNumberList.add(s);
				newNumberArray[index] = s;
				index++;
			}
		}

		/*System.out.println("partial list : ");
		for(String s: newNumberList){
			System.out.println(s);
		}

		System.out.println("partial array : ");
		for(String s: newNumberArray){
			System.out.println(s);
		}*/


		/*for(int i=0;i<bigList.size();i++){
			for(int j=0;j<bigList.get(i).size();j++){
				newNumberList.add(bigList.get(i).get(j));
			}
		}*/



		return newNumberArray;
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
