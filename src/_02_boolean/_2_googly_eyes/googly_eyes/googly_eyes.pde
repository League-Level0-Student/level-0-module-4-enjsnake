PImage face;
void setup() {
  size(600,600);
  face = loadImage("face.png");
  face.resize(600,600); 
}

void draw() {
  background(face);
  fill(255,255,255);
  ellipse(176,242,150,150);
  ellipse(415,238,150,150);
  fill(0,0,0);
  ellipse(mouseX, mouseY,50,50);
  ellipse(mouseX+239, mouseY,50,50);
  if(mouseY<176){
    mouseY=176;
  }
  if(mouseY>270){
    mouseY=270;
  }
}
