class Ninethynine {
	public static void main(String[] args) {
		int []num = new int[100];
		int size = num.length;
		int i,x,j,k,temp,m,count=0,rev;
		double r;
		//------------------------------------------------------
		for(i=0;i<=size-1;i++){
			r = Math.random() * 100;
			x = (int) r;
			if(x == 99){
				break;
			}else{
			num[i]=x;
			System.out.print(num[i] + " ");
			count+=1;
				}
			}
		//------------------------------------------------------
		for(j=0;j<=size-1;j++){
			for(k=j+1;k<size;k++){
				if(num[j] > num[k]){
					temp = num[j] ;
					num[j] = num[k];
					num[k] = temp;
					
				}
			}
		}

		System.out.print("\n\n\n");
		//------------------------------------------------------
		rev = (size-1)-count;
		for(m=rev+1;m<=size-1;m++){
			
			System.out.print(num[m] + " ");
			
		}
	
		//------------------------------------------------------
		System.out.print("\n\n\n");
	}
}
