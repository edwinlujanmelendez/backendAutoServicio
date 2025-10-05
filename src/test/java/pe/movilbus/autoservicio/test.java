package pe.movilbus.autoservicio;

public class test {
/*
	public static void main(String[] args) {
		String numeroPedido = "3582026661";
		System.out.println(numeroPedido);
		numeroPedido= numeroPedido.substring(4, numeroPedido.length()); 
		System.out.println("-----");
		System.out.println(numeroPedido);
	}*/
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hola");
		double monto = 3;
		double monto1 = 33;
		double monto2 = 344;
		double monto3 = 3567;
		
		double monto4 = 3.56;
		double monto5 = 33.4;
		double monto6 = 344.34;
		double monto7 = 3567.5;
		System.out.println("monto :"+String.valueOf(monto).substring(0, String.valueOf(monto).indexOf("."))+(String.valueOf(monto).substring(String.valueOf(monto).indexOf(".")+1)+"0").substring(0,2) );
		System.out.println("monto1 :"+String.valueOf(monto1).substring(0, String.valueOf(monto1).indexOf("."))+(String.valueOf(monto1).substring(String.valueOf(monto1).indexOf(".")+1)+"0").substring(0,2) );
		System.out.println("monto2 :"+String.valueOf(monto2).substring(0, String.valueOf(monto2).indexOf("."))+(String.valueOf(monto2).substring(String.valueOf(monto2).indexOf(".")+1)+"0").substring(0,2) );
		System.out.println("monto3 :"+String.valueOf(monto3).substring(0, String.valueOf(monto3).indexOf("."))+(String.valueOf(monto3).substring(String.valueOf(monto3).indexOf(".")+1)+"0").substring(0,2) );
		System.out.println("monto3 :"+String.valueOf(monto4).substring(0, String.valueOf(monto4).indexOf("."))+(String.valueOf(monto4).substring(String.valueOf(monto4).indexOf(".")+1)+"0").substring(0,2) );
		System.out.println("monto3 :"+String.valueOf(monto5).substring(0, String.valueOf(monto5).indexOf("."))+(String.valueOf(monto5).substring(String.valueOf(monto5).indexOf(".")+1)+"0").substring(0,2) );
		System.out.println("monto3 :"+String.valueOf(monto6).substring(0, String.valueOf(monto6).indexOf("."))+(String.valueOf(monto6).substring(String.valueOf(monto6).indexOf(".")+1)+"0").substring(0,2) );
		System.out.println("monto3 :"+String.valueOf(monto7).substring(0, String.valueOf(monto7).indexOf("."))+(String.valueOf(monto7).substring(String.valueOf(monto7).indexOf(".")+1)+"0").substring(0,2) );
		
