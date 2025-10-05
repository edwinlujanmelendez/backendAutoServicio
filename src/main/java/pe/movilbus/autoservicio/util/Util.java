package pe.movilbus.autoservicio.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;

import pe.movilbus.autoservicio.beans.VentaPasajeSispas;

/**
 * Clase que centraliza las funciones utilitarias que se usa en todo el sistema.
 * @author José Sullo Avalos
 * @since JDK1.6
 */
public class Util {
	public static final int OPER_MAYOR = 1;
	public static final int OPER_MENOR = 2;
	public static final int OPER_IGUAL = 3;
	public static final int OPER_MAYOR_IGUAL = 4;
	public static final int OPER_MENOR_IGUAL = 5;
	public static String MD2 = "MD2";
	public static String MD5 = "MD5";
	public static String SHA1 = "SHA-1";
	public static String SHA256 = "SHA-256";
	public static String SHA384 = "SHA-384";
	public static String SHA512 = "SHA-512";
	
	public static final String separator = System.getProperty("file.separator");//Get de system separator
	public static String base = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ@!#$";
		
	public Util() throws Exception{
		super();
	}
	
	/**
	 * Convierte un objeto Date s String
	 * @param myDate	: Datos a convertir
	 * @return Objeto String
	 */
	public static String DatetoString(Date myDate, String formato){
		String date="";
		try{			
			DateFormat dateFormat=new SimpleDateFormat(formato);
			date=dateFormat.format(myDate);
		}catch(Exception e){
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * Convierte un String a Date de acuerdo a un formato
	 * @param text		: Fecha en formatotexto a convertir
	 * @param pattern	: Formato al cual se desea convertir
	 * @return Objeto Date
	 */
	public static Date StringtoDate(String text,String pattern){
		Date date=null;
		try{
			DateFormat dateFormat=new SimpleDateFormat(pattern);
			date=dateFormat.parse(text);
		}catch(Exception e){
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * Convierte un String a double con la cantidad de decimales especificada
	 * @param currency		: Valor String a convertir
	 * @param numDecimal	: Numero de decimales
	 * @return double
	 */
	public static double parseNumberFormat(String currency, int numDecimal){
		double number=0.0;
		String decimal = "";
		String pattern = "###,###,##0";
		if(numDecimal>0){
			for(int i=0;i<numDecimal;i++){
				decimal = decimal+"0";
			}
			pattern = pattern+"."+decimal;
		}
		try{
			NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
			DecimalFormat df = (DecimalFormat)nf;
			df.applyPattern(pattern);
			currency=(currency!=null&&!"".equals(currency.trim()))?currency.trim():"0.0"; 
			number=df.parse(currency).doubleValue();
		}catch(Exception e ){
			e.printStackTrace();
		}
		return number;
	}
	
	/**
	 * convierte un double a String con la cantidad de decimales especificados 
	 * @param currency		: Valor double a convertir
	 * @param numDecimales	: Número de decimales 
	 * @return String
	 */
	public static String toNumberFormat(double currency, int numDecimales){		
		currency = (Double.isNaN(currency)?0.00:currency); // para capturar las operaciones no existentes
		String number = "0.00";
		String decimal = "";
		String pattern = "###,###,##0";
		if(numDecimales>0){
			for(int i=0;i<numDecimales;i++){
				decimal = decimal+"0";
			}
			pattern = pattern+"."+decimal;
		}
			
		try{
			NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
			DecimalFormat df = (DecimalFormat)nf;
			df.applyPattern(pattern);
			number = df.format(currency);
		}catch(Exception e ){
			e.printStackTrace();
		}
		return number;
	}
	
	/**
	 * Convierte del sistema decimal a hexadecimal
	 * @param valor	: Número a convertir
	 * @return Hexadecimal 
	 */
	public static String decimalToHexadecimal(long valor){
		return Long.toHexString(valor).toUpperCase();
	}
	
	/**
	 * Genera el numero de control para el registro de venta.
	 * @param valor	: Numero hexadecimal con el cual se formara el numero de control.
	 * @return String
	 */
	public static String generateControlNumber(String valor){
		String nControl = "000000000000000";
		nControl = nControl.concat(valor);
		nControl = "T"+ nControl.substring(nControl.length()-15);
		return nControl;
	}
	
	/**
	 * Autocompleta en numero de boleto
	 * @param numeroBoleto	: numero a autocompletar
	 * @return	numero de boleto
	 */
	public static String autocompleNumberBoleto(String numeroBoleto){
		String boleto="0000000";
		int longdig=7;
		if(numeroBoleto.toUpperCase().indexOf("B")>=0 || numeroBoleto.toUpperCase().indexOf("F")>=0){
			boleto="00000000";
			longdig=8;
		}
		
		Integer sep=numeroBoleto.indexOf("-");
		if(sep>=0){
			String serie=numeroBoleto.substring(0,sep);
			String numero=numeroBoleto.substring(sep+1,numeroBoleto.length());
					
			if(numeroBoleto.length()>numero.length()){
				boleto = boleto.concat(numero);				
				boleto = serie+"-"+ boleto.substring(boleto.length()-longdig);
			}else{
				boleto=numeroBoleto;
			}
			
			return boleto;
		}else
			return numeroBoleto;
	}
	
	
	/**
	 * cantidad de horas y minutos en milisegundos.
	 * @param cantidadHoras : numero de horas
	 * @return  Long
	 */
	public static Long horasMinutos(Double cantidadHoras){
		Integer hora = cantidadHoras.intValue();
		
		String horas = toNumberFormat(cantidadHoras, 2);
		Integer conPos= horas.indexOf(".");
		Integer minuto = (new Integer (horas.toString().substring(conPos+1, horas.length())));

		Long lHoras= (long) (hora * Constantes.MILISEGUNDOS_X_HORA);
		Long lMinutos = (long) (minuto * Constantes.MILISEGUNDOS_X_MINUTO);			
		Long lHorasMinutos = lHoras + lMinutos;
		
		return lHorasMinutos;
	}
	
	/**
	 * Calcula la edad.
	 * @param fechaNacimiento : fecha de nacimineto
	 * @return : edad
	 * @throws Exception
	 */
	public static Integer calculaEdad(String fechaNacimiento) throws Exception{
		Integer edad=0;
		try {
			if (!(fechaNacimiento==null || fechaNacimiento=="") ){
				Long fechaActual = new Date().getTime(); //.getTime().getTime();
				Long lFechaNacimiento = Constantes.FORMAT_DATE.parse(fechaNacimiento).getTime();
				Long lEdad = fechaActual - lFechaNacimiento;
				edad = (int) (lEdad / (Constantes.MILISEGUNDOS_X_DIA * 365));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return edad;
	}
	
	/**
	 * Convierte un Objeto calendar a String
	 * @param myCalendar	: Dato a convertir
	 * @return Un string
	 */
	public static String CalendartoString(Calendar myCalendar, String pattern){
		String date="";
		try{
			DateFormat dateFormat=new SimpleDateFormat(pattern);
			date=dateFormat.format(myCalendar.getTime());
		}catch(Exception e){
			e.printStackTrace();
		}
		return date;
	}
	
	/**
	 * Convierte un objeto String a Calendario
	 * @param fecha	: Datos a convertir
	 * @return Objeto Calendar
	 */
	public static Calendar StringtoCalendar(String fecha, String pattern){
		Calendar calend=Calendar.getInstance();
		try{
			DateFormat dateFormat=new java.text.SimpleDateFormat(pattern);
			Date date=dateFormat.parse(fecha);
			calend.setTime(date);
			if(pattern.equals(Constantes.DATE_TIME_FORMAT)){
				calend.set(Calendar.HOUR_OF_DAY, Integer.valueOf(fecha.substring(11, 13)));
				calend.set(Calendar.MINUTE, Integer.valueOf(fecha.substring(14, 16)));
				calend.set(Calendar.SECOND, Integer.valueOf(fecha.substring(17)));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return calend;
	}
	
	/**
	 * Compara si un objeto es mayor.
	 * @param min		: Dato que deseamos comparar.
	 * @param sus		: Datos contra el cual se comparara.
	 * @param operador	: Tipo de operador para realizar la comparación.
	 * @return true o false
	 */
	public static boolean comparaFechas(Object min, Object sus, int operador) {
	    Calendar fech1 = Calendar.getInstance();
        Calendar fech2 = Calendar.getInstance();
        Calendar minuendo = Calendar.getInstance();
        Calendar sustraendo = Calendar.getInstance();
        
        if(min instanceof String)
        	minuendo = StringtoCalendar((String)min, Constantes.DATE_FORMAT);
        else if (min instanceof Date)
        	minuendo = StringtoCalendar(DatetoString((Date)min, Constantes.DATE_FORMAT), Constantes.DATE_FORMAT);
        else
        	minuendo = (Calendar)min;
        
        if(sus instanceof String)
        	sustraendo = StringtoCalendar((String)sus, Constantes.DATE_FORMAT);
        else if (sus instanceof Date)
        	sustraendo = StringtoCalendar(DatetoString((Date)sus, Constantes.DATE_FORMAT), Constantes.DATE_FORMAT);
        else
        	sustraendo = (Calendar)sus;
        
        sustraendo.set(Calendar.HOUR_OF_DAY,0);
        sustraendo.set(Calendar.MINUTE,0);
        sustraendo.set(Calendar.SECOND,0);
        
        minuendo.set(Calendar.HOUR_OF_DAY,0);
        minuendo.set(Calendar.MINUTE,0);
        minuendo.set(Calendar.SECOND,0);
        
        fech1.set(Calendar.YEAR, sustraendo.get(Calendar.YEAR));
        fech1.set(Calendar.MONTH, sustraendo.get(Calendar.MONTH));
        fech1.set(Calendar.DAY_OF_MONTH, sustraendo.get(Calendar.DAY_OF_MONTH));
        
        fech2.set(Calendar.YEAR, minuendo.get(Calendar.YEAR));
        fech2.set(Calendar.MONTH, minuendo.get(Calendar.MONTH));
        fech2.set(Calendar.DAY_OF_MONTH, minuendo.get(Calendar.DAY_OF_MONTH));
        
        Date startDate1 = fech1.getTime();
        Date endDate1   = fech2.getTime();
                
        long diff = endDate1.getTime() - startDate1.getTime();
        long dife = (diff / (1000L*60L*60L*24L));
        
        boolean result = false;
        
        switch (operador) {
		case OPER_MAYOR:	//Mayor
			if(dife>0)
				result = true;
			else
				result = false;
			break;
		case OPER_MENOR:	//Menor
			if(dife<0)
				result = true;
			else
				result = false;
			break;
		case OPER_IGUAL:	//Igual
			if(dife==0)
				result = true;
			else
				result = false;
			break;
		case OPER_MAYOR_IGUAL:	//Mayor igual
			if(dife>=0)
				result = true;
			else
				result = false;
			break;
		case OPER_MENOR_IGUAL:	//Menor igual
			if(dife<=0)
				result = true;
			else
				result = false;
			break;		
		}
        
        return result;
	}
	
	/**
	 * Compara si un objeto es mayor.
	 * @param min		: Dato que deseamos comparar.
	 * @param sus		: Datos contra el cual se comparara.
	 * @param operador	: Tipo de operador mara realiza rla comparación.
	 * @return true o false
	 */
	public static boolean comparaFechasWithTime(Object min, Object sus, int operador) {
//	    Calendar fech1 = Calendar.getInstance();
//        Calendar fech2 = Calendar.getInstance();
        Calendar minuendo = Calendar.getInstance();
        Calendar sustraendo = Calendar.getInstance();
        
        if(min instanceof String)
        	minuendo = StringtoCalendar((String)min, Constantes.DATE_TIME_FORMAT);
        else if (min instanceof Date)
        	minuendo = StringtoCalendar(DatetoString((Date)min, Constantes.DATE_TIME_FORMAT), Constantes.DATE_TIME_FORMAT);
        else
        	minuendo = (Calendar)min;
        
        if(sus instanceof String)
        	sustraendo = StringtoCalendar((String)sus, Constantes.DATE_TIME_FORMAT);
        else if (sus instanceof Date)
        	sustraendo = StringtoCalendar(DatetoString((Date)sus, Constantes.DATE_TIME_FORMAT), Constantes.DATE_TIME_FORMAT);
        else
        	sustraendo = (Calendar)sus;
        
        Date startDate1 = sustraendo.getTime();
        Date endDate1   = minuendo.getTime();
                
        long diff = endDate1.getTime() - startDate1.getTime();
        long dife = (diff / (1000L*60L));
        
        boolean result = false;
        
        switch (operador) {
		case OPER_MAYOR:	//Mayor
			if(dife>0)
				result = true;
			else
				result = false;
			break;
		case OPER_MENOR:	//Menor
			if(dife<0)
				result = true;
			else
				result = false;
			break;
		case OPER_IGUAL:	//Igual
			if(dife==0)
				result = true;
			else
				result = false;
			break;
		case OPER_MAYOR_IGUAL:	//Mayor igual
			if(dife>=0)
				result = true;
			else
				result = false;
			break;
		case OPER_MENOR_IGUAL:	//Menor igual
			if(dife<=0)
				result = true;
			else
				result = false;
			break;		
		}
        
        return result;
	}
		
	/**
	 * calcula el porcentaje de un numero
	 * @param numeroCalculo : número del cual se calcula el porcentaje
	 * @param valorCalculo  : número al que se le aplica el porcentaje
	 * @return porcentaje
	 */
	public static double calculaPorcentaje(Double numeroCalculo, double numeroAplicaPorcentaje){
		Double porcenteje=.00;
//		String resultado=toNumberFormat((numeroCalculo*100)/numeroAplicaPorcentaje,2);
		porcenteje=Double.valueOf(toNumberFormat((numeroCalculo*100)/numeroAplicaPorcentaje,2));

		return porcenteje;
	}
	
	public static String adjuntarFechaHoraExportacion(String nombreArchivoExportar){
		GregorianCalendar oGregorianCalendar = new GregorianCalendar();
		SimpleDateFormat oSimpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", new Locale("es", "PE"));

		nombreArchivoExportar += oSimpleDateFormat.format(oGregorianCalendar.getTime());

		return nombreArchivoExportar;
	}
	
	/**
	 * Realiza la validadcion del RUC
	 * @param valor	: RUC a validar
	 * @return <b>true</b> si el RUC es valido, <b>false</b> caso contrario.
	 */
	public static boolean validarRUC(String valor){
		int suma = 0;
		int digito = 0;
		int resto = 0;
		if (valor.length()== Constantes.LENGHT_DNI){
			suma = 0;
			for (int i =0; i< valor.length()-1;i++){
				digito = valor.charAt(i)-'0';
				if(i==0){
					suma+= digito*2;
				}else{
					suma+=digito*(valor.length()-i);
				}
			}
			resto = suma %11;
			System.out.println("resto"+resto);
			if(resto ==1){
				resto = 11;
			}
			if(resto + (valor.charAt(valor.length()-1)-'0')==11){
				return true;
			}

		}else if (valor.length()== Constantes.LENGHT_RUC){
			suma = 0;
			int x = 6;
			for(int i =0; i<valor.length()-1; i++){
				if(i==4){
					x=8;
				}
				digito = valor.charAt(i) - '0';
				x--;
				if(i==0){
					suma += digito*x;
				}else{
					suma += digito*x;
				}
			}
			resto = suma % 11;
			resto = 11 - resto;
			if(resto >=10){
				resto = resto -10;
			}
			if(resto == valor.charAt(valor.length()-1)-'0'){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Metodo que permite validar una cadena si es numerico.  
	 * @param cadena: Cadena a evaluar
	 * @return (true) si es un numerico, (false) lo contrario250
	 */
    public static boolean isNumeric(String cadena){
	    try {
	    	Integer.parseInt(cadena);
	    	return true;
	    } catch (NumberFormatException nfe){
	    	return false;
	    }
    }
    
    /**
	 * Metodo que permite validar una cadena si es un numero decimal  
	 * @param cadena: Cadena a evaluar
	 * @return (true) si es un numerico, (false) lo contrario250
	 */
    public static boolean isDecimal(String cadena){
	    try {
	    	Double.parseDouble(cadena);
	    	return true;
	    } catch (NumberFormatException nfe){
	    	return false;
	    }
    }
    
    /**
     * Permite generar la cadena que se enviara como valor al FTI.
     * @param pasajero	: Array con los datos del pasajero.
     * @return String
     */
    public static String obtenerFullTextPasajero(String[] pasajero){
		String result = "";
		for(String valor : pasajero){
			result = (result.equals("")?"":(result+" & ")) + valor+"%";
		}
		return result;
	}
    
    /**
     * Devuelve el dia de la semana de una fecha especifica
     * @param fecha
     * @return
     */
    public static String getDiaSemana(String fecha) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dia = "";
        Date fechaActual = null;
        try {
            fechaActual = df.parse(fecha);
        }catch (ParseException e) {
            System.err.println("No se ha podido parsear la fecha.");
            e.printStackTrace();
        }
        GregorianCalendar fechaCalendario = new GregorianCalendar();
        fechaCalendario.setTime(fechaActual);
        int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);
        switch (diaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Lunes";
                break;
            case 3:
                dia = "Martes";
                break;
            case 4:
                dia = "Miercoles";
                break;
            case 5:
                dia = "Jueves";
                break;
            case 6:
                dia = "Viernes";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                System.out.println("Ese dia no existe");
                break;
        }
        return dia;
    } 
    
    /**
     * Retorna el Nombre del Mes
     * @param fecha 
     * @return 
     * @throws Exception 
     */
    @SuppressWarnings("deprecation")
	public static String getNombreMes(String fecha) throws Exception{
    	Date date=Constantes.FORMAT_DATE.parse(fecha);
		switch (date.getMonth()) {
			case 0: return "ENERO"; 
			case 1: return "FEBRERO";
			case 2: return "MARZO";
			case 3: return "ABRIL";
			case 4: return "MAYO";
			case 5: return "JUNIO";
			case 6: return "JULIO";
			case 7: return "AGOSTO";
			case 8: return "SEPTIEMBRE";
			case 9: return "OCTUBRE";
			case 10: return "NOVIEMBRE";
			case 11: return "DICIEMBRE";
		}
		return null;
	}
    
    /**
     * Realiza el calculo del total a pagar de la venta.
     * @param tarifa	: Tarifa del servicio.
     * @param descuento	: Monto descuento
     * @param recargo	: Monto recargo
     * @return total a pagar.
     */
    public static double calculoTotalPagar(Double tarifa, Double descuento, Double recargo){
    	double totalPagar=tarifa-descuento;
    	double d_decimal= ((totalPagar*100)%100)/100; //Obtiene los decimales del total a pagar 
    	    	
    	totalPagar = totalPagar-d_decimal;
    	
    	if(d_decimal >= 0.00 && d_decimal < 0.25)
    		totalPagar = totalPagar + 0.00;
    	else if(d_decimal >= 0.25 && d_decimal <= 0.50)
    		totalPagar = totalPagar + 0.50;
    	else if(d_decimal >0.50 && d_decimal < 0.75)
    		totalPagar = totalPagar + 0.50;
    	else if(d_decimal >=0.75 && d_decimal <= 1)
    		totalPagar = totalPagar + 1;
    	return totalPagar;
    }
    	
	/**
	 * Genera un numero aleatorio entre 0 y nuemro, donde superior es el intervalo mayor.
	 * @param superior	: Numero limite del intervalo de aleatorios.
	 * @return
	 */
	public static final Integer getGenerarAleatorio(Integer superior){
		int result = 0;
		Random random = new Random();
		result = random.nextInt(superior);
		return result;
	}
	
	/**
	 * Metodo que genera la contraseña de manera aleatoria.
	 */
	public static final String generarPassword(){
		int lengthPassword = 8;
		String password = "";
		int longitud = base.length();
		for(int i=0; i<lengthPassword; i++){
			int numero = (int)(Math.random()*longitud);
			String caracter = base.substring(numero, numero+1);
			password = password+caracter;
		}
		return password;
	}
		
	/**
	 * Convierta la fecha al formato dd-mm-yyyy Ejempl(Mie 10 Oct 2013)
	 * @param fecha :Fecha 
	 * @return 
	 * @throws Exception
	 */
	public static String toFechaNombreDiaMes(Date fecha) throws Exception{
		
		String dia=Util.getDiaSemana(Constantes.FORMAT_DATE.format(fecha));
		String mes=Util.getNombreMes(Constantes.FORMAT_DATE.format(fecha));
		
		String sFecha=dia.substring(0,3)+"-"+
				Constantes.FORMAT_DAY.format(fecha)+"-"+
				mes.substring(0,3)+"-"+
				Constantes.FORMAT_YEAR.format(fecha);
		
		return sFecha;
	}
	
	/**
	 * Convierta la fecha al formato dd-mm-yyyy Ejempl(Miercoles 10 de Octubre del 2013)
	 * @param fecha :Fecha 
	 * @return 
	 * @throws Exception
	 */
	public static String toFechaNombreDiaMesLong(Date fecha) throws Exception{
		
		String dia=Util.getDiaSemana(Constantes.FORMAT_DATE.format(fecha));
		String mes=Util.getNombreMes(Constantes.FORMAT_DATE.format(fecha));
		
		String sFecha=dia+" "+
				Constantes.FORMAT_DAY.format(fecha)+" de "+
				mes.substring(0,1)+mes.substring(1,mes.length()).toLowerCase()+" del "+
				Constantes.FORMAT_YEAR.format(fecha);
		
		return sFecha;
	}
		
	/**
     * Convierte un arreglo de bytes a String usando valores hexadecimales
     * @param digest arreglo de bytes a convertir
     * @return String creado a partir de <code>digest</code>
     */
    private static String toHexadecimal(byte[] digest){
        String hash = "";
        for(byte aux : digest) {
            int b = aux & 0xff;
            if (Integer.toHexString(b).length() == 1) hash += "0";
            hash += Integer.toHexString(b);
        }
        return hash;
    }
    
    /**
	 * Genera ceros a la izquierda
	 * @param longitud	: Longitud que debe de tener el campo
	 * @param valor		: Valor al que se le debe aplicar.
	 * @return
	 */
	public static String generarCeros(Integer longitud, String valor){
		String ceros="";
		
		if(longitud<valor.length())
			valor=valor.substring(0,longitud);
		for(int i=0; i<longitud-valor.length();i++){
			ceros+="0";
		}
		String svalor=ceros+""+valor;
		return svalor;
	}
    
	/**
	 * Genera Spacios a la izquierda
	 * @param longitud	: Longitud que debe de tener el campo
	 * @param valor		: Valor al que se le debe aplicar.
	 * @param alignLeft : TRUE alinea el texto a la izquierda, FALSE  a la derecha
	 * @return
	 */
	public static String generarSpacios(Integer longitud, String valor, boolean alignLeft){
		String spaces="";
		if(longitud<valor.length())
			valor=valor.substring(0,longitud);
		for(int i=0; i<longitud-valor.length();i++){
			spaces+=" ";
		}
		String svalor="";
		if(alignLeft)
			svalor=valor+""+spaces;
		else
			svalor=spaces+""+valor;
				
		return svalor;
	}
	
	/***
	 * Quita separador de un numeros decimal
	 * @param valor
	 * @return
	 */
	public static String quitarSeparador(String valor){
		//Quita la coma (,) de miles (si es que lo tubiese)
		Integer x=valor.indexOf(",");
		if(x>=0){
			String montoEntero=valor.substring(0,x);
			String montodeciamal=valor.substring(x+1,valor.length());
			valor=montoEntero+""+montodeciamal;
		}
		
		//Quita el punto (.) de decimales
		Integer i=valor.indexOf(".");
		String montoEntero=valor.substring(0,i);
		String montodeciamal=valor.substring(i+1,valor.length());
		valor=montoEntero+""+montodeciamal;
	
		return valor;
	}
	/**
	 * Valida los caracteres no validos
	 * @return caraceres invalidos encontrados.
	 */
	public static String validarCaracteresEspeciales(String cadena){
		//Estos caracteres especiales fueron enviados por la positiva, ya que no son aceptados por el sistema Affinity.
		String caracteresSpeciales=";´;/;µ;ƒ;Š;š;†;‡;±;ˆ;‰;˜;¶;Þ;Ø;Ÿ;°;*;!;%;&;=;?;¡;¿;|;+;{;};[;];_;<;>;^;@;¢;£;¥;¦;§;¨;©;ª;«;¬;­;®;¯;Ì;Ë;Ê;È;Ç;Æ;Å;Ä;Ã;Â;À;¾;½;¼;»;º;Î;Ï;Ð;€;™;„;¤;Ž;‹;œ;Œ;—;“;ä;·;ª;…;‘;”;–;;\\;";
		String caracteresInvalidos="";
		String arrayCaracteres[] =caracteresSpeciales.split(";");	 
		
			for(int i=0;i<cadena.length();i++){
				char cd=cadena.charAt(i);
				
				for(int x=0; x<arrayCaracteres.length-1;x++){
//					char cr=arrayCarateres.charAt(x);
					String cr=arrayCaracteres[x].toString();
					
					if(cr.equals(String.valueOf(cd))){
						if(caracteresInvalidos.length()==0){
							caracteresInvalidos=String.valueOf(cd);
							break;
						}else{
							caracteresInvalidos+=","+String.valueOf(cd);
							break;
						}
					}
				}
								
//			}
		}
		return caracteresInvalidos;
	}
	
	/**
	 * Realiza el redondeo a miles ejemplo si es 125,800 dede ser 126,000 si es 125,400 debe ser 126,000  o 51,300 ebe ser 52,000 siempre redinde hacia riba 
	 * @param importeSeoles	: Tarifa a redondear
	 * @param numeroRound	: Numero dijitos los que debe realiza el redondeo
	 * @return
	 */
	private static double roundToPesosColombianos(double importeSeoles) {
	    if(importeSeoles == 0) {
	        return 0;
	    }

	    final double d = Math.ceil(Math.log10(importeSeoles < 0 ? -importeSeoles: importeSeoles));
	    
	    int numeroRound=(int)d;
	    if(importeSeoles>=10000.00){
	    	numeroRound= (int) d/2; //Viene a ser el numero de dijitos que representa los miles a los cuales se debe redondear
	    }else{
	    	numeroRound=(int)d-3;
	    }
	    
	    final int potencia = numeroRound - (int) d;

	    final double magnitud = Math.pow(10, potencia);
	    final long shifted = Math.round(importeSeoles*magnitud);    
	    
	    return shifted/magnitud;
	    	
	}
	
	public static String restarhoraSalida(String horasembarq,int horamenos){
		
		String[] lsStg = horasembarq.split(":");
		String hr  = lsStg[0];
		String mts = lsStg[1];			
		int hrmenos = Integer.parseInt(hr);			
		String complentar = "00"+(hrmenos>0?hrmenos-horamenos:12);			
		String choracompleto = complentar.substring(complentar.length()-2)+":"+mts;
		
		return choracompleto;
	}
	
	public static void Zippear(String pFile, String pZipFile, String nameFile) throws Exception {
		nameFile=nameFile+".xml";
		final int BUFFER_SIZE = 1024;
		// buffer
		byte[] buffer = new byte[BUFFER_SIZE];
		try {
			FileOutputStream fos = new FileOutputStream(pZipFile);//("C:\\MyFile.zip");
    		ZipOutputStream zos = new ZipOutputStream(fos);
    		ZipEntry ze= new ZipEntry(nameFile);
    		zos.putNextEntry(ze);
    		FileInputStream in = new FileInputStream(pFile);
    		int len;
    		while ((len = in.read(buffer)) > 0) {
    			zos.write(buffer, 0, len);
    		}
    		in.close();
    		zos.closeEntry();
    		//remember close it
    		zos.close();
		} catch (Exception e) {
			throw e;
		}
	}
	
	// redondear decimales
	public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
		return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
	}
	
	// obtener la firma de qr
	public static String ObtenerFirma_QR(VentaPasajeSispas oventapaj){
		
		StringBuilder strFirma =  new StringBuilder();
		
		String id_Itinerario = null;
		String id_Ruta = null;
		String id_Pasajero = null;
		String n_Asiento = null;
		String c_numeroboleto = null;
		
		// setear los campos		
		id_Itinerario = oventapaj.getItinerario().getId().toString();
		id_Ruta = oventapaj.getRuta().getId().toString();
		id_Pasajero = oventapaj.getPasajero().getId().toString();
		n_Asiento = oventapaj.getNumeroAsiento().toString();
		c_numeroboleto = oventapaj.getNumeroBoleto().trim();
		
		// juntar los campos
		
		strFirma.append(id_Itinerario);
		strFirma.append("|");
		strFirma.append(id_Ruta);
		strFirma.append("|");
		strFirma.append(id_Pasajero);
		strFirma.append("|");
		strFirma.append(n_Asiento);
		strFirma.append("|");
		strFirma.append(c_numeroboleto);
		strFirma.append("|");
		
		return strFirma.toString();
	}
	
	//Obtiene la ruta de la aplicación Web actual
	//public String getPath(){
	//	return servletContext.getRealPath("formatTicket");
	//}
	
}