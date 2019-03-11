// create three integer variables to  
    //    represent the x, y, and the size of the ellipse
    
    int x = 2;
    int y = 30;
    int size = 60; 
    void setup() {
      //set the size of your sketch
 size(500,500);   
    }
    
    void draw() {
      //set the background color of your sketch
 background(0,57,132); 
      //draw an ellipse. Make sure it fits in the window.
      //use the variables created in step 4 in place of the numbers
      //   in your ellipse
 ellipse(x,y,size,size);  
    }
    
    void mousePressed() {
      //6a. create an integer variable called distance
      int distance;
      //6b. use the getDistance method to initialize your varible
      //    use the mouse's x and y and the x and y of your ellipse 
     distance = getDistance(mouseX,mouseY,x,y);
      //print the distance variable
    println(distance);
      //8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      if(distance <= size){
      x = (int)random(101);
      }
      
        //8b.  set the x and y of the ellipse to a random location on the window
     x = (int)random(width);
     y = (int)random(height);
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }