package io.github.gxrj;

import javax.swing.JFrame;

import com.jogamp.opengl.awt.GLJPanel;

public class Window extends JFrame {
    
    private GLJPanel glJPanel;

    Window() {
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        this.setTitle( "Skeleton" );
        this.setSize( 800, 600 );
        this.setLocation( 270, 65 );

        glJPanel = new GLJPanel();
        glJPanel.addGLEventListener( new WindowEvent() );

        this.add( glJPanel );
        this.setVisible( true );
    }
}
