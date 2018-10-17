package tram;

import java.util.ArrayList;

import org.jxmapviewer.viewer.GeoPosition;

public class DistanceHelper {

	
	private static double getDistance(GeoPosition p1, GeoPosition p2){
		double earthRadius = 6371 ;
		double dLat = deg2rad(p2.getLatitude() - p1.getLatitude()) ;
		double dLong = deg2rad(p2.getLongitude()- p1.getLongitude()) ;
		double a = Math.sin(dLat/2) * Math.sin(dLat)/2 + Math.cos(deg2rad(p1.getLatitude())) * Math.cos(deg2rad(p2.getLatitude())) * Math.sin(dLong/2) * Math.sin(dLong/2) ;
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a)) ;
		double d = earthRadius * c ;
		return d ;
	}
	
	
	private static double deg2rad(double deg){
		return deg * (Math.PI / 180) ;
	}
	
	
	public static double getFullDistance(ArrayList<GeoPosition> stations){
		double fullDistance = 0 ;
		for(int i = 0; i < stations.size() - 1; i++){
			fullDistance += getDistance(stations.get(i), stations.get(i+1)) ;
		}
		return fullDistance ;
	}
}