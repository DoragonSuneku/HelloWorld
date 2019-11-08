
public class Lotto {

	public static void main(String[] args) {
		boolean[] lottozahlen = new boolean[49];

		/* + 1;
		
		if(lottozahlen[ziehung]){
		
		lottozahlen[ziehung]=true ;*/
		
		for (int i = 0; i < 7; i++) {
			int ziehung = (int) (Math.random() * 48);
			if (lottozahlen[ziehung]==true){
				i--;}
			else {
				lottozahlen[ziehung] = true;}
		}
		for (int i=0; i < lottozahlen.length; i++){
			if (lottozahlen[i] == true){
				System.out.print(i+1 + " ");
				
			}
			
			
			
		}
		}

	}


