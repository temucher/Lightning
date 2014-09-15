import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int y, r, g, b;
int startX, endX, startY, endY;
public void setup()
{
	size(500,500);
	background(0);
	frameRate(50);
}
public void draw()
{
	strokeWeight(3);
	endX = startX + (int)(Math.random()*10-5);
	endY = startY + (int)(Math.random()*10);
	line(startX, startY, endX, endY);
	startX = endX;
	startY =endY;
}
public void mousePressed()
{
	if(mouseButton == LEFT)
	{
		startX = (int)(Math.random()*200+150);
		startY = 0;
		r = (int)(Math.random()*255);
		g = (int)(Math.random()*255);
		b = (int)(Math.random()*255);
		stroke(r, g, b);
		redraw();
	}
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
