package labs.example.fileOperations;


import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class FileOperator{

    private static final String FILE_PATH = "D:/CSC_151-main/src/labs/example/fileOperations/";
    private static final String FILE_NAME = FILE_PATH + "files/users.csv";
    private static final String ERROR_LOG_FILE = FILE_PATH + "logs/csv_error.log";

    public void FileOperator(){

    }


    public static void FileOpener(){

        openCSVFile();
    }

  private static void openCSVFile(){
        File csv_file = new File(FILE_NAME);
        File log_File = new File(ERROR_LOG_FILE);

        try{
            BufferedWriter csv_file_writer = new BufferedWriter(new FileWriter(ERROR_LOG_FILE,true));
                    int count = 0;
                    int grade = 0;
                    int average = 0;
                


            if(csv_file.exists() && log_File.exists()){
                BufferedReader ze = new BufferedReader (new FileReader(FILE_NAME));
                String line = "";

                

                while((line = ze.readLine()) != null){ 
                    if (count > 0){
                    String[] value = line.split(","); 
                    int NumOfGrades = value.length -1;
                    grade = Integer.parseInt(value[1]) + Integer.parseInt(value[2]) + Integer.parseInt(value[3]); 
                    average = grade / NumOfGrades; 
                    System.out.println(value[0] + "'s average grade is " + average);
                }
                count++;
                grade = 0;
                average = 0;
                }
                csv_file_writer.close();
            }

        }
        catch(IOException e){
           // csv_file_writer.write(e);
            System.out.println(e);

        }
    }
}