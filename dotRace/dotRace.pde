int var = 0;

//Make a variable to hold the X co-ordinate of the dot and set it to 
void setup() {
    size(800, 200);
}

void draw() {
    //make it a nice color
fill(100,65,224);
rect(500,0,20,200);
fill(0,34,222);
ellipse(var, 100,10,10);
    //if the mouse is pressed...

if(mousePressed){
var++;
} 
if(var==500){
playSound();
} 
//... change the X co-ordinate so that the dot moves to the right
    //Draw an ellipse of height and width 10Make sure to use your variable for the X position.
    //Make your dot move really fast so that it can win the race 

}
import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("harhar.wav");
        sound.trigger();
        soundPlayed = true;
    }
}