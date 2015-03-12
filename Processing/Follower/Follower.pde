float x;
float y;

void setup() {
  size(800, 600);
  x = width / 2;
  y = height / 2;
}

void draw() {
  background(128, 128, 255);
  x += (mouseX - x) / 20;
  y += (mouseY - y) / 20;
  ellipse(x, y, 100, 100);
}

