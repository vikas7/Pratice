//..............Input and Output..................
import java.io.*;
import java.util.*;
class First1{
	public static void main(String args[]) throws IOException{
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner br=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=br.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the element of the array");
		for(int i=0;i<size;i++){
			arr[i]=br.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<size;i++){
			for(int j=1;j<size-i;j++){
				if(arr[j-1]>arr[j]){
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					flag=true;
				}

			}
			if(flag==false){
				break;
			}
		}
	for(int i=0;i<size;i++){

		System.out.print(arr[i]+" ");
	}
 System.out.println(arr.length);
	}

	
}