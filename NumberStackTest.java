public class NumberStackTest {
    public static  void testthat (boolean condition){
        if(condition){
            System.out.println("suscess");
        }else{
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        NumberStack numberStack = new NumberStack();

        testthat(numberStack.getCount()==0);

        numberStack.push(10);
        testthat(numberStack.getCount()==1);

        numberStack.push(20);
        testthat(numberStack.getCount()==2);

        testthat(numberStack.pop()==20);
        testthat(numberStack.pop()==10);

        numberStack.push(100);
        numberStack.push(200);
        testthat(numberStack.peak() == 200);
        testthat(numberStack.peak() == 200);
        testthat (numberStack.getCount() == 2);

        numberStack.empty();
        testthat(numberStack.getCount() == 0);
    }

}
