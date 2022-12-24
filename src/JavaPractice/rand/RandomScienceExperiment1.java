package JavaPractice.rand;

public class RandomScienceExperiment1 {
    public static void main(String[] args) {
        int max =0;
        int curr;
        int yAxis=0;
        int abs=0;

        for(int i =1 ; i<100; i++){
            curr = (int) (Math.random() *10) ;
            //System.out.println("curr = "+curr);
            if(curr %2 == 0)
                yAxis++;
            else
                yAxis--;

            abs = (int) Math.abs(yAxis);
            if(max < abs) {
                max = abs;
                //System.out.println(max+" , i = " + i);
            }
            System.out.println(i+ " , y = "+ yAxis );

        }
        //System.out.println(max);
    }
}
