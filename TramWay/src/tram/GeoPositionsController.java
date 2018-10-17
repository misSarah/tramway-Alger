package tram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.jxmapviewer.viewer.GeoPosition;

public class GeoPositionsController {

	private HashMap<String, GeoPosition> stations = new HashMap<String, GeoPosition>() ;
	private List<String> stationsOrdonees ;
	
	public GeoPositionsController(){
		stations.put("Les fusilles", new GeoPosition(36.743889, 3.084749)) ;
		stations.put("Carroubier",new GeoPosition(36.735785, 3.118202)) ;
		stations.put("La Glaci�re", new GeoPosition(36.733807, 3.123797)) ;
		stations.put("Pont El Harrach", new GeoPosition(36.730294, 3.130100)) ;
        stations.put("Tripoli Hamadache", new GeoPosition(36.740827, 3.103273)) ;
        stations.put("El magharia", new GeoPosition(36.736993, 3.113498)) ;
        stations.put("El Anassere", new GeoPosition(36.742969, 3.083477)) ;
        stations.put("Tripoli Thaalibiya", new GeoPosition(36.745540, 3.092473)) ;
        stations.put("Tripoli mosqu�e", new GeoPosition(36.742651, 3.096765)) ;
        stations.put("Belle vue", new GeoPosition(36.729032, 3.137964)) ;
        stations.put("Cinq Maisons", new GeoPosition(36.726280, 3.150323)) ;
        stations.put("Cit� Mokhtar Zerhouni", new GeoPosition(36.729307, 3.174356)) ;
        stations.put("Unniversit� Bab Ezzouar", new GeoPosition(36.721467, 3.182747)) ;
        stations.put("Bab Ezzouar-Le pont", new GeoPosition(36.724904, 3.183969)) ;
        stations.put("Cit� Universitaire", new GeoPosition(36.733572, 3.183625)) ;
        stations.put("Station 8 Mai 1945", new GeoPosition(36.738249, 3.184140)) ;
        stations.put("Borj El Kiffan Lyc�e", new GeoPosition(36.744717, 3.186887)) ;
        stations.put("Bekri Bouguerra", new GeoPosition(36.727820, 3.143345)) ;
        stations.put("Foire D'Alger", new GeoPosition(36.731241, 3.161198)) ;
        stations.put("Tamaris", new GeoPosition(36.732165, 3.167018)) ;
        stations.put("Les Pins", new GeoPosition(36.732087, 3.166720)) ;
        stations.put("Cit� Rabia", new GeoPosition(36.724142, 3.177179)) ;
        stations.put("Cit� 5 Juillet", new GeoPosition(36.721519, 3.182881)) ;
        stations.put("Clair matin", new GeoPosition(36.741337, 3.186192)) ;
        stations.put("Borj El Kiffane centre", new GeoPosition(36.746838, 3.190698)) ;
        stations.put("Borj El Kiffane Polyclinique", new GeoPosition(36.748489, 3.197950)) ;
        stations.put("Mouhous", new GeoPosition(36.750331, 3.211948)) ;
        stations.put("Mimouni Hamoud", new GeoPosition(36.755195, 3.223707)) ;
        stations.put("Ben Merabat", new GeoPosition(36.758818, 3.229240)) ;
        stations.put("Ben Zergua", new GeoPosition(36.767961, 3.250011)) ;
        stations.put("Caf� Chergui", new GeoPosition(36.777456, 3.249767)) ;
        
        
        
        
        this.stationsOrdonees = Arrays.asList("El Anassere", "Les fusilles", "Tripoli Thaalibiya", "Tripoli mosqu�e", "Tripoli Hamadache", "El magharia", "Carroubier", "La Glaci�re", "Pont El Harrach", "Belle vue",
        		"Bekri Bouguerra", "Cinq Maisons", "Foire D'Alger", "Tamaris", "Les Pins", "Cit� Mokhtar Zerhouni", "Cit� Rabia", "Unniversit� Bab Ezzouar", "Cit� 5 Juillet", "Bab Ezzouar-Le pont", "Cit� Universitaire",
        		"Station 8 Mai 1945", "Clair matin", "Borj El Kiffan Lyc�e", "Borj El Kiffane centre", "Borj El Kiffane Polyclinique", "Mouhous", "Mimouni Hamoud", "Ben Merabat", "Caf� Chergui", "Ben Zergua") ;
	}
	
	public HashMap<String, GeoPosition> getStations(){
		return this.stations ;
	}
	
	public List<String> getStationNames(){
		return this.stationsOrdonees ;
	}
	
	public ArrayList<GeoPosition> getStationsToFrom(String st1, String st2){
		ArrayList<GeoPosition> stationList = new ArrayList<GeoPosition>() ;
		int index1 = stationsOrdonees.indexOf(st1) ;
		int index2 = stationsOrdonees.indexOf(st2) ;
		int minIndex = 0 ;
		int maxIndex = 0 ;
		if(index1 < index2){
			minIndex = index1 ;
			maxIndex = index2 ;
		}
		else{
			minIndex = index2 ;
			maxIndex = index1 ;
		}
		for(int i=minIndex; i <= maxIndex;i++){
			String station = stationsOrdonees.get(i) ;
			stationList.add(stations.get(station)) ;
		}
		return stationList ;
	}
}
