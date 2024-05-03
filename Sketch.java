import processing.core.PApplet;
import processing.sound.*;

public class Sketch extends PApplet {
  //TRY CHANGING NUMERIC VALUES:
  public int size = 0;
  public int delta = 1;
  public SoundFile highChime;
  public SoundFile lowChime;

  public void settings() {
  size(400, 400);
  }

  public void setup(){
    //DO NOT CHANGE BELOW:
    size(400, 400);
    background(0);
    pixelDensity(2);
    stroke(255);
    fill(255);

      //MAKE SURE YOU ADD THE FILENAME OF YOUR SOUNDS BELOW
      lowChime = new SoundFile(this, "NAMEHERE.mp3");
      highChime = new SoundFile(this, "NAMEHERE.mp3");
      System.out.println("Sketch and SoundFiles have loaded.");
    }
  }

  public void draw(){
    //DO NOT CHANGE BELOW:
    background(0);
    ellipse(200, 200, size, size);
    text("size: " + size, 10, 10);
    text("mouse pressed? " + mousePressed, 10, 20);

    // ADD IF/ELSE IF STATEMENTS BELOW:
    if (mousePressed == false && size == 0) {
      text("Please click!", 150, 200);
    } 
    else if (mousePressed == true && size < 400) {
      size = size + 1;
    } 
    else if (size > 300) {
      fill(255, 0, 0); // Set color to red
    }
  }  
}
