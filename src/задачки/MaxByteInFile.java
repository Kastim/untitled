package задачки;

import java.io.*;

public class MaxByteInFile {
        public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine()+".txt";
        System.out.println(nameFile);

        FileInputStream fileInputStream = new FileInputStream(nameFile);

            long[] arrBytes = new long[256];
            int  bufferSize = 64000;
            byte buffer[]   = new byte[64000];

            while (fileInputStream.available() > 0) {
                if (fileInputStream.available() < 64000) bufferSize = fileInputStream.available();
                fileInputStream.read(buffer, 0, bufferSize );


                for (int i = 0; i >= 0 ; i--)
                    if (arrBytes[(int) i] > 0) System.out.println(i);

    }
            fileInputStream.close();
}
}
