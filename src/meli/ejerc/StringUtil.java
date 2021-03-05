package meli.ejerc;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n)
	{
		String newString = String.valueOf(c);
		newString.repeat(n);
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

		for (int i=0;i<arr.length;i++){
			if(arr[i].length() < maxLength){
				arr[i] = lpad(arr[i],maxLength,c);
			}
		}
	}
}
