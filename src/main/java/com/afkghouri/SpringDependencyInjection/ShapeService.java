package com.afkghouri.SpringDependencyInjection;

public class ShapeService {
    Shape myShape;//= new Triangle();
    
    public void askForDraw(){
    	myShape.draw();
    }

	public Shape getMyShape() {
		return myShape;
	}

	public void setMyShape(Shape myShape) {
		this.myShape = myShape;
	}
    
    
}
