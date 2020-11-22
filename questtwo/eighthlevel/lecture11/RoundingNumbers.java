package questtwo.eighthlevel.lecture11;

import java.io.*;


public class RoundingNumbers {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filePath1 = reader.readLine();
        String filePath2 = reader.readLine();



        BufferedReader reader1 = new BufferedReader(new FileReader (filePath1));
        String num = reader1.readLine();

        String[] nums = num.split(" ");


        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath2));

        for (int i = 0; i < nums.length; i++) {

            double a = Double.parseDouble(nums[i]);
            long b = Math.round(a);
            writer.write(b + " ");
        }

        reader.close();
        reader1.close();
        writer.close();



    }
}
