float x = 300, y = 300;
float xFart = random(10);
float yFart = random(10);

void setup() {
  size(600, 600);
}
void draw() {
  background(0);
  x = x + xFart;
  y = y + yFart;
  if (x > width || x < 0) {
    xFart = -xFart;
  }
  if (y > height || y < 0) {
    yFart = -yFart;
  }
  ellipse(x, y, 50, 50);
}

