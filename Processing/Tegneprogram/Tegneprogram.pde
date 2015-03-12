void setup() {
  size(800, 600);
  noStroke();
}

void draw() {
  if (mousePressed) {
    ellipse(mouseX, mouseY, 30, 30);
  }
}
