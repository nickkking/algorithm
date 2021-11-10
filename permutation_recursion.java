import java.util.Arrays;

class Scratch {
    int[] card= new int[]{1,1,1,1,1,1,1,1,1,1};
    int[] box=new int[4];
    int num_box=box.length;
    //n cards m box show permutation
    public static void main(String[] args) {
        new Scratch().fill(0);
    }

     void fill(int num){//put a card into a box
        if(num==num_box)  {
            System.out.println(Arrays.toString(box));
            return;//????????????????????
        }

        for(int i=0;i<card.length;i++){
            if(card[i]==1){//exist
                box[num]=i;
                card[i]=0;//discard
                fill(num+1);
                card[i]=1;
            }
        }
//        return;
    }
}
