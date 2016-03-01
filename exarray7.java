class exarray7 {
	public static void main(String[] args) {
		int []num = new int[100];
		int i,x,j,k,temp,m;
		double r;
		//------------------------------------------------------
		for(i=0;i<=100-1;i++){
			r = Math.random() * 100;
			x = (int) r;
			num[i]=x;
			System.out.print(num[i] + " ");
				}
		//------------------------------------------------------
		for(j=0;j<=100-1;j++){
			for(k=j+1;k<100;k++){
				if(num[j] > num[k]){
					temp = num[j] ;
					num[j] = num[k];
					num[k] = temp;
					
				}
			}
		}

		System.out.print("\n\n\n");
		//------------------------------------------------------
		for(m=0;m<=100-1;m++){
			System.out.print(num[m] + " ");
		}
	
		//------------------------------------------------------
		System.out.print("\n\n\n");
	}
}
