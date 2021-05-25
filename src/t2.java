public class t2 {
    public static void main(String[] args) {
        String s="";
        Long start = System.currentTimeMillis();
        Long end = System.currentTimeMillis();

        start = System.currentTimeMillis();
        s="";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 50000000; i++) {
            stringBuilder.append(" ");
        }
        end = System.currentTimeMillis();

        System.out.println("stringBuilder::"+(end-start));



        start = System.currentTimeMillis();
        s="";
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 50000000; i++) {
            stringBuffer.append(" ");
        }
        end = System.currentTimeMillis();

        System.out.println("stringBuffer::"+(end-start));

    }
}
