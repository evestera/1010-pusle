void setup() {
  size(500, 500);
  background(255);
}

void draw() {
  fill(mouseX, mouseY, 128);
  if (mousePressed) {
    ellipse(mouseX, mouseY, 100, 100);
  }
}

