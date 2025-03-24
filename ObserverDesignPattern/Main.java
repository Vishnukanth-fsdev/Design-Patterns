package ObserverDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        YouTubeChannel yb=new YouTubeChannel();

        Subscriber vishnukanth=new Subscriber("Vishnukanth");

        Subscriber ram=new Subscriber("Ramu");
        yb.subscribe(ram);
        yb.subscribe(vishnukanth);
        yb.newVideoUploaded("Design Pattern");
        yb.newVideoUploaded("Java Full Stack Course");

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.println("Press 1 for upload video");
            System.out.println("Press 2 for create new Subsciber");
            System.out.println("Press 3 for exit");

            int c=Integer.parseInt(br.readLine());
            if(c==1){
                System.out.println("Enter Video Title");
                String video=br.readLine();
                yb.newVideoUploaded(video);

            }else if(c==2){
                System.out.println("Enter name of Subscriber");
                String name=br.readLine();
                Subscriber sb=new Subscriber(name);
                yb.subscribe(sb);

            }else if(c==3){
                System.out.println("Thank you for using app");
                break;

            }else{
            System.out.println("Wrong Input");
            }
        }

    }
    
}
