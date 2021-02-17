import java.util.StringJoiner;

public class Principal {
    public static void main(String[] args) {
        String a = "Hola", b = "Mundo", c= "Carlos", d="Jose", e="Renzo", f="Roberto", g="Zulu";
        long endTime, startTime;

        startTime = System.nanoTime();
        String zzz = a + " " + b+ " " + c+ " " + d+ " " + e+ " " + f+ " " + g;
        endTime = System.nanoTime();
        System.out.println("Calentamiento");

        startTime = System.nanoTime();
        String t1 = a + " " + b+ " " + c;
        endTime = System.nanoTime();
        System.out.println("String: "+(endTime-startTime)+" nano seconds. "+t1);

        startTime = System.nanoTime();
        String t2 = new StringBuilder()
                .append(a)
                .append(" ")
                .append(b)
                .append(" ")
                .append(c)
                .toString();
        endTime = System.nanoTime();
        System.out.println("StringBuilder: "+(endTime-startTime)+" nano seconds. "+t2);


        startTime = System.nanoTime();
        String t3 = new StringJoiner(" ")
                .add(a)
                .add(b)
                .add(c)
                .toString();
        endTime = System.nanoTime();
        System.out.println("StringJoiner: "+(endTime-startTime)+" nano seconds. "+t3);

        startTime = System.nanoTime();
        String t5 = new StringBuilder()
                .append(d)
                .append(" ")
                .append(e)
                .append(" ")
                .append(f)
                .toString();
        endTime = System.nanoTime();
        System.out.println("StringBuilder: "+(endTime-startTime)+" nano seconds. "+t5);

        startTime = System.nanoTime();
        String t6 = new StringJoiner(" ")
                .add(d)
                .add(e)
                .add(f)
                .toString();
        endTime = System.nanoTime();
        System.out.println("StringJoiner: "+(endTime-startTime)+" nano seconds. "+t6);


        startTime = System.nanoTime();
        String t10 = d+ " " + e+ " " + f;
        endTime = System.nanoTime();
        System.out.println("String: "+(endTime-startTime)+" nano seconds. "+t10);



    }
}
