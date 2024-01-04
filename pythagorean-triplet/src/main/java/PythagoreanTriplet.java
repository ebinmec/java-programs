import java.util.*;

public class PythagoreanTriplet {
    private final int a;
    private final int b;
    private final int c;

    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PythagoreanTriplet)) return false;
        PythagoreanTriplet that = (PythagoreanTriplet) o;
        return a == that.a && b == that.b && c == that.c;
    }


    public static PythagoreanTripletListBuilder makeTripletsList(){
        return new PythagoreanTripletListBuilder();
    }


    public static class PythagoreanTripletListBuilder{
        int sum=0;
        int lessThanOrEqualTo=Integer.MAX_VALUE;

        public PythagoreanTripletListBuilder thatSumTo(int n){
            sum=n;
            return this;
        }

        public PythagoreanTripletListBuilder withFactorsLessThanOrEqualTo(int n){
            lessThanOrEqualTo=n;
            return this;
        }

        public List<PythagoreanTriplet> build(){
            List<PythagoreanTriplet> l=new ArrayList<>();
            for (int a = 0; a <sum; a++) {
                for (int b = a+1; b < sum-2*a; b++) {
                    int c=sum-a-b;
                    if (a*a+b*b==c*c && b<c && c<=lessThanOrEqualTo){
                        l.add(new PythagoreanTriplet(a,b,c));
                    }
                }
            }
            return l;
        }
    }
}