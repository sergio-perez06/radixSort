package meli.ejerc;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n)
	{
		String newString = String.valueOf(c);
		newString.repeat(n);
		System.out.println(newString);

		return newString;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String.format("%1$" + n + "s", s).replace(' ', c);
		return String.format("%" + n + "s", s).replace(' ',c);


	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String [] numbers = new String[arr.length];
		for(int i=0;i<arr.length;i++){
			numbers[i] = String.valueOf(arr[i]);
		}

		for(String s: numbers){
			System.out.println(s);
		}

		return numbers;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int [] numbers = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			numbers[i] = Integer.parseInt(arr[i]);
		}

		for(int n: numbers){
			System.out.println(n);
		}

		return numbers;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maxLength = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i].length() > maxLength)
				maxLength = arr[i].length();
		}

		return maxLength;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int maxLength = maxLength(arr);

		//System.out.println("Found max length = "+maxLength);

		for (int i=0;i<arr.length;i++){
			if(arr[i].length() < maxLength){
				//System.out.println("Length of string is = "+arr[i].length());
				int difference = maxLength-arr[i].length();
				 /*System.out.println("Diference of size  = "+difference);
				 System.out.println("Previous   = "+arr[i]);*/
				arr[i] = lpad(arr[i],maxLength,c);
				// System.out.println("After pad    = "+arr[i]);
			}
		}
	}
}
