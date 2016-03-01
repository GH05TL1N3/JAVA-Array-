class exarray6 {
	public static void main(String[] args) {
		int []num = new int [10];
		int i;
		for(i=0;i<=10-1;i++){
			double r = Math.random() * 100;
			int x = (int) r;
			num[i] = x;
			System.out.println("Index of num"+"["+i+"]"+" Result is : " + num[i]);
			}
System.out.println("\n");
	}
}
