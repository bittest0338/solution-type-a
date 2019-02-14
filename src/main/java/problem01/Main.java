package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
	
		int num=number;
		int numIndex = 0;
	
		num = num%10;
		if(num ==3 || num == 6 || num== 9) {
			numIndex++;
		}
		num = num/10;
		if(num ==3 || num == 6 || num== 9) {
			numIndex++;
		}
		if(numIndex==1) {
			numIndex=numIndex;
		}else if(numIndex==2) {
			numIndex=numIndex+1;
		}
			
		
		
		return numIndex;
	}
}