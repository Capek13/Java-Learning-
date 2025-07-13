
public class Tutorial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float desetineCislo = 23.45f;
		System.out.println(desetineCislo);
		
		int cisloPrvni = 15;
		int cisloDruhe = 10;
		
		
		System.out.println(cisloPrvni / cisloDruhe); /** Udělat počítání do nové proměnné 
		
		zbytek %  **/
		
		if (!(cisloPrvni == cisloDruhe || cisloPrvni == 20)) {
			System.out.println("Proměnné se rovnájí");
		} else {
			System.out.print("Proměnné se nerovnají");
		}
		/** >= , == , !=  ;  || , && , **   if (!(..)) -> ! negace **/
	}
}
