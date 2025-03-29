import java.math.BigDecimal;
import java.util.*;
class JavaBigDecimal{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        List<Map.Entry<BigDecimal, Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new AbstractMap.SimpleEntry<>(new BigDecimal(s[i]), i));
        }

        // Sort the list based on the BigDecimal values in descending order
        // If values are equal, maintain the original order by comparing the indices
        Collections.sort(list, new Comparator<Map.Entry<BigDecimal, Integer>>() {
            @Override
            public int compare(Map.Entry<BigDecimal, Integer> a, Map.Entry<BigDecimal, Integer> b) {
                int cmp = b.getKey().compareTo(a.getKey());
                if (cmp == 0) {
                    return a.getValue().compareTo(b.getValue());
                } else {
                    return cmp;
                }
            }
        });

        // Reorder the original array based on the sorted list
        String[] sorted = new String[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = s[list.get(i).getValue()];
        }

        // Copy the sorted array back to the original array for output
        System.arraycopy(sorted, 0, s, 0, n);
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}