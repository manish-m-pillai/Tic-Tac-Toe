package TicTacToe;
import java.io.*;
import java.util.*;

public class TicTacToe {
 public static void main(String[]args)throws IOException
    {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        Scanner sc = new Scanner(System.in);
        char c[]={'1','2','3','4','5','6','7','8','9'};
        char ch[]=new char[9];
        char symbol[] = new char[2];
        String player[] = new String[2];
        String choice="Yes";
        String tn;
        char ts;
        int ty;
        int i,v=1;
        int chi;
        int y0=0,y1=0,y2=0;
        String name="TIE";
        System.out.println("*****************************TIC-TAC-TOE*****************************");
        System.out.println();
        System.out.print("Enter Player 1's Name : ");
        player[0]=sc.nextLine();
        System.out.print("Enter Player 2's Name : ");
        player[1]=sc.nextLine();
        System.out.print("Enter "+player[0]+"'s Symbol : ");
        symbol[0]=sc.next().charAt(0);
        System.out.print("Enter "+player[1]+"'s Symbol : ");
        symbol[1]=sc.next().charAt(0);
        while(choice.equalsIgnoreCase("Yes")||choice.equalsIgnoreCase("Y"))
        {
            int n=(int)(Math.random()*2);
            if(n==0)
            {}
            else
            {
                tn=player[0];
                player[0]=player[1];
                player[1]=tn;
                ts=symbol[0];
                symbol[0]=symbol[1];
                symbol[1]=ts;
                ty=y0;
                y0=y1;
                y1=ty;
            }
        
        for(i=0;i<9;i++)
        ch[i]=' ';
        v=1;
        name="TIE";
        System.out.println("*********************************************************************");
        System.out.println("Remember the Position");
        System.out.println(" "+c[0]+"  |  "+c[1]+"  |  "+c[2]);
        System.out.println("____|_____|_____");
        System.out.println(" "+c[3]+"  |  "+c[4]+"  |  "+c[5]);
        System.out.println("____|_____|_____");
        System.out.println(" "+c[6]+"  |  "+c[7]+"  |  "+c[8]);
        System.out.println("*********************************************************************");
        System.out.println(" "+ch[0]+"  |  "+ch[1]+"  |  "+ch[2]);
        System.out.println("____|_____|_____");
        System.out.println(" "+ch[3]+"  |  "+ch[4]+"  |  "+ch[5]);
        System.out.println("____|_____|_____");
        System.out.println(" "+ch[6]+"  |  "+ch[7]+"  |  "+ch[8]);
        System.out.println();
        while(v<=9)
        {
            if(v%2==1)
            {
                System.out.println(player[0]+"'s Turn");
                while(true)
                {
                    try{  
                        System.out.print("Enter the Position for your symbol "+player[0]+" : ");
                        chi=sc.nextInt();
                        if(ch[chi-1]==' ')
                        {
                            ch[chi-1]=symbol[0];
                            break;
                        }
                        else
                        {
                            System.out.println("You have Entered the Wrong Place !!! Plz Enter it Again");
                            System.out.println();
                        }
                    }
                        catch(Exception e){
                            System.out.println("You have Entered Wrong Character !!! Please Enter it Again.");
                            System.out.println();
                            sc.nextLine();
                            continue;
                    }
                }
                if((ch[0]==ch[1]&&ch[1]==ch[2]&&ch[2]==symbol[0])||(ch[3]==ch[4]&&ch[4]==ch[5]&&ch[5]==symbol[0])||(ch[6]==ch[7]&&ch[7]==ch[8]&&ch[8]==symbol[0])||(ch[0]==ch[3]&&ch[3]==ch[6]&&ch[6]==symbol[0])||(ch[1]==ch[4]&&ch[4]==ch[7]&&ch[7]==symbol[0])||(ch[2]==ch[5]&&ch[5]==ch[8]&&ch[8]==symbol[0])||(ch[0]==ch[4]&&ch[4]==ch[8]&&ch[8]==symbol[0])||(ch[2]==ch[4]&&ch[4]==ch[6]&&ch[6]==symbol[0]))
                {
                    name=player[0];
                    y0++;
                    v=9;
                }
                System.out.println(" "+ch[0]+"  |  "+ch[1]+"  |  "+ch[2]);
                System.out.println("____|_____|_____");
                System.out.println(" "+ch[3]+"  |  "+ch[4]+"  |  "+ch[5]);
                System.out.println("____|_____|_____");
                System.out.println(" "+ch[6]+"  |  "+ch[7]+"  |  "+ch[8]);
                System.out.println();
            }
            else
            {
                System.out.println(player[1]+"'s Turn");
                while(true)
                {
                    try{
                        System.out.print("Enter the Position for your symbol "+player[1]+ " : ");
                        chi=sc.nextInt();
                        if(ch[chi-1]==' ')
                        {
                            ch[chi-1]=symbol[1];
                            break;
                        }
                        else
                        {
                            System.out.println("You have Entered the Wrong Place !!! Plz Enter it Again");
                            System.out.println();
                        }
                        }
                        catch(Exception e){
                            System.out.println("You have Entered Wrong Character !!! Please Enter it Again.");
                            System.out.println();
                            sc.nextLine();
                            continue;
                    }
                }
                if((ch[0]==ch[1]&&ch[1]==ch[2]&&ch[2]==symbol[1])||(ch[3]==ch[4]&&ch[4]==ch[5]&&ch[5]==symbol[1])||(ch[6]==ch[7]&&ch[7]==ch[8]&&ch[8]==symbol[1])||(ch[0]==ch[3]&&ch[3]==ch[6]&&ch[6]==symbol[1])||(ch[1]==ch[4]&&ch[4]==ch[7]&&ch[7]==symbol[1])||(ch[2]==ch[5]&&ch[5]==ch[8]&&ch[8]==symbol[1])||(ch[0]==ch[4]&&ch[4]==ch[8]&&ch[8]==symbol[1])||(ch[2]==ch[4]&&ch[4]==ch[6]&&ch[6]==symbol[1]))
                {
                    name=player[1];
                    y1++;
                    v=9;
                }
                System.out.println(" "+ch[0]+"  |  "+ch[1]+"  |  "+ch[2]);
                System.out.println("____|_____|_____");
                System.out.println(" "+ch[3]+"  |  "+ch[4]+"  |  "+ch[5]);
                System.out.println("____|_____|_____");
                System.out.println(" "+ch[6]+"  |  "+ch[7]+"  |  "+ch[8]);
                System.out.println();
            }
            v++;
        }
        if(n==0)
        {}
        else
        {
            tn=player[0];
            player[0]=player[1];
            player[1]=tn;
            ts=symbol[0];
            symbol[0]=symbol[1];
            symbol[1]=ts;
            ty=y0;
            y0=y1;
            y1=ty;
        }
        System.out.println("*********************************************************************");
        if(name.equals("TIE"))
        {
            System.out.println("MATCH HAS BEEN TIED!!!!!!!!!");
            y2++;
        }
        else
        {
            System.out.println(name+" WINS!!!!!!!!");
        }
        System.out.println();
        System.out.println("Scores are:-");
        System.out.println(player[0]+" = "+y0);
        System.out.println(player[1]+" = "+y1);
        System.out.println("Draw ="+y2);
        System.out.println();
        System.out.println("Do You Want to Play it Again?");
        System.out.print("Press 'Yes' or 'Y' to Continue else Press any other button to quit : ");
        choice=br.readLine();
        System.out.println();
    }

       
        System.out.println("*********************************************************************");
        System.out.println("Thanking You");
        System.out.println("This Program was Developed by Manish M. Pillai");
        System.out.println("*********************************************************************");
        sc.close();
    }
}