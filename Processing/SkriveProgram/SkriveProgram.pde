String text = "";

void setup() {
  size(800, 600);
  textSize(20);
  fill(0);
}

void draw() {
  background(255);
  text(text + "|", 20, 30);
}

void keyPressed() {
  if (key == CODED) return;
  if (key == BACKSPACE) {
    if (text.length() == 0) return;
    text = text.substring(0, text.length() - 1);
  } else {
    text += key;
  }
}

