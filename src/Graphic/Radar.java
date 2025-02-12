package Graphic;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Radar extends JComponent {

  public static int DEFAULT_WIDTH = 800;

  public static int DEFAULT_HEIGHT = 800;

  private static final Color BACK_RADAR_PAINT = Color.BLACK;

  private static final Color FRONT_RADAR_PAINT = Color.GREEN;

  private static final Color FRONT_PASSIVE_RADAR_PAINT = FRONT_RADAR_PAINT.darker().darker();

  private static final Color FRONT_ACTIVE_RADAR_PAINT = FRONT_RADAR_PAINT;

  private static final Color FRONT_ACTIVE_RADAR_TRANSPARENT_PAINT = new Color(FRONT_RADAR_PAINT.getRed(),
      FRONT_RADAR_PAINT.getGreen(), FRONT_RADAR_PAINT.getBlue(), 0);

  private static final Stroke PASSIVE_STROKE = new BasicStroke(0.8f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);

  private static final Stroke ACTIVE_STROKE = new BasicStroke(3f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);

  private int SLEEP_TIME = 16;

  private InnerListener innerListener = new InnerListener();

  private Timer timer = new Timer(SLEEP_TIME, innerListener);

  private Line2D.Float line = new Line2D.Float();

  private Arc2D.Float arc = new Arc2D.Float();

  private Rectangle2D arcRect = new Rectangle2D.Float();

  private Ellipse2D.Float ellipse = new Ellipse2D.Float();

  private GradientPaint gradient;

  private float radius;

  private float diameter;

  private float centerX;

  private float centerY;

  private float radarX;

  private float radarY;

  double angle = 0;

  double da = 2 * Math.PI / 1000;

  public Radar() {
    super();
    setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_WIDTH));
    precalculate();
    addComponentListener(innerListener);
    timer.start();
  }

  private void precalculate() {
    int width = getWidth();
    int height = getHeight();
    radius = Math.min(width, height) / 2f;
    if (radius != 0) {
      diameter = 2 * radius;
      centerX = width / 2f;
      centerY = height / 2f;
      radarX = centerX - radius;
      radarY = centerY - radius;
      arc.setArc(new Rectangle2D.Double(radarX, radarY, diameter, diameter), 0f, 20f, Arc2D.PIE);
      arcRect.setRect(centerX, centerY - radius / 8f, radius, radius / 8f);

      gradient = new GradientPaint(centerX, centerY - radius / 8f, FRONT_ACTIVE_RADAR_TRANSPARENT_PAINT, centerX,
          centerY, FRONT_RADAR_PAINT, false);
    }
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    if ((radius > 0) && isVisible() && isShowing()) {
      Graphics2D g2d = (Graphics2D) g;

      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
      g2d.setPaint(BACK_RADAR_PAINT);
      ellipse.setFrame(radarX, radarY, diameter, diameter);
      g2d.fill(ellipse);
      g2d.setStroke(PASSIVE_STROKE);
      g2d.setPaint(FRONT_PASSIVE_RADAR_PAINT);
      float dx = radius / 4f;
      for (int i = 0; i < 5; i++) {
        ellipse.setFrame(radarX + i * dx, radarY + i * dx, diameter - 2 * i * dx, diameter - 2 * i * dx);
        g2d.draw(ellipse);
      }
      line.setLine(radarX, centerY, radarX + diameter, centerY);
      g2d.draw(line);
      line.setLine(centerX, radarY, centerX, radarY + diameter);
      g2d.draw(line);
      AffineTransform backTransform = g2d.getTransform();

      g2d.rotate(angle, centerX, centerY);

      g2d.setPaint(gradient);
      g2d.fill(arc);

      g2d.setStroke(ACTIVE_STROKE);
      g2d.setPaint(FRONT_ACTIVE_RADAR_PAINT);
      line.setLine(centerX, centerY, centerX + radius, centerY);
      g2d.draw(line);

      g2d.setTransform(backTransform);
    }
  }

  private class InnerListener implements ActionListener, ComponentListener {

    public InnerListener() {
    }

    public void actionPerformed(ActionEvent event) {
      angle += da;
      if (isVisible() && (isShowing())) {
        repaint();
      }
    }

    public void componentResized(ComponentEvent event) {
      precalculate();
      if (isVisible() && (isShowing())) {
        repaint();
      }
    }

    public void componentMoved(ComponentEvent event) {
    }

    public void componentShown(ComponentEvent event) {
    }

    public void componentHidden(ComponentEvent e) {
    }

  }
}