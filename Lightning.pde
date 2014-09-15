//Teagan Mucher, Lightning, AP CS block 4

int y, r, g, b;
int startX, endX, startY, endY;
void setup()
{
	size(500,500);
	background(0);
	frameRate(50);
}
void draw()
{
	strokeWeight(3);
	endX = startX + (int)(Math.random()*10-5);
	endY = startY + (int)(Math.random()*10);
	line(startX, startY, endX, endY);
	startX = endX;
	startY = endY;
}
void mousePressed()
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

