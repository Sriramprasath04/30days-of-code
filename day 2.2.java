public class Main
{
	public static void main(String[] args) {
		int n = 5;
		
		// Hallow Triangle Logic
		for(int i=0; i<n ;i++){
		    for(int j=0; j<=(n-1)*2 ;j++){
		        if((i==0)&&(j%2==0) || (i+j)==(n-1)*2 || j==i ){
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
		
		
		// X pattern
		for(int i=0; i<n ;i++){
		    for(int j=0; j<n ;j++){
		        if(i==j || (i+j)==(n-1)){
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}
	}
}
