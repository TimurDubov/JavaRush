package questone.ninthlevel.lecture11;

// В этой задачке нужно исправить ошибки, которые были допущены неаккуратным программистом.
// Код задачки специально закомментирован, чтобы к ней можно было вернуться еще ради интереса и исправить данные ошибки.
// И чтобы интелька не помечала код красным.

public class SolutionWithMistakes {


    /*
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        InputStream fileInputStream = getOutputStream(destinationFileName);
        InputStream fileOutputStream = getOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available() > 0) ;
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }

     */
}