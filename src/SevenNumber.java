
public class SevenNumber {

    public static void main(String[] args) {
        // iの値が1から101より小さい間、処理を繰り返す
        for(int i = 1; i < 101; i++) {
            //7の倍数の時
            if(i % 7 == 0 || i % 10 == 7 || i / 10 == 7) {
                System.out.println("clap!");
            }else {
                System.out.println(i);
            }
            
        }

    }

}
