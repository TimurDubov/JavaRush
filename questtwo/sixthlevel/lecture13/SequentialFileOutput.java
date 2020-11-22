package questtwo.sixthlevel.lecture13;

import java.io.*;

public class SequentialFileOutput {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String filename;
        String fileContent = "";


        @Override
        public void setFileName(String fullFileName) {
            filename = fullFileName;
        }

        @Override
        public String getFileContent() {
            return fileContent;
        }


        @Override
        public void start() {

        }

        @Override
        public void run() {

            try {
                BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));

                String s;
                while ((s=reader.readLine())!=null)
                    fileContent = fileContent + s + " ";
                reader.close();
            } catch (FileNotFoundException e){

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //add your code here - добавьте код тут
}

