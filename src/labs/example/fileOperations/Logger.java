// Michael G.
// 4/2/2025

package labs.example.fileOperations;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Logger{
    private static final String FILE_PATH = "D:/CSC_151-main/src/labs/example/fileOperations/";
    private static final String ERROR_FILE = FILE_PATH + "logs/api_error.log";


    public static void main(String[] args)throws IOException{
        BufferedReader file = openErrorLog();
        
        getCountOfErrorTypes(file);
        file.close();

        BufferedReader file2 = openErrorLog();
        getMemoryLimitExceededCount(file2);
        file2.close();


    }

    public static void readAPI(){ 
        File log_File = new File(ERROR_FILE);

        try{
            String line = "";
            if(log_File.exists()){
                BufferedReader br = new BufferedReader (new FileReader(ERROR_FILE));

                while((line = br.readLine()) != null){
                    System.out.println(line);
                }
                 br.close();
            }
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static BufferedReader openErrorLog()throws IOException{ 
    BufferedReader br = new BufferedReader(new FileReader(ERROR_FILE));

    return br;

    }

    private static void getCountOfErrorTypes(BufferedReader file) throws IOException{ 
        int error_count = 0;
        int warn_count = 0;
        int info_count = 0;
        int debug_count = 0;
        String line = "";
         while((line = file.readLine()) != null){
                  String[] lineValue = line.split(" ");

                  switch(lineValue[2]){
                    case "[ERRORS]":
                         error_count = error_count + 1;
                         break;
                    case "[WARNINGS]":
                        warn_count = warn_count + 1;
                        break;
                    case "[INFO]":
                        info_count =  info_count + 1;
                        break;
                    case "[DEBUGS]":
                        debug_count = debug_count + 1;
                        break;
                  }
                }
                System.out.println("Total Errors: " + error_count);
                System.out.println("Total Warnings: " + warn_count);
                System.out.println("Total Information: " + info_count);
                System.out.println("Total Debugs: " + debug_count);
               

    }

    private static void getMemoryLimitExceededCount(BufferedReader file)throws IOException{ //Lab 5
        ArrayList <String> endpointList = new ArrayList<String>();
        int memoryLimitExceededCount = 0;
        String line = "";
        while((line = file.readLine()) != null){
            String[] lineValue =line.split(" ");
             if(lineValue[5].equals("Memory")){
                 memoryLimitExceededCount = memoryLimitExceededCount + 1;
                endpointList.add(lineValue[13]);
            }
            
        }
        System.out.println("Memory Limit Reached " + memoryLimitExceededCount);
        for(String endPoint: endpointList){
            System.out.println(endPoint);
        }

    }
}