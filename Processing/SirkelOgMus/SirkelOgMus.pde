void setup() {
  size(500, 500);
}

void draw() {
  background(128, 255, 128);
  fill(mouseX, mouseY, 128);
  if (mousePressed) {
    ellipse(100, 200, 100, 100);
  } else {
    ellipse(200, 300, 100, 100);
  }
}

