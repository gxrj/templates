package io.github.gxrj;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

class WindowEvent implements GLEventListener {
    
    public void init( GLAutoDrawable drawable ) { }
    
    public void display( GLAutoDrawable drawable ) {
        GL gl = drawable.getGL();
        gl.glClear( GL.GL_COLOR_BUFFER_BIT );
    }
    
    public void dispose( GLAutoDrawable drawable ) {}
    public void reshape( GLAutoDrawable drawable, int x, int y, int width, int height ) {}
}
