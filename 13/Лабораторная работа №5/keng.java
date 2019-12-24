class keng{
    private int x;
    private int v;

    //конструктор
    keng(int xx, int vv){
        x=xx;
        v=vv;
    }

    //setters
    public void setX(int newX){
        this.x=newX;
    }
    public void setV(int newV){
        this.v=newV;
    }

    //getters
    public int getX(){
        return x;
    }

    public int getV(){
        return v;
    }
}