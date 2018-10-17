package tram;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;
import javax.swing.event.MouseInputListener;

import org.jxmapviewer.JXMapViewer;
import org.jxmapviewer.OSMTileFactoryInfo;
import org.jxmapviewer.input.CenterMapListener;
import org.jxmapviewer.input.PanKeyListener;
import org.jxmapviewer.input.PanMouseInputListener;
import org.jxmapviewer.input.ZoomMouseWheelListenerCenter;
import org.jxmapviewer.painter.CompoundPainter;
import org.jxmapviewer.painter.Painter;
import org.jxmapviewer.viewer.DefaultTileFactory;
import org.jxmapviewer.viewer.GeoPosition;
import org.jxmapviewer.viewer.LocalResponseCache;
import org.jxmapviewer.viewer.TileFactoryInfo;
import org.jxmapviewer.viewer.WaypointPainter;

public class FullView extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width = 1300;
	private int height = 1100;
	private JButton button ;
	private JComboBox<String> j1 ;
	private JComboBox<String> j2 ;
	private JLabel res ;
	private JLabel res2 ;
	private JLabel res3 ;
	private RoutePainter stationPainter ;
	private GeoPositionsController g ;
	
	public FullView(){
		
		this.g = new GeoPositionsController() ;
		
		this.setSize(width, height);
		
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        JPanel mapView = new JPanel();
        mapView.setSize(this.width * 3 / 4, this.height);
        mapView.setBackground(Color.BLUE);
        mapView.setVisible(true);
        mapView.setLayout(new BorderLayout());
        addMapView(mapView, g) ;
        JPanel controlView = new JPanel();
        controlView.setSize(this.width / 4, this.height);
        controlView.setBackground(Color.white);
        controlView.setVisible(true);
        addControlView(controlView, g) ;

        JSplitPane splitPane = new JSplitPane();
        splitPane.setSize(width, height);
        splitPane.setDividerSize(0);
        splitPane.setDividerLocation(this.width * 3 / 4);
        splitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setLeftComponent(mapView);
        splitPane.setRightComponent(controlView);
        this.add(splitPane);
        this.setVisible(true);
        this.setResizable(false);
	}
	
	private void addMapView(JPanel mapView, GeoPositionsController g){
		 // Create a TileFactoryInfo for OSM
        TileFactoryInfo info = new OSMTileFactoryInfo();
        DefaultTileFactory tileFactory = new DefaultTileFactory(info);
        tileFactory.setThreadPoolSize(8);

        // Setup local file cache
        File cacheDir = new File(System.getProperty("user.home") + File.separator + ".jxmapviewer2");
        LocalResponseCache.installResponseCache(info.getBaseURL(), cacheDir, false);

        // Setup JXMapViewer
        JXMapViewer mapViewer = new JXMapViewer();
        mapViewer.setTileFactory(tileFactory);

        GeoPosition alger = new GeoPosition(36.7348, 3.1212);
       
        // Set the focus
        mapViewer.setZoom(6);
        mapViewer.setAddressLocation(alger);
        GeoPosition lesFusilles = new GeoPosition(36.743889, 3.084749);
        GeoPosition carroubier = new GeoPosition(36.735785, 3.118202);
        GeoPosition LaGlacière = new GeoPosition(36.733807, 3.123797);
        GeoPosition PontElHarrach = new GeoPosition(36.730294, 3.130100);
        GeoPosition TripoliHamadache = new GeoPosition(36.740827, 3.103273);
        GeoPosition elmagaria = new GeoPosition(36.736993, 3.113498);
        GeoPosition ElAnassere = new GeoPosition(36.742969, 3.083477);
        GeoPosition TripoliThaalibiya = new GeoPosition(36.745540, 3.092473);
        GeoPosition Tripolimosquée = new GeoPosition(36.742651, 3.096765);
        GeoPosition Bellevue = new GeoPosition(36.729032, 3.137964);
        GeoPosition CinqMaisons = new GeoPosition(36.726280, 3.150323);
        GeoPosition CitéMokhtarZerhouni = new GeoPosition(36.729307, 3.174356);
        GeoPosition UnniversitéBabEzzouar = new GeoPosition(36.721467, 3.182747);
        GeoPosition BabEzzouar = new GeoPosition(36.724904, 3.183969);
        GeoPosition CitéUniversitaire = new GeoPosition(36.733572, 3.183625);
        GeoPosition Station8 = new GeoPosition(36.738249, 3.184140);
        GeoPosition BorjLycée = new GeoPosition(36.744717, 3.186887);
        GeoPosition BekriBouguerra = new GeoPosition(36.727820, 3.143345);
        GeoPosition FoireDAlger = new GeoPosition(36.731241, 3.161198);
        GeoPosition Tamaris = new GeoPosition(36.732165, 3.167018);
        GeoPosition LesPins = new GeoPosition(36.732087, 3.166720);
        GeoPosition CitéRabia = new GeoPosition(36.724142, 3.177179);
        GeoPosition Cité5  = new GeoPosition(36.721519, 3.182881);
        GeoPosition Clairmatin  = new GeoPosition(36.741337, 3.186192);
        GeoPosition Borjcentre  = new GeoPosition(36.746838, 3.190698);
        GeoPosition BorjPolyclinique = new GeoPosition(36.748489, 3.197950);
        GeoPosition Mouhous = new GeoPosition(36.750331, 3.211948);
        GeoPosition MimouniHamoud = new GeoPosition(36.755195, 3.223707);
        GeoPosition BenMerabat = new GeoPosition(36.758818, 3.229240);
        GeoPosition BenZergua = new GeoPosition(36.767961, 3.250011);
        GeoPosition CaféChergui = new GeoPosition(36.777456, 3.249767);
        Set<SwingWaypoint> waypoints = new HashSet<SwingWaypoint>(Arrays.asList(
                new SwingWaypoint("les fusilles\n lattitude :36.743889 \n longitude: 3.084749 ", lesFusilles),
                new SwingWaypoint("Carroubier\n lattitude :36.735785 \n longitude: 3.118202 ", carroubier),
                new SwingWaypoint("la glacière \n lattitude :36.733807 \n longitude: 3.123797 ",LaGlacière),
                new SwingWaypoint("Pont El Harrach \n lattitude :36.730294 \n longitude: 3.1301007 ",PontElHarrach),
                new SwingWaypoint("Tripoli Hamadache \n lattitude :36.740827 \n longitude: 3.103273 ",TripoliHamadache),
                new SwingWaypoint("El magharia \n lattitude :36.736993 \n longitude: 3.113498 ",elmagaria),
                new SwingWaypoint("El Anassere \n lattitude :36.742969 \n longitude: 3.083477 ",ElAnassere),
                new SwingWaypoint("Tripoli Thaalibiya \n lattitude :36.745540 \n longitude: 3.092473 ",TripoliThaalibiya),
                new SwingWaypoint("Tripoli mosquée \n lattitude :36.742651 \n longitude: 3.096765 ",Tripolimosquée),
                new SwingWaypoint("Belle vue \n lattitude :36.729032 \n longitude: 3.137964 ",Bellevue),
                new SwingWaypoint("Cinq Maisons\n lattitude :36.726280 \n longitude: 3.150323 ",CinqMaisons),
                new SwingWaypoint("Cité Mokhtar Zerhouni\n lattitude :36.729307\n longitude: 3.174356 ",CitéMokhtarZerhouni),
                new SwingWaypoint("Unniversité Bab Ezzouar\n lattitude :36.721467\n longitude: 3.182747 ",UnniversitéBabEzzouar),
                new SwingWaypoint("Bab Ezzouar-Le pont\n lattitude :36.724904\n longitude: 3.183969 ",BabEzzouar),
                new SwingWaypoint("Cité Universitaire\n lattitude :36.733572\n longitude: 3.183625 ",CitéUniversitaire),
                new SwingWaypoint("Station 8 Mai 1945\n lattitude :36.738249\n longitude: 3.184140 ",Station8),
                new SwingWaypoint("Borj El Kiffan Lycée\n lattitude :36.744717\n longitude: 3.186887 ",BorjLycée),
                new SwingWaypoint("Bekri Bouguerra\n lattitude :36.727820\n longitude:  3.143345 ",BekriBouguerra),
                new SwingWaypoint("Foire D'Alger\n lattitude :36.731241\n longitude:  3.161198 ",FoireDAlger),
                new SwingWaypoint("Tamaris\n lattitude :36.732165\n longitude: 3.167018 ",Tamaris),
                new SwingWaypoint("Les Pins\n lattitude :36.732087\n longitude: 3.166720 ",LesPins),
                new SwingWaypoint("Cité Rabia\n lattitude :36.724142\n longitude:3.177179 ",CitéRabia),
                new SwingWaypoint("Cité 5 Juillet\n lattitude :36.721519\n longitude:3.182881 ",Cité5 ),
                new SwingWaypoint("Clair matin\n lattitude :36.741337\n longitude:3.186192 ",Clairmatin ),
                new SwingWaypoint("Borj El Kiffane centre\n lattitude :36.746838\n longitude:3.190698 ",Borjcentre ),
                new SwingWaypoint("Borj El Kiffane Polyclinique\n lattitude :36.748489\n longitude: 3.197950 ",BorjPolyclinique ),
                new SwingWaypoint("Mouhous\n lattitude :36.750331\n longitude: 3.211948 ",Mouhous ),
                new SwingWaypoint("Mimouni Hamoud\n lattitude :36.755195\n longitude: 3.223707 ",MimouniHamoud ),
                new SwingWaypoint("Ben Merabat\n lattitude :36.758818\n longitude: 3.229240 ",BenMerabat ),
                new SwingWaypoint("Ben Zergua\n lattitude :36.767961\n longitude: 3.250011 ",BenZergua ),
                new SwingWaypoint("Café Chergui\n lattitude :36.777456\n longitude: 3.249767 ",CaféChergui )
                ));
        mapView.add(mapViewer);
        
        List<Painter<JXMapViewer>> painters = new ArrayList<Painter<JXMapViewer>>();
        
        
        // Set the overlay painter
        WaypointPainter<SwingWaypoint> swingWaypointPainter = new SwingWaypointOverlayPainter();
        swingWaypointPainter.setWaypoints(waypoints);
        //mapViewer.setOverlayPainter(swingWaypointPainter);

        // Add the JButtons to the map viewer
        for (SwingWaypoint w : waypoints) {
            mapViewer.add(w.getButton());
        }
        
        
        
        RoutePainter routePainter = new RoutePainter(g.getStationsToFrom("El Anassere", "Ben Zergua"));
        this.stationPainter = new RoutePainter(g.getStationsToFrom("El Anassere", "El Anassere"));
        stationPainter.setColor(Color.BLUE);
        stationPainter.setStroke(16);
        
        painters.add(routePainter);
		painters.add(swingWaypointPainter);
		painters.add(stationPainter) ;
		
		CompoundPainter<JXMapViewer> painter = new CompoundPainter<JXMapViewer>(painters);
		mapViewer.setOverlayPainter(painter);


        // Add interactions
        MouseInputListener mia = new PanMouseInputListener(mapViewer);
        mapViewer.addMouseListener(mia);
        mapViewer.addMouseMotionListener(mia);
        mapViewer.addMouseListener(new CenterMapListener(mapViewer));
        mapViewer.addMouseWheelListener(new ZoomMouseWheelListenerCenter(mapViewer));
        mapViewer.addKeyListener(new PanKeyListener(mapViewer));
        // Display the viewer in a JFrame
     mapView.setVisible(true);
	}
	
	private void addControlView(JPanel controlView, GeoPositionsController g){
		
		JLabel titre = new JLabel("Géolocalisation ") ;
		JLabel titre1 = new JLabel(" des stations des ") ;
		JLabel titre2 = new JLabel("TramWays à Alger") ;
		titre.setPreferredSize(new Dimension(100, 50)); 
		titre1.setPreferredSize(new Dimension(100, 50));
		titre2.setPreferredSize(new Dimension(100, 50)); Font font = new Font("Bernard MT Condensed", Font.PLAIN, 20);
		titre.setFont(font);
		titre.setFont(new Font(titre.getFont().getName(), titre.getFont().getStyle(), 20));
		titre1.setFont(new Font(titre.getFont().getName(), titre.getFont().getStyle(), 20));
		titre2.setFont(new Font(titre.getFont().getName(), titre.getFont().getStyle(), 20));
		this.j1 = new JComboBox<String>() ;
		this.j2 = new JComboBox<String>() ;
		j1.setBackground(Color.WHITE);
		j2.setBackground(Color.WHITE);
		j1.setPreferredSize(new Dimension(1,25));
		j2.setSize(1, 25);
		Font font1 = new Font("Garamond", Font.LAYOUT_LEFT_TO_RIGHT, 20);
		JLabel l1 = new JLabel("Départ") ; l1.setFont(font1); l1.setForeground(Color.blue);
		JLabel l2 = new JLabel("Arrivée") ;l2.setFont(font1); l2.setForeground(Color.blue);
		controlView.setLayout((LayoutManager) new BoxLayout(controlView, BoxLayout.Y_AXIS));
		controlView.add(titre);
		controlView.setForeground(Color.WHITE);
		List<String> items = g.getStationNames() ;
		for(String s : items){
			j1.addItem(s);
			j2.addItem(s);
		}
		controlView.add(titre);		controlView.add(titre1);		controlView.add(titre2);
		controlView.add(l1);
		controlView.add(j1);
		controlView.add(l2);
		controlView.add(j2);
		
		this.button = new JButton("Confirmer") ; button.setForeground(Color.WHITE); button.setBackground(new Color(55,125,200)); button.setPreferredSize(new Dimension(170,50));
		
		button.addMouseListener(new ConfirmerMouseListener(this));
		controlView.add(button);
		
		JLabel res4 = new JLabel("Veuillez selectionner") ;
		JLabel res1 = new JLabel(" deux stations") ;
		res4.setPreferredSize(new Dimension(100, 50));res1.setPreferredSize(new Dimension(100, 50));
		
		res4.setFont(new Font(res4.getFont().getName(), res4.getFont().getStyle(), 20));
		res1.setFont(new Font(res1.getFont().getName(), res1.getFont().getStyle(), 20));
		controlView.add(res4); controlView.add(res1);
		
		this.res2 = new JLabel("") ; this.res=new JLabel(""); res.setPreferredSize(new Dimension(100,200));
		res.setFont(new Font(res.getFont().getName(), res.getFont().getStyle(), 16));
		 this.res3=new JLabel(""); res3.setPreferredSize(new Dimension(100, 150));
			res3.setFont(new Font(res3.getFont().getName(), res3.getFont().getStyle(), 16));
		res2.setPreferredSize(new Dimension(100,30));
		res2.setFont(new Font(res2.getFont().getName(), res2.getFont().getStyle(), 16));
		controlView.add(res);
		controlView.add(res2);
		controlView.add(res3);
		
		controlView.setVisible(true);
	}
	
	
	private class ConfirmerMouseListener implements MouseListener {
		
		private FullView frame;

		public ConfirmerMouseListener(FullView frame){
			this.frame = frame ;
		}

	    @Override
	    public void mouseClicked(MouseEvent e) {
	    	
	        String depart = (String) this.frame.j1.getSelectedItem() ;
	        String arrivee = (String) this.frame.j2.getSelectedItem() ;
	        ArrayList<GeoPosition> stations = this.frame.g.getStationsToFrom(depart, arrivee) ;
	        this.frame.stationPainter.setTrack(stations);
	        double distance = DistanceHelper.getFullDistance(stations) ;
	        double nbMin = distance/18 * 60 ;
	        this.frame.res.setText(String.format("La distance est %f Km", distance));
	        this.frame.res2.setText(String.format("Le temps estimé est : "));
	        this.frame.res3.setText(String.format("%.0f minutes %.0f secondes", Math.floor(nbMin), (nbMin - Math.floor(nbMin)) * 60));
	        
	    }

	    @Override
	    public void mousePressed(MouseEvent e) {
	    }

	    @Override
	    public void mouseReleased(MouseEvent e) {
	    }

	    @Override
	    public void mouseEntered(MouseEvent e) {
	    }

	    @Override
	    public void mouseExited(MouseEvent e) {
	    }
	}
}