package LabGeo;

import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class labgeo {

	public static void main (String[] args){
		
		GeoIPService maGeo = new GeoIPService();

		GeoIPServiceSoap monAnalyse = maGeo.getGeoIPServiceSoap();
		
		String monIP = monAnalyse.getGeoIPContext().getIP();
		
		System.out.println(monIP);
		System.out.println(monAnalyse.getGeoIP(monIP).getCountryName());
		System.out.println(monAnalyse.getGeoIP(monIP).getCountryCode());		
		System.out.println(monAnalyse.getGeoIP(monIP).getReturnCodeDetails());
		
		
	}
	
}
