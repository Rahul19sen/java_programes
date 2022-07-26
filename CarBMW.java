class Car{
    public int NO_OF_TYRES;
    public String bodyType;
   Car(){
    NO_OF_TYRES=4;
     bodyType="plastic";
   }
    public void reverseGear(){
        System.out.println("Reverse Gear is Applied....");
    }
   
    public void switchOnHeadlight(){
        System.out.println("Headligthts turned on");
    }
}
class BMW extends Car{
    public String modelName="X3";
    public void topSpeed(){
        System.out.println("TopSpeed of BMW is 200 kmph");
    }
}
class Main{
    public static void main(String[] args){
        BMW b1=new BMW();
        b1.reverseGear();
        b1.switchOnHeadlight();
        b1.topSpeed();
    }
}
