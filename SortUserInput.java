import java.util.Scanner;
public class Test1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x,j,k,temp,m,count=0,rev;
		int i = 0;
		int[] number_sort = new int[50];
		int size = number_sort.length;
		//----------------------------------------------
		while(true){
		System.out.print("> ");
		x = sc.nextInt();
		if(x == 0){
			break;
		}else{
		number_sort[i] = x;
		count+=1;
		i++;
		}
		}
		//-------------------------------
		for(j=0;j<=size-1;j++){
			for(k=j+1;k<size;k++){
				if(number_sort[j] > number_sort[k]){
					temp = number_sort[j] ;
					number_sort[j] = number_sort[k];
					number_sort[k] = temp;
					
				}
			}
		}

		System.out.print("\n\n\n");
		
	
		//------------------------------------------------------
		rev = (size-1)-count;
		for(m=rev+1;m<=size-1;m++){
			
			System.out.print(number_sort[m] + " ");
	
		//------------------------------------------------------
		
		
		}
		System.out.print("\n\n\n");
		}
	

}
