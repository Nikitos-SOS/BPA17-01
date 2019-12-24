class jump {

    private int x1;
    private int x2;
    private int v1;
    private int v2;

    public void run(){
        boolean x=true;
        if(((x1>x2)&&(v1>=v2))||((x1<x2)&&(v1<=v2))){
            System.out.println("No");
            x=false;
        }
        while(x) {
            if (x1 == x2){
                System.out.println("Yes");
                x=false;
            }
            else {
                if(x1<x2){
                    x1 += v1;
                    x2 += v2;
                    if (x1 > x2){
                        System.out.println("No");
                        x=false;
                    }
                }
                else if(x1>x2){
                    x1 += v1;
                    x2 += v2;
                    if (x1 < x2){
                        System.out.println("No");
                        x=false;
                    }
                }
            } 
        }
    }

    public void jumper(keng kenguru1, keng kenguru2){
        this.x1=kenguru1.getX();
        this.x2=kenguru2.getX();
        this.v1=kenguru1.getV();
        this.v2=kenguru2.getV();
    }
}