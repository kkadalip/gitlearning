package helloworld;

//import org.apache.commons.lang3.StringUtils;

public class tryingStuff {

	public static void main(String[] args) {
		
//		String serviceName = "ee.mnt.remoreclient.liiklusregister.TeenindajakaartServiceI";
		String serviceName = "ee.mnt.remoreclient.liiklusregister.TeenindajakaartServiceI.remore.remoreClient";
		serviceName = fixTypoRemore(serviceName);
		System.out.println("serviceName: " + serviceName);
		
//		int a = 1;
//		
//		switch(a) {
//			case 2:
//				System.out.println("1");
//			default:
//				System.out.println("2");
//			case 1:
//				System.out.println("3");	
//		}
//		
		//String tyybiKinnituseNr = "e11*2222/3333*444444*55";
//		String tyybiKinnituseNr = "";
//		
//		String tkNrPohiosa = takeFromString(tyybiKinnituseNr, 0, 20);
//		String tkNrLaiend = takeFromString(tyybiKinnituseNr, 21, 23);
//		
//		System.out.println("tkNrPohiosa: " + tkNrPohiosa);
//		System.out.println("tkNrLaiend: " + tkNrLaiend);
		
//		int a = 1;
//		int b = 2;
//		if((a==b) | (a!=b)){
//			System.out.println("swag");
//		}else{
//			System.out.println("swag2");
//		}
		
//		Boolean swag = null;
//		if(swag != null && swag){
//			System.out.println("swag");
//		}else{
//			System.out.println("else");
//		}
		
//		int $ = 10, $$ = $, $$$ = $$;
//		System.out.println($);
//		System.out.println($$);
//		System.out.println($$$);
//		
//
//		float blablabla = 0f;
//		System.out.println(blablabla);
//		
//		int $$$$ = 10;
//		int Ž = (int) ($$$$ / 0f);
//		System.out.println(Ž);
//		
//		String f = String.valueOf(Float.parseFloat(String.valueOf((Float.floatToRawIntBits((float)new Long(new Integer(1)))))));
//		System.out.println("f = " + f);
		proov1();
	}
	
	
//	private static String takeFromString(String s, int from, int to){
//		return s.substring(from, Math.min(s.length(), to));
//	}

	
	private static String fixTypoRemore(String serviceName){
		return serviceName.replaceAll("remore", "remote");
	}
	
	private static void proov1(){
		System.out.println("proov1");
	}
}
