class PrimeCalculator {
    int nth(int n) {
       int count=0,num=1,i;

       if(n<1) throw new IllegalArgumentException("Invalid");
       while(count<n){
           num+=1;
           for(i=2;i<=num;i++)
               if (num%i==0) break;
           if (i==num) count++;
       }

       return num;
    }
}
