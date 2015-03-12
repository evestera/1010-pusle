int size = 600;

void setup() {
  size(800, 600);
}

void draw() {
  background(128, 255, 0);
  ellipse(width / 2, height / 2,
    size, size);
  size--;
}
