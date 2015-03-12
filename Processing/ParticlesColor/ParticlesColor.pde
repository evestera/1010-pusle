Particle[] particles = new Particle[10000];

void setup() {
  size(800, 600);
  for(int i = 0; i < particles.length; i++) {
    particles[i] = new Particle();
  }
  noStroke();
  noSmooth();
}

void draw() {
  background(0);
  for(Particle p : particles) {
    p.x += p.vx;
    p.y += p.vy;
    
    p.vx *= 0.98;
    p.vy *= 0.98;
    
    if(mousePressed) {
      float distance = dist(p.x, p.y, mouseX, mouseY);
      p.vx -= 2 / distance * (p.x - mouseX);
      p.vy -= 2 / distance * (p.y - mouseY);
    }
    
    fill(abs(p.vx) * 32, abs(p.vy) * 32, 128);
    ellipse(p.x, p.y, 5, 5);
  }
}

class Particle {
  float x = random(width);
  float y = random(height);
  float vx = random(-10, 10);
  float vy = random(-10, 10);
}
