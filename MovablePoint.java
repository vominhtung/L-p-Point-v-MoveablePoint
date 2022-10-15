public class MovablePoint extends  Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
   public MovablePoint (float x,float y,float xSpeed,float ySpeed){
        super(x, y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(){}
    public MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed() {

       return xSpeed;
    }

    public void setXSpeed(float xSpeed) {

       this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed){

       this.ySpeed=ySpeed;
    }


    public void setXYSpeed(float xSpeed,float ySpeed){
       this.ySpeed=ySpeed;
       this.xSpeed=xSpeed;
    }
    public float[] getSpeed (){
       return new float[]{xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public MovablePoint move(){
       setX(getX()+ getXSpeed());
       setY(getY()+ getYSpeed());
       return this;

    }
}
