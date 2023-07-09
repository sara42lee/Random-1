public class Main {
	public static void main (String[] args) {

		int a,b;
		System.out.print("Please enter two numbers:\n") ;
		Scanner input = new Scanner(System.in)
		a = input.nextInt() ;
		b = input.nextInt() ;
		
		if ( a == b )
			System.out.print("they are equals.") ;

		else if ( a < b )
			System.out.print(a +" is smaller than "+b) ;

		else
			System.out.print(a +" is larger than "+ b) ;
		}
						}

******************************************************

public class Main {
	public static void main (String[] args) {


		for ( int i = 1 ; i <= 10 ; i ++ ) {

			for ( int j = 1 ; j <= i ; j ++ ) {

				System.out.print(j) ;




							  }// end for 2

			System.out.println() ;

						 }//end for 1





		}
						}

*******************************************************


public class Main {
	public static void main (String[] args) {

		int a, b, c, d, e;
		System.out.println("Please enter 5 numbers:") ;
		Scanner input = new Scanner(System.in) ;
		a = input.nextInt() ;
		b = input.nextInt() ;
		c = input.nextInt() ;
		d = input.nextInt() ;
		e = input.nextInt() ;

		if ( a>b && a>c && a>d && a>e ) {

			System.out.println(a+"is the largest.") ;
						}

		else if ( b>a && b>c && b>d && b>e ) {

			System.out.println(b+"is the largest.") ;
						}

		else if ( c>a && c>b && c>d && c>e ) {

			System.out.println(c+"is the largest.") ;
						}

		else if ( d>a && d>b && d>c && d>e ) {

			System.out.println(d+"is the largest.") ;
						}

		else if ( e>b && e>c && e>d && e>a ) {

			System.out.println(e+"is the largest.") ;
						}

		else {

			System.out.println("all are equal.") ;
		     }


		}
						}
********************************************************************


public class Main {
	public static void main (String[] args) {

		int[] array = new int[5] ;
		System.out.println("Please enter 5 numbers:") ;
		Scanner input = new Scanner(System.in) ;

		for ( int i = 0 ; i <5 ; i++) {

			array[i] = input.nextInt() ;

					      }
		int tmp ;

		for ( int i = 0 ; i < 5  ; i++ ) {

			for ( int j = 0 ; j <= i ; j++ ) {

			if ( array[i] > array[j] ) {

				temp = array[i] ;
				array [i] = array [j] ;
				array [j] = tmp ;

						      }

						   }
  
						 }
		System.out.println(Arrays.toString(array)) ;

		}
						}













