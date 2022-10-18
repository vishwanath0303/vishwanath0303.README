import java.util.Scanner;

/**
 * 
 * @author nchinnabattini
 *
 */
public class Question1 {
	public static void main(String[] args) {

//		Taking the Integer Input from the User that specifies the Length of the Array
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		
//		Creating A static array With Size N 
		int[] Arr=new int[N];
		
//		Populating the Array
		for (int i=0;i<N;i++) {
			Arr[i]=input.nextInt();
		}
//		Swapping the Indexed first and last Elements
		int temp = Arr[0];
		Arr[0]=Arr[Arr.length-1];
		Arr[Arr.length-1]=temp;
		
		for (int i=0;i<N;i++) {
			System.out.print(Arr[i]+" ");
		}
		input.close();
	}
}