/*
 * Created on 12.02.2005
 */
package mayday.core.tasks.gui;

import javax.swing.JComponent;



/**
 * @author Matthias Zschunke
 *
 */
public interface StatusBarItem
{
    public int getPosition();
    
    public JComponent getRenderingComponent();
}
