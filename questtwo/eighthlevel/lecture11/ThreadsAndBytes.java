package questtwo.eighthlevel.lecture11;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


// Задача недоделана. Не проходит по всем параметрам валидатора.
// Я сделал нахождение самого большого байта, а нужно было самого частовстречающегося.
// Ссылка на задачу: https://javarush.ru/tasks/com.javarush.task.task18.task1823#discussion


public class ThreadsAndBytes {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = "";
        do {
            fileName = bufferedReader.readLine();
            ReadThread readThread = new ReadThread(fileName);
            readThread.start();
        } while (!fileName.equals("exit"));

        bufferedReader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName = "";

        public ReadThread(String fileName) {
            this.fileName = fileName;

            //implement constructor body
        }

        @Override
        public void run() {
            List<Integer> arrayList = new ArrayList<>();

            try {

                FileInputStream fileInputStream = new FileInputStream(fileName);

                while (fileInputStream.available() > 0){
                    arrayList.add(fileInputStream.read());
                }


              /*  for (int i = 0; i < arrayList.size(); i++) {
                    for (int j = 0; j < arrayList.size(); j++) {
                        if (arrayList.get(i) > arrayList.get(j)){
                            int b = arrayList.get(i);
                            arrayList.set(i,arrayList.get(j));
                            arrayList.set(j,b);
                        }
                    }
                }*/

                resultMap.put(fileName, arrayList.get(0));
                fileInputStream.close();

            } catch (Exception e){
                e.printStackTrace();
            }


        }

        // implement file reading here - реализуйте чтение из файла тут
    }
}