		String valor = "538825019";
		if(valor.length() > 8 )
			System.out.println("res :"+valor.substring(3, valor.length()));
		//System.out.println("res :"+valor.substring(3, valor.length()));
		List<Pasajero> pasajero = new ArrayList<Pasajero>();
				System.out.println("total :"+pasajero.size());
	}*/
	/*
	public static void main(String[] args) {
		
		System.out.println("hola");
		double monto =112.0;
		System.out.println("M:"+monto);
		monto += 18.4;
		System.out.println("M:"+monto);
		monto += 18.4;
		System.out.println("M1:"+monto);
		monto += 22.4;
		System.out.println("M:"+monto);
		monto += 56.0;
		System.out.println("M:"+monto);
		monto = Math.round(monto * Math.pow(10, 2)) / Math.pow(10, 2);
		System.out.println("M22:"+monto);
			
	}*/
	/*
	public static void main(String[] args) {
	   String url= "https://pasajesdebus.movilbus.pe/confirmacion-pago?estadoWS=true&mensajeWS1=OPERACIÓN%20AUTORIZADA&mensajeWS2=SU%20COMPRA%20SE%20REALIZÓ%20SATISFACTORIAMENTE&authorizationResult=00&brand=VISA&paymentReferenceCode=421355******0464&reserved22=DEBIT&reserved23=INTERBANK &NumeroCIP=&rutaIda=LIMA-PEDRO%20RUIZ&fpartidaIda=05/05/2022&hrsalidaIda=16:20&fllegadaIda=06/05/2022&hrllegadaIda=14:20&servicioIda=Ejecutivo%20vip&montoTotalIda=187.0&dirreccionPartidaIda=AV.%20JAVIER%20PRADO%20ESTE%201093%20(FRENTE%20A%20CLÍNICA%20RICARDO%20PALMA),%20LIMA&dirreccionLlegadaIda=AV.CAHUIDE%20653%20-%20CARRETERA%20MARGINAL%20FERNANDO%20BELAUNDE&nroAsientosIda=9&flagRetorno=true&rutaRetorno=PEDRO%20RUIZ-LIMA&fpartidaRetorno=09/05/2022&hrsalidaRetorno=15:00&fllegadaRetorno=10/05/2022&hrllegadaRetorno=13:00&servicioRetorno=Ejecutivo%20vip&montoTotalRetorno=187.0&dirreccionPartidaRetorno=AV.CAHUIDE%20653%20-%20CARRETERA%20MARGINAL%20FERNANDO%20BELAUNDE&dirreccionLlegadaRetorno=AV.%20JAVIER%20PRADO%20ESTE%201093%20(FRENTE%20A%20CLÍNICA%20RICARDO%20PALMA),%20LIMA&nroAsientosRetorno=3&totalPasajero=1&correoEnvio=marcialvisalot@hotmail.com&importeTotal=374.0";
	   String url1= "https://pasajesdebus.movilbus.pe/confirmacion-pago?estadoWS=true&mensajeWS1=OPERACIÓN%20AUTORIZADA&mensajeWS2=SU%20COMPRA%20SE%20REALIZÓ%20SATISFACTORIAMENTE&authorizationResult=00&brand=VISA&paymentReferenceCode=421355******0464";
	   String url2= "https://pasajesdebus.movilbus.pe/confirmacion-pago?reserved22=DEBIT&reserved23=INTERBANK &NumeroCIP=&rutaIda=LIMA-PEDRO%20RUIZ&fpartidaIda=05/05/2022&hrsalidaIda=16:20&fllegadaIda=06/05/2022&hrllegadaIda=14:20&servicioIda=Ejecutivo%20vip&montoTotalIda=187.0";
	   String url3= "https://pasajesdebus.movilbus.pe/confirmacion-pago?dirreccionPartidaIda=AV.%20JAVIER%20PRADO%20ESTE%201093%20(FRENTE%20A%20CLÍNICA%20RICARDO%20PALMA),%20LIMA&dirreccionLlegadaIda=AV.CAHUIDE%20653%20-%20CARRETERA%20MARGINAL%20FERNANDO%20BELAUNDE&nroAsientosIda=9&flagRetorno=true&rutaRetorno=PEDRO%20RUIZ-LIMA&fpartidaRetorno=09/05/2022&hrsalidaRetorno=15:00&fllegadaRetorno=10/05/2022&hrllegadaRetorno=13:00&servicioRetorno=Ejecutivo%20vip&montoTotalRetorno=187.0&dirreccionPartidaRetorno=AV.CAHUIDE%20653%20-%20CARRETERA%20MARGINAL%20FERNANDO%20BELAUNDE&dirreccionLlegadaRetorno=AV.%20JAVIER%20PRADO%20ESTE%201093%20(FRENTE%20A%20CLÍNICA%20RICARDO%20PALMA),%20LIMA&nroAsientosRetorno=3&totalPasajero=1&correoEnvio=marcialvisalot@hotmail.com&importeTotal=374.0";
	   // aqui esta el error
	   String url4= "https://pasajesdebus.movilbus.pe/confirmacion-pago?reserved22=DEBIT&reserved23=INTERBANK &NumeroCIP=&rutaIda=LIMA-PEDRO%20RUIZ&fpartidaIda=05/05/2022&hrsalidaIda=16:20";
	   String url5= "https://pasajesdebus.movilbus.pe/confirmacion-pago?fllegadaIda=06/05/2022&hrllegadaIda=14:20&servicioIda=Ejecutivo%20vip&montoTotalIda=187.0";
	   // url4
	   String url6= "https://pasajesdebus.movilbus.pe/confirmacion-pago?reserved22=DEBIT&reserved23=INTERBANK &NumeroCIP=";
	   String url7= "https://pasajesdebus.movilbus.pe/confirmacion-pago?rutaIda=LIMA-PEDRO%20RUIZ&fpartidaIda=05/05/2022&hrsalidaIda=16:20";
	   // url6
	   String url8= "https://pasajesdebus.movilbus.pe/confirmacion-pago?reserved22=DEBIT&reserved23=INTERBANK &NumeroCIP=";
	   String url9= "https://pasajesdebus.movilbus.pe/confirmacion-pago?reserved22=DEBIT&reserved23=INTERBANK &NumeroCIP=";

	   try {
		   String marca = "INTERBANK ";
		   String htp= "https://pasajesdebus.movilbus.pe/confirmacion-pago?reserved23="+
				   marca.trim().replace(" ","%20")+"&";
		   System.out.println(htp);
		   URI uri = new URI(htp);
		   System.out.println("htp");
		   
	   }catch (Exception e) {
		// TODO: handle exception
		   System.out.println("error");
	   }
	   
	}*/
	
	/*
	public static void main(String[] args) {
		
		InfoVentaPasajero adicional = new InfoVentaPasajero("SATIPO-LIMA", "03/03/2023", "19:30", "04/03/2023",
				"05:50", "Ejecutivo vip", 2, 144.0, 
				"JR.AVIAVION N°410 STAND 7 TERMINAL TERRESTRE MUNICIPAL",
				"AV. NICOLÁS ARRIOLA 780", "35,36", "mechepreciado@yahoo.es");
				adicional.setFlagRetorno(false);
				adicional.setRutaRetorno("");
				adicional.setFpartidaRetorno("");
				adicional.setHrsalidaRetorno("");	
				adicional.setFllegadaRetorno("");
				adicional.setHrllegadaRetorno("");
				adicional.setServicioRetorno("");
				adicional.setMontoFinalRetorno(0.0);
				adicional.setDrPartidaRetorno("");
				adicional.setDrLlegadaRetorno("");
				adicional.setNroAsientoRetorno("");
				MensajeConfirmacionResult resultado =new MensajeConfirmacionResult(Constantes.RESULT_TRUE,
						Constantes.MSJ_OPERACION_AUTORIZADA,"SU COMPRA SE REALIZÓ SATISFACTORIAMENTE",
						new VPOS2("29", "8092","385966",
								"14400", "604", "Mercedes","Preciado", "mechepreciado@yahoo.es", "Direccion ABC",
								"ZIP 123", "CITY ABC", "STATE ABC","PE", "VENTA DE PASAJE INTERPROV", 
								"00", "330940", "00", "Aprobado", "411090", "VISA","411090******4090", null,
								null, null,  null, null, 
								null, null,  null, null,  
								null, null,  null, null,  
								null, null,  null, null,  
								null, null,  null, null, 
								null, "CREDIT",  "INTERBANK - BANCO INTERNACIONAL DEL PERU", 
								null, null,  null, 
								null, null,  null, 
								null, null,  null,
								null, null,  null, 
								null, null,  null,
								null, null,""),adicional
						);
			String url = "https://qapasajesdebus.movilbus.pe/confirmacion-pago?"+
		 			"estadoWS="+resultado.getResult()+"&"+
		 			"NumeroCIP="+(resultado.getPayment()!=null?resultado.getPayment().getNumeroCip().replace(" ","%20"):"")+"&"+	 			
		 			"rutaIda="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getRutaIda().replace(" ","%20"):"")+"&"+
		 			"fpartidaIda="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getFpartidaIda():"")+"&"+
		 			"hrsalidaIda="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getHrsalidaIda().replace(" ","%20"):"")+"&"+
					"hrllegadaIda="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getHrllegadaIda().replace(" ","%20"):"")+"&"+				
					"servicioIda="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getServicioIda().replace(" ","%20"):"")+"&"+								
					"montoTotalIda="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getMontoFinalIda():"")+"&"+
					"dirreccionPartidaIda="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getDrPartidaIda().replace(" ","%20"):"")+"&"+
					"dirreccionLlegadaIda="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getDrLlegadaIda().replace(" ","%20"):"")+"&"+
					"nroAsientosIda="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getNroAsientoIda().replace(" ","%20"):"")+"&"+
		 			"flagRetorno="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().isFlagRetorno():"")+"&"+
		 			"fpartidaRetorno="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getFpartidaRetorno():"")+"&"+
		 			"hrsalidaRetorno="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getHrsalidaRetorno().replace(" ","%20"):"")+"&"+
		 			"hrllegadaRetorno="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getHrllegadaRetorno().replace(" ","%20"):"")+"&"+
		 			"servicioRetorno="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getServicioRetorno().replace(" ","%20"):"")+"&"+				
		 			"montoTotalRetorno="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getMontoFinalRetorno():"")+"&"+
					"dirreccionPartidaRetorno="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getDrPartidaRetorno().replace(" ","%20"):"")+"&"+				
					"dirreccionLlegadaRetorno="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getDrLlegadaRetorno().replace(" ","%20"):"")+"&"+				
					"nroAsientosRetorno="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getNroAsientoRetorno().replace(" ","%20"):"")+"&"+				
		 			"totalPasajero="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getTotalPasajero():"")+"&"+	 			
		 			"correoEnvio="+(resultado.getInfoadicional()!=null?resultado.getInfoadicional().getCorreoEnvio().replace(" ","%20"):"")+"&"+ 			
		 			"importeTotal="+(resultado.getPayment()!=null?(resultado.getInfoadicional().getMontoFinalIda()+resultado.getInfoadicional().getMontoFinalRetorno())+"":"")
		 			;
			System.out.println(url);
		 	
	}*/
	
}
