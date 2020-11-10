PImage face;
void setup() {
  size(600,600);
  face = loadImage("face.png");
  face.resize(600,600); 
  }

void draw() {
  int eyeX=0;
  int eyeY=0;

  background(face);
  fill(255,255,255);
  ellipse(176,242,150,150);
  ellipse(415,238,150,150);
  fill(0,0,0);
  eyeX=mouseX;
  eyeY=mouseY;
  if(mouseY<176){
    eyeY=176;
  }
  if(mouseY>280){
    eyeY=280;
  }
  if(mouseX<115){
    eyeX=115;
}
if(mouseX>265){
  eyeX=265;
}
  ellipse(eyeX,eyeY ,50,50);
  ellipse(eyeX +239, eyeY,50,50);
  

}
