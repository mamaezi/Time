
public class Time {
int hora;
int minuto;
int segundo;

public Time(int hora, int minuto, int segundo) {
	//super();
	this.hora = hora;
	this.minuto = minuto;
	this.segundo = segundo;
}
public int getHora() {
	return hora;
}
public void setHora(int hora) {
	this.hora = hora;
}
public int getMinuto() {
	return minuto;
}
public void setMinuto(int minuto) {
	this.minuto = minuto;
}
public int getSegundo() {
	return segundo;
}
public void setSegundo(int segundo) {
	this.segundo = segundo;
}

public String exibirHoraUniversal(){
	
	String retorno;
	
	if (hora<10) retorno = "0"+hora+":";
	else retorno=hora+":";
	
	if (minuto<10) retorno = retorno + "0"+minuto + ":";
	else retorno = retorno + minuto + ":";
	
	if (segundo<10) retorno = retorno + "0"+segundo;
	else retorno = retorno + segundo;


	return retorno;

}

public String exibirHoraPadrao() {
	
  String ret,retorno;
 if (hora>12)
 {
	 hora= hora - 12;
	 ret = " PM";
 }
 else 
 {
    if (hora==0)  
    {
    	hora=12;
    }    
    ret=" AM";   
 }
  
 
 if (hora<10) retorno = "0"+hora+":";
	else retorno=hora+":";
	
	if (minuto<10) retorno = retorno + "0"+minuto + ":";
	else retorno = retorno + minuto + ":";
	
	if (segundo<10) retorno = retorno + "0"+segundo;
	else retorno = retorno + segundo;

 return (retorno + ret) ;
}

}
