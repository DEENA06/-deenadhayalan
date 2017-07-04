package guvi2;

public class Sumodd {

	public static void main(String[] args) {
		int sum=0;int sum1=0;
		for(int i=1;i<=15;++i){
			sum=sum+i;
		}for(int i=15;i<=45;++i){
			if(i%2!=0){
				sum1=sum1+i;
			}
		}System.out.println(+sum+" "+sum1);

	}

}
