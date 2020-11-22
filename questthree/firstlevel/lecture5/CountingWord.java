package questthree.firstlevel.lecture5;

import java.io.*;


public class CountingWord {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        FileReader in = new FileReader(line);

        int count = 0;
        int i = 0;


        String s = "";//вот так можно


        while (in.ready()) {
            int data = in.read();
            s += (char) data;
            i++;
        }


//System.out.println("s:" + s);
        String[] ss = s.split("\\W|\\s");
        //System.out.println(s.length());

        for (int j = 0; j < ss.length; j++) {
            if (ss[j].equals("world")) {
                //System.out.println("j:" + ss[j]);
                count++;
            }
        }

        System.out.println(count);

        reader.close();
        in.close();
    }
}