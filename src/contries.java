import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class contries {
    public char GreetContries(String inputFile, String outputFile) throws IOException {

        char letra = 0;
        try {
            FileReader doc = new FileReader(inputFile);
            int text = doc.read();
            while (text != -1) {
                text = doc.read();
                letra = (char) text;
                System.out.print(letra);

            }


            // doc.close();
        } catch (IOException e) {
            System.out.println("nada aqui");
        }
        /*Path path = Paths.get(inputFile);
        ArrayList text = new ArrayList();

        try{
            String contein = String.valueOf(Files.readAllLines(path));
            System.out.println(contein);

        }catch(Exception e){
           // e.printStackTrace();
        }

        String text= "";
        try{
            BufferedReader file = new BufferedReader(new FileReader(inputFile));
            String fileread, temp ="";
            while((fileread = file.readLine()) != null){
                temp = temp + fileread;
            }
            text = temp;
        }catch(Exception e){
        System.out.println("File don't found");
        }
*/
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            String testo = "hola";
            FileWriter write = new FileWriter("C:/Users/a844154/Documents/PracticaJava/countries " + dt.format(LocalDateTime.now()) + ".txt", true);
            for (int i = 0; i < testo.length(); i++) {
                write.write(testo.charAt(i));
            }
            write.close();
        } catch (IOException e) {

        }



        /* return text; */
        return letra;
    }
}
