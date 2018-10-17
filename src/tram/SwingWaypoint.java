package tram;

import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class SwingWaypoint extends DefaultWaypoint {
    private final JButton button;
    private final String text;

    public SwingWaypoint(String text, GeoPosition coord) {
        super(coord);
        this.text = text;
        button = new JButton(text.substring(0, 1));
        button.setSize(15, 25);
        button.setPreferredSize(new Dimension(15,25));
        button.addMouseListener(new SwingWaypointMouseListener());
        button.setVisible(true);
        button.setIcon(new ImageIcon("C:\\Users\\Clt\\Desktop\\TramWay\\pin.png")); 
      button.setHorizontalTextPosition(SwingConstants.CENTER);
    }

    JButton getButton() {
        return button;
    }

    private class SwingWaypointMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            JOptionPane.showMessageDialog(button, "la station : " + text);
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