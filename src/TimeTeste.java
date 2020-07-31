
public class TimeTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time time1 = new Time(00,10,20);
		System.out.println(time1.exibirHoraUniversal());
		System.out.println(time1.exibirHoraPadrao());
		
		Time time2 = new Time(12,10,20);
		System.out.println(time2.exibirHoraUniversal());
		System.out.println(time2.exibirHoraPadrao());
		
		Time time3 = new Time(15,10,20);
		System.out.println(time3.exibirHoraUniversal());
		System.out.println(time3.exibirHoraPadrao());
		
		Time time4 = new Time(5,10,20);
		System.out.println(time4.exibirHoraUniversal());
		System.out.println(time4.exibirHoraPadrao());
	}

}
