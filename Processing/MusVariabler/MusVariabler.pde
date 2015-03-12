void setup() {
  size(800, 600);
  textSize(30);
}

void draw() {
  background(0);
  text("mouseX: " + mouseX, 20, 50);
  text("mouseY: " + mouseY, 20, 100);
  text("mousePressed: " + mousePressed, 20, 150);
}
