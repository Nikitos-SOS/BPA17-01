import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;
//import java.util.logging.handler;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;



public class Keng_class{

private static final Logger logger = Logger.getLogger(Keng_class.class.getClass().getCanonicalName());


  private static final Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) throws IOException {
    String[] x1V1X2V2 = scanner.nextLine().split(" ");
    logger.getParent().removeHandler(logger.getParent().getHandlers()[0]);
    try{
      keng kenguru1 = new keng(Integer.parseInt(x1V1X2V2[0]),Integer.parseInt(x1V1X2V2[1]));
      keng kenguru2 = new keng(Integer.parseInt(x1V1X2V2[2]),Integer.parseInt(x1V1X2V2[3]));
    
      jump jumping=new jump();
      jumping.jumper(kenguru1, kenguru2);
        
      new Thread(jumping::run).start();
 
    }catch(Exception e){
      //на случай удаления каталога с логами, создает новый
      File logdir = new File("./logs/");
      if(!(logdir.exists()))
        logdir.mkdir();
      //создание файла для логов
      FileHandler file = new FileHandler("logs/logs"+(Math.random() * ((1000 - 0) + 1)) + 0+".log");
      ConsoleHandler cons = new ConsoleHandler();
      //привязка хэндлеров к логгеру
      logger.addHandler(cons);
      logger.addHandler(file);
      //вывод сообщения
      logger.warning("Ошибка "+e.getMessage());
    }
    scanner.close();
  }
}
