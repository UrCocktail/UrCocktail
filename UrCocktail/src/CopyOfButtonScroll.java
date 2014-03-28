import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CopyOfButtonScroll extends JFrame {
  protected JViewport viewport;

  protected JButton upButton;

  protected JButton downButton;

  protected JButton leftButton;

  protected JButton rightButton;

  protected int pgVertical;

  protected int pgHorzontal;

  public CopyOfButtonScroll() {
    super("Scrolling Programmatically");
    setSize(400, 400);
    getContentPane().setLayout(new BorderLayout());

    //ImageIcon shuttle = new ImageIcon("D:\\Users\\Juan Carlos\\Desktop\\Portada urcocktail\\Cold-drinks-colorful-cocktails-glass-cups_1920x1200.jpg");
    //pgVertical = shuttle.getIconHeight() / 5;
    //pgHorzontal = shuttle.getIconWidth() / 5;
    //JLabel lbl = new JLabel(shuttle);
    
   pgVertical = 50;
   pgHorzontal = 50;
    
    


    JPanel panel = new JPanel();
   // panel.setSize(600, 100);
    GridBagLayout gbl_panel = new GridBagLayout();
    gbl_panel.columnWidths = new int[]{100, 0, 100, 0, 100, 0, 90, 0, 0};
    gbl_panel.rowHeights = new int[]{0, 0, 0};
    gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
    gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
    panel.setLayout(gbl_panel);
    JLabel lblHola = new JLabel("HOLA");
    GridBagConstraints gbc_lblHola = new GridBagConstraints();
    gbc_lblHola.insets = new Insets(0, 0, 0, 5);
    gbc_lblHola.gridx = 1;
    gbc_lblHola.gridy = 1;
    panel.add(lblHola, gbc_lblHola);
    JLabel lblNewLabel_1 = new JLabel("ADIOS");
    GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
    gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
    gbc_lblNewLabel_1.anchor = GridBagConstraints.ABOVE_BASELINE;
    gbc_lblNewLabel_1.gridx = 3;
    gbc_lblNewLabel_1.gridy = 1;
    panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
    JLabel lblNewLabel_2 = new JLabel("HASTA LUEGO");
    GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
    gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
    gbc_lblNewLabel_2.gridx = 5;
    gbc_lblNewLabel_2.gridy = 1;
    panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
    JLabel lblNewLabel_3 = new JLabel("YEEEEE");
    GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
    gbc_lblNewLabel_3.gridx = 7;
    gbc_lblNewLabel_3.gridy = 1;
    panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
    
    
    

    viewport = new JViewport();
    viewport.setView(panel);
    
    viewport.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent e) {
        enableButtons(CopyOfButtonScroll.this.viewport.getViewPosition());
      }
    });
    getContentPane().add(viewport, BorderLayout.CENTER);

    JPanel pv = new JPanel(new BorderLayout());
    upButton = createButton("up", 'u');
    ActionListener lst = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        movePanel(0, -1);
      }
    };
    upButton.addActionListener(lst);
    pv.add(upButton, BorderLayout.NORTH);

    downButton = createButton("down", 'd');
    lst = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        movePanel(0, 1);
      }
    };
    downButton.addActionListener(lst);
    pv.add(downButton, BorderLayout.SOUTH);
    getContentPane().add(pv, BorderLayout.EAST);

    JPanel ph = new JPanel(new BorderLayout());
    leftButton = createButton("left", 'l');
    lst = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        movePanel(-1, 0);
      }
    };
    leftButton.addActionListener(lst);
    ph.add(leftButton, BorderLayout.WEST);

    rightButton = createButton("right", 'r');
    lst = new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        movePanel(1, 0);
      }
    };
    rightButton.addActionListener(lst);
    ph.add(rightButton, BorderLayout.EAST);
    getContentPane().add(ph, BorderLayout.SOUTH);

    WindowListener wndCloser = new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    };
    addWindowListener(wndCloser);

    setVisible(true);
    movePanel(0, 0);
  }

  protected JButton createButton(String name, char mnemonics) {
    JButton btn = new JButton(name );
    btn.setToolTipText("Move " + name);
    btn.setBorderPainted(false);
    btn.setMargin(new Insets(0, 0, 0, 0));
    btn.setContentAreaFilled(false);
    btn.setMnemonic(mnemonics);
    return btn;
  }

  protected void movePanel(int xmove, int ymove) {
    Point pt = viewport.getViewPosition();
    
    System.out.println(pt.x+","+pt.y);
    
    pt.x += pgHorzontal * xmove;
    pt.y += pgVertical * ymove;

    pt.x = Math.max(0, pt.x);
    pt.x = Math.min(getMaxXExtent(), pt.x);
    pt.y = Math.max(0, pt.y);
    pt.y = Math.min(getMaxYExtent(), pt.y);

    viewport.setViewPosition(pt);
    
    enableButtons(pt);
        
  }

  protected void enableButtons(Point pt) {
    if (pt.x == 0)
      enableComponent(leftButton, false);
    else
      enableComponent(leftButton, true);

    if (pt.x >= getMaxXExtent())
      enableComponent(rightButton, false);
    else
      enableComponent(rightButton, true);

    if (pt.y == 0)
      enableComponent(upButton, false);
    else
      enableComponent(upButton, true);

    if (pt.y >= getMaxYExtent())
      enableComponent(downButton, false);
    else
      enableComponent(downButton, true);
  }

  protected void enableComponent(JComponent c, boolean b) {
    if (c.isEnabled() != b)
      c.setEnabled(b);
  }

  protected int getMaxXExtent() {
    return viewport.getView().getWidth() - viewport.getWidth();
  }

  protected int getMaxYExtent() {
    return viewport.getView().getHeight() - viewport.getHeight();
  }

  public static void main(String argv[]) {
    new CopyOfButtonScroll();
  }
}